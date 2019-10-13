class PS_Main{
    public static void main(String args[]){
       PS p=new PS(1,2);
       PS q=new PS(5,7);
       PS r=new PS();
       r=p.cong(q);
       r.hienThi();
       
       PS t=new PS();
       t=(p.nhan(2)).tru(p.chia(q));
       t.hienThi();
    }
}
