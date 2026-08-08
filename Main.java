import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print the greeting below.
      Scanner sc = new Scanner(System.in);
      int height = sc.nextInt();
      int width = sc.nextInt();
      int area = height * width;
      System.out.println(area);
    }
}
