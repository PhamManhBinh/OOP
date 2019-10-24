public class Main {
public static void main(String[] args) {
    Switcher cauDao=new Switcher();
    Cooker noiCom=new Cooker("LG",150,"123",true,false);
    Fan mayQuat=new Fan("Toshiba",70,"456",true,3,true);
    cauDao.addDevice(noiCom);
    cauDao.addDevice(mayQuat);
    cauDao.showDevice();
    cauDao.update();
    cauDao.turnOff();
    }
    
}
