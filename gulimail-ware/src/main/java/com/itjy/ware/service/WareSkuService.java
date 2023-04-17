package com.itjy.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itjy.common.utils.PageUtils;
import com.itjy.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author gjy
 * @email 164349532@qq.com
 * @date 2023-04-16 22:32:42
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

