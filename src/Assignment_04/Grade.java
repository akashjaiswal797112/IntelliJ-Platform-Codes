package Assignment_04;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int marks=sc.nextInt();

        System.out.println(checkGrade(marks));
    }

    private static String checkGrade(int marks)
    {
        int mark=marks;

        if(mark>=91 && mark <=100)
            return "AA";
        else if(mark>=81 && mark <=90)
            return "AB";
        else if(mark>=71 && mark <=80)
            return "BB";
        else if(mark>=61 && mark <=70)
            return "BC";
        else if(mark>=51 && mark <=60)
            return "CD";
        else if(mark>=41 && mark <=50)
            return "DD";
        else
            return "Fail";
    }
}
