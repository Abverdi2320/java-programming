package day18_condotions_practice_strings_intro;

public class CarLease {
    public static void main(String[] args) {

        String make = "Audi";
        String model = "RSQ8";
        double leasePrice = 0.0;

        //if (make.equals("Mercedes") && model.equals("E")) {
          //  leasePrice = 500.0;
        //} else if (make.equals("Mercedes") && model.equals("A")) {
        //    leasePrice = 400.0;
        //}

        if(make.equals("Audi")){
             if(model.equals("RSQ8")){
                 leasePrice = 880.0;
             }else if(model.equals("A8")){
                 leasePrice = 650.0;
             }
         }else{
             System.out.println("Invalid make");
             return; //exit main method
         }


        System.out.println("Make = " + make);
        System.out.println("Model = " + model);
        System.out.println("Lease price = $" + leasePrice);


    }
}
