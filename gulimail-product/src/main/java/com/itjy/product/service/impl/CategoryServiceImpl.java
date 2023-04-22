package com.itjy.product.service.impl;

import com.itjy.common.utils.PageUtils;
import com.itjy.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.itjy.product.dao.CategoryDao;
import com.itjy.product.entity.CategoryEntity;
import com.itjy.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = this.list(null);

        List<CategoryEntity> collect = entities.stream().filter(item -> item.getParentCid() == 0).map(menu -> {
            menu.setChildList(getChildren(menu,entities));
            return menu;
        }).collect(Collectors.toList());

        return collect;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> entities) {
        List<CategoryEntity> collect = entities.stream().filter(item -> item.getParentCid() == root.getCatId()).map(menu -> {
            menu.setChildList(getChildren(menu,entities));
            return menu;
        }).collect(Collectors.toList());

        return collect;
    }

}