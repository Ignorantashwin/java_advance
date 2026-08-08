import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print the greeting below.
      Scanner sc = new Scanner(System.in);
     String name = sc.nextLine();
     int age = Integer.parseInt(sc.nextLine());
     String result = "Hi, %s! You are %d years old.".formatted(name, age);
     // prints same 
     //String result1 = String.format("Hi, %s! You are %d years old.", name, age);
     System.out.println(result);

     //System.out.println(result1);

    }
}
