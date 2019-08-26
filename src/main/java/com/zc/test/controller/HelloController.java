package com.zc.test.controller;/**
 * @program: ssm_demo2
 * @description:
 * @author: ZhangChi
 * @create: 2019-07-31 13:03
 **/

import com.zc.test.model.Student;
import com.zc.test.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: ssm_demo2
 *
 * @description:
 *
 * @author: ZhangChi
 *
 * @create: 2019-07-31 13:03
 **/
@Controller
public class HelloController {

    //    注入service层对象
    @Autowired
    private HelloService helloService;

   /* public Student queryStudentById(String id){
        return helloService.queryStudentById(id);
    }
*/
    //    以下两个注解，他们的作用分别是：将以下的方法变成处理器
//    RequestBody是实现将返回的对象变成json字符串，展示在浏览器端
    @RequestMapping("queryStudent")
    @ResponseBody
    public Student queryStudentById(String id) {
        return helloService.queryStudentById(id);

    }

}
