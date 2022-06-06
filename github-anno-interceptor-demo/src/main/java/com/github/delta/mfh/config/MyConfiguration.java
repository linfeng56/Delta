package com.github.delta.mfh.config;

import com.github.delta.mfh.beans.MyBean;
import com.github.delta.mfh.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 配置中心
 * @author sea
 */
@Configuration
public class MyConfiguration extends WebMvcConfigurationSupport {

    @Bean
    public MyBean myBean(){
        return new MyBean();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/test/**");
    }
}
