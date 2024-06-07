package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.Student;
import com.spring.jdbc.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program started" );
        //spring jdbc=> jdbctemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao dao=context.getBean("studentDao",StudentDao.class);
        Student s=new Student();
        s.setId(203);
        s.setName("vandana");
        s.setAddress("kannod");
        s.setCity("rewa");
         int result=dao.insert(s);
         System.out.println("Student added"+ result);    
         }
        
    }

