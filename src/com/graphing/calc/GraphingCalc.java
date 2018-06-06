package com.graphing.calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GraphingCalc extends JFrame {

    private JPanel mainPanel;
    private JButton submitButton;
    private JComboBox  chooseFunction;

    public static void main (String [] args) {
        new GraphingCalc();
    }

    public GraphingCalc(){
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        submitButton = new JButton("Submit");
        submitButton.setPreferredSize(new Dimension(50, 30));

        String[] functionList = {"-- None --", "Polynomial", "Exponential",  "Logarithmic",};
        chooseFunction = new JComboBox(functionList);

        mainPanel.add(submitButton);
        mainPanel.add(chooseFunction);

        setContentPane(mainPanel);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Graphing Calculator");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
