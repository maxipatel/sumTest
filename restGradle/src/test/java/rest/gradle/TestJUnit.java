package rest.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestJUnit {
		@Test  
	    public void testFindMax(){  
			
	        assertEquals(11,SumController.getBook("add",5,6).getResult());  
	        assertEquals(-1,SumController.getBook("subtract",5,6).getResult());
	        assertEquals(30,SumController.getBook("multiply",5,6).getResult());  
	        assertEquals(0,SumController.getBook("divide",5,6).getResult());  
	        assertEquals("Wrong Operation",SumController.getBook("test",5,6).getResult());  
	    }  
}
