import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a + b + c != 180){
            System.out.print("Error");
        }
        else if(a + b + c == 180 && a != b && b != c && a != c){
            System.out.println("Scalene");
        }
        else if(a + b + c == 180 && a == b && a != c || a == c && a != b || b ==c && b != a){
            System.out.println("Isosceles");
        }
        else if(a == 60 && b == 60 && c == 60){
            System.out.println("Equilateral");
        }
    }
}
