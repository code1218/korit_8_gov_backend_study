package com.korit.springboot.config;

import com.korit.springboot.ioc.BeanStudy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

@Configuration
public class StudyConfig {

    @Bean
    public BeanStudy beanStudy() {
        Map<String, Object> map = Map.of("이름", "김준일", "나이", 32);
        Set<Map.Entry<String, Object>> entrySet = map.entrySet();
        for(Map.Entry<String, Object> entry : entrySet) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("bean 생성");
        return new BeanStudy();
    }

//    @Bean
//    public Criteria criteria() {
//        return new Criteria();
//    }

}
