//Node class
class Node{
    
    //Fields
    private String name;
    private int id;
    
    public Node leftChild;
    public Node rightChild;
    
    //Constructor
    public Node(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    //Setters and Getters
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    //Display contents of node
    public void display(){
        System.out.println("Name: " + name + "\tID: " + id);
    }
    
}//end of class Node

//Binary Tree class
class BinaryTree{
    
    Node root;
    
    //add node
    public void addNode(String name, int id){
        
        Node newNode = new Node(name, id);
        
        //if root is empty
        if (root == null){
            root = newNode;
            return;
        }
        
        else{
            
            Node focusNode = root;
            Node parent;
                    
            while (true){
                
                parent = focusNode;

                //if less than root check the left of root
                if (id < focusNode.getId()){
                    focusNode = focusNode.leftChild;
                    
                    if (focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }
                //if greater than root check the right of root
                else{
                    focusNode = focusNode.rightChild;
                        
                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                        
                }
            
            }

        }
        
    }

    //In-Order Traversal
    public void inOrder(Node focusNode){
        
        if (focusNode != null){
            
            inOrder(focusNode.leftChild);
            focusNode.display();
            inOrder(focusNode.rightChild);
            
        }
    }
    
    
    
}//end of class BinaryTree

//Binary_Tree main class
class Binary_Tree{
    public static void main(String [] args){
        
        BinaryTree theTree = new BinaryTree();
        
        theTree.addNode("Anya", 441);
        theTree.addNode("Rosseau", 712);
        theTree.addNode("Bentham", 211);
        theTree.addNode("Petunia", 408);
        theTree.addNode("Violet", 664);
        theTree.addNode("Todd", 821);
        theTree.addNode("Cyril", 771);
        
        theTree.inOrder(theTree.root);
        
    }//end of main
    
}//end of class Binary_Tree