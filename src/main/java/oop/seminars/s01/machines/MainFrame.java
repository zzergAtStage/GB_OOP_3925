package oop.seminars.s01.machines;



import oop.seminars.s01.App;
import oop.seminars.s01.domain.Product;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.*;

public class MainFrame extends JFrame {
    
    
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfInsertedCoins;
    private void addGrocery(Product prod, JPanel gridPanel) {
        JLabel nameLabel = new JLabel(prod.getProductName());
        JLabel amountLabel = new JLabel("Price: " + prod.getPrice());

        gridPanel.add(nameLabel);
        gridPanel.add(amountLabel);
    }
    
    JLabel lbWelcome;
    static JComboBox  listOfGroceries;

    public void initialize(VendingMachine machine) {


        MainFrame s = new MainFrame(); //listener
        tfInsertedCoins = new JTextField();
        tfInsertedCoins.setFont(mainFont);


        JLabel lbSelectedItem = new JLabel();
        lbSelectedItem.setFont(mainFont);




        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));

        formPanel.add(tfInsertedCoins);
        formPanel.add(lbSelectedItem);
        formPanel.add(lbWelcome);

        
        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        
        
        JButton btnOk = new JButton("Ok");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String coinsInput = tfInsertedCoins.getText();
                int coinsAmount = Integer.getInteger(coinsInput);
                lbWelcome.setText("Inserted:  " + coinsAmount + " coins ");
            }
        });

       
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(mainFont);
        btnCancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
                tfInsertedCoins.setText("");
                lbSelectedItem.setText("");
            }

        });

        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnOk);
        buttonPanel.add(btnCancel);

        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        
        mainPanel.add(formPanel, BorderLayout.NORTH);

        
        mainPanel.add(lbWelcome, BorderLayout.CENTER);

        
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        //HomeWork S01 -> adding a grid
        listOfGroceries = new JComboBox (machine.getProducts().toArray(new Product[0]));
        //listOfGroceries.addItemListener(mainPanel);
        listOfGroceries.setSelectedIndex(2);//TODO magic numbers!
        formPanel.add(listOfGroceries);
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(0, 4, 10, 10));

        for (Product item:
                machine.getProducts()) {
            this.addGrocery(item, gridPanel);
        }


        mainPanel.add(gridPanel);
        setVisible(true);
        add(mainPanel);


        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        formPanel.setOpaque(false);
        buttonPanel.setOpaque(false);

        
        setTitle("VendingMachines");
        setSize(500, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] arg) throws Exception {
        MainFrame myFrame = new MainFrame();
        VendingMachine machine = new VendingMachine(6);
        App.initialize(machine);
        myFrame.initialize(machine);
    }

    public void itemStateChanged(ItemEvent e)
    {
        // if the state combobox is changed
        if (e.getSource() == listOfGroceries) {
            lbWelcome.setText(listOfGroceries.getSelectedItem() + " selected");
        }
    }

}
