import java.io.*;
import java.util.Scanner;

public class InsSortInt {
    public static void main(String[] args) throws IOException{
        File file = new File("randInts.txt");
        Scanner scn = new Scanner(file);

        int count = 0;
        while (scn.hasNextInt()){
            scn.nextInt();
            count++;
        }

        int[] arr = new int[count];

        scn.close();
        scn = new Scanner(file);

        for (int i = 0; i < count; i++){
            if (scn.hasNextInt()){
                arr[i] = scn.nextInt();
            }
        }

        scn.close();
        insSort(arr);

        System.out.println("The Highest Number is: " + arr[arr.length - 1]);
        System.out.println("The Lowest Number is: " + arr[0]);
    }

    public static int[] insSort(int[] ar){
        for (int i = 1; i < ar.length; i++){
            int c = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] > c){
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = c;
        }
        return ar;
    }
}