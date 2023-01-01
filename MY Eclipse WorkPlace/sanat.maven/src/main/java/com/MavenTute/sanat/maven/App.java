package com.MavenTute.sanat.maven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	System.out.println("connection started");
        SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        //factory.getCurrentSession();
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
        Lectures lectures = new Lectures();
        lectures.setName("Bistnu prasad Mangarraj");
        lectures.setPhoneNum("+9145678546");
        lectures.setQualification("Java programmer");
        lectures.setAbout("Proficient in built of dynamic web pages");
        System.out.println(lectures);
        //Course Objects
        Course csCourse = new Course();
        csCourse.setCourse("Btech");
        csCourse.setDuration(4);
        csCourse.setFeeStructure(240000);
        //Student obj
        Student student= new Student();
        student.setName("Aditya");
        student.setFatherName("Baistnaba");
        student.setMobile("+918755245");
        student.setEmail("aditya@gmail.com");
        student.setDate_of_joinDate(new Date());
        student.setAddress("old cross-2");
        student.setCourse(csCourse);
        //File input strength
        FileInputStream fio = new FileInputStream("src/main/java/logo.png");
        byte[] data= new byte[fio.available()];
        fio.read(data);
        student.setImage(data);
        Session session = factory.openSession();
        Transaction txTransaction = session.beginTransaction();
        session.save(lectures);
        session.save(student);
        txTransaction.commit();
        session.close();
    }
}
