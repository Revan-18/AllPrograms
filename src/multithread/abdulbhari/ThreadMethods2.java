package multithread.abdulbhari;


class mThread extends Thread{
	
	public mThread(String name) {
		super(name);
	}
	
	public void run() {
		
		int count =1;
		while(true) {
			System.out.println(count++);
			try {
				Thread.sleep(100);    // sleep method
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadMethods2 {

	public static void main(String[] args) {
		mThread t= new mThread("sleep_interrupt ");
		System.out.println("Name:- "+t.getName());
		t.start();
		t.interrupt();
	}

}
