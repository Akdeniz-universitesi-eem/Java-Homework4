import javax.swing.JOptionPane;

import Homework_tools.numberStuff;

public class App {

    public static boolean areFriends (int a , int b)
{
	if(numberStuff.sumFactors(a)==b && numberStuff.sumFactors(b)==a)
		return true;
	return false;
}

    public static void main(String[] args) throws Exception 
    {
        for(int i = 1000;i<10000;i++)
        {
            boolean friendFound = false;
            for(int j = 1001;j<10000;j++)
            {
                if(areFriends(i, j)) 
                {
                JOptionPane.showMessageDialog(null, i + " and " + j + " are friends", "Friend Pair", JOptionPane.INFORMATION_MESSAGE);
                friendFound = true;
                break;
                }
                if(friendFound)
                    break;
                
            }
            if(friendFound)
                break;
        }
    }
}
