import java.math.BigInteger;

/**
 * The CombinationsPermutationsTester class is used to test the Combination and Permutation classes.
 * @author Rachel Hussmann
 */
public class CombinationsPermutationsTester {

    public static void main(String[] args) {

        //Created tester Combination object
        Combination cTester = new Combination();

        //Created tester Permutation object
        Permutation pTester = new Permutation();

        //Initializes some BigInteger objects for test cases
        BigInteger n = BigInteger.valueOf(6);
        BigInteger r = BigInteger.valueOf(2);

        //Testing simple example to make sure that factorial, getPermutation and getCombination methods work
        System.out.println(cTester.getCombination(6, 2));
        System.out.println(cTester.getCombination(n, r));
        System.out.println(pTester.getPermutation(6, 2));
        System.out.println(pTester.getPermutation(n, r));



    }

}
