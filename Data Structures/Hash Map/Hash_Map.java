import java.util.Arrays;
import java.util.ArrayList;

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
        
            String newElement = inputArray[n];
         
            //A Function creating an index in theArray where the newElement 
            //will be stored
            int arrayIndex = convertString(newElement) % 29;
         
            System.out.println("Array Index: " + arrayIndex + " for Element: " 
            + newElement);
         
            //Check for collisions
            while (outputArray[n] != "-1"){
                
                arrayIndex++;
                System.out.println("Collision! Try Index " + arrayIndex);
                arrayIndex %= this.arraySize;
            
            }
            
            outputArray[arrayIndex] = newElement;
            this.numOfElements++;
         
        }
    
    }//endof class HashFunction
    
    //Find the element in the hash table
    public String findKey(String key){
        
        //Use the formula of the hash function in order to generate the index in
        //which the key is stored
        int hashIndex = convertString(key) % 29;
        
        while (theArray[hashIndex] != "-1"){
            
            if (key == theArray[hashIndex]){
                System.out.println("Found the value " + key + " at index " + 
                hashIndex);
                
                return key;
            }
            
            //Check the next index for the key
            else{
                hashIndex++;
                hashIndex %= arraySize;
            }
            
        }
        
        //If the key is not found anywhere
        System.out.println("Key was not found");
        return key;
        
    }
    
    //Convert a string to an int
    public int convertString(String word){
        
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
        
        //Display
        System.out.println();
        System.out.println("Clean Array contents");
        for(int k = 0; k < cleanArray.length; k++)
            System.out.println("Index: " + k + "    Contains " + cleanArray[k]);
            
        //Display
        System.out.println();
        System.out.println("THE ARRAY contents BEFORE RESIZING");
        for(int k = 0; k < theArray.length; k++)
            System.out.println("Index: " + k + "    Contains " + theArray[k]);
        
        this.theArray = new String[size];
        
        this.arraySize = size;
        
        //Display
        System.out.println();
        System.out.println("THE ARRAY SIZE IS: " + this.getArraySize());
        
        Arrays.fill(this.theArray, "-1");
        
        //Display
        System.out.println();
        System.out.println("THE ARRAY contents AFTER RESIZING");
        for(int n = 0; n < theArray.length; n++)
            System.out.println("Index: " + n + "    Contains " + theArray[n]);
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
        
        //Display
        System.out.println();
        System.out.println("STRING LIST contents");
        for(int n = 0; n < stringList.size(); n++)
            System.out.println("Index: " + n + "    Contains " + stringList.get(n));
        
        return stringList.toArray(new String[stringList.size()]);
        
    }
    
    
}//end of class HashTable

class Hash_Map{
    
    public static void main(String[] args){
        
        /*HashTable table1 = new HashTable(30);
        
        String[] array1 = {"660", "air", "pecan pie", "ice", "toast"};
        
        table1.HashFunction(array1, table1.theArray);
        
        System.out.println("Size of Hash Table is " + table1.getArraySize());
        
        System.out.println("Nuumber of Elements in Hash Table is " + 
        table1.getNumberOfElements());
        
        table1.findKey("ice");
        
        table1.findKey("stones");
        
        table1.increaseArraySize(32);*/
        
        /*System.out.println("Size of Hash Table is " + table1.getArraySize());
        
        System.out.println("Nuumber of Elements in Hash Table is " + 
        table1.getNumberOfElements());
        */
        
        HashTable table2 = new HashTable(30);
        String[] array1 = {"660", "air", "pecan pie", "ice", "toast"};
        table2.HashFunction(array1, table2.theArray);
        
        table2.increaseArraySize(32);
        System.out.println("COMPLETED");
    }
    
}