import static org.junit.Assert.assertEquals;
import java.util.Random;
import org.junit.Test;
public class MaxHeapTest {
    
    @Test
    public void MaxHeapLogN() { 
        // homework
        System.out.println("In MaxHeapLogN =====>");

        Integer[] arr = new Integer[10000];
        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            arr[i] = r.nextInt((10000 - 1) + 1) + 1;
        }
        
        MaxHeap mh = new MaxHeap(10000);
        System.out.println(System.currentTimeMillis());
        mh.MaxHeapLogN(arr);
        
        
        System.out.println(System.currentTimeMillis());
    }
    
    @Test
    public void MaxHeapN() { 
        // homework
        System.out.println("In MaxHeapN =====>");
        
        Integer[] arr = new Integer[10000];
        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            arr[i] = r.nextInt((10000 - 1) + 1) + 1;
        }
      
        
        MaxHeap mh = new MaxHeap(10000);
        System.out.println(System.currentTimeMillis());
        mh.MaxHeapN(arr);
        System.out.println(System.currentTimeMillis());
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
    
    public void Tests(){
        Integer[] arr = new Integer[10000];
        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            arr[i] = r.nextInt((10000 - 1) + 1) + 1;
        }
        
    }
}