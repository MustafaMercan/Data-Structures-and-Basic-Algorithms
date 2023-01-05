package srcs;
public class BinaryTree{
    public Node root;

    public BinaryTree()
    {
        System.out.println("BinaryTree was created");
        this.root = null;
    }
    public void addNode(int data)
    {
        Node newNode = new Node(data);
        addNode(newNode,this.root);
    }
    public void addNode(Node newNode,Node currentNode)
    {
        if(this.root == null)
        {
            this.root = newNode;
            return ;
        }
        if(currentNode.left == null && newNode.data < currentNode.data)
        {
            currentNode.left = newNode;
            return;
        }
        else if(currentNode.right == null && newNode.data >= currentNode.data)
        {
            currentNode.right = newNode;
            return;
        }

        if(currentNode.data > newNode.data)
        {
            addNode(newNode,currentNode.left);
        }
        else if(currentNode.data <= newNode.data)
            addNode(newNode,currentNode.right);
    }
    public void printNode(Node node)
    {
        System.out.println("data -> " + node.data);
    }

    public void printList()
    {
        printNodes(this.root);
    }

    public void printNodes(Node current)
    {
        if(current.right == null && current.left == null)
        {
            current.printData();
            return;
        }
        if(current.left != null)
            printNodes(current.left);

        current.printData();

        if(current.right != null)
            printNodes(current.right);

            
         
    }



}