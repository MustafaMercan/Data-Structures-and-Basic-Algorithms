package srcs;
public class LinkedList{
	public Node head;
	public LinkedList()
	{
		this.head = null;
		System.out.println("Linked List was Created\n");
	}
	Node createNewNode(int data)
	{
		Node newNode = new Node(data);
		return newNode;
	}
	//Adds a new node to the list
	public void add(int data)
	{
		if(this.head == null)
		{
			this.head = createNewNode(data);
		}
		else
		{
			Node iter = this.head;
			while(iter.next != null)
				iter = iter.next;
			iter.next = createNewNode(data);
		}
	}
	//Prints all nodes in the list to the screen
	public void printList()
	{
		Node iter = this.head;
		while(iter != null)
		{
			iter.printNode();
			iter = iter.next;
		}
	}
	//deletes all nodes with the given data from the list
	public void delNode(int data)
	{
		//Checks if the list is empty or not
		if(this.head == null)
		{
			System.out.println("Empty List\n");
			return;
		}
		//Checks whether the data is the first and only element of the list
		if(this.head.data == data && this.head.next == null)
		{
			this.head = null;
			return;
		}
		//Checks the data is the first element of the list
		if(this.head.data == data && this.head.next != null)
			this.head = this.head.next;

		Node iter = this.head;
		//Checks other elements in the list
		while(iter.next != null)
		{
			if(iter.next.data == data)
			{
				iter.next = iter.next.next;
			}
			iter = iter.next;
		}
		//Checks the data is the last element of the list
		if(iter.data == data)
			iter.data = null;
	}
}
