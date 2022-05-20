package multithread.abdulbhari;


class thread1 extends Thread{
	
	public thread1(String name) {
		super(name);
		//setDaemon(true);
	}
	
	
	public void run() {
		
		int count =1;
		while(true) {
			System.out.println(count++);
		}
	}
}

public class ThreadMethods3 {

	public static void main(String[] args) {
		thread1 t= new thread1("Demon_join_yield ");
		t.setDaemon(true);  // we can also write inside constructor
		System.out.println("Name "+t.getName());
		t.start();
		
	}

}
