import java.util.Scanner;

import SlidingWindow.SlidingWindow;

public class HelloWorld {
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);
        // int x = scanner.nextInt();
        // System.out.println(x);
        // scanner.close();


        // int arr[] = {1,1,2,1,1};
        // System.out.println(SlidingWindow.numberOfSubarrays(arr, 3));
        String str = "abcabc";
        System.out.println(SlidingWindow.numberOfSubstrings(str));
    }
}