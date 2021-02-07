package Test_Your_Luck_GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;




public class Test_your_luck_GUI {
    private JPanel form;
    private JButton testYourLuckButton;
    private JLabel luck;

    public static void main(String[] args) {
        JFrame frame = new JFrame("_-_lucky_-_");
        frame.setContentPane(new Test_your_luck_GUI().form);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Test_your_luck_GUI() {
        testYourLuckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                luck.setText(Luck());
            }

        });
    }



      public  String Luck(){
        Random r = new Random();
        // generating three random numbers from 0 to 9
        int one = r.nextInt(10);
        int two = r.nextInt(10);
        int three = r.nextInt(10);
        // printing the three numbers:
        System.out.printf("Your Three numbers are \n %d %d %d \n " ,one ,two, three);
        // comparing the numbers
        if (one == two && two == three){// if all are same you are very lucky
            System.out.println("You are very Lucky Today");
            return"Very Lucky...";
        }
        else if (one == two ||two == three || one == three){ //if any two of them are equal
            System.out.println("You are a little Lucky Today");
            return "Little Lucky";
        }
        else{ // this is your unluck
            System.out.println("It seems you are not Lucky enough Today");
            return "Not lucky";
        }


    }

}
