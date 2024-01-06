package Deepen1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class H_YourAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double creditSum = 0;
        for(int i = 0; i < 20; i++){
            String str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade =st.nextToken();
            double gradeNum = 0;
            if(grade.equals("P")) continue;
            switch(grade){
                case "A+" : gradeNum = 4.5; break;
                case "A0" : gradeNum = 4.0; break;
                case "B+" : gradeNum = 3.5; break;
                case "B0" : gradeNum = 3.0; break;
                case "C+" : gradeNum = 2.5; break;
                case "C0" : gradeNum = 2.0; break;
                case "D+" : gradeNum = 1.5; break;
                case "D0" : gradeNum = 1.0; break;
                case "F" : gradeNum = 0.0; break;
            }
            sum += (credit * gradeNum);
            creditSum += credit;
        }
        System.out.println(sum / creditSum);
    }
}
