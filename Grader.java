import java.util.*;

public class Grader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gradeCount = scan.nextInt();
        for (int i = 0; i < gradeCount; i++){
            int grade = scan.nextInt();
            if (grade >= 38 && grade%5 > 2){
                while (grade%5 != 0){
                    grade++;
                }
            }
            System.out.println(grade);
        }
        scan.close();    
    }
}
