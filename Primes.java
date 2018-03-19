/**
 * Two examples of methods for determining whether an int is prime. 
 * You will be asked questions about this code on the loops test.
 * 
 * @author Jon Cooper
 * @version November 18, 2013
 */
import java.util.Arrays;
public class Primes 
{
    /**
     * Determine if an int is prime.
     * 
     * @param n     number to test
     * @return      true if number is prime, false otherwise
     */
    public static boolean isPrime1(int n)
    {
        if (n < 2) return false;
        
        for (int i=2; i<n; i++)
        {
            if (n % i == 0) return false;
            
        }
        return true;
        
    }
    
    /**
     * A more efficient way to determine if an int is prime.
     * 
     * @param n     number to test
     * @return      true if number is prime, false otherwise
     */
    public static boolean isPrime2(int n)
    {
        if (n == 2)        return true;
        else if (n % 2==0 || n < 2) return false;
        
        double limit = Math.sqrt(n);
        
        for (int i=3; i<=limit; i+=2)
        {
            if (n % i == 0) return false;
        }
        return true;
        
    }
        
    
    public static void main(String[] args)
    {
        // test isPrime1
        System.out.println( isPrime1(2) );
        System.out.println( isPrime1(9) );
        System.out.println( isPrime1(15485863) );
        System.out.println();
        
        System.out.println( isPrime1(2) );
        System.out.println( isPrime1(9) );
        System.out.println( isPrime1(17) );
        
        // test isPrime2
        System.out.println( isPrime2(2) );
        System.out.println( isPrime2(9) );
        System.out.println( isPrime2(17) );
        
        
        // Study the isPrime1 and isPrime2 methods to answer the following:
        
        // 0. Study the method isPrime1. Describe the set of numbers that would be 
        //    tested as divisors when checking the value 19 for primality. Do the 
        //    same for 91 and 643.
        
        /**
         * it would check all of the numbers inclusive from 2-18 and for 19
         * then it would check numbers from 2-642 and for 643
         */
       

        
        // 1. Study the method isPrime2. Describe the set of numbers that would be 
        //    tested as divisors when checking the value 19 for primality. Do the 
        //    same for 91 and 643
        
         /**
          * for 19 it would check 2 then after that just 3
          * for 91 it would check 2 then after that it would check 3,5,7,9
          * for 643 it would check 2, after that then 3,5,7,9,11,13,15,17,19,21,23,25
          */
    
         
        
        
        // 2. The number 15,485,863 is the 1 millionth prime number. Suppose it is 
        //    tested in both isPrime1 and isPrime2 for primality. About how much
        //    faster will isPrime2 finish testing. Show how you determined your answer.
        
         /**
          * prime1 would do 15485863 calculations
          * prime2 would do about 1967 calculations
          */
        
        
        // 3. In isPrime2, why is the limit calculated before the loop rather than
        //    writing the loop as for (int i=3; i<=Math.sqrt(n); i=i+2)?
        
         /**
         * this makes the code work better by not recounting the square root of n after 
         * each cycle during the comparison of it.
         */
        
        
        // 4. The number 1 is not prime, however both prime function say that it is.
        //    Negative numbers cannot be prime either. Fix each function so that all
        //    ints less than 2 return false.

        
        
        // Write blocks of code that use isPrime2 to solve the following problems:
        
        // 5. Generate a list of the first 50 prime numbers.
    }
     
          static public void first50() {
            int[] results = new int[50];
            int count = 0;
            int i = 0;
            while (i < 50) {
                count++;
                if (isPrime2(count)) {
                    results[i] = count;
                    i++;
                }
            }
        
            System.out.println(Arrays.toString(results));
        }
        
        // 6. What is the 100th prime? the 1000th? The 12847th?
            static public int nthPrime(int n) {
            int i = 0;
            int count = 0;
            
            while (i < n) {
                count++;
                if (isPrime2(count)) {
                    i++;
                }
            }
            
            return count;
        }
        // 7. In the set of integers from 2-1000000, how many are prime?
            static public int countPrime(int start, int end) {
            int count = 0;
            
            for (int i = start; i < end; i++) {
                if (isPrime2(i)) count++;
            }
            
            return count;
        }
        
        
        // 8. What is the sum of the all prime numbers below 1000000?
        static public long sumPrime(int end) {
            long count = 0L;
            
            for (int i = 2; i < end; i++) {
                if (isPrime2(i)) count+=i;
            }
            
            return count;
        }
        
        
        // 9. What is the sum of the first 1000 prime numbers?
         static public long sumFirstPrime(int end) {
            int i = 0;
            int count = 0;
            int sum = 0;
            
            while (i < end) {
                count++;
                if (isPrime2(count)) {
                    i++;
                    sum += count;
                }
            }
            
            return sum;
        }        
    }

