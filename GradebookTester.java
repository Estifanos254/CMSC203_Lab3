package com.ekebebebw.classes;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GradebookTester {
	
	 
     private Gradebook gb1;
     private Gradebook gb2;
	
	@Before
	  public void setUp() throws Exception {
	    gb1 = new Gradebook(5);
	    gb2 = new Gradebook(5);
	
	    gb1.addScore(50.0);
	    gb1.addScore(75.0);
	    gb2.addScore(80.0);
	    gb2.addScore(90.0);
	
	  }

	  @After
	  public void tearDown() throws Exception{
	    gb1 = gb2 = null;
	  }
       
	  @Test
	  public void testSum() {
	    assertEquals(125, gb1.sum(), 0.001);
	    assertEquals(170, gb2.sum(), 0.001);
	  }
	  
	  @Test
	  public void testMinimum() {
	    assertEquals(50, gb1.minimum(), 0.001);
	    assertEquals(80, gb2.minimum(), 0.001);
	    
	  }
	  
	  @Test
	  public void testAddScore() { 
	    assertTrue(gb1.toString().equals("50.075.0"));
	    assertTrue(gb2.toString().equals("80.090.0"));
	    
	  }


	  @Test
	  public void testFinalScore() {
	    assertEquals(75, gb1.finalScore(), 0.001);
	    assertEquals(90, gb2.finalScore(), 0.001);
	    
	  }

}
