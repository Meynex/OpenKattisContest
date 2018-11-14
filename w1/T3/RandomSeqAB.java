/******************************************************************************
 *  Compilation:  javac RandomSeqAB.java
 *  Execution:    java RandomSeqAB n a b
 *
 *  Prints n random natural numbers between a and b.
 *
 *  % java RandomSeqAB 5 10 10
 * 	10
 * 	9
 * 	5
 * 	10
 * 	6
 * 	8
 * 	6
 * 	5
 * 	6
 * 	7
 *
 *******************************************************************************/
public class RandomSeqAB {

	public static void main(String[] args) {
		// command-line argument
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);	//min Value
        int n = Integer.parseInt(args[2]);	//max Value
     // generate and print n numbers between a and b
        int Range = b - a + 1;
        for (int i = 0; i < n; i++) System.out.println(((int)(Math.random()*Range)+a));
        
        

	}

}
