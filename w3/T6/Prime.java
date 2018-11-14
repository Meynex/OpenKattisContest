package T6;

public class Prime {
	
	public boolean IsPrime(int zahl) {
		
		boolean[] Sieb = new boolean[zahl+1];
		
		int[] List = new int[zahl+1];
		
		if(zahl==1||zahl==0) return false;
		else {
			
			for(int i=0;i<zahl;i++) // Generierung von Sieb
			{
				Sieb[i]=true;
			}
			for(int i=2;i<zahl;i++)
			{
				if(Sieb[i])
				{
					List[i-2]=i;
				
					for(int n = 0;n<zahl;n++)
					{
					
						if(n%List[i-2]==0)Sieb[n]=false;
						
					}
				}
			}
			
			
		}
		
		
		
	}
	
	
	
	
	public void PrimeOut()
	{
		int N = 10000;
				 boolean[] gestrichen = new boolean[N];
				 // Initialisierung des Primzahlfeldes
				 // Alle Zahlen im Feld sind zu Beginn nicht gestrichen
				 for(int i = 2; i < N;i++) {
				     gestrichen[i] = false;
	}

				 // Siebe mit allen (Prim-) Zahlen i, wobei i der kleinste Primfaktor einer zusammengesetzten
				 // Zahl j = i*k ist. Der kleinste Primfaktor einer zusammengesetzten Zahl j kann nicht größer
				 // als die Wurzel von j <= n sein.
				 for (int i = 2; i < Math.sqrt(N);i++) {
					 
				 
				     if (!gestrichen[i]) {
				         // i ist prim, gib i aus...
				         System.out.print(i+", ");
				         // ...und streiche seine Vielfachen, beginnend mit i*i
				         // (denn k*i mit k<i wurde schon als Vielfaches von k gestrichen)
				         for(int j = i*i; j < N;i++) {
				             gestrichen[j] = true;
				         }
				     	}
				     }
				 // Gib die Primzahlen größer als Wurzel(n) aus - also die, die noch nicht gestrichen wurden
				 for(double i = Math.sqrt(N)+1; i < N;i++) {
					 
				     if(!gestrichen[(int) i]) {
				         // i ist prim, gib i aus
				         System.out.print(i+", ");
				     }
				 }
	}

}
