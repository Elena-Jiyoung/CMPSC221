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

    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    static JLabel jLabel4 = new JLabel();

    private JPanel line1 = new JPanel();
    private JPanel line2 = new JPanel();

    public PizzaServingsCalculator()
    {
        super("Pizza Servings Calculator");
        GridLayout grid = new GridLayout(4, 1);
        setLayout(new GridLayout(4, 1));
        

        jLabel1.setText("Pizza Servings Calculator");
        jLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabel1.setForeground(Color.red);
        line1.add(jLabel1);
        add(line1);

        jLabel2.setText("Enter the size of the pizza in inches:");
        line2.add(jLabel2);
        line2.add(new JTextField(5));
        
        add(line2);
        
        JButton calcServs = new JButton("Calculate Servings");
        ButtonHandler handler = new ButtonHandler();
        add(calcServs);
        
        add(jLabel4);
    }
    
    /**
     * @param args the command line arguments   
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PizzaServingsCalculator p = new PizzaServingsCalculator();
        p.setSize(350,300);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setVisible(true);
    }
}
