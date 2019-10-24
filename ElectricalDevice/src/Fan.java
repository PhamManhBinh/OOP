class Fan extends ElectricalDevice{
    protected int speed;
    protected boolean swing;
    public Fan(String a,int b,String c,boolean d,int sp,boolean sw){
        super(a,b,c,d);
        speed=sp;
        swing=sw;
    }
    public void setSpeed(int x){
        speed=x;
    }
    public void setSwing(boolean x){
        swing=x;
    }
    public int getSpeed(){
        return speed;
    }
    public boolean getSwing(){
        return swing;
    }
    public void incSpeed(){
        if(speed>=3)
            speed=0;
        else speed++;
    }
    public void update(){
        if(speed==0)
            swing=false;
    }
}
