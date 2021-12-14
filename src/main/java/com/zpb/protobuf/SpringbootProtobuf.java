package com.zpb.protobuf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author       pengbo.zhao
 * @description  主启动类
 * @createDate   2021/11/4 17:05
 * @updateDate   2021/11/4 17:05
 * @version      1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootProtobuf {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootProtobuf.class);
    }
}
