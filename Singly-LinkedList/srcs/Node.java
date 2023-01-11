package srcs;
public class Node{
	public int data;
	public Node next;
	public Node(int data)
	{
		this.data = data;
		this.next = next;
		System.out.println("Node was created");
	}

	//Prints the Node's data to the screen
	public void printNode()
	{
		System.out.println("data -> " + this.data);

	}
}
