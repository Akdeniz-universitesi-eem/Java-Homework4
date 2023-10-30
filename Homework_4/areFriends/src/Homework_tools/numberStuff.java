package Homework_tools;
import java.util.Random;

public class numberStuff {
    
    //Prime number
    public static boolean isPrime(int a) 
    {
        if (a <= 1) 
        {
            return false;  
        }
        
        for (int i = 2; i * i <= a; i++) 
        {
            if (a % i == 0) 
            {
                return false;  
            }
        }
        return true;  
    }

    public static int createRandomNumber(int a, int b) 
    {
        Random rand = new Random();

        if (a < b) 
        {
            int randomNum = rand.nextInt((b - a + 1)) + a;
            return randomNum;
        } 
        else if (a > b) 
        {
            int randomNum = rand.nextInt((a - b + 1)) + b;
            return randomNum;
        } 
        else 
        {
            return a; // if a and b are equal, return one of them
        }
    }

    //Needed for below funtion
    public static int countDigits(int num) 
    {
        int count = 0;
        while (num > 0) 
        {
            num /= 10;
            count++;
        }
        return count;
    }
    

    public static int[] numberToDigitsArray(int num) 
    {
        // Digit count
        int length = countDigits(num);


        //Putting digits in array
        int[] digits = new int[length];
        
        //example : 456 to [4,5,6]
        for (int i = length - 1; i >= 0; i--) 
        {
            digits[i] = num % 10;
            num /= 10;
        }
    
        return digits;
    }

    // I dont get any errors but not sure if its all true (logic should be) (test it with 29 it returns true)
    public static boolean isPrimeX(int num) 
    {
        // not prime at all
        if (!isPrime(num)) {
            return false;
        }
    
        // sums for digits
        int sum = num;
    
        // loop for digits
        while (sum > 9) 
        {  
            //if more than 1 digit
            
            int[] digits = numberToDigitsArray(sum);
            
            sum = 0;  // Reset the sum to 0 ,

            for (int digit : digits) 
            {
                sum += digit;
            }
    
            //If the result isn't prime
            if (!isPrime(sum)) 
            {
                return false;
            }
        }
    
        // Check if the last digit is also prime
        if (isPrime(sum)) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }

    public static int[] numToFactorsArray(int a) 
    {
        int count = 0;
        //count for number of factors
        for (int i = 1; i < a; i++) 
        {
            if (a % i == 0) 
            {
                count++;
            }
        }

        //create an array
        int[] factors = new int[count];
        int index = 0;

        //factors to array
        for (int i = 1; i < a; i++) 
        {
            if (a % i == 0) 
            {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }
    
    public static int sumFactors(int a) 
    {
        int[] factors = numToFactorsArray(a);
        int sum = 0;


        for (int factor : factors) 
        {
            sum =sum + factor;
        }

        return sum;
    }

    public static boolean ısPerfect(int a)
{
	if(sumFactors(a)==a)
		return true;
	return false;
}

    

    
}

