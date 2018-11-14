package T6;
import java.util.Scanner;

public class fakultaet {
	
		public void Fak()
		{
			Scanner scan = new Scanner( System.in );
			long n, fakultaet = 1;

			System.out.println( "Geben Sie N ein:" );
			n = scan.nextLong();

			if ( n >= 0 )
			{
				while ( n > 1 )
				{
					fakultaet = fakultaet * n;
					n   = n - 1;
				}
			}
			scan.close();
		}
		public long Fak(long n)
		{
			long fakultaet = 1;
		    if ( n >= 0 )
		    {
		      while ( n > 1 )
		      {
		        fakultaet = fakultaet * n;
		        n   = n - 1;
		      }
		    }
		    return fakultaet;
		}
		
		public int FakCount(long zahl)
		{
			long tmp=0;
			int loop_counter=1;

			while(zahl>=tmp){
				tmp=Fak(loop_counter);
				loop_counter++;
			}
			while(zahl>=tmp);
			return loop_counter-1;
		}
		
		public void FakOut(long zahl)
		{
			long tmp=0;
			int loop_counter=1;

			while(zahl>=tmp){
				tmp=Fak(loop_counter);
				//if(Fak(loop_counter+1)>=zahl)break;
				System.out.print(tmp+" ");
				loop_counter++;
			}
		}
		
		public int fakCountRange(long Min, long Max)
		{
			int erg=0;
			
			//erg=Fak(Min)
			
			return erg;
		}
		
		}
