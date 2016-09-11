// Checksum

import java.util.Scanner;

public class CheckISBN10{
    
    public static void main (String args[]){
        
        try{
            
            //Declare Scanner and Variables
            Scanner scanInput = new Scanner(System.in);
            
            
            //Prompt input
            System.out.println("Enter the 9-digit ISBN number: ");
            int isbn = 0;
            
            //Verify input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextInt()){
                    isbn = scanInput.nextInt();
                    
                    if (isbn < 100000000){
                        int badInputInt = isbn;
                        System.out.println("Enter the 9-digit ISBN number: ");
                    }
                    else
                        break;
                }
                
                else{
                    String badInputStr = scanInput.next();
                    System.out.println("Enter the 9-digit ISBN number: ");
                }
            }
            
            
            //Find Checksum
            String isbnStr = Integer.toString(isbn);
            int checkSum = 0;
            for (int k = 0; k < 9; k++){
                
                //must copy the checkSum int into a String variable in order to dereference it
                System.out.println("Number: " + (isbnStr.charAt(k)));
                checkSum += (isbnStr.charAt(k) - 48) * (k+1);
                System.out.println("Checksum: " + checkSum);
            }
            checkSum = checkSum % 11;
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//end of main
    
    
}//end of class