package estatico;

public class Main {

    public static void main(String[] args) {
        Soma s = new Soma();
        System.out.println(s.soma(4, 5));
        System.out.println(s.soma(4.5, 4.5));
        System.out.println(s.soma(4, 4.5));
        System.out.println(s.soma(4.5, 4));
        System.out.println(s.soma("A", "A"));
    }
}
