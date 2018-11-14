package Extra;
import java.util.Scanner;
public class Bijele {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int i;
        int[] seq = {1,1,2,2,2,8};
        int[] tmp = new int[7];
        //int a = new Integer
        //integer.
        
        for(i=0;i<6;++i)
        {
        tmp[i]=sc.nextInt();
            if(Integer.compare(seq[i],tmp[i])==0)
            {
                tmp[i]=0;
                System.out.println("0");
                continue;
            }
            else
            {
                tmp[i]=seq[i]-tmp[i];
                System.out.println(tmp[i]);
            }
            
        }
        
        
        sc.close();
        
        
    }

}