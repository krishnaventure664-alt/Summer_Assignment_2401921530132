package week2.oops;

interface Playable {
    void play();
}

class Veena implements Playable {
    public void play() {
        System.out.println("Playing Veena");
    }
}

class Saxophone implements Playable {
    public void play() {
        System.out.println("Playing Saxophone");
    }
}

public class playable {

    public static void main(String[] args) {

        // Direct object calls
        Veena v = new Veena();
        v.play();

        Saxophone s = new Saxophone();
        s.play();

        System.out.println("----------------");

        // Polymorphism using interface reference
        Playable p;

        p = v;
        p.play();

        p = s;
        p.play();
    }
}
