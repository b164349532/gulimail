package com.itjy.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itjy.common.utils.PageUtils;
import com.itjy.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author gjy
 * @email 164349532@qq.com
 * @date 2023-04-16 21:19:11
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

