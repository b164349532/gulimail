package com.itjy.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.itjy.common.utils.PageUtils;
import com.itjy.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author gjy
 * @email 164349532@qq.com
 * @date 2023-04-16 11:38:09
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
