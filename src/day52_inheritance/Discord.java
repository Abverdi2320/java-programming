package day52_inheritance;

public class Discord extends MobileApp{
    public void chat(String someOne){
        System.out.println("Chatting with " +someOne + " on Discord");
    }


    @Override
    protected boolean download() {
        System.out.println("Download Discord 0.0.23 from App Store");
        return true;
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("Vladislav");
    }
    public void printInfo(){
        System.out.println("App Name = " +getName());
        System.out.println("App Version = " +getVersion());

    }
}
