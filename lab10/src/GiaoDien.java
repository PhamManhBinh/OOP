import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class GiaoDien extends Frame implements WindowListener,ActionListener{
    Label l1=new Label("Họ Tên:   ");
    TextField t1=new TextField();
    Label l2=new Label("Thu Nhập:   ");
    TextField t2=new TextField();
    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox cb1=new Checkbox("Thu Nhập Thường Xuyên",cbg,false);
    Checkbox cb2=new Checkbox("Thu Nhập Không Thường Xuyên",cbg,false);
    Button b1=new Button("Tính Thuế");
    Button b2=new Button("Lưu Vào Tệp");
    Label kq=new Label();
    ThuNhap dt;
    public GiaoDien(){
        super("Chương trình tính thuế");
        setSize(400,300);
        setLayout(null);
        l1.setBounds(50, 50, 100, 20);
        t1.setBounds(150, 50, 150, 20);
        l2.setBounds(50, 90, 100, 20);
        t2.setBounds(150, 90, 150, 20);
        cb1.setBounds(50, 130, 200, 20);
        cb2.setBounds(50, 160, 200, 20);
        b1.setBounds(70, 200,80,20);
        b2.setBounds(180, 200, 80, 20);
        kq.setBounds(50, 230, 250, 30);
        add(l1); add(t1);
        add(l2); add(t2);
        add(cb1); add(cb2);
        add(b1); add(b2);
        add(kq);
        b1.addActionListener(this);
        b2.addActionListener(this);
        addWindowListener(this);
        this.setLocationByPlatform(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String ten;
        double tn;
        boolean TX;
        try{
        if(e.getSource()==b1){
            ten=t1.getText();
            tn=Double.parseDouble(t2.getText());
            if(cb1.getState()==true)
                TX=true;
            else if(cb2.getState()==true) 
                TX=false;
            else {kq.setText("Vui lòng chọn loại thu nhập");
                    return; }
            dt=new ThuNhap(ten,tn,TX);
            kq.setText("Thuế cần nộp là: "+String.format("%.0f", dt.tinhThue()));
        }else{
           
            try{
                FileOutputStream fo=new FileOutputStream("ThongTin.txt");
                PrintWriter pw=new PrintWriter(fo);
                if(dt.getTNTX()==true)
                pw.println(dt.getHoTen()+", "+String.format("%.0f",dt.getThuNhap())
                        +", "+ "Thu Nhập Thường Xuyên, Thuế: "
                        +String.format("%.0f", dt.tinhThue()));
                else pw.println(dt.getHoTen()+", "+String.format("%.0f",dt.getThuNhap())
                        +", "+ "Thu Nhập Không Thường Xuyên, Thuế: "
                        +String.format("%.0f", dt.tinhThue()));
                pw.close();fo.close();
                kq.setText("Đã lưu vào tệp thành công!");
            }catch(IOException ioe){}
            
        }
        }catch(Exception ex){kq.setText("Vui lòng nhập đúng thông tin");}
        
    }
    
    public static void main(String args[]){
        new GiaoDien();;
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
