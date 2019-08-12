
/**
 * Payment page frame
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class payment extends JFrame implements ActionListener
{
    private static final int framewidth = 700;
    private static final int frameheight = 700;
    
    private JPanel center;
    private JButton submit, mainmenubtn;
    private JLabel header, paymenttext, amounttext, amount, bankholdertext, accountnotext, toaccounttext, ouraccount, datetext, date, logouttext;
    private JComboBox bankholder;
    private JTextField accountno;
    
    public payment()
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
        getContentPane().setBackground(Color.YELLOW);
        header = new JLabel(new ImageIcon("header6.jpg"));
        
        getContentPane().add(header);
        
        center = new JPanel(new GridBagLayout());
        center.setBackground(Color.YELLOW);
        getContentPane().add(center);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        
        paymenttext = new JLabel("Payment Method");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(paymenttext, constraints);
        
        bankholdertext = new JLabel("Bank Holder : ");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(bankholdertext, constraints);
        
        String[] banks = {"Choose Bankholder", "Bank Islam", "Maybank", "CIMB", "Bank Rakyat"};
        bankholder = new JComboBox(banks);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(bankholder, constraints);
        
        accountnotext = new JLabel("Bank Account Number : ");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(accountnotext, constraints);
        
        accountno = new JTextField("16-digits number", 16);
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(accountno, constraints);
        
        toaccounttext = new JLabel("To Account : ");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(toaccounttext, constraints);
        
        ouraccount = new JLabel("Travel Agency");
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(ouraccount, constraints);
        
        datetext = new JLabel("Date Valid : ");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(datetext, constraints);
        
        date = new JLabel("Today");
        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(date, constraints);
        
        submit = new JButton("Submit");
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 4;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        submit.addActionListener(this);
        center.add(submit, constraints);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == submit)
        {
            if(!((accountno.getText()).length() == 16))
            {
                JOptionPane.showMessageDialog(null, "Account number should be in 16-digits");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Transaction Successfull!");
                
                mainmenu homemenu = new mainmenu();
                homemenu.setVisible(true);
                setVisible(false);
            }
        }
        else
        {}
        if(event.getSource() == mainmenubtn)
        {
            mainmenu homemenu = new mainmenu();
            homemenu.setVisible(true);
            setVisible(false);
        }
        else
        {}
    }
    
}
