package com.fengfang.test;

import com.fengfang.domain.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/12 14:50
 **/
public class PersonTest {
    @Test
    public void testAutorid(){
        ApplicationContext context = new ClassPathXmlApplicationContext("person.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person.toString());
    }
}
