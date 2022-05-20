package multithread.abdulbhari;

public class Test1 extends Thread
{
	
	public void run() {
		int i=10;
		while (i!=0) {
			System.out.println(i+"-------");
			i--;
		}
	}	

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.start();
		int i=20;
		while (i!=0) {
			System.out.println(i+"Revan");
			i--;
		}
}
}