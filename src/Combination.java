import java.math.BigInteger;

/**
 * The Combination class holds methods that calculate combinations of two inputted numbers (integers and BigIntegers).
 * @author Rachel Hussmann
 */
public class Combination {

    /**
     * The getCombination method uses the Combination formula and integers to calculate the number of combinations that
     * are possible.
     * @param n The size of the set to choose from.
     * @param r The number of choices to be made from the set.
     * @return The total number of combinations that can be made from n and k as an integer.
     */
    public int getCombination(int n, int r){

        //This method follows the formula for combinations n!/r!(n-r)!

        //Find the numerator for the fraction
        int numerator = factorial(n);

        //Find the denominator of the fractions
        int denominator = factorial(r)*factorial(n-r);

        //Return the number that results from dividing the numerator by the denominator
        return numerator/denominator;
    }

    /**
     * The getCombination method uses the Combination formula and BigInteger objects to calculate the number of
     * combinations that are possible.
     * @param n The size of the set to choose from.
     * @param r The number of choices to be made from the set.
     * @return The total number of combinations that can be made from n and k as a BigInteger object.
     */
    public BigInteger getCombination(BigInteger n, BigInteger r){

        //This method follows the formula for combinations n!/r!(n-r)!

        //Find the numerator for the fraction
        BigInteger numerator = factorial(n);

        //Find the denominator of the fractions
        BigInteger denominator = factorial(r).multiply(factorial(n.subtract(r)));

        //Return the number that results from dividing the numerator by the denominator
        return numerator.divide(denominator);
    }

    /**
     * The factorial method calculates the number equal to 1 * 2 * 3 * . . . * n-1 * n (noted usually as n!).
     * @param n The number to find the factorial of.
     * @return The number equal to the factorial of n as an integer.
     */
    public int factorial(int n){

        //Create the starting point for the calculation
        int f = 1;

        //Use for loop to multiply the variable f by all the numbers in front of it up to and including n.
        for(int j = 1; j <= n; j++){

            //Multiply f by the current number in the loop
            f = f * j;
        }

        //Return the factorial of n
        return f;
    }

    /**
     * The factorial method calculates the number equal to 1 * 2 * 3 * . . . * n-1 * n (noted usually as n!).
     * @param n The BigInteger object to find the factorial of.
     * @return A BigInteger object equal to the factorial of n.
     */
    public BigInteger factorial(BigInteger n){

        //Create the starting point for the calculation
        BigInteger f = BigInteger.valueOf(1);

        //Create the count variable for the while loop used later
        BigInteger count = BigInteger.valueOf(1);

        //Use the loop to multiply the variable f by all the numbers in front of it up to and including n.
        while(count.compareTo(n) < 1){

            //Multiply f by the current number in the loop
            f = f.multiply(count);

            //Increment the loop counter
            count = count.add(BigInteger.valueOf(1));
        }

        //Return the BigInteger object equal to the factorial of n
        return f;
    }
}
