public class PS {
    private int tu;
    private int mau;
    public PS(){
        tu=1;
        mau=1;
    }
    public PS(int n){
        tu=n;
        mau=1;
    }
    public PS(int t,int m){
        tu=t;
        mau=m;
    }
    public PS(PS p){
        tu=p.layTu();
        mau=p.layMau();
    }
    public void ganTu(int t){
        tu=t;
    }
    public int layTu(){
        return tu;
    }
    public void ganMau(int m){
        mau=m;
    }
    public int layMau(){
        return mau;
    }
    public void hienThi(){
        System.out.println("Phân số: "+tu+"/"+mau);
    }
    private static int UCLN(int x, int y){
        if(x%y==0){
            return y;
        } else {
            return UCLN(y,x%y);
        }
    }
    private void rutGon(){
        int x=UCLN(this.mau,this.tu);
        this.mau/=x;
        this.tu/=x;
    }
    
    public PS cong(int n){
        PS p=new PS(this.tu,this.mau);
        p.ganTu(n*p.layMau()+p.layTu());
        p.rutGon();
        return p;
    }
    public PS cong(PS p){
        PS x=new PS(this.tu,this.mau);
        x.ganTu(x.layTu()*p.layMau()+x.layMau()*p.layTu());
        x.ganMau(p.layMau()*x.layMau());
        x.rutGon();
        return x;
    }
    public PS tru(int n){
        PS p=new PS(this.tu,this.mau);
        p.ganTu(p.layTu()-n*p.layMau());
        p.rutGon();
        return p;
    }
    public PS tru(PS p){
        PS x=new PS(this.tu,this.mau);
        x.ganTu(x.layTu()*p.layMau()-x.layMau()*p.layTu());
        x.ganMau(p.layMau()*x.layMau());
        x.rutGon();
        return x;
    }
    public PS nhan(int n){
        PS p=new PS(this.tu,this.mau);
        p.ganTu(p.layTu()*n);
        p.rutGon();
        return p;
    }
    public PS nhan(PS p){
        PS x=new PS(this.tu,this.mau);
        x.ganTu(x.layTu()*p.layTu());
        x.ganMau(x.layMau()*p.layMau());
        x.rutGon();
        return x;
    }
    public PS chia(int n){
        PS p=new PS(this.tu,this.mau);
        p.ganMau(p.layMau()*n);
        p.rutGon();
        return p;
    }
    public PS chia(PS p){
        PS x=new PS(this.tu,this.mau);
        x.ganTu(x.layTu()*p.layMau());
        x.ganMau(p.layTu()*x.layMau());
        x.rutGon();
        return x;
    }
    public String toString(){
        return tu+"/"+mau;
    }
    public int soSanh(PS p){
       int x=this.layTu()*p.layMau();
       int y=p.layTu()*this.layMau();
       if(x>y){
           return 1;
       }else{
           if(x<y){
           return -1;
           }else{
               return 0;
           }
       }
        
    
    }
}