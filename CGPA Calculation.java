import java.util.Scanner;

public class Calculating_CGPA_RECR {
    
    //This Section is For Converting User's Grade into point 
    static float GradeConversion() {
        
        Scanner x = new Scanner(System.in);
        
        float GradeConvert = 0.0f;
        System.out.print("Enter The Subject Name : ");
        String sub_name = x.nextLine();
       
        System.out.print("Enter The Grade of "+sub_name+" : ");
        String grade = x.nextLine();
        
        switch(grade) {
            case"A+" -> GradeConvert = 4.00f;
            case"A" -> GradeConvert = 3.75f;
            case"A-" -> GradeConvert = 3.50f;
            case"B+" -> GradeConvert = 3.25f;
            case"B" -> GradeConvert = 3.00f;
            case"B-" -> GradeConvert = 2.75f;
            case"C+" -> GradeConvert = 2.50f;
            case"C" -> GradeConvert = 2.25f;
            case"D" -> GradeConvert = 2.00f;
            case"F" -> GradeConvert = 0.00f;
            default -> System.out.println("Invalid Input !");
        }
        return GradeConvert;
        
    }
    
    public static void main (String[] args) {
        
        Scanner x = new Scanner(System.in);
        float point, total_credit = 0.0f, total_point = 0.0f;
        System.out.println("This Code is Created by Student of Rangpur Engineering College");
        System.out.print("Enter The Number of Total Subjects : ");
        byte totalSub = x.nextByte();
        
        for (int i = 0; i < totalSub; i++) {
            
            float grade = GradeConversion();
            System.out.print("Enter The Credit of that Subject : ");
            byte credit = x.nextByte();
            
            point = grade * credit;
            total_credit += credit;
            total_point += point;   
        }
       float CGPA = total_point / total_credit;
        System.out.format("Your obtained CGPA : %.3f\n",CGPA);
    }
    
}