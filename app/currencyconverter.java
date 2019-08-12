
/**
 * Currency converter page frame
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class currencyconverter extends JFrame implements ActionListener
{
    private static final int framewidth = 500;
    private static final int frameheight = 500;
    
    private JPanel center;
    private JButton convert, mainmenubtn;
    private JLabel header, convertertext, totext, logouttext;
    private JComboBox currency1, currency2;
    private JTextField amount1, amount2;
    
    public currencyconverter()
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
        getContentPane().setBackground(Color.GREEN);
        header = new JLabel(new ImageIcon("header4.jpg"));
        
        getContentPane().add(header);
        
        center = new JPanel(new GridBagLayout());
        center.setBackground(Color.GREEN);
        getContentPane().add(center);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        
        convertertext = new JLabel("Currency Converter");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(convertertext, constraints);
        
        amount1 = new JTextField(15);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(amount1, constraints);
        
        String[] currencies = {"Choose Currency", "RM (Ringgit Malaysia)", "¥ (Chinese Yuan)", "₩ (Korean Won)", "¥ (Japanese Yen)", "$ (Singaporean Dollar)", "Rp (Indonesian Rupiah)"};
        currency1 = new JComboBox(currencies);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(currency1, constraints);
        
        totext = new JLabel("to");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 4;
        constraints.weightx = 0.0;
        constraints.weighty = 1;
        center.add(totext, constraints);
        
        amount2 = new JTextField(15);
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        amount2.setEditable(false);
        center.add(amount2, constraints);
        
        currency2 = new JComboBox(currencies);
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(currency2, constraints);
        
        convert = new JButton("Convert");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 4;
        constraints.weightx = 0.0;
        constraints.weighty = 1;
        convert.addActionListener(this);
        center.add(convert, constraints);
        
        logouttext = new JLabel("Back to Main Menu");
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        center.add(logouttext, constraints);
        
        mainmenubtn = new JButton("Main Menu");
        constraints.gridx = 3;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.weighty = 1;
        mainmenubtn.addActionListener(this);
        center.add(mainmenubtn, constraints);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        double pengkali = 0, before = 0, after = 0;
        
        if(event.getSource() == convert)
        {
            if(currency1.getSelectedItem().toString().equals("RM (Ringgit Malaysia)"))
            {
                if(currency2.getSelectedItem().toString().equals("¥ (Chinese Yuan)"))
                {
                    pengkali = 1.63;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("₩ (Korean Won)"))
                {
                    pengkali = 286.15;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("¥ (Japanese Yen)"))
                {
                    pengkali = 25.96;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("$ (Singaporean Dollar)"))
                {
                    pengkali = 0.33;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("Rp (Indonesian Rupiah)"))
                {
                    pengkali = 3289.80;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else
                {}
            }
            else if(currency1.getSelectedItem().toString().equals("¥ (Chinese Yuan)"))
            {
                if(currency2.getSelectedItem().toString().equals("RM (Ringgit Malaysia)"))
                {
                    pengkali = 0.61;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("₩ (Korean Won)"))
                {
                    pengkali = 175.19;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("¥ (Japanese Yen)"))
                {
                    pengkali = 15.90;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("$ (Singaporean Dollar)"))
                {
                    pengkali = 0.20;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("Rp (Indonesian Rupiah)"))
                {
                    pengkali = 2014.62;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else
                {}
            }
            else if(currency1.getSelectedItem().toString().equals("₩ (Korean Won)"))
            {
                if(currency2.getSelectedItem().toString().equals("RM (Ringgit Malaysia)"))
                {
                    pengkali = 0.0035;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("¥ (Chinese Yuan)"))
                {
                    pengkali = 0.0057;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("¥ (Japanese Yen)"))
                {
                    pengkali = 0.091;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("$ (Singaporean Dollar)"))
                {
                    pengkali = 0.0012;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("Rp (Indonesian Rupiah)"))
                {
                    pengkali = 11.50;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else
                {}
            }
            else if(currency1.getSelectedItem().toString().equals("¥ (Japanese Yen)"))
            {
                if(currency2.getSelectedItem().toString().equals("RM (Ringgit Malaysia)"))
                {
                    pengkali = 0.039;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("¥ (Chinese Yuan)"))
                {
                    pengkali = 0.063;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("₩ (Korean Won)"))
                {
                    pengkali = 11.03;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("$ (Singaporean Dollar)"))
                {
                    pengkali = 0.013;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("Rp (Indonesian Rupiah)"))
                {
                    pengkali = 126.75;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else
                {}
            }
            else if(currency1.getSelectedItem().toString().equals("$ (Singaporean Dollar)"))
            {
                if(currency2.getSelectedItem().toString().equals("RM (Ringgit Malaysia)"))
                {
                    pengkali = 3.01;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("¥ (Chinese Yuan)"))
                {
                    pengkali = 4.91;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("₩ (Korean Won)"))
                {
                    pengkali = 860;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("¥ (Japanese Yen)"))
                {
                    pengkali = 78.01;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("Rp (Indonesian Rupiah)"))
                {
                    pengkali = 9888.62;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else
                {}
            }
            else if(currency1.getSelectedItem().toString().equals("Rp (Indonesian Rupiah)"))
            {
                if(currency2.getSelectedItem().toString().equals("RM (Ringgit Malaysia)"))
                {
                    pengkali = 0.00030;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("¥ (Chinese Yuan)"))
                {
                    pengkali = 0.00050;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("₩ (Korean Won)"))
                {
                    pengkali = 0.087;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("¥ (Japanese Yen)"))
                {
                    pengkali = 0.0079;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else if(currency2.getSelectedItem().toString().equals("$ (Singaporean Dollar)"))
                {
                    pengkali = 0.0001;
                    
                    before = Double.parseDouble(amount1.getText());
                    after = before * pengkali;
            
                    amount2.setText(Double.toString(after));
                }
                else
                {}
            }
            else
            {}
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
