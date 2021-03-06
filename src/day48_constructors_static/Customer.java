package day48_constructors_static;

public class Customer {
    private String name;
    private int id ;

    //No-Args Constructor
    public  Customer(){
        System.out.println("No-Args constructors");
        name = "new customer";
        id = -1;
    }

    //add a constructor with params where we can assign name and id

    public Customer(String name,int id){
        System.out.println("2-args constructor");
        this.name=name;// or setName(name)
        this.id=id;// or setID(id)
    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
