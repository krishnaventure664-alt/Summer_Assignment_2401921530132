package week4.oops;

interface Test {
    int square(int n);
}

class Arithmetic implements Test {

    public int square(int n) {
        return n * n;
    }
}

public class test_ques1 {

    public static void main(String[] args) {

        Arithmetic obj = new Arithmetic();

        System.out.println("Square = " + obj.square(5));
    }
}