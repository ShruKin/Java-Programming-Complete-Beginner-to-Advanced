class Methods {
    String animal;
    int value;
    int month;

    void run() {
        System.out.println("Running");
        System.out.println("My " + animal + " is " + value + " years old");
    }

    int calculateMonthsToBirthday() {
        int monthsLeft = 12 - month;
        // System.out.println(monthsLeft);
        return monthsLeft;
    }

    void talk(String text) {
        System.out.println(text);
    }

    void walk(int speed) {
        System.out.println("Walking: " + speed + "kmph");
    }

    void timer(int minutes, double seconds) {
        System.out.println("It took " + minutes + "m and " + seconds + "s to get down the hill");
    }
}

public class Objects {
    public static void main(String[] args) { // only one entry point

        Methods name = new Methods();
        name.animal = "Cat";
        name.value = 9;
        // name.run();
        name.month = 8;
        int months = name.calculateMonthsToBirthday();
        System.out.println("Months until birthday: " + months);

        name.talk("Hi! I'm Kinjal");
        name.walk(7);

        name.timer(9, 3.65);
    }
}