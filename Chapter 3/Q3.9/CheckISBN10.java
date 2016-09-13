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
                    
                    if (isbn < 100000000 || isbn > 999999999){
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
                //System.out.println("Number: " + (isbnStr.charAt(k)));
                checkSum += (isbnStr.charAt(k) - 48) * (k+1);
                //System.out.println("Checksum: " + checkSum);
            }
            
            //Find Checksum remainder to determine the last digit/character for isbn id
            checkSum = checkSum % 11;
            //System.out.println("Check sum: " + checkSum);
            String checkSumStr = "";

            //Display
            if (checkSum == 10){
                checkSumStr = "X";
                isbnStr = isbnStr + checkSumStr;
            }
            else{
                checkSumStr = "" + checkSum;
                isbnStr = isbnStr + checkSumStr;
            }
            
            System.out.println("ISBN-10: " + isbnStr);

        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//end of main
    
    
}//end of class