package Generics.arrayGenerics;

public class ArrayGeneric5 {
    public ArrayGeneric5() {
    }

    public static void main(String[] args) {
        MyArray3<Integer> obj = new MyArray3();
        obj.append(10);
        obj.append(12);
        obj.display();
    }
}

