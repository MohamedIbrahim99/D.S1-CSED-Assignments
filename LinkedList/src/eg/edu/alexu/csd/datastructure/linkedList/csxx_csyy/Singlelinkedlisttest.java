package eg.edu.alexu.csd.datastructure.linkedList.csxx_csyy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class Singlelinkedlisttest {

	 /**
	   * test add and get methods.
	   **/
	  @Test
	 public void test_add() { 
			singlelinkedlist test1 = new singlelinkedlist() ;
			test1.add(0);
			test1.add(1);
			test1.add(2);
			test1.add(3);
			assertEquals(1,test1.get(1)) ;
		}
	  /**
		 * Test contains method
		 */

		 @Test
	 
	public void test_contains() {
		singlelinkedlist test1 = new singlelinkedlist() ;
		test1.add(0);
		test1.add(1);
		test1.add(2);
		test1.add(3);
		assertTrue(test1.contains(1)) ;
	}
		 /**
		   * test for set method
		   **/
		  @Test
		  public void test_set() {
			  singlelinkedlist tes1 = new singlelinkedlist();
		    final int n = 3;
		    tes1.add(1);
		    tes1.add(n);
		    tes1.add(n + 2);
		    tes1.set(1, 'F');
		    assertEquals('F', tes1.get(1));
		  }
		  /**
		   * test to sublist.
		   **/
		  @Test
		  public void test_sublist() {
			  singlelinkedlist test1 = new singlelinkedlist();
			  test1.add('a');
			  test1.add('b');
			  test1.add('c');
			  test1.add('d');
		    singlelinkedlist temp = (singlelinkedlist) test1.sublist(1, 2);
		    assertEquals(temp.get(0), test1.get(1));
		    assertEquals(temp.get(1), test1.get(2));
		  }
	  
	  


}
