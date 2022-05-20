package Lambda;

import com.sun.org.apache.xpath.internal.functions.FuncStringLength;

public class TypeInterface {
    public static void main(String[] args) {
        StringLength str = s -> s.length();
        System.out.println(str.getLength("hello 1123"));

        printLambda(s -> s.length());
    }

    public static void printLambda(StringLength l) {
        System.out.println(l.getLength("Hello Dear sir"));
    }

    interface StringLength {
        int getLength(String s);
    }
}
