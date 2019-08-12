
/**
 * Login page frame
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

public class home extends JFrame implements ActionListener
{
    private static final int framewidth = 500;
    private static final int frameheight = 500;
    
    private JPanel center;
    private JButton login, signup;
    private JLabel hometext1, hometext2, hometext3, hometext4, signuptext, usernametext, passwordtext, header;
    private JTextField username;
    private JPasswordField password;
    
    public home()
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
        getContentPane().setBackground(Color.ORANGE);
        header = new JLabel(new ImageIcon("header1.jpg"));
        
        getContentPane().add(header);
        
        center = new JPanel(new GridBagLayout());
        center.setBackground(Color.ORANGE);
        getContentPane().add(center);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        
        hometext1 = new JLabel("Welcome to Travel Agency software!");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(hometext1, constraints);
        
        hometext2 = new JLabel("We provide services such as booking plane tickets,");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 4;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(hometext2, constraints);
        
        hometext3 = new JLabel("hotel rooms, holiday packages and currency converter");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 4;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(hometext3, constraints);
        
        hometext4 = new JLabel("to ease your vacation.");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 4;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(hometext4, constraints);
        
        usernametext = new JLabel("Username : ");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(usernametext, constraints);
        
        username = new JTextField(10);
        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(username, constraints);
        
        passwordtext = new JLabel("Password : ");
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(passwordtext, constraints);
        
        password = new JPasswordField(10);
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(password, constraints);
        
        login = new JButton("Login");
        login.addActionListener(this);
        constraints.gridx = 2;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(login, constraints);
        
        signuptext = new JLabel("Or if you don't have an account, ");
        constraints.gridx = 0;
        constraints.gridy = 9;
        constraints.gridwidth = 2;
        constraints.weightx = 1;
        constraints.weighty = 0.5;
        center.add(signuptext, constraints);
        
        signup = new JButton("Sign Up");
        signup.addActionListener(this);
        constraints.gridx = 2;
        constraints.gridy = 9;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(signup, constraints);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        File users = new File("users.dat");
        
        try
        { 
            String username1, password1, address1, email1;
            
            Scanner in = new Scanner(users);
            
            String indata = null;
            
            if (event.getSource() == login)
            {
                if(username.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Username field is required!");
                }
                else
                {
                    char[] pw1 = password.getPassword();
                    String pwstring1 = new String(pw1);
                    
                    if(pwstring1.equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "Password field is required!");
                    }
                    else
                    {
                        while(in.hasNext())
                        {
                            indata = in.nextLine();
                            StringTokenizer st = new StringTokenizer(indata, ";");
                            
                            username1 = st.nextToken();
                            password1 = st.nextToken();
                            address1 = st.nextToken();
                            email1 = st.nextToken();
                        
                            if(username.getText().equals(username1))
                            {
                                char[] pw = password.getPassword();
                                String pwstring = new String(pw);
                                
                                if(pwstring.equals(password1))
                                {
                                    JOptionPane.showMessageDialog(null, "Login Successfull!");
                                    mainmenu homemenu = new mainmenu();
                                    homemenu.setVisible(true);
                                    setVisible(false);
                                    break;
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "Username and password does not match!");
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Username and password does not match!");
                            }
                        }
                    }
                }
            }
        
            else if(event.getSource() == signup)
            {
                signuppage newuser = new signuppage();
                newuser.setVisible(true);
                setVisible(false);
            }
            else
            {}
            
            in.close();
        }
        
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}