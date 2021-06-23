package Practice;

public class Earth {
    public static void main(String[] args) {
        AnimalSpecies any = new AnimalSpecies();
        any.setInfo("Rabbit",20_000_000,7);
        System.out.println(any.toString());
        System.out.println(any.getName());
        System.out.println(any.getPopulation());
        System.out.println(any.growthRate);

        System.out.println(any.getGrowthRate());




    }


}
