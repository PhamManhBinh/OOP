class Diem {
    private float x;
    private float y;
    public Diem(float t1,float t2){
        x=t1;
        y=t2;
    }
    public float layX(){
        return x;
    }
    public float layY(){
        return y;
    }
    public double khoangCach(Diem p){
        return Math.sqrt(Math.pow(p.layX()-x,2)+Math.pow(p.layY()-y,2));
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
