package day24_Loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;

        while (seconds <= 117) {
            System.out.println("starting: World's smallest cat \uD83D\uDC08- BBC\"" + seconds);
            seconds++;

        }
        System.out.println("finished video");

        int count = 5;
        while(count>=0){
            System.out.println("reverse" + count);
            count--;
        }
        System.out.println("count reversed");
    }






}
