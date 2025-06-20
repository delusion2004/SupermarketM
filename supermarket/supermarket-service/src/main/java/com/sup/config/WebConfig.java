package com.sup.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // 配置所有路径都允许跨域
                .allowedOrigins("http://localhost:5173")  // 允许来自 http://localhost:5173 的请求
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // 允许的请求方法
                .allowedHeaders("*")  // 允许所有的请求头
                .allowCredentials(true);  // 是否允许携带凭证（如 Cookies）
    }
}
