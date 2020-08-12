package com.fengfang.test;

import com.fengfang.domain.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/12 16:17
 **/
public class TeacherTest {
    @Test
    public void  testResource(){
        ApplicationContext context = new ClassPathXmlApplicationContext("teacher.xml");
        Teacher teacher = context.getBean("teacher", Teacher.class);
        System.out.println(teacher);
    }
}
