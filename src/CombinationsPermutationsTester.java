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
        System.out.println("Combinations of n = 6 and r = 2: " + cTester.getCombination(6, 2));
        System.out.println("Combinations of n = 6 and r = 2 using BigInteger: " + cTester.getCombination(n, r));
        System.out.println("Permutations of n = 6 and r = 2: " + pTester.getPermutation(6, 2));
        System.out.println("Permutations of n = 6 and r = 2 using BigInteger: " + pTester.getPermutation(n, r));

        //Testing out an example from the book
        //Example 2.8 - Pizza problem
        //According to the textbook, the problem is a permutation and the answer is 24360
        BigInteger f = BigInteger.valueOf(30);
        BigInteger g = BigInteger.valueOf(3);

        System.out.println("Testing example 2.8 from the book (answer should be 24360): " +
                pTester.getPermutation(f, g));

        //Solve a problem from the textbook homework

        //Problem 2.57 "Two cards are drawn from a standard 52-card playing deck. What is the probability that the
        //draw will yield an ace and a face card?"
        BigInteger v = BigInteger.valueOf(52);
        BigInteger m = BigInteger.valueOf(2);

        //We are choosing one of the available aces. There are 4 aces in a deck of cards so we need to find the number
        //of combinations (since order doesn't matter) we can make from 4 choose 1.
        BigInteger aces = cTester.getCombination(BigInteger.valueOf(4), BigInteger.valueOf(1));

        //We are choosing one of the available aces. There are 12 faces in a deck of cards so we need to find the number
        //of combinations (since order doesn't matter) we can make from 12 choose 1.
        BigInteger faces = cTester.getCombination(BigInteger.valueOf(12), BigInteger.valueOf(1));

        //We need to find the total number of combinations we can find for 52 pick 2 (since order doesn't matter).
        BigInteger totalNumber = cTester.getCombination(v, m);

        //Since we have two number of combinations, we need to multiply them together to find the total number of
        //combinations for those two situations specifically.
        BigInteger wantedOutcome = aces.multiply(faces);

        //We then divide the wantedOutcome by the totalNumber of outcomes to give us our probability.
        System.out.println("The probability of drawing an ace and a face card in the same draw is: " + wantedOutcome
                + "/" + totalNumber);

        //Confirmed answer with the answer in the back of the textbook (48/1326 or .0362)
    }

}
