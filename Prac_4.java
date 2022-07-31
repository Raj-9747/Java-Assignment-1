/*   Name : Fachara Raj 
     ID   : 21CE027
     Aim  : Given an array of ints, return true if the sequence of numbers 1, 2, 3 
            appears in the array somewhere.
            array123([1, 1, 2, 3, 1]) → true
            array123([1, 1, 2, 4, 1]) → false
            array123([1, 1, 2, 1, 2, 3]) → true
 */
import java.util.Scanner;

public class Prac_4 {
    int num;
    int[] array;
    Scanner sc = new Scanner(System.in);

    public Prac_4(int n) {
        num = n;
        array = new int[n];
    }

    public void input() {
        //Input of the array
        System.out.print("Enter " + num + " element : ");
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
    }

    //Checking for the sequence of 1 2 3
    public boolean Check() {
        for (int i = 0; i < num - 2; i++) {
            if (array[i] == 1 && array[i + 1] == 2 && array[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }
}
