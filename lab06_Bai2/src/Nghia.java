public class Nghia {
    private String nghia,phanLoai,viDu;
    public Nghia(String a,String b,String c){
        nghia=a;
        phanLoai=b;
        viDu=c;
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
        return nghia+" ("+phanLoai+")\nVí dụ:"+viDu;
    }
}
