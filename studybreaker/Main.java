package appdev.studybreaker;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("++++++++++++++++Study Breaker++++++++++++++++");
            
            System.out.print("Your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + ", welcome to Study Breaker!");
        }
    }
}
