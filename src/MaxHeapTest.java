/**
 *
 * Spoorthi Gowda
 * Homework 7 - problem 2 
 *
 *
 */
import static org.junit.Assert.assertEquals;
import java.util.Random;
import org.junit.Test;

public class MaxHeapTest {
	
	@Test
	public void MaxHeapLogNTest() {
        // homework
		System.out.println("In MaxHeapLogNTest =====>");
		Integer [] arr = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
		
		MaxHeap mh = new MaxHeap(arr.length);
		mh.MaxHeapLogN(arr);
		 for (int i = 0; i < mh.data.length; i++) {
	        	System.out.println(mh.data[i]);
			}
		assertEquals(new Integer[] {17, 15, 13, 9, 8, 10, 3, 6, 1, 5, 4}, mh.data);
    }
	
	@Test
	public void MaxHeapNTest() {
        // homework
		System.out.println("In MaxHeapNTest =====>");
		Integer [] arr = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
		
		MaxHeap mh = new MaxHeap(arr.length);
		mh.MaxHeapN(arr);
		 for (int i = 0; i < mh.data.length; i++) {
	        	System.out.println(mh.data[i]);
			}
		assertEquals(new Integer[] {17, 15, 13, 9, 6, 5, 10, 4, 8, 3, 1}, mh.data);
    }
	
	
	@Test
    public void addItemTests() {
		MaxHeap mh = new MaxHeap(1);
		assertEquals(true, mh.add(19));
		assertEquals(false, mh.add(21));
	}
	
	@Test
    public void getMaxItemTests() {
		MaxHeap mh = new MaxHeap(3);
		mh.add(19);
		mh.add(21);
		mh.add(23);
		assertEquals(new Integer(23), mh.get());
	}
	
	@Test
    public void popItemTests() {
		MaxHeap mh = new MaxHeap(3);
		mh.add(19);
		mh.add(21);
		mh.add(23);
		assertEquals(new Integer(23), mh.pop());
	}
	
}
