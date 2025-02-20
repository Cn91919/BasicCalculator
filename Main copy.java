import java.io.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JFrame;

class Main {
    private static double total = 0;
    private static double currentNumber = 0;

    private static String addDeci = ".";

    private static String currentStringValue = "";
    private static String totalStringValue = "";

    private static String currentOperation = "";
    private static JLabel label = new JLabel("0", SwingConstants.CENTER);
    private static JLabel background = new JLabel("", SwingConstants.CENTER);

public static void Buttons() {
    JFrame frame = new JFrame("Calculator");


    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonZero = new JButton("0");

    JButton buttonAddition = new JButton("+");
    JButton buttonSubtract = new JButton("-");
    JButton buttonMultiply = new JButton("X");
    JButton buttonDivide = new JButton("÷");
    JButton buttonEquals = new JButton("=");
    JButton buttonAC = new JButton("AC");
    JButton buttonDec = new JButton(".");


    buttonAC.setBackground(new Color(224,71,76));
    buttonAC.setForeground(Color.BLACK);
    buttonAC.setOpaque(true);
    buttonAC.setBorderPainted(false);



    label = new JLabel();
    label.setFont(new Font("Xenara", Font.BOLD, 24)); // Monospaced font and bold
    label.setOpaque(true);
    label.setBackground(Color.GRAY);
    label.setForeground(Color.WHITE);
    label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    background = new JLabel();
    background.setOpaque(true);
    background.setBackground(Color.BLACK);
    label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


    // x axis, y axis, width, height
    frame.setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.BOTH;
    gbc.insets = new Insets(0, 0, 0, 0);

    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.weightx = 1.0;
    gbc.weighty = 1.0;
    frame.add(buttonAC, gbc);

    gbc.gridx = 0; // Column
    gbc.gridy = 2; // Row
    gbc.weightx = 1; // Expand Horizontally
    gbc.weighty = 1; // Expand Vertically
    frame.add(buttonSeven, gbc);

    gbc.gridx = 1;
    gbc.gridy = 2;
    gbc.weightx = 1;
    gbc.weighty = 1;
    frame.add(buttonEight, gbc);

    gbc.gridx = 2;
    gbc.gridy = 2;
    gbc.weightx = 1;
    gbc.weighty = 1;
    frame.add(buttonNine, gbc);

    gbc.gridx = 3;
    gbc.gridy = 2;
    gbc.weightx = 1;
    gbc.weighty = 1;
    frame.add(buttonMultiply, gbc);

    gbc.gridx = 3;
    gbc.gridy = 1;
    gbc.weightx = 1;
    gbc.weighty = 1;
    frame.add(buttonDivide, gbc);

    gbc.gridx = 0;
    gbc.gridy = 3;
    gbc.weightx = 1;
    gbc.weighty = 1;
    frame.add(buttonFour, gbc);

    gbc.gridx = 1;
    gbc.gridy = 3;
    gbc.weightx = 1;
    gbc.weighty = 1;
    frame.add(buttonFive, gbc);

    gbc.gridx = 2;
    gbc.gridy = 3;
    gbc.weightx = 1;
    gbc.weighty = 1;
    frame.add(buttonSix, gbc);

    gbc.gridx = 3;
    gbc.gridy = 3;
    gbc.weightx = 1;
    gbc.weighty = 1;
    frame.add(buttonSubtract, gbc);

    gbc.gridx = 0;
    gbc.gridy = 4;
    gbc.weightx = 1;
    gbc.weighty = 1;
    frame.add(buttonOne, gbc);

    gbc.gridx = 1;
    gbc.gridy = 4;
    gbc.weightx = 1;
    gbc.weighty = 1;
    frame.add(buttonTwo, gbc);

    gbc.gridx = 2;
    gbc.gridy = 4;
    gbc.weightx = 1;
    gbc.weighty = 1;
    frame.add(buttonThree, gbc);

    gbc.gridx = 2;
    gbc.gridy = 5;
    gbc.weightx = 1;
    gbc.weighty = 1;
    frame.add(buttonDec, gbc);


    gbc.gridx = 3;
    gbc.gridy = 4;
    gbc.weightx = 1;
    gbc.weighty = 1;
    frame.add(buttonAddition, gbc);

    gbc.gridx = 1;
    gbc.gridy = 5;
    gbc.weightx = 1;
    gbc.weighty = 1;
    frame.add(buttonZero, gbc);

    gbc.gridx = 3;
    gbc.gridy = 5;
    gbc.weightx = 1;
    gbc.weighty = 1;
    frame.add(buttonEquals, gbc);

    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 5;
    gbc.weightx = 5;
    gbc.weighty = 1;
    frame.add(label, gbc);
    label.setText("0");

    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 5;
    gbc.gridheight = 6;
    gbc.weightx = 5;
    gbc.weighty = 1;
    frame.add(background, gbc);
    buttonOne.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            currentStringValue = "1";
            totalStringValue += currentStringValue;
            currentNumber = Double.parseDouble(totalStringValue);
            label.setText(String.valueOf(currentNumber));

            shorten();
        }
    });

    buttonTwo.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            currentStringValue = "2";
            totalStringValue += currentStringValue;
            currentNumber = Double.parseDouble(totalStringValue);
            label.setText(String.valueOf(currentNumber));

            shorten();
        }
    });

    buttonThree.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            currentStringValue = "3";
            totalStringValue += currentStringValue;
            currentNumber = Double.parseDouble(totalStringValue);
            label.setText(String.valueOf(currentNumber));

            shorten();
        }
    });

    buttonFour.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            currentStringValue = "4";
            totalStringValue += currentStringValue;
            currentNumber = Double.parseDouble(totalStringValue);
            label.setText(String.valueOf(currentNumber));

            shorten();
        }
    });

    buttonFive.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            currentStringValue = "5";
            totalStringValue += currentStringValue;
            currentNumber = Double.parseDouble(totalStringValue);
            label.setText(String.valueOf(currentNumber));

            shorten();
        }
    });

    buttonSix.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            currentStringValue = "6";
            totalStringValue += currentStringValue;
            currentNumber = Double.parseDouble(totalStringValue);
            label.setText(String.valueOf(currentNumber));

            shorten();
        }
    });

    buttonSeven.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            currentStringValue = "7";
            totalStringValue += currentStringValue;
            currentNumber = Double.parseDouble(totalStringValue);
            label.setText(String.valueOf(currentNumber));

            shorten();
        }
    });

    buttonEight.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            currentStringValue = "8";
            totalStringValue += currentStringValue;
            currentNumber = Double.parseDouble(totalStringValue);
            label.setText(String.valueOf(currentNumber));

            shorten();
        }
    });

    buttonNine.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            currentStringValue = "9";
            totalStringValue += currentStringValue;
            currentNumber = Double.parseDouble(totalStringValue);
            label.setText(String.valueOf(currentNumber));

            shorten();
        }
    });

    buttonZero.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            currentStringValue = "0";
            totalStringValue += currentStringValue;
            currentNumber = Double.parseDouble(totalStringValue);
            label.setText(String.valueOf(currentNumber));

            shorten();
        }
    });

    buttonEquals.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            calculations();
            // Resetting the operation after the calculation
            currentOperation = "";
            label.setText("" + total);
            currentNumber = 0;
        }
    });
    buttonAC.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            fullWipe();
            label.setText("0.0");
        }
    });
    buttonAddition.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            currentOperation = "+";
            reset();
        }
    });
    buttonSubtract.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            currentOperation = "-";
            reset();
        }
    });
    buttonMultiply.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            currentOperation = "*";
            reset();

        }
    });
    buttonDivide.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            currentOperation = "÷";
            reset();
        }
    });
    buttonDec.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (!currentStringValue.contains(".")) {
                currentStringValue += ".";
                totalStringValue = currentStringValue; // Update totalStringValue with the decimal point
                label.setText(totalStringValue);
            }
        }
    });
    frame.setSize(400, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
public static void shorten()
{
    if (total == 0)
    {
        String tot = "";
        label.setText(String.valueOf(tot + currentOperation + currentNumber));
    }
    else
    {
        label.setText(String.valueOf(total + currentOperation + currentNumber));
    }
}
public static void calculations()
{
    if (currentOperation.equals("+")) {
        total += currentNumber;
    }
    else if(currentOperation.equals("-")) {
        total -= currentNumber;
    }
    else if(currentOperation.equals("*")) {
        total *= currentNumber;
    }
    else if(currentOperation.equals("÷")) {
        if (currentNumber != 0)
        {
            total /= currentNumber;
        }
        else {
            label.setText("Error");
        }
    }
}
public static void reset()
{
    total += currentNumber;
    currentStringValue = "";
    totalStringValue = "";
    currentNumber = 0;
    label.setText(total + "" + currentOperation);
}
public static void fullWipe()
{
    label.setText("");
    currentNumber = 0;
    total = 0;
    currentOperation = "";
    currentStringValue = "";
    totalStringValue = "";
}
public static void main(String[] args) {
        Buttons();
    }
}