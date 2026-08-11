import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print the greeting below.
    
      Scanner sc = new Scanner(System.in);
       int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    System.out.println(square(x1, y1, x2, y2));
       
}
static int square(int x1, int y1, int x2, int y2){
    int dx = x2-x1;
    int dy = y2-y1;
    int sum = dx*dx + dy*dy;
    return sum;
}
}