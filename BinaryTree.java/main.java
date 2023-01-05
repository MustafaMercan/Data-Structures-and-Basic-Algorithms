import srcs.*;
public class main{
    public static void main(String[] args)
    {

        BinaryTree myData = new BinaryTree();

        myData.addNode(4);
        myData.addNode(3);
        myData.addNode(6);
        myData.addNode(5);
        myData.addNode(1);
          
        System.out.println(myData.root.data); // 4
        System.out.println(myData.root.left.data); //33
        System.out.println(myData.root.right.data); //6
        System.out.println(myData.root.right.left.data); // 5
        System.out.println(myData.root.left.left.data);//1
        


          myData.printList();
    }
}