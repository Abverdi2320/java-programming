package day53_inheritance.tesla;

    public class ElectricCar {
        private String make;
        private String model;
        private double price;
        private int year;
        private int range;
        private static int count;
        public static final int MAX_Range = 400;






        @Override
        public String toString() {
            return "ElectricCar{" +
                    "make='" + make + '\'' +
                    ", model='" + model + '\'' +
                    ", price=" + price +
                    ", year=" + year +
                    ", range=" + range +
                    '}';
        }

        public ElectricCar(String make, String model, double price, int year, int range) {
            setMake(make);  //same as this.make = make; useful when setter has some condition
            this.model = model;
            this.price = price;
            this.year = year;
            this.range = range;
            count++; //increase count  by 1 - everytime new car is created
        }

        public final void charge(){
            System.out.println("Charging the Electric car using plug-in");
            this.range = MAX_Range;
        }



        public static int getCount() {
            return count;
        }


        //model3.drive(34);
        protected void drive(int miles) {
            if (range == 0 || range - miles < 0) {
                System.out.println("Error: Cannot drive that car,need to charge");
            } else {
                range -= miles;
                System.out.println("Driving " + miles + "miles...");
            }
        }


        public int getRange() {
            return range;
        }

        public void setRange(int range) {
            this.range = range;
        }


        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            if (make.isEmpty()) {
                System.out.println("Error - make cannot be blank");
            } else {
                this.make = make;
            }

        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }
