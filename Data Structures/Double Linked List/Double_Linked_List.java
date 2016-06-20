//Neighbor Class
class Neighbor{
    
    //Fields
    public String homeOwnerName;
    public int houseNumber;
    
    public Neighbor next;
    public Neighbor previous;
    
    /* Constructor for Neighbor object
     * String homeOwnerName
     * int houseNumber
     */
    public Neighbor(String homeOwnerName, int houseNumber){
        this.homeOwnerName = homeOwnerName;
        this.houseNumber = houseNumber;
    }
    
    //Display the name and house number of this neighbor
    public void display(){
        System.out.println("Home Owner: " + homeOwnerName + "/tHouse Number: " + houseNumber);
    }
    
    //Setters and Getters of all fields in Neighbor class
    public void setName(String homeOwnerName){
        this.homeOwnerName = homeOwnerName;
    }
    
    public String getName(){
        return homeOwnerName;
    }
    
    public void setNumber(int houseNumber){
        this.houseNumber = houseNumber;
    }
    
    public int getNumber(){
        return houseNumber;
    }
    
}

//Double Ended Linked List
class DoubleEndedLinkedList{
    
    Neighbor firstLink;
    Neighbor lastLink;
    
    public void insertInFirstPosition(String homeOwnerName, int houseNumber){
        Neighbor newLink = new Neighbor(homeOwnerName, houseNumber);
        
        if(isEmpty()){
            lastLink = newLink;
        }
        
        newLink.next = firstLink;
        firstLink = newLink;

    }
    
    public void insertInLastPosition(String homeOwnerName, int houseNumber){
        Neighbor newLink = new Neighbor(homeOwnerName, houseNumber);
        
        if(isEmpty()){
            firstLink = newLink;
        }
        
        newLink.previous = lastLink;
        lastLink.next = newLink;
        lastLink = newLink;
    }
    
    public boolean isEmpty(){
        return firstLink == null;
    }
    
    public void display(){
        Neighbor theLink = firstLink;
        
        while(theLink != null){
            
            theLink.display();
            System.out.println("Next Link: " + theLink.next);
            theLink = theLink.next;
            
            System.out.println();
        }
    }
}


class Double_Linked_List
    extends DoubleEndedLinkedList{
    public static void main (String [] args){
        
        DoubleEndedLinkedList theList = new DoubleEndedLinkedList();
        theList.insertInFirstPosition("Alice", 7);
        theList.insertInFirstPosition("Carol", 8);
        theList.insertInLastPosition("Belle", 9);
        theList.insertInLastPosition("Donna", 10);

        theList.display();
    }
    
}