package com.fengfang.test;

import com.fengfang.domain.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/12 16:07
 **/
public class StudentTest {
    @Test
    public void testQualifier(){
        ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
