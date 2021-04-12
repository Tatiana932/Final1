/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.models.Client;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CliDaoTest {
    
    public CliDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of viewAllUsers method, of class CliDao.
     */
    @Test
    public void testViewAllTeachers() {
        System.out.println("viewAllTeachers");
        CliDao instance = new CliDao();
        List expResult = instance.viewAllTeacher();
        List result = instance.viewAllTeacher();
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteTeacher method, of class CliDao.
     */
    @Test
    public void testDeleteTeacher() {
        System.out.println("deleteTeacher");
        int user_id = 0;
        CliDao instance = new CliDao();
        int expResult = 0;
        int result = instance.deleteTeacher(user_id);
        assertEquals(expResult, result);
    }


    /**
     * Test of addTeacher method, of class CliDao.
     */
    @Test
    public void testAddTeacher() {
        System.out.println("addTeacher");
        Client cli = new Client();
        cli.setTh_name("Tatiana");
        cli.setTh_lastname("Jimenez");
        cli.setTh_mail("tatiana@gmail.com");
        cli.setTh_phone("31245756");
        cli.setTh_subject("Astronomy");
        CliDao instance = new CliDao();
        int expResult = 1;
        int result = instance.addTeacher(cli);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateTeacherGet method, of class CliDao.
     */
    @Test
    public void testUpdateTeacherGet() {
        System.out.println("updateTeacherGet");
        int teacher_id = 0;
        CliDao instance = new CliDao();
        Client result = instance.updateTeacherGet(teacher_id);
        Client expResult = result;
        assertEquals(expResult, result);
    }

    /**
     * Test of updateTeacherPost method, of class CliDao.
     */
    @Test
    public void testUpdateTeacherPost() {
        System.out.println("updateTeacherPost");
        Client cli = new Client(2, "Jose", "Pojo", "Zuluaga", "123", "jose@gmail.com");
        CliDao instance = new CliDao();
        int result = instance.updateTeacherPost(cli);
        int expRes = 1;
        assertEquals(result, expRes);
    }


    
}
