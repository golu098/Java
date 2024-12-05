class Inheritance {
    public void f1() {
        System.out.println("shiv");
    }
}

class Inheritance2 extends Inheritance {
    public void f2() {
        System.out.println("kant");
    }
}

// Multilevel inheritance
class Inheritance3 extends Inheritance2 {
    public void f3() {
        System.out.println("kumar");
    }
}

// Hierarchical inheritance
class Inheritance4 extends Inheritance {
    public void f4() {
        System.out.println("Golu");
    }
}

class Inheritance5 extends Inheritance {
    public void f5() {
        System.out.println("Sharma");
    }
}

public class MainInheritance {
    public static void main(String[] args) {
        // Creating an object of Inheritance4
        Inheritance4 obj4 = new Inheritance4();
        obj4.f1();
        obj4.f4();

        // Creating an object of Inheritance5
        Inheritance5 obj5 = new Inheritance5();
        obj5.f1();
        obj5.f5();
    }
}
