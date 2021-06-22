package day51_inheritance.Super;

public class LyftLux extends Lyft{
    @Override
    public double calculateRate(double miles){
        //calculateRate of Lyft + plus 20 percent

        return super.calculateRate(miles) * 1.2;
    }
}
