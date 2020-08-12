package com.fengfang.test;

import com.fengfang.domain.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/12 11:16
 **/
public class PeopleTest {
    @Test
    public void testPeople(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people);
        people.getCat().shout();
        people.getDog().shout();
    }
}
