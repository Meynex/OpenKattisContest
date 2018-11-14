package T6;
import java.util.Scanner;
import java.lang.Math;
public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		double v = sc.nextInt();
		int erg = (int)(h / Math.sin(Math.toRadians(v)))+1;
		// Rundungsfehler bei der ersten aufgabe
		System.out.println(erg);
		sc.close();
	}

}