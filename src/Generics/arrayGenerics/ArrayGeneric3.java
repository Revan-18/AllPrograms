package Generics.arrayGenerics;

public class ArrayGeneric3 {
    public ArrayGeneric3() {
    }

    public static void main(String[] args) {
        Array<Integer, String> obj = new Array();
        obj.append(10);
        obj.append(10);
        obj.append(20);
        obj.display();
    }
}
