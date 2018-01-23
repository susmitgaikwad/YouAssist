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
public class Naive1IT {
    
    public Naive1IT() {
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
     * Test of getHasspamy method, of class Naive1.
     */
    @Test
    public void testGetHasspamy() {
        System.out.println("getHasspamy");
        Naive1 instance = new Naive1();
        String expResult = null;
        String result = instance.getHasspamy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHasspamy method, of class Naive1.
     */
    @Test
    public void testSetHasspamy() {
        System.out.println("setHasspamy");
        String hasspamy = "";
        Naive1 instance = new Naive1();
        instance.setHasspamy(hasspamy);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class Naive1.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        Naive1 instance = new Naive1();
        String expResult = null;
        String result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setResult method, of class Naive1.
     */
    @Test
    public void testSetResult() {
        System.out.println("setResult");
        String result_2 = "";
        Naive1 instance = new Naive1();
        instance.setResult(result_2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVid method, of class Naive1.
     */
    @Test
    public void testGetVid() {
        System.out.println("getVid");
        Naive1 instance = new Naive1();
        String expResult = null;
        String result = instance.getVid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVid method, of class Naive1.
     */
    @Test
    public void testSetVid() {
        System.out.println("setVid");
        String vid = "";
        Naive1 instance = new Naive1();
        instance.setVid(vid);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Naive1.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Naive1 instance = new Naive1();
        String expResult = null;
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Naive1.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Naive1 instance = new Naive1();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Naive1.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Naive1 instance = new Naive1();
        String expResult = null;
        String result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Naive1.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "";
        Naive1 instance = new Naive1();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class Naive1.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        Naive1 instance = new Naive1();
        String expResult = null;
        String result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCategory method, of class Naive1.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String category = "";
        Naive1 instance = new Naive1();
        instance.setCategory(category);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal_age_notspam method, of class Naive1.
     */
    @Test
    public void testGetTotal_age_notspam() {
        System.out.println("getTotal_age_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTotal_age_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal_age_notspam method, of class Naive1.
     */
    @Test
    public void testSetTotal_age_notspam() {
        System.out.println("setTotal_age_notspam");
        double total_age_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTotal_age_notspam(total_age_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal_length_notspam method, of class Naive1.
     */
    @Test
    public void testGetTotal_length_notspam() {
        System.out.println("getTotal_length_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTotal_length_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal_length_notspam method, of class Naive1.
     */
    @Test
    public void testSetTotal_length_notspam() {
        System.out.println("setTotal_length_notspam");
        double total_length_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTotal_length_notspam(total_length_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal_views_notspam method, of class Naive1.
     */
    @Test
    public void testGetTotal_views_notspam() {
        System.out.println("getTotal_views_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTotal_views_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal_views_notspam method, of class Naive1.
     */
    @Test
    public void testSetTotal_views_notspam() {
        System.out.println("setTotal_views_notspam");
        double total_views_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTotal_views_notspam(total_views_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal_avgrating_notspam method, of class Naive1.
     */
    @Test
    public void testGetTotal_avgrating_notspam() {
        System.out.println("getTotal_avgrating_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTotal_avgrating_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal_avgrating_notspam method, of class Naive1.
     */
    @Test
    public void testSetTotal_avgrating_notspam() {
        System.out.println("setTotal_avgrating_notspam");
        double total_avgrating_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTotal_avgrating_notspam(total_avgrating_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal_no_rating_notspam method, of class Naive1.
     */
    @Test
    public void testGetTotal_no_rating_notspam() {
        System.out.println("getTotal_no_rating_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTotal_no_rating_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal_no_rating_notspam method, of class Naive1.
     */
    @Test
    public void testSetTotal_no_rating_notspam() {
        System.out.println("setTotal_no_rating_notspam");
        double total_no_rating_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTotal_no_rating_notspam(total_no_rating_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal_comment_notspam method, of class Naive1.
     */
    @Test
    public void testGetTotal_comment_notspam() {
        System.out.println("getTotal_comment_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTotal_comment_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal_comment_notspam method, of class Naive1.
     */
    @Test
    public void testSetTotal_comment_notspam() {
        System.out.println("setTotal_comment_notspam");
        double total_comment_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTotal_comment_notspam(total_comment_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal_age_spam method, of class Naive1.
     */
    @Test
    public void testGetTotal_age_spam() {
        System.out.println("getTotal_age_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTotal_age_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal_age_spam method, of class Naive1.
     */
    @Test
    public void testSetTotal_age_spam() {
        System.out.println("setTotal_age_spam");
        double total_age_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTotal_age_spam(total_age_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal_length_spam method, of class Naive1.
     */
    @Test
    public void testGetTotal_length_spam() {
        System.out.println("getTotal_length_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTotal_length_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal_length_spam method, of class Naive1.
     */
    @Test
    public void testSetTotal_length_spam() {
        System.out.println("setTotal_length_spam");
        double total_length_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTotal_length_spam(total_length_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal_views_spam method, of class Naive1.
     */
    @Test
    public void testGetTotal_views_spam() {
        System.out.println("getTotal_views_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTotal_views_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal_views_spam method, of class Naive1.
     */
    @Test
    public void testSetTotal_views_spam() {
        System.out.println("setTotal_views_spam");
        double total_views_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTotal_views_spam(total_views_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal_avgrating_spam method, of class Naive1.
     */
    @Test
    public void testGetTotal_avgrating_spam() {
        System.out.println("getTotal_avgrating_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTotal_avgrating_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal_avgrating_spam method, of class Naive1.
     */
    @Test
    public void testSetTotal_avgrating_spam() {
        System.out.println("setTotal_avgrating_spam");
        double total_avgrating_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTotal_avgrating_spam(total_avgrating_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal_no_rating_spam method, of class Naive1.
     */
    @Test
    public void testGetTotal_no_rating_spam() {
        System.out.println("getTotal_no_rating_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTotal_no_rating_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal_no_rating_spam method, of class Naive1.
     */
    @Test
    public void testSetTotal_no_rating_spam() {
        System.out.println("setTotal_no_rating_spam");
        double total_no_rating_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTotal_no_rating_spam(total_no_rating_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal_comment_spam method, of class Naive1.
     */
    @Test
    public void testGetTotal_comment_spam() {
        System.out.println("getTotal_comment_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTotal_comment_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal_comment_spam method, of class Naive1.
     */
    @Test
    public void testSetTotal_comment_spam() {
        System.out.println("setTotal_comment_spam");
        double total_comment_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTotal_comment_spam(total_comment_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNo_of_entries method, of class Naive1.
     */
    @Test
    public void testGetNo_of_entries() {
        System.out.println("getNo_of_entries");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getNo_of_entries();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNo_of_entries method, of class Naive1.
     */
    @Test
    public void testSetNo_of_entries() {
        System.out.println("setNo_of_entries");
        double no_of_entries = 0.0;
        Naive1 instance = new Naive1();
        instance.setNo_of_entries(no_of_entries);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNo_of_attributes method, of class Naive1.
     */
    @Test
    public void testGetNo_of_attributes() {
        System.out.println("getNo_of_attributes");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getNo_of_attributes();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNo_of_attributes method, of class Naive1.
     */
    @Test
    public void testSetNo_of_attributes() {
        System.out.println("setNo_of_attributes");
        double no_of_attributes = 0.0;
        Naive1 instance = new Naive1();
        instance.setNo_of_attributes(no_of_attributes);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCount_notspam method, of class Naive1.
     */
    @Test
    public void testGetCount_notspam() {
        System.out.println("getCount_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getCount_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCount_notspam method, of class Naive1.
     */
    @Test
    public void testSetCount_notspam() {
        System.out.println("setCount_notspam");
        double count_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setCount_notspam(count_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCount_spam method, of class Naive1.
     */
    @Test
    public void testGetCount_spam() {
        System.out.println("getCount_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getCount_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCount_spam method, of class Naive1.
     */
    @Test
    public void testSetCount_spam() {
        System.out.println("setCount_spam");
        double count_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setCount_spam(count_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMean_age_notspam method, of class Naive1.
     */
    @Test
    public void testGetMean_age_notspam() {
        System.out.println("getMean_age_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getMean_age_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMean_age_notspam method, of class Naive1.
     */
    @Test
    public void testSetMean_age_notspam() {
        System.out.println("setMean_age_notspam");
        double mean_age_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setMean_age_notspam(mean_age_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMean_length_notspam method, of class Naive1.
     */
    @Test
    public void testGetMean_length_notspam() {
        System.out.println("getMean_length_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getMean_length_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMean_length_notspam method, of class Naive1.
     */
    @Test
    public void testSetMean_length_notspam() {
        System.out.println("setMean_length_notspam");
        double mean_length_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setMean_length_notspam(mean_length_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMean_views_notspam method, of class Naive1.
     */
    @Test
    public void testGetMean_views_notspam() {
        System.out.println("getMean_views_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getMean_views_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMean_views_notspam method, of class Naive1.
     */
    @Test
    public void testSetMean_views_notspam() {
        System.out.println("setMean_views_notspam");
        double mean_views_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setMean_views_notspam(mean_views_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMean_avgrating_notspam method, of class Naive1.
     */
    @Test
    public void testGetMean_avgrating_notspam() {
        System.out.println("getMean_avgrating_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getMean_avgrating_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMean_avgrating_notspam method, of class Naive1.
     */
    @Test
    public void testSetMean_avgrating_notspam() {
        System.out.println("setMean_avgrating_notspam");
        double mean_avgrating_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setMean_avgrating_notspam(mean_avgrating_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMean_no_rating_notspam method, of class Naive1.
     */
    @Test
    public void testGetMean_no_rating_notspam() {
        System.out.println("getMean_no_rating_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getMean_no_rating_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMean_no_rating_notspam method, of class Naive1.
     */
    @Test
    public void testSetMean_no_rating_notspam() {
        System.out.println("setMean_no_rating_notspam");
        double mean_no_rating_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setMean_no_rating_notspam(mean_no_rating_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMean_comment_notspam method, of class Naive1.
     */
    @Test
    public void testGetMean_comment_notspam() {
        System.out.println("getMean_comment_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getMean_comment_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMean_comment_notspam method, of class Naive1.
     */
    @Test
    public void testSetMean_comment_notspam() {
        System.out.println("setMean_comment_notspam");
        double mean_comment_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setMean_comment_notspam(mean_comment_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVar_length_notspam method, of class Naive1.
     */
    @Test
    public void testGetVar_length_notspam() {
        System.out.println("getVar_length_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getVar_length_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVar_length_notspam method, of class Naive1.
     */
    @Test
    public void testSetVar_length_notspam() {
        System.out.println("setVar_length_notspam");
        double var_length_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setVar_length_notspam(var_length_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVar_age_notspam method, of class Naive1.
     */
    @Test
    public void testGetVar_age_notspam() {
        System.out.println("getVar_age_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getVar_age_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVar_age_notspam method, of class Naive1.
     */
    @Test
    public void testSetVar_age_notspam() {
        System.out.println("setVar_age_notspam");
        double var_age_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setVar_age_notspam(var_age_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVar_views_notspam method, of class Naive1.
     */
    @Test
    public void testGetVar_views_notspam() {
        System.out.println("getVar_views_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getVar_views_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVar_views_notspam method, of class Naive1.
     */
    @Test
    public void testSetVar_views_notspam() {
        System.out.println("setVar_views_notspam");
        double var_views_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setVar_views_notspam(var_views_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVar_avgrating_notspam method, of class Naive1.
     */
    @Test
    public void testGetVar_avgrating_notspam() {
        System.out.println("getVar_avgrating_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getVar_avgrating_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVar_avgrating_notspam method, of class Naive1.
     */
    @Test
    public void testSetVar_avgrating_notspam() {
        System.out.println("setVar_avgrating_notspam");
        double var_avgrating_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setVar_avgrating_notspam(var_avgrating_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVar_no_rating_notspam method, of class Naive1.
     */
    @Test
    public void testGetVar_no_rating_notspam() {
        System.out.println("getVar_no_rating_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getVar_no_rating_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVar_no_rating_notspam method, of class Naive1.
     */
    @Test
    public void testSetVar_no_rating_notspam() {
        System.out.println("setVar_no_rating_notspam");
        double var_no_rating_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setVar_no_rating_notspam(var_no_rating_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVar_comment_notspam method, of class Naive1.
     */
    @Test
    public void testGetVar_comment_notspam() {
        System.out.println("getVar_comment_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getVar_comment_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVar_comment_notspam method, of class Naive1.
     */
    @Test
    public void testSetVar_comment_notspam() {
        System.out.println("setVar_comment_notspam");
        double var_comment_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setVar_comment_notspam(var_comment_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMean_age_spam method, of class Naive1.
     */
    @Test
    public void testGetMean_age_spam() {
        System.out.println("getMean_age_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getMean_age_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMean_age_spam method, of class Naive1.
     */
    @Test
    public void testSetMean_age_spam() {
        System.out.println("setMean_age_spam");
        double mean_age_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setMean_age_spam(mean_age_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMean_length_spam method, of class Naive1.
     */
    @Test
    public void testGetMean_length_spam() {
        System.out.println("getMean_length_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getMean_length_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMean_length_spam method, of class Naive1.
     */
    @Test
    public void testSetMean_length_spam() {
        System.out.println("setMean_length_spam");
        double mean_length_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setMean_length_spam(mean_length_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMean_views_spam method, of class Naive1.
     */
    @Test
    public void testGetMean_views_spam() {
        System.out.println("getMean_views_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getMean_views_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMean_views_spam method, of class Naive1.
     */
    @Test
    public void testSetMean_views_spam() {
        System.out.println("setMean_views_spam");
        double mean_views_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setMean_views_spam(mean_views_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMean_avgrating_spam method, of class Naive1.
     */
    @Test
    public void testGetMean_avgrating_spam() {
        System.out.println("getMean_avgrating_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getMean_avgrating_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMean_avgrating_spam method, of class Naive1.
     */
    @Test
    public void testSetMean_avgrating_spam() {
        System.out.println("setMean_avgrating_spam");
        double mean_avgrating_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setMean_avgrating_spam(mean_avgrating_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMean_no_rating_spam method, of class Naive1.
     */
    @Test
    public void testGetMean_no_rating_spam() {
        System.out.println("getMean_no_rating_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getMean_no_rating_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMean_no_rating_spam method, of class Naive1.
     */
    @Test
    public void testSetMean_no_rating_spam() {
        System.out.println("setMean_no_rating_spam");
        double mean_no_rating_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setMean_no_rating_spam(mean_no_rating_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMean_comment_spam method, of class Naive1.
     */
    @Test
    public void testGetMean_comment_spam() {
        System.out.println("getMean_comment_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getMean_comment_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMean_comment_spam method, of class Naive1.
     */
    @Test
    public void testSetMean_comment_spam() {
        System.out.println("setMean_comment_spam");
        double mean_comment_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setMean_comment_spam(mean_comment_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVar_length_spam method, of class Naive1.
     */
    @Test
    public void testGetVar_length_spam() {
        System.out.println("getVar_length_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getVar_length_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVar_length_spam method, of class Naive1.
     */
    @Test
    public void testSetVar_length_spam() {
        System.out.println("setVar_length_spam");
        double var_length_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setVar_length_spam(var_length_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVar_age_spam method, of class Naive1.
     */
    @Test
    public void testGetVar_age_spam() {
        System.out.println("getVar_age_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getVar_age_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVar_age_spam method, of class Naive1.
     */
    @Test
    public void testSetVar_age_spam() {
        System.out.println("setVar_age_spam");
        double var_age_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setVar_age_spam(var_age_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVar_views_spam method, of class Naive1.
     */
    @Test
    public void testGetVar_views_spam() {
        System.out.println("getVar_views_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getVar_views_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVar_views_spam method, of class Naive1.
     */
    @Test
    public void testSetVar_views_spam() {
        System.out.println("setVar_views_spam");
        double var_views_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setVar_views_spam(var_views_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVar_avgrating_spam method, of class Naive1.
     */
    @Test
    public void testGetVar_avgrating_spam() {
        System.out.println("getVar_avgrating_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getVar_avgrating_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVar_avgrating_spam method, of class Naive1.
     */
    @Test
    public void testSetVar_avgrating_spam() {
        System.out.println("setVar_avgrating_spam");
        double var_avgrating_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setVar_avgrating_spam(var_avgrating_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVar_no_rating_spam method, of class Naive1.
     */
    @Test
    public void testGetVar_no_rating_spam() {
        System.out.println("getVar_no_rating_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getVar_no_rating_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVar_no_rating_spam method, of class Naive1.
     */
    @Test
    public void testSetVar_no_rating_spam() {
        System.out.println("setVar_no_rating_spam");
        double var_no_rating_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setVar_no_rating_spam(var_no_rating_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVar_comment_spam method, of class Naive1.
     */
    @Test
    public void testGetVar_comment_spam() {
        System.out.println("getVar_comment_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getVar_comment_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVar_comment_spam method, of class Naive1.
     */
    @Test
    public void testSetVar_comment_spam() {
        System.out.println("setVar_comment_spam");
        double var_comment_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setVar_comment_spam(var_comment_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTemp_length_notspam method, of class Naive1.
     */
    @Test
    public void testGetTemp_length_notspam() {
        System.out.println("getTemp_length_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTemp_length_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTemp_length_notspam method, of class Naive1.
     */
    @Test
    public void testSetTemp_length_notspam() {
        System.out.println("setTemp_length_notspam");
        double temp_length_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTemp_length_notspam(temp_length_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTemp_age_notspam method, of class Naive1.
     */
    @Test
    public void testGetTemp_age_notspam() {
        System.out.println("getTemp_age_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTemp_age_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTemp_age_notspam method, of class Naive1.
     */
    @Test
    public void testSetTemp_age_notspam() {
        System.out.println("setTemp_age_notspam");
        double temp_age_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTemp_age_notspam(temp_age_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTemp_views_notspam method, of class Naive1.
     */
    @Test
    public void testGetTemp_views_notspam() {
        System.out.println("getTemp_views_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTemp_views_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTemp_views_notspam method, of class Naive1.
     */
    @Test
    public void testSetTemp_views_notspam() {
        System.out.println("setTemp_views_notspam");
        double temp_views_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTemp_views_notspam(temp_views_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTemp_avgrating_notspam method, of class Naive1.
     */
    @Test
    public void testGetTemp_avgrating_notspam() {
        System.out.println("getTemp_avgrating_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTemp_avgrating_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTemp_avgrating_notspam method, of class Naive1.
     */
    @Test
    public void testSetTemp_avgrating_notspam() {
        System.out.println("setTemp_avgrating_notspam");
        double temp_avgrating_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTemp_avgrating_notspam(temp_avgrating_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTemp_no_rating_notspam method, of class Naive1.
     */
    @Test
    public void testGetTemp_no_rating_notspam() {
        System.out.println("getTemp_no_rating_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTemp_no_rating_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTemp_no_rating_notspam method, of class Naive1.
     */
    @Test
    public void testSetTemp_no_rating_notspam() {
        System.out.println("setTemp_no_rating_notspam");
        double temp_no_rating_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTemp_no_rating_notspam(temp_no_rating_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTemp_comment_notspam method, of class Naive1.
     */
    @Test
    public void testGetTemp_comment_notspam() {
        System.out.println("getTemp_comment_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTemp_comment_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTemp_comment_notspam method, of class Naive1.
     */
    @Test
    public void testSetTemp_comment_notspam() {
        System.out.println("setTemp_comment_notspam");
        double temp_comment_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTemp_comment_notspam(temp_comment_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTemp_length_spam method, of class Naive1.
     */
    @Test
    public void testGetTemp_length_spam() {
        System.out.println("getTemp_length_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTemp_length_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTemp_length_spam method, of class Naive1.
     */
    @Test
    public void testSetTemp_length_spam() {
        System.out.println("setTemp_length_spam");
        double temp_length_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTemp_length_spam(temp_length_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTemp_age_spam method, of class Naive1.
     */
    @Test
    public void testGetTemp_age_spam() {
        System.out.println("getTemp_age_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTemp_age_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTemp_age_spam method, of class Naive1.
     */
    @Test
    public void testSetTemp_age_spam() {
        System.out.println("setTemp_age_spam");
        double temp_age_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTemp_age_spam(temp_age_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTemp_views_spam method, of class Naive1.
     */
    @Test
    public void testGetTemp_views_spam() {
        System.out.println("getTemp_views_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTemp_views_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTemp_views_spam method, of class Naive1.
     */
    @Test
    public void testSetTemp_views_spam() {
        System.out.println("setTemp_views_spam");
        double temp_views_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTemp_views_spam(temp_views_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTemp_avgrating_spam method, of class Naive1.
     */
    @Test
    public void testGetTemp_avgrating_spam() {
        System.out.println("getTemp_avgrating_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTemp_avgrating_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTemp_avgrating_spam method, of class Naive1.
     */
    @Test
    public void testSetTemp_avgrating_spam() {
        System.out.println("setTemp_avgrating_spam");
        double temp_avgrating_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTemp_avgrating_spam(temp_avgrating_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTemp_no_rating_spam method, of class Naive1.
     */
    @Test
    public void testGetTemp_no_rating_spam() {
        System.out.println("getTemp_no_rating_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTemp_no_rating_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTemp_no_rating_spam method, of class Naive1.
     */
    @Test
    public void testSetTemp_no_rating_spam() {
        System.out.println("setTemp_no_rating_spam");
        double temp_no_rating_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTemp_no_rating_spam(temp_no_rating_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTemp_comment_spam method, of class Naive1.
     */
    @Test
    public void testGetTemp_comment_spam() {
        System.out.println("getTemp_comment_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getTemp_comment_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTemp_comment_spam method, of class Naive1.
     */
    @Test
    public void testSetTemp_comment_spam() {
        System.out.println("setTemp_comment_spam");
        double temp_comment_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setTemp_comment_spam(temp_comment_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProb_notspam method, of class Naive1.
     */
    @Test
    public void testGetProb_notspam() {
        System.out.println("getProb_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getProb_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProb_notspam method, of class Naive1.
     */
    @Test
    public void testSetProb_notspam() {
        System.out.println("setProb_notspam");
        double prob_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setProb_notspam(prob_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProb_spam method, of class Naive1.
     */
    @Test
    public void testGetProb_spam() {
        System.out.println("getProb_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getProb_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProb_spam method, of class Naive1.
     */
    @Test
    public void testSetProb_spam() {
        System.out.println("setProb_spam");
        double prob_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setProb_spam(prob_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProb_length_notspam method, of class Naive1.
     */
    @Test
    public void testGetProb_length_notspam() {
        System.out.println("getProb_length_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getProb_length_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProb_length_notspam method, of class Naive1.
     */
    @Test
    public void testSetProb_length_notspam() {
        System.out.println("setProb_length_notspam");
        double prob_length_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setProb_length_notspam(prob_length_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProb_age_notspam method, of class Naive1.
     */
    @Test
    public void testGetProb_age_notspam() {
        System.out.println("getProb_age_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getProb_age_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProb_age_notspam method, of class Naive1.
     */
    @Test
    public void testSetProb_age_notspam() {
        System.out.println("setProb_age_notspam");
        double prob_age_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setProb_age_notspam(prob_age_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProb_views_notspam method, of class Naive1.
     */
    @Test
    public void testGetProb_views_notspam() {
        System.out.println("getProb_views_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getProb_views_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProb_views_notspam method, of class Naive1.
     */
    @Test
    public void testSetProb_views_notspam() {
        System.out.println("setProb_views_notspam");
        double prob_views_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setProb_views_notspam(prob_views_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProb_avgrating_notspam method, of class Naive1.
     */
    @Test
    public void testGetProb_avgrating_notspam() {
        System.out.println("getProb_avgrating_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getProb_avgrating_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProb_avgrating_notspam method, of class Naive1.
     */
    @Test
    public void testSetProb_avgrating_notspam() {
        System.out.println("setProb_avgrating_notspam");
        double prob_avgrating_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setProb_avgrating_notspam(prob_avgrating_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProb_no_rating_notspam method, of class Naive1.
     */
    @Test
    public void testGetProb_no_rating_notspam() {
        System.out.println("getProb_no_rating_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getProb_no_rating_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProb_no_rating_notspam method, of class Naive1.
     */
    @Test
    public void testSetProb_no_rating_notspam() {
        System.out.println("setProb_no_rating_notspam");
        double prob_no_rating_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setProb_no_rating_notspam(prob_no_rating_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProb_comment_notspam method, of class Naive1.
     */
    @Test
    public void testGetProb_comment_notspam() {
        System.out.println("getProb_comment_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getProb_comment_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProb_comment_notspam method, of class Naive1.
     */
    @Test
    public void testSetProb_comment_notspam() {
        System.out.println("setProb_comment_notspam");
        double prob_comment_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setProb_comment_notspam(prob_comment_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProb_length_spam method, of class Naive1.
     */
    @Test
    public void testGetProb_length_spam() {
        System.out.println("getProb_length_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getProb_length_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProb_length_spam method, of class Naive1.
     */
    @Test
    public void testSetProb_length_spam() {
        System.out.println("setProb_length_spam");
        double prob_length_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setProb_length_spam(prob_length_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProb_age_spam method, of class Naive1.
     */
    @Test
    public void testGetProb_age_spam() {
        System.out.println("getProb_age_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getProb_age_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProb_age_spam method, of class Naive1.
     */
    @Test
    public void testSetProb_age_spam() {
        System.out.println("setProb_age_spam");
        double prob_age_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setProb_age_spam(prob_age_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProb_views_spam method, of class Naive1.
     */
    @Test
    public void testGetProb_views_spam() {
        System.out.println("getProb_views_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getProb_views_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProb_views_spam method, of class Naive1.
     */
    @Test
    public void testSetProb_views_spam() {
        System.out.println("setProb_views_spam");
        double prob_views_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setProb_views_spam(prob_views_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProb_avgrating_spam method, of class Naive1.
     */
    @Test
    public void testGetProb_avgrating_spam() {
        System.out.println("getProb_avgrating_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getProb_avgrating_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProb_avgrating_spam method, of class Naive1.
     */
    @Test
    public void testSetProb_avgrating_spam() {
        System.out.println("setProb_avgrating_spam");
        double prob_avgrating_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setProb_avgrating_spam(prob_avgrating_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProb_no_rating_spam method, of class Naive1.
     */
    @Test
    public void testGetProb_no_rating_spam() {
        System.out.println("getProb_no_rating_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getProb_no_rating_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProb_no_rating_spam method, of class Naive1.
     */
    @Test
    public void testSetProb_no_rating_spam() {
        System.out.println("setProb_no_rating_spam");
        double prob_no_rating_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setProb_no_rating_spam(prob_no_rating_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProb_comment_spam method, of class Naive1.
     */
    @Test
    public void testGetProb_comment_spam() {
        System.out.println("getProb_comment_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getProb_comment_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProb_comment_spam method, of class Naive1.
     */
    @Test
    public void testSetProb_comment_spam() {
        System.out.println("setProb_comment_spam");
        double prob_comment_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setProb_comment_spam(prob_comment_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSigma_length_notspam method, of class Naive1.
     */
    @Test
    public void testGetSigma_length_notspam() {
        System.out.println("getSigma_length_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getSigma_length_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSigma_length_notspam method, of class Naive1.
     */
    @Test
    public void testSetSigma_length_notspam() {
        System.out.println("setSigma_length_notspam");
        double sigma_length_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setSigma_length_notspam(sigma_length_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSigma_age_notspam method, of class Naive1.
     */
    @Test
    public void testGetSigma_age_notspam() {
        System.out.println("getSigma_age_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getSigma_age_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSigma_age_notspam method, of class Naive1.
     */
    @Test
    public void testSetSigma_age_notspam() {
        System.out.println("setSigma_age_notspam");
        double sigma_age_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setSigma_age_notspam(sigma_age_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSigma_views_notspam method, of class Naive1.
     */
    @Test
    public void testGetSigma_views_notspam() {
        System.out.println("getSigma_views_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getSigma_views_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSigma_views_notspam method, of class Naive1.
     */
    @Test
    public void testSetSigma_views_notspam() {
        System.out.println("setSigma_views_notspam");
        double sigma_views_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setSigma_views_notspam(sigma_views_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSigma_avgrating_notspam method, of class Naive1.
     */
    @Test
    public void testGetSigma_avgrating_notspam() {
        System.out.println("getSigma_avgrating_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getSigma_avgrating_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSigma_avgrating_notspam method, of class Naive1.
     */
    @Test
    public void testSetSigma_avgrating_notspam() {
        System.out.println("setSigma_avgrating_notspam");
        double sigma_avgrating_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setSigma_avgrating_notspam(sigma_avgrating_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSigma_no_rating_notspam method, of class Naive1.
     */
    @Test
    public void testGetSigma_no_rating_notspam() {
        System.out.println("getSigma_no_rating_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getSigma_no_rating_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSigma_no_rating_notspam method, of class Naive1.
     */
    @Test
    public void testSetSigma_no_rating_notspam() {
        System.out.println("setSigma_no_rating_notspam");
        double sigma_no_rating_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setSigma_no_rating_notspam(sigma_no_rating_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSigma_comment_notspam method, of class Naive1.
     */
    @Test
    public void testGetSigma_comment_notspam() {
        System.out.println("getSigma_comment_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getSigma_comment_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSigma_comment_notspam method, of class Naive1.
     */
    @Test
    public void testSetSigma_comment_notspam() {
        System.out.println("setSigma_comment_notspam");
        double sigma_comment_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setSigma_comment_notspam(sigma_comment_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSigma_length_spam method, of class Naive1.
     */
    @Test
    public void testGetSigma_length_spam() {
        System.out.println("getSigma_length_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getSigma_length_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSigma_length_spam method, of class Naive1.
     */
    @Test
    public void testSetSigma_length_spam() {
        System.out.println("setSigma_length_spam");
        double sigma_length_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setSigma_length_spam(sigma_length_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSigma_age_spam method, of class Naive1.
     */
    @Test
    public void testGetSigma_age_spam() {
        System.out.println("getSigma_age_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getSigma_age_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSigma_age_spam method, of class Naive1.
     */
    @Test
    public void testSetSigma_age_spam() {
        System.out.println("setSigma_age_spam");
        double sigma_age_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setSigma_age_spam(sigma_age_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSigma_views_spam method, of class Naive1.
     */
    @Test
    public void testGetSigma_views_spam() {
        System.out.println("getSigma_views_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getSigma_views_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSigma_views_spam method, of class Naive1.
     */
    @Test
    public void testSetSigma_views_spam() {
        System.out.println("setSigma_views_spam");
        double sigma_views_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setSigma_views_spam(sigma_views_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSigma_avgrating_spam method, of class Naive1.
     */
    @Test
    public void testGetSigma_avgrating_spam() {
        System.out.println("getSigma_avgrating_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getSigma_avgrating_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSigma_avgrating_spam method, of class Naive1.
     */
    @Test
    public void testSetSigma_avgrating_spam() {
        System.out.println("setSigma_avgrating_spam");
        double sigma_avgrating_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setSigma_avgrating_spam(sigma_avgrating_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSigma_no_rating_spam method, of class Naive1.
     */
    @Test
    public void testGetSigma_no_rating_spam() {
        System.out.println("getSigma_no_rating_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getSigma_no_rating_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSigma_no_rating_spam method, of class Naive1.
     */
    @Test
    public void testSetSigma_no_rating_spam() {
        System.out.println("setSigma_no_rating_spam");
        double sigma_no_rating_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setSigma_no_rating_spam(sigma_no_rating_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSigma_comment_spam method, of class Naive1.
     */
    @Test
    public void testGetSigma_comment_spam() {
        System.out.println("getSigma_comment_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getSigma_comment_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSigma_comment_spam method, of class Naive1.
     */
    @Test
    public void testSetSigma_comment_spam() {
        System.out.println("setSigma_comment_spam");
        double sigma_comment_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setSigma_comment_spam(sigma_comment_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getX_age method, of class Naive1.
     */
    @Test
    public void testGetX_age() {
        System.out.println("getX_age");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getX_age();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setX_age method, of class Naive1.
     */
    @Test
    public void testSetX_age() {
        System.out.println("setX_age");
        double x_age = 0.0;
        Naive1 instance = new Naive1();
        instance.setX_age(x_age);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getX_length method, of class Naive1.
     */
    @Test
    public void testGetX_length() {
        System.out.println("getX_length");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getX_length();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setX_length method, of class Naive1.
     */
    @Test
    public void testSetX_length() {
        System.out.println("setX_length");
        double x_length = 0.0;
        Naive1 instance = new Naive1();
        instance.setX_length(x_length);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getX_view method, of class Naive1.
     */
    @Test
    public void testGetX_view() {
        System.out.println("getX_view");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getX_view();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setX_view method, of class Naive1.
     */
    @Test
    public void testSetX_view() {
        System.out.println("setX_view");
        double x_view = 0.0;
        Naive1 instance = new Naive1();
        instance.setX_view(x_view);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getX_avgrating method, of class Naive1.
     */
    @Test
    public void testGetX_avgrating() {
        System.out.println("getX_avgrating");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getX_avgrating();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setX_avgrating method, of class Naive1.
     */
    @Test
    public void testSetX_avgrating() {
        System.out.println("setX_avgrating");
        double x_avgrating = 0.0;
        Naive1 instance = new Naive1();
        instance.setX_avgrating(x_avgrating);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getX_no_rating method, of class Naive1.
     */
    @Test
    public void testGetX_no_rating() {
        System.out.println("getX_no_rating");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getX_no_rating();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setX_no_rating method, of class Naive1.
     */
    @Test
    public void testSetX_no_rating() {
        System.out.println("setX_no_rating");
        double x_no_rating = 0.0;
        Naive1 instance = new Naive1();
        instance.setX_no_rating(x_no_rating);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getX_comment method, of class Naive1.
     */
    @Test
    public void testGetX_comment() {
        System.out.println("getX_comment");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getX_comment();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setX_comment method, of class Naive1.
     */
    @Test
    public void testSetX_comment() {
        System.out.println("setX_comment");
        double x_comment = 0.0;
        Naive1 instance = new Naive1();
        instance.setX_comment(x_comment);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPosterior_notspam method, of class Naive1.
     */
    @Test
    public void testGetPosterior_notspam() {
        System.out.println("getPosterior_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getPosterior_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPosterior_notspam method, of class Naive1.
     */
    @Test
    public void testSetPosterior_notspam() {
        System.out.println("setPosterior_notspam");
        double posterior_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setPosterior_notspam(posterior_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPosterior_spam method, of class Naive1.
     */
    @Test
    public void testGetPosterior_spam() {
        System.out.println("getPosterior_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getPosterior_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPosterior_spam method, of class Naive1.
     */
    @Test
    public void testSetPosterior_spam() {
        System.out.println("setPosterior_spam");
        double posterior_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setPosterior_spam(posterior_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPosterior_numerator_notspam method, of class Naive1.
     */
    @Test
    public void testGetPosterior_numerator_notspam() {
        System.out.println("getPosterior_numerator_notspam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getPosterior_numerator_notspam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPosterior_numerator_notspam method, of class Naive1.
     */
    @Test
    public void testSetPosterior_numerator_notspam() {
        System.out.println("setPosterior_numerator_notspam");
        double posterior_numerator_notspam = 0.0;
        Naive1 instance = new Naive1();
        instance.setPosterior_numerator_notspam(posterior_numerator_notspam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPosterior_numerator_spam method, of class Naive1.
     */
    @Test
    public void testGetPosterior_numerator_spam() {
        System.out.println("getPosterior_numerator_spam");
        Naive1 instance = new Naive1();
        double expResult = 0.0;
        double result = instance.getPosterior_numerator_spam();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPosterior_numerator_spam method, of class Naive1.
     */
    @Test
    public void testSetPosterior_numerator_spam() {
        System.out.println("setPosterior_numerator_spam");
        double posterior_numerator_spam = 0.0;
        Naive1 instance = new Naive1();
        instance.setPosterior_numerator_spam(posterior_numerator_spam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mean method, of class Naive1.
     */
    @Test(expected=NullPointerException.class)
    public void testMean() {
        System.out.println("mean");
        Naive1 instance = new Naive1();
        instance.mean();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of variance method, of class Naive1.
     */
    @Test(expected=NullPointerException.class)
    public void testVariance() {
        System.out.println("variance");
        Naive1 instance = new Naive1();
        instance.variance();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of probability method, of class Naive1.
     */
    @Test
    public void testProbability() {
        System.out.println("probability");
        Naive1 instance = new Naive1();
        instance.probability();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of accept method, of class Naive1.
     */
    @Test
    public void testAccept() {
        System.out.println("accept");
        String date = "";
        double length = 0.0;
        double views = 0.0;
        double avgrating = 0.0;
        double noofrating = 0.0;
        double comment = 0.0;
        Naive1 instance = new Naive1();
        instance.accept(date, length, views, avgrating, noofrating, comment);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calc_age method, of class Naive1.
     */
    @Test(expected=NullPointerException.class)
    public void testCalc_age() throws Exception {
        System.out.println("calc_age");
        Naive1 instance = new Naive1();
        instance.calc_age();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDay method, of class Naive1.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Naive1 instance = new Naive1();
        int expResult = 0;
        int result = instance.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDay method, of class Naive1.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        int day = 0;
        Naive1 instance = new Naive1();
        instance.setDay(day);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMonth method, of class Naive1.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Naive1 instance = new Naive1();
        int expResult = 0;
        int result = instance.getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMonth method, of class Naive1.
     */
    @Test
    public void testSetMonth() {
        System.out.println("setMonth");
        int month = 0;
        Naive1 instance = new Naive1();
        instance.setMonth(month);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class Naive1.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Naive1 instance = new Naive1();
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setYear method, of class Naive1.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 0;
        Naive1 instance = new Naive1();
        instance.setYear(year);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVideo_date method, of class Naive1.
     */
    @Test
    public void testGetVideo_date() {
        System.out.println("getVideo_date");
        Naive1 instance = new Naive1();
        String expResult = null;
        String result = instance.getVideo_date();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVideo_date method, of class Naive1.
     */
    @Test
    public void testSetVideo_date() {
        System.out.println("setVideo_date");
        String video_date = "";
        Naive1 instance = new Naive1();
        instance.setVideo_date(video_date);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}