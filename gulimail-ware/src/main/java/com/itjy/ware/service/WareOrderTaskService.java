package com.itjy.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itjy.common.utils.PageUtils;
import com.itjy.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author gjy
 * @email 164349532@qq.com
 * @date 2023-04-16 22:32:42
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

