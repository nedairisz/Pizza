package pizza;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class OrderSummaryWindow extends JFrame {
    public OrderSummaryWindow(String selectedPizza, String selectedExtra, String selectedSize, int selectedQuantity) {
        setTitle("Rendelés");
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the window on the screen
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        add(panel);

        JLabel pizzaLabel = new JLabel("Selected Pizza: " + selectedPizza);
        JLabel extraLabel = new JLabel("Selected Extra: " + selectedExtra);
        JLabel sizeLabel = new JLabel("Selected Size: " + selectedSize);
        JLabel quantityLabel = new JLabel("Selected Quantity: " + selectedQuantity);

        panel.add(pizzaLabel);
        panel.add(extraLabel);
        panel.add(sizeLabel);
        panel.add(quantityLabel);
    }
}