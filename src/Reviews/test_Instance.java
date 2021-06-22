package Reviews;

public class test_Instance {
    String name;
    int age;
    char gender;
    String job;

    @Override
    public String toString() {
        return "test_Instance{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", job='" + job + '\'' +
                '}';
    }

    public int calories (int cal,int mile){
        return cal*mile;
    }


    public void running(){
        System.out.println(name + " is Running");
    }

    public void swimming(){
        System.out.println(name+ " is Swimming");
    }

    public void biking(){
        System.out.println(name+ " is biking");
    }
}
