package com.zpb.protobuf.test;

import com.google.protobuf.util.JsonFormat;
import com.zpb.protobuf.test.demo.Demo;

import java.util.Arrays;

/**
 * @author       pengbo.zhao
 * @description  hello-protobuf
 * @createDate   2021/11/3 18:09
 * @updateDate   2021/11/3 18:09
 * @version      1.0
 */

public class HelloWorld {

    public static void main(String[] args) {
        Demo.Builder demoBuilder = Demo.newBuilder();
        demoBuilder.setId(System.currentTimeMillis()).setAge(23).setName("张三").setAddress("北京");

        // 序列化
        Demo demo = demoBuilder.build();
        byte[] bytes = demo.toByteArray();
        System.err.println("protobuf 数据:"+ Arrays.toString(bytes));
        System.err.println("protobuf 序列化大小："+ bytes.length);

       Demo deserialization = null;
       String json = null;
       try {

           // 反序列化
           deserialization = Demo.parseFrom(bytes);
           json = JsonFormat.printer().print(deserialization);
       } catch (Exception e){
           e.printStackTrace();
       }

       System.err.println("反序列化：\n"+deserialization.toString());
       System.err.println("json格式："+json);
       System.err.println("json格式大小："+json.getBytes().length);

    }

}
