import java.util.Scanner;

public class CalculateMarks {
    public static void main(String[] argus){

//created 3 variable for 3 subject
        int m1,m2,m3;

// added Scanner function to sacon the given value
        Scanner s = new Scanner(System.in);
         
       System.out.println("Enter your name =");
//for taking String value from user 
        String str = s.next();

       System.out.println("Enter you marks = ")];
        
//for taking subject marks form user
        m1 = s.nextInt();
        m2 = s.nextInt();
        m3 = s.nextInt();

//Calculating Average Of 3 Subjects
         int result = (m1+m2+m3)/3;

//Printing Final output        
        System.out.println(str+" here your avg of 3 subjects "+result);
    }
}
