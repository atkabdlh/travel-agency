
/**
 * Booking plane ticket page frame
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

public class planeticketpage extends JFrame implements ActionListener
{
    private static final int framewidth = 700;
    private static final int frameheight = 700;
    
    private JPanel center;
    private JButton book, mainmenubtn;
    private JLabel header, booktext, countrytext, flightclasstext, departuredate, departuretext, seattext1, seattext2, seattext3, logouttext;
    private JComboBox country, flightclass, date, month, year, departure;
    private JTextField adult, children;
    
    public planeticketpage()
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
        header = new JLabel(new ImageIcon("header8.jpg"));
        
        getContentPane().add(header);
        
        center = new JPanel(new GridBagLayout());
        getContentPane().add(center);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        
        booktext = new JLabel("Booking Plane Ticket");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 5;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(booktext, constraints);
        
        countrytext = new JLabel("Country : ");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(countrytext, constraints);
        
        String[] countries = {"Choose Country", "China", "Korea", "Japan", "Singapore", "Indonesia"};
        country = new JComboBox(countries);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 3;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(country, constraints);
        
        flightclasstext = new JLabel("Flight Class : ");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(flightclasstext, constraints);
        
        String[] flight = {"Choose Flight Class", "Economy Class", "Business Class", "First Class"};
        flightclass = new JComboBox(flight);
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 3;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(flightclass, constraints);
        
        departuredate = new JLabel("Departure Date: ");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(departuredate, constraints);
        
        String[] tarikh = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        date = new JComboBox(tarikh);
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(date, constraints);
        
        String[] bulan = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        month = new JComboBox(bulan);
        constraints.gridx = 3;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(month, constraints);
        
        String[] tahun = {"2016", "2017", "2018"};
        year = new JComboBox(tahun);
        constraints.gridx = 4;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(year, constraints);
        
        departuretext = new JLabel("Departure Time: ");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(departuretext, constraints);
        
        String[] time = {"Choose Departure Time", "9.10 a.m.", "3.10 p.m.", "10 p.m."};
        departure = new JComboBox(time);
        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.gridwidth = 3;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(departure, constraints);
        
        seattext1 = new JLabel("Tickets : ");
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(seattext1, constraints);
        
        seattext2 = new JLabel("Adults : ");
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(seattext2, constraints);
        
        adult = new JTextField("0", 10);
        constraints.gridx = 3;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(adult, constraints);
        
        seattext3 = new JLabel("Children : ");
        constraints.gridx = 2;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(seattext3, constraints);
        
        children = new JTextField("0", 10);
        constraints.gridx = 3;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(children, constraints);
        
        book = new JButton("Book");
        constraints.gridx = 3;
        constraints.gridy = 7;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        book.addActionListener(this);
        center.add(book, constraints);
        
        logouttext = new JLabel("Back to Main Menu");
        constraints.gridx = 1;
        constraints.gridy = 8;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(logouttext, constraints);
        
        mainmenubtn = new JButton("Main Menu");
        constraints.gridx = 3;
        constraints.gridy = 8;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        mainmenubtn.addActionListener(this);
        center.add(mainmenubtn, constraints);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        File flightticket = new File("flightticket.dat");
        
        String negara, kelasplane, deptdate, deptmonth, deptyear, depttime, tarikh, dewasa, kanakkanak;
        double hargadewasa = 0, hargakanakkanak = 0, total, jdewasa, jkanakkanak;
        
        try
        {
            PrintWriter out = new PrintWriter(flightticket);
            
            if(event.getSource() == book)
            {
                negara = country.getSelectedItem().toString();
                kelasplane = flightclass.getSelectedItem().toString();
                deptdate = date.getSelectedItem().toString();
                deptmonth = month.getSelectedItem().toString();
                deptyear = year.getSelectedItem().toString();
                depttime = departure.getSelectedItem().toString();
                dewasa = adult.getText();
                kanakkanak = children.getText();
                
                tarikh = deptdate + "/" + deptmonth + "/" + deptyear;
                
                jdewasa = Double.parseDouble(dewasa);
                jkanakkanak = Double.parseDouble(kanakkanak);
                
                if(negara.equals("China"))
                {
                    if(kelasplane.equals("Economy Class"))
                    {
                        hargadewasa = 2251;
                        hargakanakkanak = 1915;
                    }
                    else if(kelasplane.equals("Business Class"))
                    {
                        hargadewasa = 3840;
                        hargakanakkanak = 3265;
                    }
                    else if(kelasplane.equals("First Class"))
                    {
                        hargadewasa = 4561;
                        hargakanakkanak = 3955;
                    }
                    else
                    {}
                }
                else if(negara.equals("Korea"))
                {
                    if(kelasplane.equals("Economy Class"))
                    {
                        hargadewasa = 1228;
                        hargakanakkanak = 1043;
                    }
                    else if(kelasplane.equals("Business Class"))
                    {
                        hargadewasa = 5118;
                        hargakanakkanak = 4350;
                    }
                    else if(kelasplane.equals("First Class"))
                    {
                        hargadewasa = 8930;
                        hargakanakkanak = 7260;
                    }
                    else
                    {}
                }
                else if(negara.equals("Japan"))
                {
                    if(kelasplane.equals("Economy Class"))
                    {
                        hargadewasa = 1908;
                        hargakanakkanak = 1623;
                    }
                    else if(kelasplane.equals("Business Class"))
                    {
                        hargadewasa = 5587;
                        hargakanakkanak = 4750;
                    }
                    else if(kelasplane.equals("First Class"))
                    {
                        hargadewasa = 9641;
                        hargakanakkanak = 7986;
                    }
                    else
                    {}
                }
                else if(negara.equals("Singapore"))
                {
                    if(kelasplane.equals("Economy Class"))
                    {
                        hargadewasa = 1199;
                        hargakanakkanak = 1020;
                    }
                    else if(kelasplane.equals("Business Class"))
                    {
                        hargadewasa = 1690;
                        hargakanakkanak = 1438;
                    }
                    else if(kelasplane.equals("First Class"))
                    {
                        hargadewasa = 2568;
                        hargakanakkanak = 1890;
                    }
                    else
                    {}
                }
                else if(negara.equals("Indonesia"))
                {
                    if(kelasplane.equals("Economy Class"))
                    {
                        hargadewasa = 887;
                        hargakanakkanak = 753;
                    }
                    else if(kelasplane.equals("Business Class"))
                    {
                        hargadewasa = 1967;
                        hargakanakkanak = 1677;
                    }
                    else if(kelasplane.equals("First Class"))
                    {
                        hargadewasa = 3241;
                        hargakanakkanak = 2580;
                    }
                    else
                    {}
                }
                else
                {}
                
                total = (jdewasa * hargadewasa) + (jkanakkanak * hargakanakkanak);
                
                out.println(negara + ";" + kelasplane + ";" + tarikh + ";" + depttime + ";" + total);
                
                int result = JOptionPane.showConfirmDialog(null, "Total payment is RM " + total + "\nWould you like to proceed?");
                
                if(result == JOptionPane.YES_OPTION)
                {
                        
                    JOptionPane.showMessageDialog(null, "Flight Ticket Successfully Booked!");
                    
                    payment paymenu = new payment();
                    paymenu.setVisible(true);
                    setVisible(false);
                }
                else
                {}
                
            }
            else
            {}
            
            out.close();
        }
        
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
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
