package com.kgc.springboot2018.hangduo;

import com.kgc.springboot2018.hangduo.pojo.Consult;
import com.kgc.springboot2018.hangduo.service.ConsultService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class HangduoApplicationTests {
	@Resource
	ConsultService consultService;
	@Test
	void contextLoads() {
        Consult consult = consultService.getById(1);
        System.out.println(consult.getZcontent());

    }
}
