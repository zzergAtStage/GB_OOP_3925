package oop.seminars.s01;

import oop.seminars.s01.domain.Product;
import oop.seminars.s01.machines.VendingMachine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendingMachineGUI extends JFrame {
    private JPanel gridPanel;
    private JComboBox<String> groceryComboBox;
    private static VendingMachine machine;
    public VendingMachineGUI() {
        setTitle("Vending Machine");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        // Create the grid panel
        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(0, 2, 10, 10));

        // Add grocery items
        for (Product item:
                machine.getProducts()) {
            this.addGrocery(item.getProductName(), machine.getProducts().size());
        }
        // Add more grocery items as needed

        // Create the grocery combo box
        groceryComboBox = new JComboBox<>();
        addGroceryItemsToComboBox();

        // Create the buy button
        JButton buyButton = new JButton("Buy");
        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedGrocery = (String) groceryComboBox.getSelectedItem();
                if (selectedGrocery != null) {
                    // Process the selected grocery for purchase
                    JOptionPane.showMessageDialog(VendingMachineGUI.this, "You bought: " + selectedGrocery);
                }
            }
        });

        // Create the bottom panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.add(groceryComboBox);
        bottomPanel.add(buyButton);

        // Add the grid panel and bottom panel to the frame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(gridPanel, BorderLayout.CENTER);
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void addGrocery(String name, int amount) {
        JLabel nameLabel = new JLabel(name);
        JLabel amountLabel = new JLabel("Remaining: " + amount);

        gridPanel.add(nameLabel);
        gridPanel.add(amountLabel);
    }

    private void addGroceryItemsToComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        DefaultListModel<String> listModel = new DefaultListModel<>();

        for (Component component : gridPanel.getComponents()) {
            if (component instanceof JLabel) {
                JLabel label = (JLabel) component;
                String name = label.getText();
                listModel.addElement(name);
            }
        }

        for (int i = 0; i < listModel.size(); i++) {
            model.addElement(listModel.get(i));
        }

        groceryComboBox.setModel(model);
    }

    public static void main(String[] args) throws Exception {

        machine = new VendingMachine(6);
        App.initialize(machine);
        SwingUtilities.invokeLater(() -> new VendingMachineGUI());
    }
}
