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
    
    // This setter can screw up the order of the tree
    /*public void setId(int id){
        this.id = id;
    }
    */
    
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
    
    //Pre-Order Traversal
    public void preOrder(Node focusNode){
        
        if (focusNode != null){
            
            focusNode.display();
            preOrder(focusNode.leftChild);
            preOrder(focusNode.rightChild);
            
        }
        
    }
    
    //Post-Order Traversal
    public void postOrder(Node focusNode){
        
        if(focusNode != null){
            
            postOrder(focusNode.leftChild);
            postOrder(focusNode.rightChild);
            focusNode.display();
            
        }
        
    }
    
    //find node
    public Node find(int id){
        
        Node focusNode = root;
        
        while (id != focusNode.getId()){
        
            if (id < focusNode.getId()){
                focusNode = focusNode.leftChild;
            }
                
            else{
                focusNode = focusNode.rightChild;
            }
        
            if (focusNode == null){
                
                //System.out.println("Id is not found");
                return null;
                
            } 
            
        }
        
        //System.out.println("Found the Person with id: " + id);
        return focusNode;
        
    }
    
    //delete node
    public boolean remove(int key){
        
        Node focusNode = root;
        Node parent = root;
        
        boolean isItALeftChild = true;
        
        //Find the node to delete on the tree
        while (focusNode.getId() != key){
            
            parent = focusNode;
            
            if (key < focusNode.getId()){
                isItALeftChild = true;
                focusNode = focusNode.leftChild;
            }
            
            else{
                isItALeftChild = false;
                focusNode = focusNode.rightChild;
            }
            
            if (focusNode == null){
                return false;
            }
        }
        
        if (focusNode.leftChild == null && focusNode.rightChild == null){
            
            if (focusNode == root){
                root = null;
            }
            else if (isItALeftChild){
                parent.leftChild = null;
            }
            else{
                parent.rightChild = null;
            }
        }
        
        else if (focusNode.rightChild == null){
            
            if (focusNode == root){
                root = focusNode.leftChild;
            }
            else if (isItALeftChild){
                parent.leftChild = focusNode.leftChild;
            }
            else{
                parent.rightChild = focusNode.leftChild;
            }
        }
        
        else if (focusNode.leftChild == null){
            
            if (focusNode == root){
                root = focusNode.rightChild;
            }
            else if (isItALeftChild){
                parent.leftChild = focusNode.rightChild;
            }
            else{
                parent.rightChild = focusNode.leftChild;
            }
        }
        
        else{
            
            Node replacement = getReplacement(focusNode);
            
            if (focusNode == root){
                root = replacement;
            }
            else if(isItALeftChild){
                parent.leftChild = replacement;
            }
            else{
                parent.rightChild = replacement;
            }
            
            replacement.leftChild = focusNode.leftChild;
            
        }
        
        return true;
    }
    
    public Node getReplacement(Node replacedNode){
        
        Node replacementParent = replacedNode;
        Node replacement = replacedNode;
        
        Node focusNode = replacedNode.rightChild;
        
        while (focusNode != null){
            replacementParent = replacement;
            replacement = focusNode;
            focusNode = focusNode.leftChild;
        }
        
        if (replacement != replacedNode.rightChild){
            replacementParent.leftChild = replacement.rightChild;
            replacement.rightChild = replacedNode.rightChild;
        }
        
        return replacement;
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
        System.out.println();
        
        theTree.preOrder(theTree.root);
        System.out.println();
        
        theTree.postOrder(theTree.root);
        System.out.println();
        
        Node foundNode = theTree.find(664);
        
        if (foundNode != null){
            System.out.println(foundNode.getName());
            System.out.println();
            foundNode.setName("Violette");
            theTree.inOrder(theTree.root);
        }
        
        System.out.println();
        foundNode = theTree.find(12);
        
         if (foundNode != null){
            System.out.println(foundNode.getName());
            System.out.println();
            foundNode.setName("Violette");
            theTree.inOrder(theTree.root);
        }
        
        System.out.println();
        System.out.println("Remove Anya");
        theTree.remove(441);
        theTree.inOrder(theTree.root);

    }//end of main
    
}//end of class Binary_Tree