package com.itjy.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itjy.common.utils.PageUtils;
import com.itjy.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author gjy
 * @email 164349532@qq.com
 * @date 2023-04-16 22:24:41
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

