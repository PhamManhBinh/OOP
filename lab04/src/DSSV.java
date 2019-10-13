class DSSV {
    private SV SV[];
    private int soSV;
    public DSSV(int x){
        soSV=x;
        SV=new SV[x];
    }
    public void them(SV sv){
        int vt=0;
        while(SV[vt]!=null){
            vt=vt+1;
        }
        SV[vt] = sv;
    }
    public SV laySV(int i){
        return SV[i];
    }
    public void hienThi(){
        for(int i=0;i<soSV;i++)
            SV[i].hienThi();
    }
    public void sapHoTen(){
        SV tg;
        String s1,s2;
        for(int i=0;i<soSV-1;i++)
            for(int j=i+1;j<soSV;j++)
        {
            s1=SV[i].layTen()+" "+SV[i].layHo()+" "+SV[i].layDem();
            s2=SV[j].layTen()+" "+SV[j].layHo()+" "+SV[j].layDem();
            if(s1.compareTo(s2)>0){
                tg=SV[i];
                SV[i]=SV[j];
                SV[j]=tg;
            }
                
        }
    }
    public void sapTuoi(){
        SV tg;
        for(int i=0;i<soSV-1;i++)
            for(int j=i+1;j<soSV;j++)
            if(SV[i].layTuoi()<SV[j].layTuoi()){
                tg=SV[i];
                SV[i]=SV[j];
                SV[j]=tg;
            }
    }
    public void sapDTB(){
        SV tg;
        for(int i=0;i<soSV-1;i++)
            for(int j=i+1;j<soSV;j++)
            if(SV[i].layDTB()<SV[j].layDTB()){
                tg=SV[i];
                SV[i]=SV[j];
                SV[j]=tg;
            }
    }
    public int timTen(String st){
        int ok=-1;
        for(int i=0;i<soSV;i++)
            if(SV[i].layTen().compareTo(st)==0){
                ok=i+1;
            }
        return ok;
    }
    public void lietKeXepLoai(String st){
        System.out.println("Danh sách các sinh viên "+st+":");
        for(int i=0;i<soSV;i++)
            if(SV[i].layXepLoai().compareTo(st)==0){
                SV[i].hienThi();
            }
    }
    public void xoa(String st){
        int vt=this.timTen(st)-1;
        for(int i=vt;i<soSV-1;i++)
            SV[i]=SV[i+1];
        soSV=soSV-1;
    }
}
