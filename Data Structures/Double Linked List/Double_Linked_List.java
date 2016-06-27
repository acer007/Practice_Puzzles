//Neighbor Class
class Neighbor{
    
    //Fields
    private String homeOwnerName;
    private int houseNumber;
    
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
        System.out.println("Home Owner: " + homeOwnerName + "\tHouse Number: " + houseNumber);
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
    
    //Insert new link before the First link
    public void insertInFirstPosition(String homeOwnerName, int houseNumber){
        Neighbor newLink = new Neighbor(homeOwnerName, houseNumber);
        
        if(isEmpty()){
            lastLink = newLink;
        }
        else{
            firstLink.previous = newLink;
            newLink.next = firstLink;
        }
        
        firstLink = newLink;

    }
    
    //Insert the new link after the Last link
    public void insertInLastPosition(String homeOwnerName, int houseNumber){
        Neighbor newLink = new Neighbor(homeOwnerName, houseNumber);
        
        if(isEmpty()){
            firstLink = newLink;
        }
        else{
            newLink.previous = lastLink;
            lastLink.next = newLink;
        }
        
        lastLink = newLink;
    }
    
    public boolean insertAfterKey(String homeOwnerName, int houseNumber, int key){
        Neighbor newLink = new Neighbor(homeOwnerName, houseNumber);
        Neighbor currentLink = firstLink;
        
        while(currentLink.getNumber() != key){
            currentLink = firstLink.next;
            
            if(currentLink == null){
                System.out.println("Cannot find the key in the list");
                return false;
            }
        }
        
        if(currentLink == lastLink){
            newLink.next = null;
            lastLink = newLink;
        }
        
        else{
            newLink.next = currentLink.next;
            currentLink.next.previous = newLink;
            
        }
        
        newLink.previous = currentLink;
        currentLink.next = newLink;
        return true;
    }
    
    //Check if the First linkis empty
    public boolean isEmpty(){
        return firstLink == null;
    }
    
    //Display all the links of the linked list
    public void display(){
        Neighbor theLink = firstLink;
        
        while(theLink != null){
            
            theLink.display();
            
            if(theLink.next != null){
                System.out.println("Next Link: " + theLink.next.getName());
            }
            
            System.out.println();

            theLink = theLink.next;

        }
    }
    
    //Find the number of items in the list
    public int length(){
        
        Neighbor currentLink = firstLink;
        int counter = 0;
        
        if(currentLink == null){
            return counter;
        }
        
        else{
            counter++;
            while(currentLink.next != null){
                counter++;
                currentLink = currentLink.next;
            }
        }
        
        return counter;
    }
        
    // Split a doubly linked list (DLL) into 2 DLLs of
    // half sizes
    public Neighbor split(Neighbor head) {
        
        Neighbor fast = head, slow = head;
        
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Neighbor temp = slow.next;
        slow.next = null;
        return temp;
    }
    
    //Merge Sort the linked list    
    public Neighbor mergeSort(Neighbor node) {
            
        if (node == null || node.next == null) {
            return node;
        }
            
        Neighbor second = split(node);
 
        // Recur for left and right halves
        node = mergeSort(node);
        second = mergeSort(second);
 
        // Merge the two sorted halves
        return merge(node, second);
    }
    
    //Function to merge the linked lists
    Neighbor merge(Neighbor first, Neighbor second) {
        
        // If first linked list is empty
        if (first == null) {
            return second;
        }
 
        // If second linked list is empty
        if (second == null) {
            return first;
        }
 
        // Pick the smaller value
        if (first.getNumber() < second.getNumber()) {
            first.next = merge(first.next, second);
            first.next.previous = first;
            first.previous = null;
            return first;
        } 
        else {
            second.next = merge(first, second.next);
            second.next.previous = second;
            second.previous = null;
            return second;
        }
    }
    
    //Get the head of the linked list
    public Neighbor getFirstLink(){
        return firstLink;
    }
    
    
}

//Main function
class Double_Linked_List
    extends DoubleEndedLinkedList{
        
    public static void main (String [] args){
        
        DoubleEndedLinkedList theList = new DoubleEndedLinkedList();
        theList.insertInFirstPosition("Alice", 7);
        theList.insertInFirstPosition("Carol", 8);
        theList.insertInLastPosition("Belle", 9);
        theList.insertInLastPosition("Donna", 10);
        theList.insertAfterKey("Kepler", 13, 8);

        theList.display();
        
        System.out.println();
        System.out.println("Length: " + theList.length());
        System.out.println();
        
        Neighbor head = theList.getFirstLink();
        theList.mergeSort(head);
        theList.display();
    }
    
}
