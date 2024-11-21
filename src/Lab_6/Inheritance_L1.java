package Lab_6;
class University1 {
    void display() {
        System.out.println("University Name: Daffodil International University");
    }
}

class College1 extends University1 {
    void show() {
        System.out.println("College Name: APBn Public School and College, Bogura.");
    }
}

public class Inheritance_L1 {
    public static void main(String[] args) {
        College1 c = new College1();
        c.display();
        c.show();
    }
}

