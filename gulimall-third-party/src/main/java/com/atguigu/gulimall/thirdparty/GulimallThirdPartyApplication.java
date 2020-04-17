package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@EnableDiscoveryClient
@SpringBootApplication
public class GulimallThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallThirdPartyApplication.class, args);
    }

}
