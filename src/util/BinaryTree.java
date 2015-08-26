package util;

public class BinaryTree{

    Node root;

    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.addNode(1, "a");
        bt.addNode(2, "b");
        bt.addNode(3, "c");
        bt.addNode(4, "d");
        bt.addNode(5, "e");
        bt.addNode(6, "f");
        bt.addNode(8, "h");
        bt.addNode(7, "g");

        bt.inOrderTraverseTree(bt.root);

        //System.out.println(bt.findNode(12));

        System.out.println(bt.remove(3));
        bt.inOrderTraverseTree(bt.root);

    }

    public void addNode(int key, String name){
        //if tree is empty
        Node newNode = new Node(key, name);
        if (root == null)
            root = newNode;
            //if tree is not empty
        else{
            Node focusNode = root;
            Node parent;
            while(true){
                parent = focusNode;
                if (key < focusNode.key){
                    focusNode = focusNode.leftChild;
                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else{
                    focusNode = focusNode.rightChild;
                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }

    }

    public boolean remove(int key){
        Node focusNode = root;
        Node parent = root;
        boolean isLeftChild = true;
        while(focusNode.key != key){
            parent = focusNode;
            if(key < focusNode.key){
                isLeftChild = true;
                focusNode = focusNode.leftChild;
            }else{
                isLeftChild = false;
                focusNode = focusNode.rightChild;
            }
            if(focusNode == null)
                return false;
        }
        if(focusNode.leftChild == null && focusNode.rightChild == null){
            if(focusNode == root)
                root = null;
            else if(isLeftChild)
                parent.leftChild = null;
            else
                parent.rightChild = null;
        }else if(focusNode.leftChild == null){
            if(focusNode == root)
                root = focusNode.rightChild;
            else if(isLeftChild)
                parent.leftChild = focusNode.rightChild;
            else
                parent.rightChild = focusNode.rightChild;
        }else if(focusNode.rightChild == null){
            if(focusNode == root)
                root = focusNode.leftChild;
            else if(isLeftChild)
                parent.leftChild = focusNode.leftChild;
            else
                parent.rightChild = focusNode.leftChild;
        }else{
            Node replacement = findReplacementNode(focusNode);
            if(focusNode == root)
                root = replacement;
            else if(isLeftChild)
                parent.leftChild = replacement;
            else
                parent.rightChild = replacement;
            replacement.leftChild = focusNode.leftChild;
        }
        return true;
    }

    public Node findReplacementNode(Node replacedNode){
        Node replacement = replacedNode;
        Node parent = replacedNode;
        Node focusNode = replacedNode.rightChild;
        while(focusNode != null){
            parent = replacement;
            replacement = focusNode;
            focusNode = focusNode.leftChild;
        }
        if(replacement != replacedNode.rightChild){
            parent.leftChild = replacement.rightChild;
            replacement.rightChild = replacedNode.rightChild;
        }
        return replacement;
    }

    // public boolean remove(int key){
    // 	Node noteToRemoveParent = findNodeParent(key);
    // 	if(noteToRemoveParent==null)
    // 		return false;
    // 	if(noteToRemoveParent.leftChild !=null){
    // 		if(key == noteToRemoveParent.leftChild.key)
    // 			noteToRemoveParent.leftChild = noteToRemoveParent.leftChild.rightChild;
    // 	}
    // 	else if(noteToRemoveParent.rightChild !=null){
    // 			if(key == noteToRemoveParent.rightChild.key && noteToRemoveParent.rightChild !=null)
    // 			noteToRemoveParent.rightChild = noteToRemoveParent.rightChild.rightChild;
    // 	}
    // 	else
    // 		root = null;
    // 	return true;
    // }

    // public Node findNodeParent(int key){
    // 	Node focusNode = root;
    // 	Node parent = focusNode;
    // 	while(true){
    // 		if(focusNode == null)
    // 		return null;
    // 		if(focusNode.key == key)
    // 		return parent;
    // 		else if(key < focusNode.key){
    // 			parent = focusNode;
    // 			parent.leftChild = focusNode.leftChild;
    // 			parent.rightChild = focusNode.rightChild;
    // 			focusNode = focusNode.leftChild;
    // 		}
    // 		else{
    // 			parent = focusNode;
    // 			parent.leftChild = focusNode.leftChild;
    // 			parent.rightChild = focusNode.rightChild;
    // 			focusNode = focusNode.rightChild;
    // 		}
    // 	}
    // }

    public void inOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public Node findNode(int key){
        Node focusNode = root;
        while(true){
            if(focusNode == null)
                return null;
            if(focusNode.key == key)
                return focusNode;
            else if(key < focusNode.key)
                focusNode = focusNode.leftChild;
            else
                focusNode = focusNode.rightChild;
        }
    }


}

class Node{
    int key;
    String name;
    Node leftChild;
    Node rightChild;

    Node(int key,String name){
        this.key = key;
        this.name = name;
    }

    public String toString(){
        return name + "-" + key;
    }


}

