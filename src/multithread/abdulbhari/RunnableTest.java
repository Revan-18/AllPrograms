package multithread.abdulbhari;
public class RunnableTest implements Runnable {
	

	public void run() {
		int i=100;
		while (i!=0) {
			System.out.println(i+"#####");
			i--;
		}
	}

	public static void main(String[] args) {
		 RunnableTest r = new RunnableTest();
		Thread t = new Thread(r);
		t.start();
		
		int i=10;
		while (i!=0) {
			System.out.println(i+"Hii");
			i--;
		}

	}

}
