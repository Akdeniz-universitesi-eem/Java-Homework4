import javax.swing.JOptionPane;

public class App {

    public static double factorial(int a) 
    {
            //1.0 needed for accuracy
            double fac = 1.0;
            for (int i = 2; i < a+1; i++) 
            {
                fac = fac * i ;
            }
            return fac;
    }
    
        public static double calcE(int a) 
    {
            double e = 0; 
            for (int i = 0; i < a+1; i++) 
            {
                e = e + 1 / factorial(i); 
            }
            return e;
    }
    
    public static void main(String[] args) throws Exception {
        boolean inputCorrect = false;
        while(!inputCorrect)
        {
        try
        {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Give an integer for the accuracy you desire."));
        JOptionPane.showMessageDialog(null, calcE(a));
        inputCorrect = true;
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Read carefully !");
        }
        } 
    }
}
