import java.awt.*;
import java.awt.event.*;

public class PTB2 implements ActionListener,WindowListener{
        Frame f=new Frame();
        Label l=new Label("Chương trình giải PT bậc 2");
        Label l1=new Label("x^2+");
        Label l2=new Label("x+");
        Label l3=new Label("=0");
        TextField tf1=new TextField();
        TextField tf2=new TextField();
        TextField tf3=new TextField();
        Button giai=new Button("Bắt đầu giải PT");
        Label kq1=new Label("                                               ");
        Label kq2=new Label("                                               ");
        Label kq3=new Label("                                               ");
        Button thoat=new Button("Thoát");
       
    public PTB2(){
        f.addWindowListener(this);
        f.setSize(300, 250);
        f.setLayout(new FlowLayout());
        l.setBackground(Color.GREEN);
        l.setForeground(Color.red);
        l.setFont(new Font("Arial",Font.BOLD,20));
        giai.addActionListener(this);
        thoat.addActionListener(this);
        f.add(l); 
        f.add(tf1); f.add(l1);
        f.add(tf2); f.add(l2);
        f.add(tf3); f.add(l3);
        f.add(giai);
        f.add(thoat);
        f.add(kq1); f.add(kq2); f.add(kq3); 
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        kq1.setText("                                               ");
        kq2.setText("                                               ");
        kq3.setText("                                               ");
        if(e.getSource()==thoat){
            System.exit(0);
        }else{
            try{
            float a=Float.parseFloat(tf1.getText());
            float b=Float.parseFloat(tf2.getText());
            float c=Float.parseFloat(tf3.getText());
            double dt=b*b-4*a*c;
            if(dt>0){
                kq1.setText("Phương trình có 2 nghiệm:");
                kq2.setText("x1="+((-b-Math.sqrt(dt))/(2*a)));
                kq3.setText("x2="+((-b+Math.sqrt(dt))/(2*a)));
            }
            else if(dt<0)
                    kq1.setText("Phương trình vô nghiệm");
            else{
                        kq1.setText("Phương trình có nghiệm kép: ");
                        kq2.setText("x="+(-b/2*a));}
            }catch(NumberFormatException nf){ 
                kq1.setText("Đã xảy ra lỗi");
            }
        }
        
    }
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    
    public static void main(String args[]){
        new PTB2();
    }

    
}

