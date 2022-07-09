package com.hwangshifu.gulimall.product;

import com.hwangshifu.gulimall.product.entity.BrandEntity;
import com.hwangshifu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GuliMallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brand = new BrandEntity();
        brand.setName("华为");
        brandService.save(brand);
    }

}
