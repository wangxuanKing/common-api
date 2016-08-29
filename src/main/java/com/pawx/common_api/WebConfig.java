//package com.pawx.common_api;
//
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan
//public class WebConfig extends WebMvcConfigurerAdapter {
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        //默认
//    	registry.addResourceHandler("/**").addResourceLocations("/");
//        //自定义
////        registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/");
////        super.addResourceHandlers(registry);
//       }
//}