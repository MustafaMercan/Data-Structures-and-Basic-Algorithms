package srcs;
public class Node{
    public int data;
    public Node left;
    public Node right;

    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
        System.out.println("Node was created");
    }
    public void printData()
    {
        System.out.println("data -> " + this.data);
    }
}