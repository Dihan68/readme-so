package Registration;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Main implements ActionListener {

    private static  JLabel UserLabel;
    private static JTextField UserText;
    private static JLabel PasswordLabel;
    private static JPasswordField  PasswordText;
    private static JButton Button;
    private static JLabel Success;


    public static void main(String[] args) {


        JLabel userLaber;

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        UserLabel = new JLabel("userID");
        UserLabel.setBounds(10, 20, 85, 25);
        panel.add(UserLabel);


        UserText = new JTextField(20);
        UserText.setBounds(100, 20, 165, 20);
        panel.add(UserText);

        PasswordLabel = new JLabel("Password");
        PasswordLabel.setBounds(10, 50, 80, 25);
        panel.add(PasswordLabel);

        PasswordText = new JPasswordField();
        PasswordText.setBounds(100, 50, 165, 25);
        panel.add(PasswordText);


        Button = new JButton("Login");
        Button.addActionListener( new Main());
        Button.setBounds(10,80,80,25);
        panel.add(Button);


        Success = new JLabel("");
        Success.setBounds(10,110, 300,25);
        panel.add(Success);




        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = UserText.getText();
        String Password = PasswordText.getText();
        System.out.println( user + "" + Password);

        if (user.equals("Dihan99") && Password.equals("Games123"))  {
            Success.setText("Successful! Welcome to Intergence");

        }

    }
}

