import java.util.Vector;
class Switcher implements Switchable{
    private Vector devices;
    private boolean state;
    public Switcher(){
        devices=new Vector();
        state=true;
    }
    public boolean getState(){
        return state;
    }
    public void setState(boolean x){
        state=x;
    }
    public void addDevice(ElectricalDevice x){
        devices.addElement(x);
    }
    public void removeDevice(ElectricalDevice x){
        devices.removeElement(x);
    }
    public void turnOn(){
        state=true;
        for(int i=0;i<devices.size();i++)
            ((ElectricalDevice)devices.elementAt(i)).turnOn();
    }
    public void turnOff(){
        state=false;
        for(int i=0;i<devices.size();i++)
            ((ElectricalDevice)devices.elementAt(i)).turnOff();
    }
    public void showDevice(){
        for(int i=0;i<devices.size();i++)
            System.out.println(devices.elementAt(i));
    }
    public void update(){
        for(int i=0;i<devices.size();i++)
            ((ElectricalDevice)devices.elementAt(i)).update();
    }
}
