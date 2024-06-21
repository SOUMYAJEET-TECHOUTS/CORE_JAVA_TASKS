package tasktwo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayListTest {
	
	    public static void main(String[] args) throws InterruptedException {
	       
	        List<Integer> arrayList = new ArrayList<>();

	        List<Integer> synchronizedList = Collections.synchronizedList(arrayList);

	        Thread thread1 = new Thread(new ModifyListTask(synchronizedList));
	        Thread thread2 = new Thread(new ModifyListTask(synchronizedList));

	        thread1.start();
	        thread2.start();

	        thread1.join();
	        thread2.join();

	        System.out.println("Final synchronized list: " + synchronizedList);
	    }

	    static class ModifyListTask implements Runnable {
	        private final List<Integer> list;

	        public ModifyListTask(List<Integer> list) {
	            this.list = list;
	        }

	        @Override
	        public void run() {
	            for (int i = 1; i <= 5; i++) {
	                list.add(i);
	                System.out.println(Thread.currentThread().getName() + " added: " + i);
	                try {
	                    Thread.sleep(100); 
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }
	}



