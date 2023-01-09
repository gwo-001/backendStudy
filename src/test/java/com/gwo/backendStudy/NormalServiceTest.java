package com.gwo.backendStudy;

import com.gwo.backendStudy.service.NormalService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Gwo(1552571230 @ qq.com)
 * @Classname NormalServiceTest
 * @Description TODO
 * @Date 2022/11/27 17:17
 */
@SpringBootTest
public class NormalServiceTest {

    @Autowired
    private NormalService normalService;

    @Test
    public void testNormalMethod() {
        normalService.normalMethod();
    }
}
