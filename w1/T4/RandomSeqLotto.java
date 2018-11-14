/*/******************************************************************************
 *  Compilation:  javac RandomSeqLotto.java
 *  Execution:    java RandomSeqLotto
 *
 *  Prints LottoNo. 6 numbers between 1 and 49.
 *
 *  % java RandomSeqLotto
 * 	1 23 20 43 32 9
 * 
 *******************************************************************************/

public class RandomSeqLotto {

	public static void main(String[] args) {
	// generate and print 6 numbers between 1 and 49
        int Range = 49 - 1 + 1;
        for (int i = 0; i < 6; i++) System.out.print(((int)(Math.random()*Range)+1+" "));

	}

}
