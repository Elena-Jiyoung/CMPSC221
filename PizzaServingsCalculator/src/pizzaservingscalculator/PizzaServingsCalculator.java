/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzaservingscalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author kinner
 */
public class PizzaServingsCalculator extends JFrame{

    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JTextField input = new JTextField(5);
    private JButton calcButton = new JButton("Calculate Servings");
    static JLabel jLabel4 = new JLabel();

    private JPanel line1 = new JPanel();
    private JPanel line2 = new JPanel();
    private JPanel line4 = new JPanel();

    public PizzaServingsCalculator()
    {
        super("Pizza Servings Calculator");
        setLayout(new GridLayout(4, 1));
        
        jLabel1.setText("Pizza Servings Calculator");
        jLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabel1.setForeground(Color.red);
        line1.add(jLabel1);
        
        jLabel2.setText("Enter the size of the pizza in inches:");
        line2.add(jLabel2);
        line2.add(input);

        line4.add(jLabel4);

        add(line1);
        add(line2);
        add(calcButton); // Entire line is button
        add(line4);

        ButtonHandler t = new ButtonHandler();
        calcButton.addActionListener(t);
    }
    
    /**
     * @param args the command line arguments   
     */
    public static void main(String[] args) {
        PizzaServingsCalculator p = new PizzaServingsCalculator();
        p.setSize(350,300);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setVisible(true);
    }

    private class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            Double t = Math.pow((Double.parseDouble(input.getText()) / 8), 2);
            jLabel4.setText("A " + input.getText() + " inch pizza will serve " + Math.round(t * 100.0) / 100.0 + " people.");
        }
    }
}
