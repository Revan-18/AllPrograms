package Generics;


public class GenericArguments {
    public GenericArguments() {
    }

    static void fun(MyArray<? super B> obj) {
        obj.display();
    }

    public static void main(String[] args) {
        MyArray<B> maS = new MyArray();
        new MyArray();
        fun(maS);
    }
}

