import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener,WindowListener{
    Button b[]=new Button[10];
    TextArea ss=new TextArea();
    TextArea sss=new TextArea();
    Button cong=new Button("+");
    Button tru=new Button("-");
    Button nhan=new Button("x");
    Button chia=new Button("/");
    Button ps=new Button("1/x");
    Button clear=new Button("Clear");
    Button bang=new Button("=");
    Label kq=new Label();
    private float so1,so2;
    private String dau;
    
    public Calculator(){
      super("Calculator");
      this.setSize(250, 400);
      this.setLayout(null);
      this.setBackground( new Color(171, 207, 255) );
      this.setLocationByPlatform(true);
      kq.setBackground(Color.white);
      kq.setFont(new Font("Times New Roman",Font.BOLD,25));
      kq.setAlignment(2);
      kq.setBounds(20,50,210,90);
      add(kq);
      
      cong.setBackground( new Color(128,0,128) );
      cong.setFont(new Font("Times New Roman",Font.BOLD,25));
      cong.setBounds(20, 150, 60, 30);
      cong.addActionListener(this);
      add(cong);
      
      tru.setBackground( new Color(128,0,128) );
      tru.setFont(new Font("Times New Roman",Font.BOLD,25));
      tru.setBounds(90, 150, 60, 30);
      tru.addActionListener(this);
      add(tru);
      
      nhan.setBackground( new Color(128,0,128) );
      nhan.setFont(new Font("Times New Roman",Font.BOLD,25));
      nhan.setBounds(160, 150, 60, 30);
      nhan.addActionListener(this);
      add(nhan);
      
      chia.setBackground( new Color(128,0,128) );
      chia.setFont(new Font("Times New Roman",Font.BOLD,25));
      chia.setBounds(20, 190, 60, 30);
      chia.addActionListener(this);
      add(chia);
      
      ps.setBackground( new Color(128,0,128) );
      ps.setFont(new Font("Times New Roman",Font.BOLD,25));
      ps.setBounds(90, 190, 60, 30);
      ps.addActionListener(this);
      add(ps);
      
      clear.setBackground( new Color(128,0,128) );
      clear.setFont(new Font("Times New Roman",Font.BOLD,20));
      clear.setBounds(160, 190, 60, 30);
      clear.addActionListener(this);
      add(clear);
      
      for(int i=0;i<10;i++)
          b[i]=new Button(""+i);
      
      b[7].setBackground( new Color(128,0,128) );
      b[7].setFont(new Font("Times New Roman",Font.BOLD,25));
      b[7].setBounds(20, 230, 60, 30);
      add(b[7]);
      
      b[8].setBackground( new Color(128,0,128) );
      b[8].setFont(new Font("Times New Roman",Font.BOLD,25));
      b[8].setBounds(90, 230, 60, 30);
      add(b[8]);
      
      b[9].setBackground( new Color(128,0,128) );
      b[9].setFont(new Font("Times New Roman",Font.BOLD,20));
      b[9].setBounds(160, 230, 60, 30);
      add(b[9]);
      
      b[4].setBackground( new Color(128,0,128) );
      b[4].setFont(new Font("Times New Roman",Font.BOLD,25));
      b[4].setBounds(20, 270, 60, 30);
      add(b[4]);
      
      b[5].setBackground( new Color(128,0,128) );
      b[5].setFont(new Font("Times New Roman",Font.BOLD,25));
      b[5].setBounds(90, 270, 60, 30);
      add(b[5]);
      
      b[6].setBackground( new Color(128,0,128) );
      b[6].setFont(new Font("Times New Roman",Font.BOLD,20));
      b[6].setBounds(160, 270, 60, 30);
      add(b[6]);
      
      b[1].setBackground( new Color(128,0,128) );
      b[1].setFont(new Font("Times New Roman",Font.BOLD,25));
      b[1].setBounds(20, 310, 60, 30);
      add(b[1]);
      
      b[2].setBackground( new Color(128,0,128) );
      b[2].setFont(new Font("Times New Roman",Font.BOLD,25));
      b[2].setBounds(90, 310, 60, 30);
      add(b[2]);
      
      b[3].setBackground( new Color(128,0,128) );
      b[3].setFont(new Font("Times New Roman",Font.BOLD,20));
      b[3].setBounds(160, 310, 60, 30);
      add(b[3]);
      
      b[0].setBackground( new Color(128,0,128) );
      b[0].setFont(new Font("Times New Roman",Font.BOLD,25));
      b[0].setBounds(20, 350, 60, 30);
      add(b[0]);
      
      for(int i=0;i<10;i++)
          b[i].addActionListener(this);
      
      bang.setBackground( new Color(128,0,128) );
      bang.setFont(new Font("Times New Roman",Font.BOLD,25));
      bang.setBounds(90, 350, 130, 30);
      bang.addActionListener(this);
      add(bang);
      
      this.addWindowListener(this);
      this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==clear){
          so1=0;
          so2=0;
          dau="";
          kq.setText("");
      }
      if(e.getSource()==cong){
          so1=Float.parseFloat(kq.getText());
          kq.setText("");
          dau="+";
      }
      if(e.getSource()==tru){
          so1=Float.parseFloat(kq.getText());
          kq.setText("");
          dau="-";
      }
      if(e.getSource()==nhan){
          so1=Float.parseFloat(kq.getText());
          kq.setText("");
          dau="*";
      }
      if(e.getSource()==chia){
          so1=Float.parseFloat(kq.getText());
          kq.setText("");
          dau="/";
      }
      if(e.getSource()==ps){
          kq.setText(Float.toString(1/Float.parseFloat(kq.getText())));
      }
      if(e.getSource()==b[0]) kq.setText(kq.getText()+"0");
      if(e.getSource()==b[1]) kq.setText(kq.getText()+"1");
      if(e.getSource()==b[2]) kq.setText(kq.getText()+"2");
      if(e.getSource()==b[3]) kq.setText(kq.getText()+"3");
      if(e.getSource()==b[4]) kq.setText(kq.getText()+"4");
      if(e.getSource()==b[5]) kq.setText(kq.getText()+"5");
      if(e.getSource()==b[6]) kq.setText(kq.getText()+"6");
      if(e.getSource()==b[7]) kq.setText(kq.getText()+"7");
      if(e.getSource()==b[8]) kq.setText(kq.getText()+"8");
      if(e.getSource()==b[9]) kq.setText(kq.getText()+"9");
      
      if(e.getSource()==bang){
          so2=Float.parseFloat(kq.getText());
          if(dau=="+")
              kq.setText(Float.toString(so1+so2));
          if(dau=="-")
              kq.setText(Float.toString(so1-so2));
          if(dau=="*")
              kq.setText(Float.toString(so1*so2));
          if(dau=="/")
              kq.setText(Float.toString(so1/so2));
      }
    }
    public static void main(String args[]){
        new Calculator();
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
   
}