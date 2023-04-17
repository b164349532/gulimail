package com.itjy.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itjy.common.utils.PageUtils;
import com.itjy.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author gjy
 * @email 164349532@qq.com
 * @date 2023-04-16 22:32:42
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

