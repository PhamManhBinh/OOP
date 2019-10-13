class ATM{
    private String soTK;
    private double soDu;
    public ATM(String stk,double sd){
        soTK=stk;
        soDu=sd;
    }
    public String laySTK(){
        return soTK;
    }
    public double laySoDu(){
        return soDu;
    }
    public String toString(){
        return "Tài khoản "+soTK+" có số dư là "+soDu;
    }
    public void napTien(double st){
        soDu+=st;
        System.out.println("Nạp thành công "+st+" vào tài khoản "+soTK);
    }
    public boolean rutTien(double st){
        if(st>soDu){
            return false;
        } else {
            soDu-=st;
            return true;
        }
        
    }
    public boolean chuyenTien(ATM tk,double st){
        if(st>soDu){
            return false;
        } else {
            soDu-=st;
            tk.soDu+=st;
            return true;
        }
    }
}
