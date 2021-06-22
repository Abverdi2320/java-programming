package day55_abstraction.interface_demo;

public interface WebDiver {
    public abstract void get(String url);
    public  abstract  void findElement(String locator);
    void quit(); //it is automatically public abstract
    String getTitle();
}
