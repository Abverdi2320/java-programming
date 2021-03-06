package Practice;

public class ConstructorReview {
   private String name;
   private int age;
   private String hairColor;
   private String eyeColor;

    public ConstructorReview(){
        name="Elvin";
        age= 30;
        hairColor = "Blue";
        eyeColor = "Yellow";

    }

    public ConstructorReview(String name, String hairColor, String eyeColor, int age){
        this.name=name;
        this.age = age;
        this.eyeColor= eyeColor;
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "ConstructorReview{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairColor='" + hairColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }



}
