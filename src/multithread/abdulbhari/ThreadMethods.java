package multithread.abdulbhari;


class Threadmethod extends Thread{
	public Threadmethod(String name) {
		super(name);
		setPriority(MAX_PRIORITY);
	}
}

public class ThreadMethods {

	public static void main(String[] args) {
		Threadmethod t = new Threadmethod("payment ");
		
		System.out.println("ID "+t.getId());
		System.out.println("Name "+t.getName());
		System.out.println("Priority "+t.getPriority());
		t.start();
		System.out.println("State "+t.getState());
		System.out.println(t.isAlive());
	}

}
