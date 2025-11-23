import javax.swing.*;
import java.awt.event.*;

public class Q10 {
    public static void main(String[] args){
        JFrame f=new JFrame();
        JTextField t1=new JTextField(); t1.setBounds(20,20,100,30);
        JTextField t2=new JTextField(); t2.setBounds(20,60,100,30);
        JButton b=new JButton("Divide"); b.setBounds(20,100,100,30);
        JLabel r=new JLabel(); r.setBounds(20,140,200,30);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    int a=Integer.parseInt(t1.getText());
                    int c=Integer.parseInt(t2.getText());
                    int d=a/c;
                    r.setText("Result: "+d);
                }
                catch(Exception ex){
                    r.setText(ex.toString());
                }
            }
        });

        f.add(t1); f.add(t2); f.add(b); f.add(r);
        f.setSize(300,250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
