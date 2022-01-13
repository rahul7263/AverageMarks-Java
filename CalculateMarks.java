import java.util.Scanner;

public class CalculateMarks {
    public static void main(String[] argus){

        int m1,m2,m3;

        Scanner s = new Scanner(System.in);
         
       System.out.println("Enter your name =");

        String str = s.next();

       System.out.println("Enter you marks = ");

        m1 = s.nextInt();
        m2 = s.nextInt();
        m3 = s.nextInt();

         int result = (m1+m2+m3)/3;

        System.out.println(str+" here your avg of 3 subjects "+result);
    }
}