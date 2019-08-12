
/**
 * Booking holiday package page frame
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

public class holidaypackagepage extends JFrame implements ActionListener
{
    private static final int framewidth = 700;
    private static final int frameheight = 700;
    
    private JPanel center;
    private JButton book, mainmenubtn;
    private JLabel header, packagetext1, packagetext2, packagedescription, description1, description2, description3, countrytext, arrivaltext, checkouttext, logouttext;
    private JComboBox country, adate, amonth, ayear, cdate, cmonth, cyear;
    private JRadioButton family, friends, honeymoon, business;
    
    public holidaypackagepage()
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
        getContentPane().setBackground(Color.WHITE);
        header = new JLabel(new ImageIcon("header5.jpeg"));
        
        getContentPane().add(header);
        
        center = new JPanel(new GridBagLayout());
        center.setBackground(Color.WHITE);
        getContentPane().add(center);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        
        packagetext1 = new JLabel("Holiday Packages");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 8;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(packagetext1, constraints);
        
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
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(country, constraints);
        
        packagetext2 = new JLabel("Choose a holiday package : ");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 8;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(packagetext2, constraints);
        
        ButtonGroup packagestype = new ButtonGroup();
        
        family = new JRadioButton("Family Package");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        family.addActionListener(this);
        packagestype.add(family);
        center.add(family, constraints);
        
        friends = new JRadioButton("Friends Package");
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        friends.addActionListener(this);
        packagestype.add(friends);
        center.add(friends, constraints);
        
        honeymoon = new JRadioButton("Honeymoon Package");
        constraints.gridx = 4;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        honeymoon.addActionListener(this);
        packagestype.add(honeymoon);
        center.add(honeymoon, constraints);
        
        business = new JRadioButton("Business Package");
        constraints.gridx = 6;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        business.addActionListener(this);
        packagestype.add(business);
        center.add(business, constraints);
        
        packagedescription = new JLabel("Package Description : ");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(packagedescription, constraints);
        
        description1 = new JLabel("");
        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.gridwidth = 6;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(description1, constraints);
        
        description2 = new JLabel("");
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridwidth = 6;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(description2, constraints);
        
        description3 = new JLabel("");
        constraints.gridx = 2;
        constraints.gridy = 6;
        constraints.gridwidth = 6;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(description3, constraints);
        
        arrivaltext = new JLabel("Arrival Date : ");
        constraints.gridx = 0;
        constraints.gridy = 7;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(arrivaltext, constraints);
        
        String[] tarikh = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        adate = new JComboBox(tarikh);
        constraints.gridx = 2;
        constraints.gridy = 7;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(adate, constraints);
        
        String[] bulan = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        amonth = new JComboBox(bulan);
        constraints.gridx = 3;
        constraints.gridy = 7;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(amonth, constraints);
        
        String[] tahun = {"2016", "2017", "2018"};
        ayear = new JComboBox(tahun);
        constraints.gridx = 4;
        constraints.gridy = 7;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(ayear, constraints);
        
        checkouttext = new JLabel("Checkout Date : ");
        constraints.gridx = 0;
        constraints.gridy = 8;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(checkouttext, constraints);
        
        cdate = new JComboBox(tarikh);
        constraints.gridx = 2;
        constraints.gridy = 8;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(cdate, constraints);
        
        cmonth = new JComboBox(bulan);
        constraints.gridx = 3;
        constraints.gridy = 8;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(cmonth, constraints);
        
        cyear = new JComboBox(tahun);
        constraints.gridx = 4;
        constraints.gridy = 8;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(cyear, constraints);
        
        book = new JButton("Book");
        constraints.gridx = 6;
        constraints.gridy = 9;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        book.addActionListener(this);
        center.add(book, constraints);
        
        logouttext = new JLabel("Back to Main Menu");
        constraints.gridx = 4;
        constraints.gridy = 10;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(logouttext, constraints);
        
        mainmenubtn = new JButton("Main Menu");
        constraints.gridx = 6;
        constraints.gridy = 10;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        mainmenubtn.addActionListener(this);
        center.add(mainmenubtn, constraints);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        File holidaypackages = new File("packages.txt");
        File bookpakej = new File("bookedpackages.dat");
        
        try
        {
            Scanner in = new Scanner(holidaypackages);
            
            String packagename = null, countryname = null, packagedescription1 = null, packagedescription2 = null, packagedescription3 = null, tarikhsampai = null, tarikhcheckout = null, starikh = null, sbulan = null, stahun = null, ctarikh = null, cbulan = null, ctahun = null;
            double total = 0;
            String indata = null;
            if(event.getSource() == family)
            {
                if(country.getSelectedItem().toString().equals("China"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Family Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Korea"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Family Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Japan"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                            
                        if(packagename.equalsIgnoreCase("Family Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Singapore"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                            
                        if(packagename.equalsIgnoreCase("Family Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Indonesia"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                            
                        if(packagename.equalsIgnoreCase("Family Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else
                {}
            }
            else if(event.getSource() == friends)
            {
                if(country.getSelectedItem().toString().equals("China"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Friends Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Korea"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Friends Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Japan"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Friends Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Singapore"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Friends Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Indonesia"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Friends Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else
                {}
            }
            else if(event.getSource() == honeymoon)
            {
                if(country.getSelectedItem().toString().equals("China"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Honeymoon Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Korea"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Honeymoon Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Japan"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Honeymoon Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Singapore"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Honeymoon Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Indonesia"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Honeymoon Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else
                {}
            }
            else if(event.getSource() == business)
            {
                if(country.getSelectedItem().toString().equals("China"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Business Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Korea"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Business Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Japan"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Business Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Singapore"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Business Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else if(country.getSelectedItem().toString().equals("Indonesia"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        packagename = st.nextToken();
                        countryname = st.nextToken();
                        packagedescription1 = st.nextToken();
                        packagedescription2 = st.nextToken();
                        packagedescription3 = st.nextToken();
                        
                        if(packagename.equalsIgnoreCase("Business Package"))
                        {
                            if(countryname.equals(country.getSelectedItem().toString()))
                            {
                                description1.setText(packagedescription1);
                                description2.setText(packagedescription2);
                                description3.setText(packagedescription3);
                            }
                            else
                            {}
                        }
                        else
                        {}
                    }
                }
                else
                {}
            }
            else
            {}
            
            PrintWriter out = new PrintWriter(bookpakej);
            
            if(event.getSource() == book)
            {
                countryname = country.getSelectedItem().toString();
                starikh = adate.getSelectedItem().toString();
                sbulan = amonth.getSelectedItem().toString();
                stahun = ayear.getSelectedItem().toString();
                ctarikh = cdate.getSelectedItem().toString();
                cbulan = cmonth.getSelectedItem().toString();
                ctahun = cyear.getSelectedItem().toString();
                
                tarikhsampai = starikh + "/" + sbulan + "/" + stahun;
                tarikhcheckout = ctarikh + "/" + cbulan + "/" + ctahun;
                
                if(family.isSelected())
                {
                    packagename = "Family Package";
                    
                    total = 12950;
                }
                else if(friends.isSelected())
                {
                    packagename = "Friends Package";
                    
                    total = 9435;
                }
                else if(honeymoon.isSelected())
                {
                    packagename = "Honeymoon Package";
                    
                    total = 10678;
                }
                else if(business.isSelected())
                {
                    packagename = "Business Package";
                    
                    total = 16432;
                }
                else
                {}
                
                
                out.println(packagename + ";" + countryname + ";" + tarikhsampai + ";" + tarikhcheckout + ";" + total);
                
                int result = JOptionPane.showConfirmDialog(null, "Total payment is RM " + total + "\nWould you like to proceed?");
                
                if(result == JOptionPane.YES_OPTION)
                {
                        
                    JOptionPane.showMessageDialog(null, "Package Successfully Booked!");
                    
                    payment paymenu = new payment();
                    paymenu.setVisible(true);
                    setVisible(false);
                }
                else
                {}
                
            }
            else
            {}
            
            in.close();
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
