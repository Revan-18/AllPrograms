package Generics.arrayGenerics;

public class ArrayGeneric2 {
    public ArrayGeneric2() {
    }

    public static void main(String[] args) {
        MyArray<String> obj = new MyArray();
        obj.append("HEllo");
        obj.append("How are u");
        obj.display();
    }
}
