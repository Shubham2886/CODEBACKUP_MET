
import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

public class Ds_Practical_94 {
	
	Node root,last;
	
	 void createLinkedList()
	 {
	     root=last=null;
	 }
	         
	 
	 void insertRight(int data)
	 {
	     Node n=new Node(data);
	     if(root==null)
	     {
	         root=last=n;
	         last.next=root;
	     }
	     else
	     {
	        last.next=n;
	        last=n;
	        last.next=root;
	     }
	   }
	 
	 
	 void merge(Ds_Practical_94 obj1)
	 {
				if(this.root==null && obj1.root==null) {
					System.out.println("cant perform merge");
				}
				else
				{
					this.root=obj1.last;
					last=last;
					last.next=obj1.root;
				}
			}
	 }
	
	 void printList()
	 {
	     if(root==null)
	     {System.out.println("List Empty");
	     }
	     else
	     {
	         Node t;
	         t=root;
	         do
	         {
	             System.out.println(t.data);
	             t=t.next;
	         }  while(t!=root);//2
	     }
	   }    

	public static void main(String[] args) {
		int ch, e;
		Ds_Practical_94 obj1 = new Ds_Practical_94();
		obj1.createLinkedList();
		obj1.insertRight(2);
		obj1.insertRight(4);
		obj1.insertRight(6);
		obj1.insertRight(8);
		obj1.insertRight(10);
		Ds_Practical_94 obj = new Ds_Practical_94();
		Scanner in = new Scanner(System.in);
		obj.createLinkedList();
		do {

			System.out.println("1.Insertright\n2.Print first list\n3.print second list\n4.merge list\n0.exit");
			ch = in.nextInt();
			switch (ch) {

			case 1:
					System.out.println("Enter Data:");
					e = in.nextInt();
					obj.insertRight(e);
					break;

			case 2:
				obj.printList();
				break;
			case 3:
				obj1.printList();
			case 4:
				obj1.merge(obj);
				System.out.println("List Merged");
			case 5:
				System.out.println("print merge list");
				obj1.printList();
				
				
			case 0:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Wrong option selected");
				break;
			}
		} while (ch != 0);
		in.close();
	}

	}


