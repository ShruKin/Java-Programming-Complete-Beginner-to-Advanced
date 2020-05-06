class Program {
    int value;
    String text;

    public Program() {
        this(5); // this() must be the first statement, and you cant call this() multiple times
        System.out.println("First Constructor");
        value = 12;
    }

    public Program(int value) {
        this.value = value;
        System.out.println("Second Constructor");
    }

    public Program(int value, String text) {
        this.value = value;
        this.text = text;
        System.out.println("Third Construtor");
    }
}

public class constructors {
    public static void main(String[] args) {
        Program myProgram = new Program();
        Program myProgram1 = new Program(2);
        Program myProgram2 = new Program(5, "Hi");
    }
}