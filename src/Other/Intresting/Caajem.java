package Other.Intresting;

import java.util.LinkedList;
class Abc{
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    int a;
    int b;

}


public class Caajem {
    public static void main(String[] args) {
        LinkedList<Abc> li = new LinkedList<>();
        Abc ab = new Abc();
        Abc ab1 = new Abc();
        Abc ab2 = new Abc();
        Abc ab3 = null;
        li.add(ab);
        li.add(ab1);
        li.add(ab2);
        li.add(ab3);

        for (int i = 0; i < 4; i++) {
            if(li.get(i)==null)
                li.remove(i);
        }


        System.out.println(li);
    }
}
