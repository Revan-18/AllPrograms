package Lambda;

public class Greet {
    public static void main(String[] args) {
        Greeting hl = new HelloWorld();


        Greeting baby = () -> System.out.println("Hello Lambda Ji");


        //anonymous class
        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("Hello inner class Ji");
            }
        };

        hl.perform();
        baby.perform();
        innerClassGreeting.perform();

    }
}
