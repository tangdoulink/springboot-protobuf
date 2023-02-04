package com.zpb.protobuf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * @author       pengbo.zhao
 * @description  protobuf-config
 * @createDate   2021/11/4 17:09
 * @updateDate   2021/11/4 17:09
 * @version      1.0
 */
@Configuration
public class ProtobufConfig {

    /**
     * protobuf 序列化
     * @return protobufHttpMessageConverter
     */
    @Bean
    public ProtobufHttpMessageConverter protobufHttpMessageConverter(){
        return new ProtobufHttpMessageConverter();
    }

    /**
     * protobuf 反序列化
     * @param protobufHttpMessageConverter 序列化
     * @return restTemplate
     */
    @Bean
    public RestTemplate restTemplate(ProtobufHttpMessageConverter protobufHttpMessageConverter){
        return new RestTemplate(Collections.singletonList(protobufHttpMessageConverter));
    }

}
