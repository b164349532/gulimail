package com.itjy.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itjy.common.utils.PageUtils;
import com.itjy.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author gjy
 * @email 164349532@qq.com
 * @date 2023-04-16 11:38:09
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

