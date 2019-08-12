
/**
 * Main menu page frame
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainmenu extends JFrame implements ActionListener
{
    private static final int framewidth = 500;
    private static final int frameheight = 500;
    
    private JPanel center;
    private JButton planeticket, hotelroom, holidaypackages, currencyconverter, logout;
    private JLabel chooseservice, logouttext, header;
    
    public mainmenu()
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
        getContentPane().setBackground(Color.BLUE);
        header = new JLabel(new ImageIcon("header3.jpg"));
        
        getContentPane().add(header);
        
        center = new JPanel(new GridBagLayout());
        center.setBackground(Color.BLUE);
        getContentPane().add(center);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        
        chooseservice = new JLabel("Choose Your Service");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 6;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(chooseservice, constraints);
        
        planeticket = new JButton("Booking Plane Ticket");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 3;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        constraints.ipadx = 35;
        constraints.ipady = 20;
        planeticket.addActionListener(this);
        center.add(planeticket, constraints);
        
        hotelroom = new JButton("Booking Hotel Room");
        constraints.gridx = 3;
        constraints.gridy = 1;
        constraints.gridwidth = 3;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        constraints.ipadx = 35;
        constraints.ipady = 20;
        hotelroom.addActionListener(this);
        center.add(hotelroom, constraints);
        
        holidaypackages = new JButton(" Holiday Packages ");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 3;
        constraints.weightx = 1.5;
        constraints.weighty = 0.5;
        constraints.ipadx = 45;
        constraints.ipady = 20;
        holidaypackages.addActionListener(this);
        center.add(holidaypackages, constraints);
        
        currencyconverter = new JButton("Currency Converter");
        constraints.gridx = 3;
        constraints.gridy = 2;
        constraints.gridwidth = 3;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        constraints.ipadx = 35;
        constraints.ipady = 20;
        currencyconverter.addActionListener(this);
        center.add(currencyconverter, constraints);
        
        logouttext = new JLabel("You are currently logged in");
        constraints.gridx = 3;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        constraints.ipadx = 0;
        constraints.ipady = 0;
        center.add(logouttext, constraints);
        
        logout = new JButton("Log out");
        constraints.gridx = 4;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        constraints.ipadx = 0;
        constraints.ipady = 0;
        logout.addActionListener(this);
        center.add(logout, constraints);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == planeticket)
        {
            planeticketpage bookplaneticket = new planeticketpage();
            bookplaneticket.setVisible(true);
            setVisible(false);
        }
        else if(event.getSource() == hotelroom)
        {
            hotelroompage bookhotelroom = new hotelroompage();
            bookhotelroom.setVisible(true);
            setVisible(false);
        }
        else if(event.getSource() == holidaypackages)
        {
            holidaypackagepage choosepackage = new holidaypackagepage();
            choosepackage.setVisible(true);
            setVisible(false);
        }
        else if(event.getSource() == currencyconverter)
        {
            currencyconverter convertmoney = new currencyconverter();
            convertmoney.setVisible(true);
            setVisible(false);
        }
        else if(event.getSource() == logout)
        {
            int result = JOptionPane.showConfirmDialog(null, "Are you sure, you would like to logout from the system?");
            
            if(result == JOptionPane.YES_OPTION)
            {
                JOptionPane.showMessageDialog(null, "Successfully logged out of the system.");
                
                setVisible(false);
            }
            else
            {}
        }
        else
        {}
    }
}
