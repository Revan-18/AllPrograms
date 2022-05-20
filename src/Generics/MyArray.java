package Generics;

public class MyArray<T> {
    T[] A = (T[]) new Object[10];
    int l = 0;

    MyArray() {
    }

    public void append(T v) {
        this.A[this.l++] = v;
    }

    public void display() {
        for(int i = 0; i < this.l; ++i) {
            System.out.println(this.A[i]);
        }

    }
}

