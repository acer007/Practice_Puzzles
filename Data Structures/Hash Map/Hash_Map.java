import java.util.Arrays;

class HashTable{
    
    public String[] theArray;
    private int arraySize;
    private int numOfElements = 0;
    
    //Construct a hash table
    HashTable(int size){
        
        this.arraySize = size;
        this.theArray  = new String[arraySize];
        Arrays.fill(theArray, "-1");
        
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
    public void HashFunction(String[] inputArray, String[] theArray){
    
        for(int n = 0; n < inputArray.length; n++){
        
            String newElement = inputArray[n];
         
            // Creating an index in theArray where the newElement will be stored
            int arrayIndex = convertString(newElement) % 29;
         
            System.out.println("Array Index: " + arrayIndex + " for Element: " 
            + newElement);
         
            //Check for collisions
            while (theArray[n] != "-1"){
                
                arrayIndex++;
                System.out.println("Collision! Try Index " + arrayIndex);
                arrayIndex %= arraySize;
            
            }
            
            theArray[arrayIndex] = newElement;
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
                
                return null;
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
    
}//end of class HashTable

class Hash_Map{
    
    public static void main(String[] args){
        
        HashTable table1 = new HashTable(30);
        
        String[] array1 = {"660", "air", "pecan pie", "ice", "toast"};
        
        table1.HashFunction(array1, table1.theArray);
        
        System.out.println("Size of Hash Table is " + table1.getArraySize());
        
        System.out.println("Nuumber of Elements in Hash Table is " + table1.getNumberOfElements());
        
        table1.findKey("ice");
        
    }
    
}