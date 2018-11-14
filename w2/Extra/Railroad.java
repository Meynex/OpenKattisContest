package Extra;
import java.util.Scanner;
public class Railroad {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();
        if(((X*4)+(Y*3))%2==0) System.out.println("possible");
        else System.out.println("impossible");
    }

}
