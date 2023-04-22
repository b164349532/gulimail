package com.itjy.product;

import com.aliyun.oss.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.InputStream;


/**
 * Unit test for simple App.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTest{
    @Autowired
    OSSClient ossClient;
    @Test
    public void testUpload() throws Exception {
//        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-beijing.aliyuncs.com";
//        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//        String accessKeyId = "LTAI5tJwkgzRAZKTURVHF4fM";
//        String accessKeySecret = "iUH1tt39XM6lZmqW0aFDYapmURkGxE";
//
//        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        //上传文件流
        InputStream inputStream = new FileInputStream("C:\\Users\\Rhetoric\\Desktop\\sky.jpg");

        ossClient.putObject("gulimail-itjy","sky.jpg",inputStream);

        ossClient.shutdown();

        System.out.println("上传成功");

    }

}
