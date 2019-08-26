package com.zc.test.service.impl;/**
 * @program: ssm_demo2
 * @description:
 * @author: ZhangChi
 * @create: 2019-07-31 13:04
 **/

import com.zc.test.mapper.HelloMapper;
import com.zc.test.model.Student;
import com.zc.test.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ssm_demo2
 *
 * @description:
 *
 * @author: ZhangChi
 *
 * @create: 2019-07-31 13:04
 **/
@Service
public class HelloServiceImp implements HelloService {

    //    注入持久层对象
    @Autowired
    private HelloMapper helloMapper;

    @Override
    public Student queryStudentById(String id) {
        return helloMapper.queryOne(id);
    }
}
