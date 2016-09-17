import java.util.Scanner;
import java.util.Arrays;

public class FindTwoHighScores{
    
    static class StudentInfo{
        
        //Fields
        private String name;
        private double score;
        
        //Constructor
        StudentInfo(String name, double score){
            
            this.name = name;
            this.score = score;
            
        }
        
        //Get name
        public String getName(){
            return this.name;
        }
        
        //Get score
        public double getScore(){
            return this.score;
        }
        
        public void display(){
            System.out.printf("Name: %s \t Score: %f\n", this.name, this.score);
        }
        
    }
    
    public static void main(String args[]){
        
        try{
            
            // Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            // Prompt input of number of students
            System.out.print("Enter the number of students in the roster: ");
            int roster = 0;
            
            // Verify input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextInt()){
                    roster = scanInput.nextInt();
                    
                    if (roster < 0){
                        int BadInputInt = roster;
                        System.out.print("Re-enter the number of students as a positive integer: ");
                    }
                    
                    else{
                        break;
                    }
                    
                }
                
                else{
                    String badInputStr = scanInput.next();
                    System.out.print("Re-enter the number of students as a positive integer: ");
                }
                
            }
            
            // Prompt input
            System.out.println("Enter the students' name and score");
            
            // Enter Student info into an array
            StudentInfo [] studentScoreArray = new StudentInfo[roster];
            
            // Enter Student Name and Score in each row of the array
            for (int k = 0; k < roster; k++){
                
                System.out.print((k+1) + ".)\tEnter the name: ");
                String studentName = scanInput.next();
                System.out.print("  \tEnter the score: ");
                double studentScore = 0;
                
                while (scanInput.hasNext()){
                
                    if (scanInput.hasNextDouble()){
                        studentScore = scanInput.nextDouble();
                        break;
                    }
                    
                    else{
                        String badInputStr = scanInput.next();
                        System.out.print("Re-enter the score as a number: ");
                    }
                
                }
                
                StudentInfo student = new StudentInfo(studentName, studentScore);
                studentScoreArray[k] = student;
                
            }
            
            // Find the highest scorer and second highest scorer
            StudentInfo student1, student2, temp;
            student1 = studentScoreArray[0];
            student2 = studentScoreArray[1];

            for (int k = 1; k < studentScoreArray.length; k++){
                
                student2 = studentScoreArray[k];
                
                if (student1.getScore() < student2.getScore()){
                    temp = student1;
                    student1 = student2;
                    student2 = temp;
                }
                
            }
            
            System.out.println("Highest Scorer: " + student1.getName() + 
                                " " + student1.getScore());
            System.out.println("Second Highest Scorer: " + student2.getName() + 
                                " " + student2.getScore());
            
            // Display all the students in the array
            System.out.println();
            
            for (int k = 0; k < studentScoreArray.length; k++){
                studentScoreArray[k].display();
            }
            //System.out.println("Complete");
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}