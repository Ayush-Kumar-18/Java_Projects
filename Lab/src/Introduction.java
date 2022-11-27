import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Introduction implements ActionListener {
    JFrame f;
    JButton StartQ, back;
    JLabel name, reg_no, branch, iHead, l1, l2, l3, l4, l5;
    Introduction(){
        f = new JFrame("Introduction");
        back = new JButton("Back");
        back.setBounds(600, 30, 80, 20);

        name = new JLabel("Name: "+LoginDemo.userName);
        name.setBounds(30, 20, 200, 30);
        reg_no = new JLabel("Reg. No.: "+LoginDemo.roll);
        reg_no.setBounds(30, 50, 200, 30);
        branch = new JLabel("Branch :"+LoginDemo.branch);
        branch.setBounds(30, 80, 200, 30);

//        panel = new JPanel();
//        panel.setBounds(30, 110, 600,300);
//        panel.setBackground(Color.gray);

        iHead = new JLabel("------- Instruction -------");
        iHead.setBounds(250, 200, 150, 50);
        f.add(iHead);
        l1 = new JLabel("> The Quiz is of 3 minutes");
        l2 = new JLabel("> Only Single Options are correct");
        l3 = new JLabel("> There is only 2 attempts");
        l4 = new JLabel("> Don't Perform any malpractice");
        l1.setBounds(80, 250, 500, 30);
        l2.setBounds(80, 280, 500, 30);
        l3.setBounds(80, 310, 500, 30);
        l4.setBounds(80, 340, 500, 30);
        f.add(l1); f.add(l2); f.add(l3); f.add(l4);

        StartQ = new JButton("Start Quiz");
        StartQ.setBounds(300, 400, 100, 30);
        StartQ.addActionListener(this);
        back.addActionListener(this);
        f.add(back); f.add(name); f.add(reg_no);
        f.add(branch);  f.add(l1); f.add(l2);
        f.add(l3); f.add(l4); f.add(StartQ);

        f.setSize(700, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==StartQ){
            f.setVisible(false);
            new Quiz();
            new Question();
        }
        if(e.getSource()==back){
            f.setVisible(false);
            new LoginDemo();
        }
    }

    public static void main(String[] args) {
        new Introduction();
    }
}
