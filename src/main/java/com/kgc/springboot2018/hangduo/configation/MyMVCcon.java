package com.kgc.springboot2018.hangduo.configation;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMVCcon implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("title");
        registry.addViewController("/zhuce").setViewName("zhuce");




    }

   ///* @Bean
   // public LocaleResolver localeResolver() {
   //     return new MyLocaleResolver();
   // }
   //
   //*//* @Override
   // public void addInterceptors(InterceptorRegistry registry) {
   //     //拦截所有请求，排除登录和静态资源
   //     registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/","/log","/asserts/**","/webjars/**","/login.html");
   // }*/
}
