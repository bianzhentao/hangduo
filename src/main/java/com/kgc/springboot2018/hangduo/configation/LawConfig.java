package com.kgc.springboot2018.hangduo.configation;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LawConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("laws.html").setViewName("laws");
        registry.addViewController("lawAdd.html").setViewName("lawAdd");
        registry.addViewController("lawUpdate.html").setViewName("lawUpdate");
    }
}
