package com.zc.test;/**
import	java.util.stream.DoublePipeline.Head;
 * @program: ssm_demo2
 * @description:
 * @author: ZhangChi
 * @create: 2019-07-31 13:08
 **/

import com.zc.test.controller.HelloController;
import com.zc.test.model.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: ssm_demo2
 *
 * @description:
 *
 * @author: ZhangChi
 *
 * @create: 2019-07-31 13:08
 **/
public class TestHello {

    @Test
    public void test(){
        //初始化spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        //获取controller对象
        HelloController helloController = app.getBean(HelloController.class);
        //调用方法
        Student sayHi = helloController.queryStudentById("c");
        System.out.println(sayHi);

    }
}
