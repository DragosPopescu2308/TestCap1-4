import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int [] arr1 = new int [5];
//        int [] arr2 = {7,5,33,4,55};
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter array elements: ");
//        arr1[0] = sc.nextInt();
//        arr1[1] = sc.nextInt();
//        arr1[2] = sc.nextInt();
//        arr1[3] = sc.nextInt();
//        arr1[4] = sc.nextInt();
//        System.out.printf("The formatted array1 is: "+ ArraysUtils.intToArray(arr1));
//        System.out.println("\nThe formatted array2 is: "+ Arrays.toString(arr2));

        LocalDate past =  LocalDate.of(2005,05,12);
        DateExercises.howMuchTime(past);

        }
    }
