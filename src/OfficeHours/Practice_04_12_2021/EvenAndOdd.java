package OfficeHours.Practice_04_12_2021;

public class EvenAndOdd {
      /*Input: [4,1,3,12,5]
        Output:
        Even: 2
        Odd: 3
       */

    public static void main(String[] args) {
        int nums[] = {4,1,3,12,5};
        int even = 0;
        int odd = 0;

        for(int eachNum : nums){
            if(eachNum%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);

    }
}
