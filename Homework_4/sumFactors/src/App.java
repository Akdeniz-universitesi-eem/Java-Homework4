import javax.swing.JOptionPane;

public class App {

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
                System.out.print(" " + i);
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
    public static void main(String[] args) throws Exception 
    {
        boolean inputCorrect = false;
        while(!inputCorrect){
            try{
            int a = Integer.parseInt(JOptionPane.showInputDialog("Number ? "));
            inputCorrect = true;
            JOptionPane.showMessageDialog(null, "Sum : " + sumFactors(a), "SumFactors", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Number !!?? ");
            }

        }

    }
}
