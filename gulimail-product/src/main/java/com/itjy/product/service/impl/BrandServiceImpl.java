package com.itjy.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itjy.common.utils.PageUtils;
import com.itjy.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;



import com.itjy.product.dao.BrandDao;
import com.itjy.product.entity.BrandEntity;
import com.itjy.product.service.BrandService;


@Service
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageUtils(page);
    }

}