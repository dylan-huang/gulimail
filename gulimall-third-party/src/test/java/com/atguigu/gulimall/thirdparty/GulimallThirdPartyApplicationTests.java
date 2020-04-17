package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
class GulimallThirdPartyApplicationTests {

    @Resource
    OSS ossClient;

    @Test
    void contextLoads() throws FileNotFoundException {
        ossClient.putObject("dylan-test-bocket","test.jpg", new FileInputStream("/Users/dylan/Desktop/a.jpg"));
        System.out.println("upload success!");

    }

}
