package multithread.abdulbhari;


class MyThread extends Thread{
	
	public void run() {
		int i=10;
		while (i!=0) {
			System.out.println(i+"Hii");
			i--;
		}
	}	
}


public class Test {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		int i=20;
		while (i!=0) {
			System.out.println(i+"Hello");
			i--;
		}
}
}





























		
