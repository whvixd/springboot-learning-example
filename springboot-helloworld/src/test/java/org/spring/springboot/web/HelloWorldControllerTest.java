package org.spring.springboot.web;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Spring Boot HelloWorldController 测试 - {@link HelloWorldController}
 *
 * Created by bysocket on 16/4/26.
 */
public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("Hello,World!",new HelloWorldController().sayHello());
    }

   /* public static void main(String[] args) {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        System.out.println(cl);
        System.out.println(cl.getParent());
        System.out.println(cl.getParent().getParent());//BootStrap是用启动类，用C写的
    }*/
}
