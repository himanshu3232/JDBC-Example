import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of subjects: ");
        int numberOfSubjects = sc.nextInt();
        int total = 0;
        for(int i=0; i<numberOfSubjects; i++){
            System.out.print("Enter marks: ");
            total+= sc.nextInt();
        }
        sc.close();
        float avg = total/numberOfSubjects;
        String grade = (avg>90f) ? "Grade A+" : 
            (avg>=80f) ? "Grade A" :
                (avg>=65f) ? "Grade B" :
                   (avg>=50f) ? "Grade C" :
                      (avg>=35f) ? "Grade D" : "Grade F";

        System.out.println("Total marks is: " + total);
        System.out.println("Average Percentage is: " + avg);
        System.out.println("Your grade is: " + grade);
    }
}