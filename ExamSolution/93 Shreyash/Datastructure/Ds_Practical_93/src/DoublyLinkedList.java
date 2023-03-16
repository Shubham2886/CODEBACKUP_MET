import java.util.*;

class Dnode {
	int data;
	Dnode left;
	Dnode right;

	Dnode(int data) {
		this.data = data;
		left = null;
		right = null;
	}

}

public class DoublyLinkedList {
	Dnode root;
//	public int nodeCounter = 0;

	public void createList() {
		root = null;
	}

	public void inserRight(int data) {
		Dnode n = new Dnode(data);
//		++nodeCounter;
		if (root == null)
			root = n;
		else {
			Dnode t = root;
			// traversing to the last node.
			while (t.right != null) {
				t = t.right;
			}
			t.right = n;
			n.left = t;
		}
	}

	public void printTraverse() {
		if (root == null)
			System.out.println("List is Empty");
		else {
			Dnode t = root;
			while (t != null) {
				System.out.println(t.data);
				t = t.right;
			}
		}
	}

	public void splitList(DoublyLinkedList obj) {
		if (this.root == null)
			System.out.println("List is Empty");
		else {
			int count = 1;
			int temp ;
			Dnode t = root;
			while (t != null) {
				if(count % 2 != 1) {
					temp = t.data;
					(t.left).right = t.right;
					if(count % 2 != 1 && t.right == null)
					{
						t.right = null;
					}
					else {				
						(t.right).left = t.left;
					}
					obj.inserRight(temp);
					}
				
				count++;
				t=t.right;
				}
			
		
			}
		}

	public static void main(String args[]) {
		DoublyLinkedList obj = new DoublyLinkedList();
		obj.createList();
		DoublyLinkedList obj2 = new DoublyLinkedList();
		obj2.createList();
		int choice, data;
		Scanner sc = new Scanner(System.in);
		try {

			do {
				System.out.println("1.InsertRight\n2.Print\n3.SplitList\n0.Exit");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the data");
					data = sc.nextInt();

					obj.inserRight(data);
//					System.out.println(obj.nodeCounter);
					break;
				case 2:
					obj.printTraverse();
					break;
				case 3:
					obj.splitList(obj2);
					System.out.println("=============ODD LIST=============");
					obj.printTraverse();
					System.out.println("=============EVEN LIST=============");
					obj2.printTraverse();
					break;
				case 0:
					System.out.println("Exiting....");
					break;

				default:
					System.out.println("Wrong option selected");

				}
			} while (choice != 0);
		} finally {
			sc.close();
//			 System.out.println("scanner closed");
		}
	}
}
