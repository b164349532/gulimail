package com.itjy.product.dao;

import com.itjy.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author gjy
 * @email 164349532@qq.com
 * @date 2023-04-16 11:38:09
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
