package Generics;

public class GenericMethods {
    public GenericMethods() {
    }

    static <T extends Number> void show(T... list) {
        Number[] var1 = list;
        int var2 = list.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            T x = (T) var1[var3];
            System.out.println(x);
        }

    }

    public static void main(String[] args) {
        show(10, 20, 30, 20.5D);
    }
}

