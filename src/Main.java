import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                                     // Arrays Exercises
//        int [] arr1 = new int [5];
//        int [] arr2 = {7,5,33,4,55};
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter array elements: ");
//        arr1[0] = sc.nextInt();
//        arr1[1] = sc.nextInt();
//        arr1[2] = sc.nextInt();
//        arr1[3] = sc.nextInt();
//        arr1[4] = sc.nextInt();
//        System.out.printf("The formatted array1 is: "+ ArraysUtils.intToArray(arr1));
//        System.out.println("\nThe formatted array2 is: "+ Arrays.toString(arr2));

                                       // Date exercises
//        LocalDate past =  LocalDate.of(2005,5,12);
//        DateExercises.howMuchTime(past);
//        System.out.print("\n\n");
//        DateExercises d = new DateExercises();
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter past date: ");
//        System.out.print("\nYear: ");
//        int year = input.nextInt();
//        System.out.print("Month: ");
//        int month = input.nextInt();
//        System.out.print("Day: ");
//        int day = input.nextInt();
//        LocalDate date = LocalDate.of(year,month,day);
//
//        System.out.println(d.howMuchTime2(date));

//        DateExercises date = new DateExercises();
//        System.out.println("Insert your Birth Year: ");
//        int birthYear = sc.nextInt();
//        System.out.println("Insert your Birth Month: ");
//        int birthMonth = sc.nextInt();
//        System.out.println("Insert your Birth Day: ");
//        int birthDay = sc.nextInt();
//
//        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
//        System.out.println(date.happyBirthday(birthDate));

                             // Time exercises

        System.out.println("Enter the start time: ");
        LocalTime start = LocalTime.now();
        System.out.println(start);
        System.out.println("Enter the end time! ");
        System.out.println("Hour: ");
        int eh =  sc.nextInt();
        System.out.println("Minute: ");
        int em =  sc.nextInt();
        LocalTime end =  LocalTime.of(eh, em);
        System.out.println(TimeExercises.timeCalculator(start, end));


        }
    }
