import javax.swing.*;
import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
    }
    public static class Frame extends JFrame {
        public Frame() {
        setTitle("Calculator");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
       
        JTextField textField = new JTextField();
        textField.setColumns(20);
        
        JPanel panel = new JPanel(new BorderLayout());
        add(textField, BorderLayout.NORTH);
          
        
        JPanel button = new JPanel(new GridLayout(4, 4));
        button.add(new JButton("7"));
        button.add(new JButton("8"));
        button.add(new JButton("9"));
        button.add(new JButton("/"));
        button.add(new JButton("4"));
        button.add(new JButton("5"));
        button.add(new JButton("6"));
        button.add(new JButton("*"));
        button.add(new JButton("1"));
        button.add(new JButton("2"));
        button.add(new JButton("3"));
        button.add(new JButton("-"));
        button.add(new JButton("C"));
        button.add(new JButton("0"));
        button.add(new JButton("="));
        button.add(new JButton("+"));
        
        
        panel.add(button, BorderLayout.CENTER);
        add(panel);
        }
    }
}
