import java.math.BigInteger;

/**
 *
 * @author Rachel Hussmann
 */
public class CombinationsPermutationsTester {

    public static void main(String[] args) {

        //
        Combination cTester = new Combination();

        //
        Permutation pTester = new Permutation();

        //
        BigInteger n = BigInteger.valueOf(6);
        BigInteger r = BigInteger.valueOf(2);

        //
        System.out.println(cTester.getCombinationEasy(6, 2));
        System.out.println(cTester.getCombination(n, r));
        System.out.println(pTester.getPermutationEasy(6, 2));
        System.out.println(pTester.getPermutation(n, r));

    }

}
