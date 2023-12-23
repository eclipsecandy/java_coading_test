package Condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareTwoNum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        if(a > b) {
            System.out.println(">");
        } else if(a < b){
            System.out.println("<");
        } else{
            System.out.println("==");
        }
    }
}
