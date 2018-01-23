/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spam_detection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Susmit
 */
public class CsvWriterAppendExampleIT {
    
    public CsvWriterAppendExampleIT() {
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
     * Test of writer method, of class CsvWriterAppendExample.
     */
    @Test(expected=NullPointerException.class)
    public void testWriter() throws Exception {
        System.out.println("writer");
        CsvWriterAppendExample o = null;
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        instance.writer(o);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of csvwriter method, of class CsvWriterAppendExample.
     */
    @Test
    public void testCsvwriter() throws Exception {
        System.out.println("csvwriter");
        String vid = "";
        String title = "";
        String user = "";
        String category = "";
        String age = "";
        String length = "";
        String view = "";
        String arating = "";
        String nrating = "";
        String comment = "";
        String hasspam = "";
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        instance.csvwriter(vid, title, user, category, age, length, view, arating, nrating, comment, hasspam);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of getVid method, of class CsvWriterAppendExample.
     */
    @Test
    public void testGetVid() {
        System.out.println("getVid");
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        String expResult = null;
        String result = instance.getVid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of setVid method, of class CsvWriterAppendExample.
     */
    @Test
    public void testSetVid() {
        System.out.println("setVid");
        String vid = "";
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        instance.setVid(vid);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class CsvWriterAppendExample.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        String expResult = null;
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class CsvWriterAppendExample.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class CsvWriterAppendExample.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        String expResult = null;
        String result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class CsvWriterAppendExample.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "";
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class CsvWriterAppendExample.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        String expResult = null;
        String result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of setCategory method, of class CsvWriterAppendExample.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String category = "";
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        instance.setCategory(category);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of getView method, of class CsvWriterAppendExample.
     */
    @Test
    public void testGetView() {
        System.out.println("getView");
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        String expResult = null;
        String result = instance.getView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of setView method, of class CsvWriterAppendExample.
     */
    @Test
    public void testSetView() {
        System.out.println("setView");
        String view = "";
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        instance.setView(view);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class CsvWriterAppendExample.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        String expResult = null;
        String result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class CsvWriterAppendExample.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        String age = "";
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of getLength method, of class CsvWriterAppendExample.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        String expResult = null;
        String result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of setLength method, of class CsvWriterAppendExample.
     */
    @Test
    public void testSetLength() {
        System.out.println("setLength");
        String length = "";
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        instance.setLength(length);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of getNrating method, of class CsvWriterAppendExample.
     */
    @Test
    public void testGetNrating() {
        System.out.println("getNrating");
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        String expResult = null;
        String result = instance.getNrating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of setNrating method, of class CsvWriterAppendExample.
     */
    @Test
    public void testSetNrating() {
        System.out.println("setNrating");
        String nrating = "";
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        instance.setNrating(nrating);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of getComment method, of class CsvWriterAppendExample.
     */
    @Test
    public void testGetComment() {
        System.out.println("getComment");
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        String expResult = null;
        String result = instance.getComment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of setComment method, of class CsvWriterAppendExample.
     */
    @Test
    public void testSetComment() {
        System.out.println("setComment");
        String comment = "";
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        instance.setComment(comment);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of getArating method, of class CsvWriterAppendExample.
     */
    @Test
    public void testGetArating() {
        System.out.println("getArating");
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        String expResult = null;
        String result = instance.getArating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of setArating method, of class CsvWriterAppendExample.
     */
    @Test
    public void testSetArating() {
        System.out.println("setArating");
        String arating = "";
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        instance.setArating(arating);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of getHasspam method, of class CsvWriterAppendExample.
     */
    @Test
    public void testGetHasspam() {
        System.out.println("getHasspam");
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        String expResult = null;
        String result = instance.getHasspam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of setHasspam method, of class CsvWriterAppendExample.
     */
    @Test
    public void testSetHasspam() {
        System.out.println("setHasspam");
        String hasspam = "";
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        instance.setHasspam(hasspam);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of getCount method, of class CsvWriterAppendExample.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        String expResult = null;
        String result = instance.getCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of setCount method, of class CsvWriterAppendExample.
     */
    @Test
    public void testSetCount() {
        System.out.println("setCount");
        String count = "";
        CsvWriterAppendExample instance = new CsvWriterAppendExample();
        instance.setCount(count);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }
    
}