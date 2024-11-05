import java.util.ArrayList;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {

        int[] number={1,2,3,4,5};
        number=new int[]{1,2,3,4,9};
        number[3]=7;
        System.out.print(number[4]);
        System.out.print(number[number.length-1]);
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
       // int[][] matrix=new int[3][4];size
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] matrix1={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
for(int row:matrix[1]){
    for(int column:matrix1[1]){
       int a=row*column;
       System.out.print(a+" ");
        ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.get(0);
        list.remove(1);
        list.size();
Scanner scanner=new Scanner(System.in);
System.out.println("first number:");
int number1=scanner.nextInt();
double[] numbers=new double[number1];
    }
    System.out.println();
        }
    }
}
