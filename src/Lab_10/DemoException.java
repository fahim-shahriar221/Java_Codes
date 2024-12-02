package Lab_10;

public class DemoException {
    void DivideByzero() {
        try {
            int i = 15 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Could not execute because: " + e);
        }
    }

    void IndexOutOfBound() {
        int A[] = {1, 5, 6};
        try {
            System.out.println(A[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Could not print index of 5 because : " + e);
        }
    }

    void MultipleException() {
        try {
            int i = 134 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Could not execute because: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Could not execute because: " + e);
        } catch (Exception e) {
            System.out.println("Could not execute because: " + e);
        }
    }

    void Finally() {
        try {
            int j = 316 / 0;
        }finally {
            int sum = 0;
            for (int i = 0; i <= 5; i++) {
                sum += i;
            }
            int result = sum / 5;
            System.out.println("Result is: " + result);
        }
    }

 public static void main(String[] args) {
        DemoException s = new DemoException();
        s.DivideByzero();
        s.IndexOutOfBound();
        s.MultipleException();
        s.Finally();

        X obj = new X();
        obj.Y();
        try {
            obj.Z();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

class X {
    void Y() {
        int i = 10;
        if (i < 18) {
            throw new ArithmeticException("Exception is Thrown");
        }
    }

    void Z() throws ArithmeticException {
        throw new ArithmeticException("Test Exception");
    }
}
