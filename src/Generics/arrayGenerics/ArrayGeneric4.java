package Generics.arrayGenerics;

public class ArrayGeneric4 {
    public ArrayGeneric4() {
    }

    public static void main(String[] args) {
        MyArray obj = new MyArray2();
        obj.append(10);
        obj.append("How are u");
        obj.display();
    }
}