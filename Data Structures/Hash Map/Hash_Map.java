import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

class HashTable{
    
    public String[] theArray;
    private int arraySize;
    private int numOfElements = 0;
    
    //Construct a hash table
    HashTable(int size){
        
        this.arraySize = size;
        this.theArray  = new String[arraySize];
        Arrays.fill(this.theArray, "-1");
        
    }
    
    //Get the size of the hash table
    public int getArraySize(){
        
        return arraySize;
        
    }
    
    //Get the number of elements sotred in the hash table
    public int getNumberOfElements(){
        
        return numOfElements;
        
    }
    
    //Store each element from an array into a hash table
    public void HashFunction(String[] inputArray, String[] outputArray){
    
        for(int n = 0; n < inputArray.length; n++){
        
            String newElement = inputArray[n].toLowerCase();
         
            //A Function creating an index in theArray where the newElement 
            //will be stored
            int arrayIndex = 13 - convertString(newElement) % 29;
            
            //If the calculated index is less than 0
            if (arrayIndex < 0)
                arrayIndex *= -1;
            
            //System.out.printf("Array Index: %3d for Element: %s\n", arrayIndex, 
            //newElement);
         
            //If the calculated index is too large for the current array, 
            //increase the array size and call the hash function again
            if (arrayIndex > this.theArray.length){
                
                int increaseSize = getArraySize() * 2;
                increaseArraySize(increaseSize);
                HashFunction(inputArray, theArray);
                
            }
            
            //Check for collisions
            while (outputArray[arrayIndex] != "-1"){
                
                arrayIndex++;
                System.out.println("Collision! Try Index " + arrayIndex);
                arrayIndex %= this.arraySize;
            
            }
            
            outputArray[arrayIndex] = newElement;
            this.numOfElements++;
         
        }
    
    }//end of HashFunction
    
    //Find the element in the hash table
    public int findKey(String key){
        
        //Use the formula of the hash function in order to generate the index in
        //which the key is stored
        key = key.toLowerCase();
        int hashIndex = 13 - convertString(key) % 29;
        
        if (hashIndex < 0)
            hashIndex *= -1;
        
        while (theArray[hashIndex] != "-1"){
            
            if (key.compareToIgnoreCase(theArray[hashIndex]) == 0){
                
                System.out.println();
                System.out.println("Found the value " + key + " at index " + 
                hashIndex);
                
                return hashIndex;
            }
            
            //Check the next index for the key
            else{
                hashIndex++;
                hashIndex %= arraySize;
            }
            
        }
        
        //If the key is not found anywhere
        System.out.println("Key was not found: " + key + " " + hashIndex);
        return -1;
        
    }
    
    //Convert a string to an int
    public int convertString(String word){
        
        //word = word.toLowerCase();
        //System.out.println("The modified word is " + word);
        int number = 0;
        
        for (int i = 0; i < word.length(); i++){
            
            char ch = word.charAt(i);
            number += (int)ch;
        }
        
        return number;
    }
    
    //Check if the array size a prime number
    public boolean isPrime(int number){
        
        if(number % 2 == 0)
            return false;
        
        for (int i = 3; i*i < number; i += 2){
            
            if (number % i == 0)
                return false;
        }
        
        return true;
    }
    
    //Get a prime number given the input
    public int getNextPrime(int number){
        
        for (int i = number; true; i++){
            
            if (isPrime(i))
                return i;
            
        }
        
    }
    
    //Increase the size of this array
    public void increaseArraySize(int number){
        
        int newSize = getNextPrime(number);
        
        moveOldArray(newSize);
        
    }
    
    //Copy contents of the old array into a temp array with no spaces and resize
    //the old array. Use the hash function to transfer all the contents from the
    //temp array into the old array
    public void moveOldArray(int size){
        
        String[] cleanArray = removeEmptySpaces(this.theArray);
        
        /*Display the cleanArray after being filled
        System.out.println();
        System.out.println("Clean Array contents");
        for(int k = 0; k < cleanArray.length; k++)
            System.out.println("Index: " + k + "    Contains " + 
            cleanArray[k]);*/
            
        /*Display theArray before resizing
        System.out.println();
        System.out.println("THE ARRAY contents BEFORE RESIZING");
        for(int k = 0; k < theArray.length; k++)
            System.out.println("Index: " + k + "    Contains " + theArray[k]);*/
        
        this.theArray = new String[size];
        
        this.arraySize = size;
        
        /*Display theArray's new size
        System.out.println();
        System.out.println("THE ARRAY SIZE IS: " + this.getArraySize());*/
        
        Arrays.fill(this.theArray, "-1");
        
        /*Display theArray after resizing
        System.out.println();
        System.out.println("THE ARRAY contents AFTER RESIZING");
        for(int n = 0; n < theArray.length; n++)
            System.out.println("Index: " + n + "    Contains " + theArray[n]);*/
        
        this.numOfElements = 0;
        HashFunction(cleanArray, this.theArray);
    }
    
    //Return an array with no empty spaces by using an Array List since it
    //constantly resizes itself
    public String[] removeEmptySpaces(String[] arrayToClean){
        
        ArrayList<String> stringList = new ArrayList<String>();
        
        for (String theString: arrayToClean){
            
            if(!theString.equals("-1") && !theString.equals(""))
                stringList.add(theString);
            
        }
        
        /*Display the stringList
        System.out.println();
        System.out.println("STRING LIST contents");
        for(int n = 0; n < stringList.size(); n++)
            System.out.println("Index: " + n + "    Contains " + 
            stringList.get(n));*/
        
        return stringList.toArray(new String[stringList.size()]);
        
    }
    
