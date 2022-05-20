package Generics.arrayGenerics;

public class MyArray<T> {
    T[] A = (T[]) new Object[10];
    int l = 0;

    MyArray() {
    }

    public void append(T v) {
        this.A[this.l++] = v;
    }

    public void display() {
        Object[] var1 = this.A;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            T value = (T) var1[var3];
            System.out.println(value);
        }

    }
}
