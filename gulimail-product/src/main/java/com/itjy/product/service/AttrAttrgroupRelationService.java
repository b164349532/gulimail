package com.itjy.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itjy.common.utils.PageUtils;
import com.itjy.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author gjy
 * @email 164349532@qq.com
 * @date 2023-04-16 11:38:09
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

