package Other.Interview;

/**
     * The class must be declared as final so that child classes can’t be created.
     * Data members in the class must be declared private so that direct access is not allowed.
     * class must be declared as final so that we can’t change the value of it after object creation.
     * Data members in the class must be declared as final so that we can’t change the value of it
       after object creation.
     * A parameterized constructor should initialize all the fields performing a deep copy so that
       data members can’t be modified with an object reference.
     * Deep Copy of objects should be performed in the getter methods to
       return a copy rather than returning the actual object reference)
 **/

// class is declared final
final class Immutable {

    // private class members
    private String name;
    private int date;

    Immutable(String name, int date) {

        // class members are initialized using constructor
        this.name = name;
        this.date = date;
    }

    // getter method returns the copy of class members
    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

}

class Main {
    public static void main(String[] args) {

        // create object of Immutable
        Immutable obj = new Immutable("Programiz", 2011);

        System.out.println("Name: " + obj.getName());
        System.out.println("Date: " + obj.getDate());
    }
}