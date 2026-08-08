import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        String result = "Hi, %s! You are %d years old.".formatted(name, age);
        System.out.println(result);

    }
}
