public class Nghia {
private String nghia, phanLoai, viDu;
public Nghia(String n,String pl,String vd) {
nghia = n;
phanLoai = pl;
viDu = vd;
}
public String layNghia(){
        return nghia;
    }
    public String layPhanLoai(){
        return phanLoai;
    }
    public String layViDu(){
        return viDu;
    }
    public void ganNghia(String x){
        nghia=x;
    }
    public void ganPhanLoai(String x){
        phanLoai=x;
    }
    public void ganViDu(String x){
        viDu=x;
    }
    public String toString(){
        return phanLoai+"-"+nghia+"-"+viDu;
    }
}
