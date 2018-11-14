import java.util.Scanner;
public class Cold_puter_Science {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] t = new int[ n ];
        int c=0,i;
        
        
        for(i=0;i<n;i++)
        {
            t[i] = sc.nextInt();
            if(t[i]<0) c++;
        }
        System.out.println(c);
        
        sc.close();
    }

}