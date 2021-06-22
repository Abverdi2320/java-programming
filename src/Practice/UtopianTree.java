package Practice;

public class UtopianTree {
    public static void main(String[] args) {
        int year = 0;
        int growth = 0;
        int treeSize = 0;
        for (int i = 1; i<+10; i++){
            if(i>=1 && i <=3){
                growth = 1;
                treeSize+=growth;

            }if(i>3 &&  i<=11){
                growth = 2;
                treeSize+=growth;

            }
            System.out.println("tree size: " +treeSize );

        }
        }
    }


