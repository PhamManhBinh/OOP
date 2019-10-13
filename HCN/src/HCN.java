class HCN {
    private Diem d1;
    private Diem d2;
    public HCN(Diem d1,Diem d2){
        this.d1=d1;
        this.d2=d2;
    }
    
    public double chuVi(){
    	Diem d3=new Diem(d1.layX(),d2.layY());
    	return (d1.khoangCach(d3)+d2.khoangCach(d3))*2;        
    }
    public double dienTich(){
    	Diem d3=new Diem(d1.layX(),d2.layY());
    	return d1.khoangCach(d3)*d2.khoangCach(d3);
    }
    public String toString(){
        return "["+d1+","+d2+"]";
    }
}
