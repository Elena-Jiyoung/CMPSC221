/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordle;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import java.awt.*;

/**
 *
 * @author kinner
 */
public class Wordle extends JFrame
{
    private JPanel line0 = new JPanel();
    private JTextField line0In = new JTextField(10);
    private JButton line0Button = new JButton();

    private JPanel line1 = new JPanel();
    private JTextField line1In = new JTextField(10);
    private JButton line1Button = new JButton();

    private JPanel line2 = new JPanel();
    private JTextField line2In = new JTextField(10);
    private JButton line2Button = new JButton();


    private JPanel line3 = new JPanel();
    private JTextField line3In = new JTextField(10);
    private JButton line3Button = new JButton();

    private JPanel line4 = new JPanel();
    private JTextField line4In = new JTextField(10);
    private JButton line4Button = new JButton();

    

    public Wordle()
    {
        super("Wordle");
        GridLayout grid = new GridLayout(6, 1);
        setLayout(grid);

        line0.add(line0In);
        line1.add(line1In);
        line2.add(line2In);
        line3.add(line3In);
        line4.add(line4In);

        line0.add(line0Button);
        line1.add(line1Button);
        line2.add(line2Button);
        line3.add(line3Button);
        line4.add(line4Button);

        line0Button.setText("Done");
        line1Button.setText("Done");
        line2Button.setText("Done");
        line3Button.setText("Done");
        line4Button.setText("Done");

        add(line0);
        add(line1);
        add(line2);
        add(line3);
        add(line4);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Wordle p = new Wordle();
        p.setSize(300,300);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setVisible(true);
    }
    
}
