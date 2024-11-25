package Chapter1;

public class HelloWorld {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        System.out.println(greeting);

        int number = 5;
        int doubled = doubleNumber(number);
        System.out.println("hte doubled number is:  " +
        doubled);
    }

    public static int doubleNumber(int input) {
        return input * 2; 
    }
}