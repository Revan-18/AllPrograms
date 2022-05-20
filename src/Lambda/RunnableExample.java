package Lambda;

public class RunnableExample {
    public static void main(String[] args) {
        Thread td = new Thread(new Runnable() {
            public void run() {
                System.out.println("inside Runnable");
            }
        });

        Thread tdlambda = new Thread(() -> System.out.println("lambda Thread"));

        td.run();
        tdlambda.run();
    }
}
