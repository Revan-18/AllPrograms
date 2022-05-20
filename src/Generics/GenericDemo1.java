package Generics;

public class GenericDemo1<T> {
    public GenericDemo1() {
    }

    public static void main(String[] args) {
        Data<String> obj = new Data();
        obj.setStr("Hello");
        System.out.println((String)obj.getStr());
    }
}

