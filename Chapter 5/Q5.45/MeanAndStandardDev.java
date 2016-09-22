import java.util.Scanner;

public class MeanAndStandardDev{
    
    public static void main(String args[]){
        
        try{
            
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            //Prompt input
            System.out.print("Enter ten numbers: ");
            double num = 0;
            double sumMean = 0;
            double sumDev = 0;
            double counter = 0;
            
            //Verify input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextDouble()){
                    
                    num = scanInput.nextDouble();
                    sumMean += num;
                    sumDev += (num * num);
                    counter++;
                    
                    if (counter == 10){
                        break;
                    }
                    
                }
                else{
                    String badInputStr = scanInput.next();
                    counter = 0;
                    num = 0;
                    sumMean = 0;
                    sumDev = 0;
                    System.out.print("Re-enter ten numbers: ");
                }
                
                
            }
            
            //System.out.println("Sum: " + sum);
            double mean = 0, dev = 0;
            
            //Find Mean
            mean = sumMean / 10.0;
            
            //Find Standard Deviation
            double devNum = sumDev - ((sumMean * sumMean) / 10.0);
            double div = devNum / 9.0;
            dev = Math.sqrt(div);
            
            //Display
            System.out.println("The Mean: " + mean + "\nThe Standard Deviation: " + dev);
            
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}