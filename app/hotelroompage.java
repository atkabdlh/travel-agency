
/**
 * Booking hotel room page frame
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

public class hotelroompage extends JFrame implements ActionListener
{
    private static final int framewidth = 700;
    private static final int frameheight = 700;
    
    private JPanel center;
    private JButton book, mainmenubtn;
    private JLabel header, booktext, countrytext, hotelname, name, arrivaltext, checkouttext, roomtypetext, roomtext, roomdescription1, roomdescription2, roomdescription3, roomdescription4, roomdescription5, logouttext;
    private JComboBox country, adate, amonth, ayear, cdate, cmonth, cyear, roomtype;
    
    public hotelroompage()
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
        getContentPane().setBackground(Color.PINK);
        header = new JLabel(new ImageIcon("header7.jpg"));
        
        getContentPane().add(header);
        
        center = new JPanel(new GridBagLayout());
        center.setBackground(Color.PINK);
        getContentPane().add(center);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        
        booktext = new JLabel("Booking Hotel Room");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 9;
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
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        country.addActionListener(this);
        center.add(country, constraints);
        
        hotelname = new JLabel("Hotel Name : ");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(hotelname, constraints);
        
        name = new JLabel("");
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 4;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(name, constraints);
        
        arrivaltext = new JLabel("Arrival Date : ");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(arrivaltext, constraints);
        
        String[] tarikh = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        adate = new JComboBox(tarikh);
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(adate, constraints);
        
        String[] bulan = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        amonth = new JComboBox(bulan);
        constraints.gridx = 3;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(amonth, constraints);
        
        String[] tahun = {"2016", "2017", "2018"};
        ayear = new JComboBox(tahun);
        constraints.gridx = 4;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(ayear, constraints);
        
        checkouttext = new JLabel("Checkout Date : ");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(checkouttext, constraints);
        
        cdate = new JComboBox(tarikh);
        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(cdate, constraints);
        
        cmonth = new JComboBox(bulan);
        constraints.gridx = 3;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(cmonth, constraints);
        
        cyear = new JComboBox(tahun);
        constraints.gridx = 4;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(cyear, constraints);
        
        roomtypetext = new JLabel("Type of Room : ");
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(roomtypetext, constraints);
        
        String[] rooms = {"Choose Room", "Standard Room", "Deluxe Room", "Club Room", "Executive Suite", "Centennial Suite"};
        roomtype = new JComboBox(rooms);
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        roomtype.addActionListener(this);
        center.add(roomtype, constraints);
        
        roomtext = new JLabel("Room Description : ");
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(roomtext, constraints);
        
        roomdescription1 = new JLabel("");
        constraints.gridx = 2;
        constraints.gridy = 6;
        constraints.gridwidth = 7;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(roomdescription1, constraints);
        
        roomdescription2 = new JLabel("");
        constraints.gridx = 2;
        constraints.gridy = 7;
        constraints.gridwidth = 7;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(roomdescription2, constraints);
        
        roomdescription3 = new JLabel("");
        constraints.gridx = 2;
        constraints.gridy = 8;
        constraints.gridwidth = 7;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(roomdescription3, constraints);
        
        roomdescription4 = new JLabel("");
        constraints.gridx = 2;
        constraints.gridy = 9;
        constraints.gridwidth = 7;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(roomdescription4, constraints);
        
        roomdescription5 = new JLabel("");
        constraints.gridx = 2;
        constraints.gridy = 10;
        constraints.gridwidth = 7;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(roomdescription5, constraints);
        
        book = new JButton("Book");
        constraints.gridx = 1;
        constraints.gridy = 11;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        book.addActionListener(this);
        center.add(book, constraints);
        
        logouttext = new JLabel("Back to Main Menu");
        constraints.gridx = 4;
        constraints.gridy = 11;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(logouttext, constraints);
        
        mainmenubtn = new JButton("Main Menu");
        constraints.gridx = 5;
        constraints.gridy = 11;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        mainmenubtn.addActionListener(this);
        center.add(mainmenubtn, constraints);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        File bilik = new File ("rooms.txt");
        File bookbilik = new File("bookedrooms.dat");
        
        String namahotel = null;
        
        if(event.getSource() == country)
        {
            if(country.getSelectedItem().toString().equals("China"))
            {
                namahotel = "Red Wall Garden Hotel, Beijing.";
                name.setText(namahotel);
            }
            else if(country.getSelectedItem().toString().equals("Korea"))
            {
                namahotel = "The Shilla Seoul, Seoul.";
                name.setText(namahotel);
            }
            else if(country.getSelectedItem().toString().equals("Japan"))
            {
                namahotel = "Takinoya, Noboribetsu.";
                name.setText(namahotel);
            }
            else if(country.getSelectedItem().toString().equals("Singapore"))
            {
                namahotel = "The Fullerton Bay Hotel, Singapore.";
                name.setText(namahotel);
            }
            else if(country.getSelectedItem().toString().equals("Indonesia"))
            {
                namahotel = "Wapa di Ume Resort and Spa, Ubud.";
                name.setText(namahotel);
            }
        }
    
        try
        {
            Scanner in = new Scanner(bilik);
            
            String namabilik = null, deskripsibilik1 = null, deskripsibilik2 = null, deskripsibilik3 = null, deskripsibilik4 = null, deskripsibilik5 = null, negara, tarikhsampai, tarikhcheckout, starikh, sbulan, stahun, ctarikh, cbulan, ctahun;
            int days;
            double harga = 0, total;
            String indata = null;
            
            if(event.getSource() == roomtype)
            {
                if(roomtype.getSelectedItem().toString().equals("Standard Room"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        namabilik = st.nextToken();
                        deskripsibilik1 = st.nextToken();
                        deskripsibilik2 = st.nextToken();
                        deskripsibilik3 = st.nextToken();
                        deskripsibilik4 = st.nextToken();
                        deskripsibilik5 = st.nextToken();
                    
                        if(namabilik.equals(roomtype.getSelectedItem().toString()))
                        {
                            roomdescription1.setText(deskripsibilik1);
                            roomdescription2.setText(deskripsibilik2);
                            roomdescription3.setText(deskripsibilik3);
                            roomdescription4.setText(deskripsibilik4);
                            roomdescription5.setText(deskripsibilik5);
                        }
                        else
                        {}
                    }
                }
                else if(roomtype.getSelectedItem().toString().equals("Deluxe Room"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                    
                        namabilik = st.nextToken();
                        deskripsibilik1 = st.nextToken();
                        deskripsibilik2 = st.nextToken();
                        deskripsibilik3 = st.nextToken();
                        deskripsibilik4 = st.nextToken();
                        deskripsibilik5 = st.nextToken();
                    
                        if(namabilik.equals(roomtype.getSelectedItem().toString()))
                        {
                            roomdescription1.setText(deskripsibilik1);
                            roomdescription2.setText(deskripsibilik2);
                            roomdescription3.setText(deskripsibilik3);
                            roomdescription4.setText(deskripsibilik4);
                            roomdescription5.setText(deskripsibilik5);
                        }
                        else
                        {}
                    }
                }
                else if(roomtype.getSelectedItem().toString().equals("Club Room"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                    
                        namabilik = st.nextToken();
                        deskripsibilik1 = st.nextToken();
                        deskripsibilik2 = st.nextToken();
                        deskripsibilik3 = st.nextToken();
                        deskripsibilik4 = st.nextToken();
                        deskripsibilik5 = st.nextToken();
                    
                        if(namabilik.equals(roomtype.getSelectedItem().toString()))
                        {
                            roomdescription1.setText(deskripsibilik1);
                            roomdescription2.setText(deskripsibilik2);
                            roomdescription3.setText(deskripsibilik3);
                            roomdescription4.setText(deskripsibilik4);
                            roomdescription5.setText(deskripsibilik5);
                        }
                        else
                        {}
                    }
                }
                else if(roomtype.getSelectedItem().toString().equals("Executive Suite"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                        
                        namabilik = st.nextToken();
                        deskripsibilik1 = st.nextToken();
                        deskripsibilik2 = st.nextToken();
                        deskripsibilik3 = st.nextToken();
                        deskripsibilik4 = st.nextToken();
                        deskripsibilik5 = st.nextToken();
                    
                        if(namabilik.equals(roomtype.getSelectedItem().toString()))
                        {
                            roomdescription1.setText(deskripsibilik1);
                            roomdescription2.setText(deskripsibilik2);
                            roomdescription3.setText(deskripsibilik3);
                            roomdescription4.setText(deskripsibilik4);
                            roomdescription5.setText(deskripsibilik5);
                        }
                        else
                        {}
                    }
                }
                else if(roomtype.getSelectedItem().toString().equals("Centennial Suite"))
                {
                    while(in.hasNext())
                    {
                        indata = in.nextLine();
                        StringTokenizer st = new StringTokenizer(indata, ";");
                    
                        namabilik = st.nextToken();
                        deskripsibilik1 = st.nextToken();
                        deskripsibilik2 = st.nextToken();
                        deskripsibilik3 = st.nextToken();
                        deskripsibilik4 = st.nextToken();
                        deskripsibilik5 = st.nextToken();
                    
                        if(namabilik.equals(roomtype.getSelectedItem().toString()))
                        {
                            roomdescription1.setText(deskripsibilik1);
                            roomdescription2.setText(deskripsibilik2);
                            roomdescription3.setText(deskripsibilik3);
                            roomdescription4.setText(deskripsibilik4);
                            roomdescription5.setText(deskripsibilik5);
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
        
            PrintWriter out = new PrintWriter(bookbilik);
            
            if(event.getSource() == book)
            {
                negara = country.getSelectedItem().toString();
                namabilik = roomtype.getSelectedItem().toString();
                starikh = adate.getSelectedItem().toString();
                sbulan = amonth.getSelectedItem().toString();
                stahun = ayear.getSelectedItem().toString();
                ctarikh = cdate.getSelectedItem().toString();
                cbulan = cmonth.getSelectedItem().toString();
                ctahun = cyear.getSelectedItem().toString();
                
                tarikhsampai = starikh + "/" + sbulan + "/" + stahun;
                tarikhcheckout = ctarikh + "/" + cbulan + "/" + ctahun;
                
                if(namabilik.equals("Standard Room"))
                {
                    harga = 750;
                }
                else if(namabilik.equals("Deluxe Room"))
                {
                    harga = 1560;
                }
                else if(namabilik.equals("Club Room"))
                {
                    harga = 3502;
                }
                else if(namabilik.equals("Executive Suite"))
                {
                    harga = 5290;
                }
                else if(namabilik.equals("Centennial Suite"))
                {
                    harga = 8761;
                }
                else
                {}
                
                days = ((Integer.parseInt(ctarikh)) - (Integer.parseInt(starikh))) + (((Integer.parseInt(cbulan)) - (Integer.parseInt(sbulan))) * 30) + (((Integer.parseInt(ctahun)) - (Integer.parseInt(stahun))) * 365);
                
                total = days * harga;
                
                out.println(negara + ";" + tarikhsampai + ";" + tarikhcheckout + ";" + namabilik + ";" + total);
                
                int result = JOptionPane.showConfirmDialog(null, "Total payment is RM " + total + "\nWould you like to proceed?");
                
                if(result == JOptionPane.YES_OPTION)
                {
                        
                    JOptionPane.showMessageDialog(null, "Room Successfully Booked!");
                    
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
