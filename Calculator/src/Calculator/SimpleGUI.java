package Calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static java.lang.Float.parseFloat;

public class SimpleGUI extends JFrame {
    private JPanel buttonPanel = new JPanel(new GridLayout(3,0));
    private JPanel display1 = new JPanel(new GridLayout(1,0));
    private JPanel operatorPanel = new JPanel(new GridLayout(1,0));
    private JTextField display = new JTextField("", 15);
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");
    private JButton button0 = new JButton("0");
    private JButton clear = new JButton("C");
    private JButton result = new JButton("=");


    private JButton buttonMult = new JButton("x");
    private JButton buttonPlus = new JButton("+");
    private JButton buttonMinus = new JButton("-");
    private JButton buttonDivision = new JButton("/");

    public SimpleGUI() {
        super("Первый Калькулятор");
        this.setBounds(700,400,300,180);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        add(display1,BorderLayout.NORTH);
        add(buttonPanel,BorderLayout.SOUTH);
        add(operatorPanel,BorderLayout.CENTER);

        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("",Font.LAYOUT_RIGHT_TO_LEFT, 24));

        display1.add(display);
        buttonPlus.setFont(new Font("",Font.PLAIN,17));
        buttonMinus.setFont(new Font("",Font.PLAIN,18));
        buttonMult.setFont(new Font("",Font.PLAIN,17));
        buttonDivision.setFont(new Font("",Font.PLAIN,17));
        operatorPanel.add(buttonPlus);
        operatorPanel.add(buttonMinus);
        operatorPanel.add(buttonMult);
        operatorPanel.add(buttonDivision);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(button0);
        buttonPanel.add(clear);
        buttonPanel.add(result);

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"0");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"9");
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });


        final int[] result = {0};


        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result[0] = Integer.valueOf(display.getText());
                button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        display.setText("");
                        display.isEditable();
                    }
                });


            }
        });



    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button was pressed\n";
            message += "Text is " + display.getText() + "\n";
            JOptionPane.showMessageDialog(null,
                    message,
                    "Output",
                    JOptionPane.PLAIN_MESSAGE);
            display.setText("");
        }
    }
}