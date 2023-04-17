package com.itjy.order.dao;

import com.itjy.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author gjy
 * @email 164349532@qq.com
 * @date 2023-04-16 22:24:41
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
