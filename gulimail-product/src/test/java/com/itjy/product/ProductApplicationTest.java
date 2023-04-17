package com.itjy.product;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.itjy.product.entity.BrandEntity;
import com.itjy.product.service.BrandService;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTest{
    @Autowired
    private  BrandService  brandService;
    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        BrandEntity brand = brandService.getOne(new LambdaQueryWrapper<BrandEntity>().eq(BrandEntity::getBrandId, 2));
        System.out.println(brand);

    }

}
