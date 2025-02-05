import java.math.BigInteger;

/**
 *
 * @author Rachel Hussmann
 */
public class Permutation {

    /**
     *
     * @param n
     * @param r
     * @return
     */
    public int getPermutationEasy(int n, int r){

        //
        int numerator = factorial(n);

        //
        int denominator = factorial(n-r);

        //
        return numerator/denominator;
    }

    /**
     *
     * @param n
     * @param r
     * @return
     */
    public BigInteger getPermutation(BigInteger n, BigInteger r){

        //
        BigInteger numerator = factorial(n);

        //
        BigInteger denominator = factorial(n.subtract(r));

        //
        return numerator.divide(denominator);
    }

    /**
     *
     * @param i
     * @return
     */
    public int factorial(int i){

        //
        int f = 1;

        //
        for(int j = 1; j <= i; j++){

            //
            f = f * j;
        }

        //
        return f;
    }

    /**
     *
     * @param i
     * @return
     */
    public BigInteger factorial(BigInteger i){

        //
        BigInteger f = BigInteger.valueOf(1);

        //
        BigInteger count = BigInteger.valueOf(1);

        //
        while (count.compareTo(i) < 1){

            //
            f = f.multiply(count);

            //
            count = count.add(BigInteger.ONE);
        }

        //
        return f;
    }

}
