package com.itjy.order.dao;

import com.itjy.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author gjy
 * @email 164349532@qq.com
 * @date 2023-04-16 22:24:41
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
