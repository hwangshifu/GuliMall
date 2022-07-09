package com.hwangshifu.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
class GuliMallThirdPartyApplicationTests {
    @Autowired
    private OSSClient ossClient;

    @Test
    void contextLoads() {
    }

    @Test
    public void upload() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\SANQI\\Pictures\\Saved Pictures\\wxy\\2.jpg");
        ossClient.putObject("gulimall-wongshifu", "1111.jgp", fileInputStream);
        ossClient.shutdown();
    }
}