    //Add an item to the Hashtable
    public void addItem(String word){
        
        //String wordLowCase = word.toLowerCase();
        String[] singleItemArray = {word};
        HashFunction(singleItemArray, this.theArray);
        System.out.println("Inserted " + word + " into hash table");
        
    }
    
    //Delete an item from the Hashtable
    public String deleteItem(String key){
        
        String keyLowCase = key.toLowerCase();
        int keyIndex = findKey(keyLowCase);
        
        if (keyIndex >= 0){
            
            this.theArray[keyIndex] = "-1";
            System.out.println(key + "was deleted from the hash table");
            return keyLowCase;
            
        }
        
        else{
            System.out.println("The word " + key + " does not exist in the hash table");
            return key;
        }
        
    }
    
    //Display the Hashtable
    public void display(){
        
        System.out.println();
        for(int n = 0; n < theArray.length; n++)
            //System.out.println("Index: " + n + "    Contains " + theArray[n]);
            System.out.printf("Table Index: %3d Contains: %s\n", n, theArray[n]);
    }
    
}//end of class HashTable

class Hash_Map{
    
    public static void main(String[] args){
        
        //First tests
        /*
        try{
            HashTable table1 = new HashTable(30);
            
            String[] array1 = {"660", "air", "pecan pie", "ice", "toast"};
            
            table1.HashFunction(array1, table1.theArray);
            
            System.out.println();
            System.out.println("Size of Hash Table is " + table1.getArraySize());
            
            System.out.println();
            System.out.println("Number of Elements in Hash Table is " + 
            table1.getNumberOfElements());
            
            table1.findKey("ice");
            
            System.out.println();
            table1.findKey("stones");
            
            table1.increaseArraySize(32);
            
            System.out.println();
            System.out.println("Size of Hash Table is " + table1.getArraySize());
            
            System.out.println("Number of Elements in Hash Table is " + 
            table1.getNumberOfElements());
            
            System.out.println();
            table1.findKey("ice");
            
            table1.display();
            
            table1.addItem("PENGUIN");
            System.out.println("Size of Hash Table is " + table1.getArraySize());
            System.out.println("Number of Elements in Hash Table is " + 
            table1.getNumberOfElements());
            
            table1.display();
            table1.findKey("PENGUIN");
            
            table1.deleteItem("toast");
            table1.display();
        
            table1.deleteItem("Carlos");
            System.out.println();
            System.out.println("COMPLETED");
        
        }
        catch (Exception e){
        
            System.out.println(e.getMessage());
        
        }    
        */
        
        //Second Tests
        try{
            
            //Define Variables
            Scanner scanInput = new Scanner(System.in);
            //Scanner scanNum = new Scanner(System.in);
            //Scanner scanWords = new Scanner(System.in);
            boolean cycle = true;
            
            System.out.print("Enter a size for your hash table: ");
            
            //Check input of the size of the hash table to be a positive integer
            while (cycle){
                
                if (!scanInput.hasNextInt()){
                        
                    String badInputStr = scanInput.next();
                    System.out.println("Re-enter the size as a number: ");
                        
                }
                
                if (scanInput.hasNextInt()){
                    
                    int size = scanInput.nextInt();
                    
                    if (size < 0){
                                        
                        int badInputInt = size;
                        System.out.println("Re-enter the size as a positive number: ");

                    }
                            
                    else{
                                        
                        HashTable hashTable1 = new HashTable(size);
                                        
                        System.out.println("Please enter a list of words. Type \"stop\" to stop input:\n");
                            
                        while (scanInput.hasNext()){
                                            
                            String inputWord = scanInput.next();
                                            
                            if (inputWord.toLowerCase().compareTo("stop") == 0){
                                
                                cycle = false;
                                break;
                                
                            }
                                            
                            else{
                                
                                hashTable1.addItem(inputWord);
                                
                            }
                            
                        }
                        
                    }
                        
                }
            
            }
            
            System.out.println("COMPLETED");
            
        }
        
        catch (Exception e){
            
            System.out.println(e.getMessage());
            
        }
        
    }
    
}

/*while (cycle){
                
    int size = scanNum.nextInt();
                
    if (scanNum.hasNextInt()){
                    
    if (size < 0){
                        
        int badInputInt = size;
        System.out.println("Re-enter the size as a positive number: ");
        //size = scanNum.nextInt();
                        
    }
                    
    else{
                        
        HashTable hashTable1 = new HashTable(size);
                        
        System.out.println("Please enter a list of words. Type \"stop\" to stop input:\n");
            
        while (scanWords.hasNext()){
                            
            String inputWord = scanWords.next();
                            
            if (inputWord.toLowerCase().compareTo("stop") == 0){
                break;
            }
                            
            else{
                hashTable1.addItem(inputWord);
            }
            
        }
                        
        cycle = false;
                        
    }
                    
}
                
                if (scanNum.hasNext()){
                    
                    String badInputStr = scanNum.next();
                    System.out.println("Re-enter the size as a number: ");
                    
                }
            
            }
            */