package MahmoudQandeel;

import javax.swing.*;
import java.util.ArrayList;

import static MahmoudQandeel.GUI.*;

public class Main {

    public static void main(String[] args) {
        new GUI();
        ArrayList<customerData> information = new ArrayList<>();

        Female.addActionListener(e -> {
            if (Female.isSelected()){
                Male.setSelected(false);
            }
        });

        Male.addActionListener(e -> {
            if (Male.isSelected()){
                Female.setSelected(false);
            }
        });

        Save.addActionListener(e -> {
            String age = textAge.getText();
            customerData customerData = new customerData();
            if (textName.getText().isEmpty() || textAddress.getText().isEmpty() || textAge.getText().isEmpty() ||
                    Female.getText().isEmpty() || Male.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please complete the boxes!");
            } else {
                if (Female.isSelected()) {
                    customerData.setGender("Female");
                } else if (Male.isSelected()) {
                    customerData.setGender("Male");
                }else{
                    JOptionPane.showMessageDialog(null, "Please select the gender!");
                }
                customerData.setName(textName.getText());
                customerData.setAddress(textAddress.getText());
                customerData.setAge(Integer.parseInt(age));
                customerData.setComments(textArea.getText());
                for (int i=0; i < information.size()+1; i++) {
                    count.setText("Customer: " + (i+1));
                }
            }
            information.add(customerData);
            JOptionPane.showMessageDialog(null,"Save successful!");
        });


        Clear.addActionListener(e -> {
            textName.setText(null);
            textAddress.setText(null);
            textAge.setText(null);
            textArea.setText(null);
            Male.setSelected(false);
            Female.setSelected(false);
        });

        Print.addActionListener(e -> {
            if (information.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No stored information was found!");
            }else {
                for (MahmoudQandeel.customerData customerData : information) {
//                    System.out.println("Person " + (i+1) + " -->");
                    System.out.println("Name: " + customerData.getName());
                    System.out.println("Address: " + customerData.getAddress());
                    System.out.println("Age: " + customerData.getAge());
                    System.out.println("Gender: " + customerData.getGender());
                    System.out.println("Comment: " + customerData.getComments());
                }
            }
        });
    }
}
