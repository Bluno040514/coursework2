public class PyramidPattern {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
            int high=4;
            for(int a=0;a<high;a++){
                for(int b=0;b<high;b++){
                    System.out.print(" ");
                }
                System.out.println("*");

            }

    }
}
