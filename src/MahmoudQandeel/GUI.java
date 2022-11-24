package MahmoudQandeel;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static JTextField textName, textAddress, textAge;
    public static JRadioButton Female, Male;
    public static JButton Save, Clear, Print;
    public static TextArea textArea;
    public static JLabel count;

    GUI() {
        JFrame frame = new JFrame("Customer System");
        frame.setSize(500, 580);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        Button(panel);
        label(panel);
        TextField(panel);
        JRadioButton(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void label(JPanel panel){
        JLabel Customer = new JLabel("Customer Information");
        Customer.setBounds(20, 25, 400, 80);
        Customer.setFont(new Font("Information", Font.BOLD, 25));
        panel.add(Customer);

        JLabel Name = new JLabel("Customer Name: ");
        Name.setBounds(30, 100, 150, 25);
        panel.add(Name);

        JLabel Address = new JLabel("Customer Address: ");
        Address.setBounds(30, 130, 150, 25);
        panel.add(Address);

        JLabel Age = new JLabel("Customer Age: ");
        Age.setBounds(30, 160, 150, 25);
        panel.add(Age);

        JLabel Gender = new JLabel("Customer Gender");
        Gender.setBounds(20, 175, 400, 80);
        Gender.setFont(new Font("Gender", Font.BOLD, 19));
        panel.add(Gender);

        JLabel Comments = new JLabel("Comment");
        Comments.setBounds(20, 250, 120, 65);
        Comments.setFont(new Font("Gender", Font.BOLD, 17));
        panel.add(Comments);


        count = new JLabel();
        count.setBounds(10, 498, 120, 65);
        panel.add(count);
    }

    public void TextField(JPanel panel){
        textName = new JTextField();
        textName.setBounds(190, 100, 165, 25);
        panel.add(textName);

        textAddress = new JTextField();
        textAddress.setBounds(190, 130, 165, 25);
        panel.add(textAddress);

        textAge = new JTextField();
        textAge.setBounds(190, 160, 165, 25);
        panel.add(textAge);

        textArea = new TextArea();
        textArea.setBounds(25, 315, 400, 150);
        textArea.setFont(new Font("Comments", Font.BOLD, 15));
        panel.add(textArea);
    }

    public void JRadioButton(JPanel panel){
        Female = new JRadioButton();
        Male = new JRadioButton();
        Female.setText("Female");
        Female.setBounds(25, 235, 100, 25);
        Male.setText("Male");
        Male.setBounds(120, 235, 100, 25);
        panel.add(Female);
        panel.add(Male);
    }

    public void Button(JPanel panel) {
        Save = new JButton("Save");
        Save.setBounds(25, 480, 80, 25);
        panel.add(Save);

        Clear = new JButton("Clear");
        Clear.setBounds(150, 480, 80, 25);
        panel.add(Clear);

        Print = new JButton("Print");
        Print.setBounds(275, 480, 80, 25);
        panel.add(Print);
    }
}