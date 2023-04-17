package com.itjy.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itjy.product.entity.BrandEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author gjy
 * @email 164349532@qq.com
 * @date 2023-04-16 11:38:09
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
