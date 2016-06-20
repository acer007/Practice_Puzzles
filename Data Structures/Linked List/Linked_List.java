// Import statements
import java.util.Scanner;

//Link node class
class Link{
    
    public String title;
    public int bookId;
    public Link next;
    
    public Link(String bkTitle, int bkId){
        this.title = bkTitle;
        this.bookId = bkId;
    }
    
    public void display(){
        System.out.println("Title: " + this.title + "\nID: " + bookId);
    }
}//end of Link class

// Linked list class
class LinkedList{
    
    public Link firstLink;
    
    public LinkedList(){
        firstLink = null;
    }
    
    public boolean isEmpty(){
        return (firstLink==null);
    }
    
    public void add(String bkTitle, int bkId){
        Link newNode = new Link(bkTitle, bkId);
        newNode.next = firstLink;
        firstLink = newNode;
    }
    
    public Link remove(){
        
        Link linkReference = firstLink;
    
        if (!isEmpty()){
            firstLink = firstLink.next;
        }
        else{
            System.out.println("Empty Book List");
        }
        
        return linkReference;
    }
    
    public void display(){
        
        Link theLink = firstLink;
        
        while (theLink != null){
            
            theLink.display();
            theLink = theLink.next;
            
            System.out.println();
        }
    }
    
    public Link find(String bookName){
        
        Link theLink = firstLink;
        
        if (!isEmpty()){
            
            while (theLink.title != bookName){
                
                if (theLink.next == null){
                    return null;
                }
                
                else{
                    theLink = theLink.next;
                }
            }
        }
        
        else{
            System.out.println("Empty book linked-list");
        }
        
        return theLink;
    }
    
    public Link removeLink(String bookName){
        
        Link currentLink = firstLink;
        Link previousLink = firstLink;
        
        while (currentLink.title != bookName){
            
            if (currentLink.next == null){
                return null;
            }
            else{
                previousLink = currentLink;
                currentLink = currentLink.next;
            }
        }
        
        if (currentLink == firstLink){
            firstLink = firstLink.next;
        }
        
        else{
            previousLink.next = currentLink.next;
        }
        
        return currentLink;

    }
}//end of LinkedList class

// Main class which extends

public class Linked_List extends LinkedList{
    
    public static void main (String args []){
        LinkedList bookBag = new LinkedList();
        
        bookBag.add("Cinderella", 1101200);
        bookBag.add("Swan Lake", 2241100);
        bookBag.add("1Q84", 6412370);
        bookBag.add("King Henry", 8334216);
        bookBag.add("Hello World", 9123456);
        
        bookBag.display();
        bookBag.remove();
        System.out.println("==============================");
        
        bookBag.display();
        bookBag.removeLink("1Q84");
        System.out.println("==============================");
        
        bookBag.display();
        bookBag.add("Dostoevsky", 4432587);
        System.out.println("==============================");

        bookBag.display();
    }
}