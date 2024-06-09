package Tugas_GUI;

import javax.swing.*;
import java.awt.*;

public class CalculatorPanel extends JPanel{
    public CalculatorPanel(){
        setLayout(new BorderLayout());

        JTextField displayField = new JTextField();
        add(displayField , BorderLayout.NORTH);

        JPanel buttomPanel = new JPanel();
        buttomPanel.setLayout(new GridLayout(3, 6));

        String[] buttonLabels = {
            "1", "2", "3", "4", "5", "6",
            "7", "8", "9", "0", "+", "-",
            "*", "/", "=", "%", "Mod", "Exit"
        };

        for (String label : buttonLabels) {
            CalculatorButton button = new CalculatorButton(label);
            buttomPanel.add(button);

            if(label.equals("Exit")) {
                button.addActionListener(e -> System.exit(0));
            } 
        }
        add(buttomPanel, BorderLayout.CENTER);
    }
}
