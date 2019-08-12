
/**
 * Sign up page frame
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

public class signuppage extends JFrame implements ActionListener
{
    private static final int framewidth = 500;
    private static final int frameheight = 500;
    
    private JPanel center;
    private JButton submit;
    private JLabel signuptext, usernametext, passwordtext, reentertext, addresstext, emailtext, header;
    private JTextField username, address, email;
    private JPasswordField password, reenter;
    
    public signuppage()
    {
        super("Travel Agency");
        setSize(framewidth, frameheight);
        setResizable(false);
        
        addComponents(getContentPane());
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void addComponents(Container contentPane)
    {
        getContentPane().setLayout(new FlowLayout());
        getContentPane().setBackground(Color.CYAN);
        header = new JLabel(new ImageIcon("header2.jpg"));
        
        getContentPane().add(header);
        
        center = new JPanel(new GridBagLayout());
        center.setBackground(Color.CYAN);
        getContentPane().add(center);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        
        signuptext = new JLabel("Sign Up");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(signuptext, constraints);
        
        usernametext = new JLabel("Username : ");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(usernametext, constraints);
        
        username = new JTextField(10);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(username, constraints);
        
        passwordtext = new JLabel("Password : ");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(passwordtext, constraints);
        
        password = new JPasswordField(10);
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(password, constraints);
        
        reentertext = new JLabel("Re-enter Password : ");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(reentertext, constraints);
        
        reenter = new JPasswordField(10);
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(reenter, constraints);
        
        addresstext = new JLabel("Address : ");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(addresstext, constraints);
        
        address = new JTextField(10);
        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(address, constraints);
        
        emailtext = new JLabel("E-mail : ");
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(emailtext, constraints);
        
        email = new JTextField(10);
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(email, constraints);
        
        submit = new JButton("Submit");
        constraints.gridx = 2;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        submit.addActionListener(this);
        center.add(submit, constraints);
        
    }
    
    public void actionPerformed(ActionEvent event)
    {
        File users = new File("users.dat");
        
        String username1, password1, address1, email1;
        
        
        try
        {
            PrintWriter userout = new PrintWriter(users);
            
            if(event.getSource() == submit)
            {
                if(!(username.getText().equals("")))
                {
                    char[] pw = password.getPassword();
                    String pwstring = new String(pw);
                        
                    if(!(pwstring.equals("")))
                    {
                        if(!(address.getText().equals("")))
                        {
                            if(!(email.getText().equals("")))
                            {
                                char[] re = reenter.getPassword();
                                String pwrestring = new String(re);
                                
                                if(pwrestring.equals(pwstring))
                                {
                                    username1 = username.getText();
                                    password1 = pwstring;
                                    address1 = address.getText();
                                    email1 = email.getText();
                                    
                                    userout.println(username1 + ";" + password1 + ";" + address1 + ";" + email1 + ";");
                                    
                                    JOptionPane.showMessageDialog(null, "Your account has succesfully been created! Login to continue.");
                                    
                                    home newuser = new home();
                                    newuser.setVisible(true);
                                    setVisible(false);
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "The password you re-enter does not match!");
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "E-mail field is required!");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Address field is required!");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Password field is required!");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Username field is required!");
                }
            }
            else
            {}
            
            userout.close();
        }

        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
