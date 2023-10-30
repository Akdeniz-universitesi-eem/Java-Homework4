import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    private JPasswordField passwordField;
    private JLabel[] conditionLabels = new JLabel[5];
    private ImageIcon correctIcon, incorrectIcon;

    private void checkPassword()
    {
        String password = new String(passwordField.getPassword());  //JPasswordField.getPassword() method returns char array can be used as checking conditions ?

        
        //In this case, the manual method involves treating a string as a character array and examining conditions for its members. However, I encountered errors and difficulties while attempting to implement this approach, leading me to revert back to using string functions . (i try getting array members and cast their values as ascı and in loop looked for equality mostly but there was some unexpected return for some sembols and characters that gives an incorrect images for booleans)
        boolean passwordLength = password.length() > 6 && password.length() < 20;
        boolean passwordLetter = password.matches(".*[A-Za-z].*");
        boolean passwordNumber = password.matches(".*[0-9].*");

        //Emtpy string  when entering empty it give correct icon 
        boolean passwordSpace = password.isEmpty() || password.contains(" ");
        //This may couse some error for logic because it uses convertion for looking it may return true for some numbers i think ? ( ->  this break the code it maybe has a value of some number)
        boolean passwordSCharacter = password.matches(".*[!\\'^+%&/()=?*£#$\\[\\]_-].*");


        updateLabel(conditionLabels[0], passwordLength);
        updateLabel(conditionLabels[1], passwordLetter);
        updateLabel(conditionLabels[2], passwordNumber);
        updateLabel(conditionLabels[3], !passwordSpace);
        updateLabel(conditionLabels[4], passwordSCharacter);
    }

    private void updateLabel(JLabel label, boolean conditionMet)
    {
        if (conditionMet)
        {
            label.setIcon(correctIcon);
        } else
        {
            label.setIcon(incorrectIcon);
        }
    }

    public App() {

        setTitle("Password Check");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

       

        setSize(400, 400);  
        setLocationRelativeTo(null);


        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        add(new JLabel("Password"), gbc);

        passwordField = new JPasswordField(20);

        gbc.gridy = 1;
        add(passwordField, gbc);

        JButton visibilityButton = new JButton();
        visibilityButton.setPreferredSize(new Dimension(20, 20));
        visibilityButton.addActionListener(e -> togglePasswordVisibility());

        gbc.gridx = 1;
        add(visibilityButton, gbc);

        JButton checkButton = new JButton("Check");

        checkButton.setPreferredSize(new Dimension(50, 30));

        gbc.gridx = 0;
        gbc.gridy = 2;

        add(checkButton, gbc);
        checkButton.addActionListener(e -> checkPassword());

        correctIcon = new ImageIcon(new ImageIcon("src/Images/correct.jpg").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        incorrectIcon = new ImageIcon(new ImageIcon("src/Images/incorrect.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));

        String[] conditionTexts =
        {
                "Password length between 6 and 20",
                "Contains at least 1 letter",
                "Contains at least 1 number",
                "Does not contain spaces",
                "Contains a special character"
        };



        for (int i = 0; i < 5; i++)
        {
            JPanel conditionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            conditionLabels[i] = new JLabel();
            conditionLabels[i].setIcon(incorrectIcon); // Default to incorrect


            conditionPanel.add(conditionLabels[i]);
            conditionPanel.add(new JLabel(conditionTexts[i]));

            gbc.gridy = 3 + i;
            add(conditionPanel, gbc);
        }


    }


    //copy paste from toggle
    private void togglePasswordVisibility() 
    {
        passwordField.setEchoChar(passwordField.getEchoChar() == '\u0000' ? '*' : '\u0000');
    }



    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App().setVisible(true));
    }
}
