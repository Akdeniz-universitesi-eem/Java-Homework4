import javax.swing.JOptionPane;

import Homework_tools.numberStuff;

public class App {
    
    public static void main(String[] args) throws Exception 
    {
        boolean inputCorrect = false;
        while (!inputCorrect) 
        { 
        try{
        int a = Integer.parseInt(JOptionPane.showInputDialog("ısPerfect test number:"));
    
        inputCorrect=true;

        if (numberStuff.ısPerfect(a)) 
            JOptionPane.showMessageDialog(null, "true");
        else 
            JOptionPane.showMessageDialog(null, "False");
        
        
        for (int i = 1000; i < 10000; i++) {
            if (numberStuff.ısPerfect(i)) 
                JOptionPane.showMessageDialog(null, "Only this : " + i);
            
        }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Number pls");
        }
    }
    }
}
