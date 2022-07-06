package com.hwangshifu.gulimall.product;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectResult;
import com.hwangshifu.gulimall.product.entity.BrandEntity;
import com.hwangshifu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootTest
class GuliMallProductApplicationTests {

    @Autowired
    private BrandService brandService;
    @Resource
    private OSSClient ossClient;

    @Test
    void contextLoads() {
        BrandEntity brand = new BrandEntity();
        brand.setName("华为");
        brandService.save(brand);
    }

    @Test
    public void ossTest() throws IOException {
        InputStream inputStream = Files.newInputStream(Paths.get("C:\\Users\\SANQI\\Pictures\\Saved Pictures\\wxy\\18.jpg"));
        PutObjectResult object = ossClient.putObject("gulimall-wongshifu", "18.jpg", inputStream);
    }

}
