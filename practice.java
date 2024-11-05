import java.util.ArrayList;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        String[] name=new String[100];
        double[] grade=new double[100];
        System.out.println("Welcome to the Student Grade Management System\n" +
                "     Please choose an option:\n" +
                "     1. Add a new student\n" +
                "     2. Display all students and grades\n" +
                "     3. Calculate class average\n" +
                "     4. Find highest and lowest grade\n" +
                "     5. Search for a student by name\n" +
                "     6. Sort students by grade (descending)\n" +
                "     7. Exit");
        Scanner scanner=new Scanner(System.in);
        System.out.println("type in option:");
        int number=scanner.nextInt();
        if(number==1) {
            Scanner scanner1=new Scanner(System.in);
            System.out.println("type in grade:");
            double grades=scanner.nextInt();
            Scanner scanner2=new Scanner(System.in);
            System.out.println("type in name:");
            String names=scanner.nextLine();
            for(int i=0;i<100;i++) {
                name[i] = names;
                grade[i] = grades;
            }
            if(number==2){
                System.out.println(name);
            }
        }
    }
}