package com.zc.test.service;/**
 * @program: ssm_demo2
 * @description:
 * @author: ZhangChi
 * @create: 2019-07-31 13:04
 **/

import com.zc.test.model.Student;

/**
 * @program: ssm_demo2
 *
 * @description:
 *
 * @author: ZhangChi
 *
 * @create: 2019-07-31 13:04
 **/
public interface HelloService {


    Student queryStudentById(String id);
}
