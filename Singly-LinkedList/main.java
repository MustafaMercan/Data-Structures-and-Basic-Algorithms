import srcs.*;
public class main{
	public static void main(String[] args)
	{
		LinkedList myList = new LinkedList();
		myList.add(10);
		myList.add(12);
		myList.add(13);



		System.out.println(myList.head.data);
		System.out.println(myList.head.next.data);
		System.out.println(myList.head.next.next.data);


		myList.printList();
	}

}
