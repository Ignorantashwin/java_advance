import java.util.Scanner;
public class lesson9 {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
       int x1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y1 = sc.nextInt();
    int y2 = sc.nextInt();
    System.out.println(sumSquare(x1, x2, y1, y2));
       
}
static int sumSquare(int a1 , int a2, int b1, int b2){
     int totalSum = 0;
     if (a1 > b1 && a2 > b2) {
        totalSum = (a1*a1) - (b1*b1) + (a2*a2) - (b2*b2);
        return totalSum;
     }
     else {
     totalSum =   (b1*b1)- (a1*a1) +  (b2*b2)- (a2*a2);
     }
     
        return totalSum;
    }
}
