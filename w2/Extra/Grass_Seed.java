package Extra;
import java.util.Scanner;
public class Grass_Seed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		
		double C = Sc.nextDouble();
		int Lines = Sc.nextInt();
		double[][] L = new double[2][Lines];
		double erg = 0;
		
		for(int i = 0; i < Lines; i++) {
			L[0][i]= Sc.nextDouble();
			L[1][i]= Sc.nextDouble();
			erg=erg+(L[0][i]*L[1][i]*C);
			
		}
		Sc.close();
		output(erg);
	}

	public static void output(double Erg) {
		System.out.format("%.6f", Erg);
	}
}
