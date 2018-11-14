package Extra;
import java.util.Scanner;
public class Loop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n, i;
        n = sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println((i+1)+" Abracadabra");
        }
        sc.close();
        System.exit(0);
    }

}