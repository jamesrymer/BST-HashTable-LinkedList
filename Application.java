import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Patient p1 = new Patient(50, "jack");
		Patient p2 = new Patient(16, "john");
		Patient p3 = new Patient(17, "stacey");
		Patient p4 = new Patient(18, "link");
		Patient p5 = new Patient(19, "darry");
		Patient p6 = new Patient(25, "welly");
		Patient p7 = new Patient(53, "dreen");
		Patient p8 = new Patient(29, "jaged");
		Patient p9 = new Patient(23, "lotey");
		Patient p10 = new Patient(62, "prosley");
		Patient p11 = new Patient(92, "waxteena");
		Patient p12 = new Patient(31, "jackle");
		Patient p13 = new Patient(33, "janet");
		Patient p14 = new Patient(34, "plackle");
		Patient p15 = new Patient(35, "dale");
		Patient p16 = new Patient(36, "jickle");
		Patient p17 = new Patient(37, "jaemen");
		Patient p18 = new Patient(38, "sally");

		Scanner scaner = new Scanner(System.in);
		System.out.println("Enter 1 to simulate a bst, enter 2 to simulate a hashtable");
		int choice1 = scaner.nextInt();

		if (choice1 == 1) {
			Node n1 = new Node(p1);
			Node n2 = new Node(p2);
			Node n3 = new Node(p3);
			Node n4 = new Node(p4);
			Node n5 = new Node(p5);
			Node n6 = new Node(p6);
			Node n7 = new Node(p7);
			Node n8 = new Node(p8);
			Node n9 = new Node(p9);
			Node n10 = new Node(p10);
			Node n11 = new Node(p11);
			Node n12 = new Node(p12);
			Node n13 = new Node(p13);
			Node n14 = new Node(p14);
			Node n15 = new Node(p15);
			Node n16 = new Node(p16);
			Node n17 = new Node(p17);
			Node n18 = new Node(p18);

			BST bst = new BST();

			bst.TreeInsert(n1);
			bst.TreeInsert(n2);
			bst.TreeInsert(n3);
			bst.TreeInsert(n4);
			bst.TreeInsert(n5);
			bst.TreeInsert(n6);
			bst.TreeInsert(n7);
			bst.TreeInsert(n8);
			bst.TreeInsert(n9);
			bst.TreeInsert(n10);
			bst.TreeInsert(n11);
			bst.TreeInsert(n12);
			bst.TreeInsert(n13);
			bst.TreeInsert(n14);
			bst.TreeInsert(n15);
			bst.TreeInsert(n16);
			bst.TreeInsert(n17);
			bst.TreeInsert(n18);
			Boolean exit = false;
			while (!exit) {

				Scanner scan = new Scanner(System.in);
				System.out.println("1: Print Patient List Sorted From Highst Priority to Lowest");
				System.out.println("2: Add A Patient To The List");
				System.out.println("3: Treat A Patient");
				System.out.println("4: Exit");

				int choice = scan.nextInt();

				switch (choice) {
				case 1:
					bst.InOrderTreeWalk(bst.getRoot());
					break;
				case 2:
					System.out.println("Enter The First Name Of The New Patient:");
					String name = scan.next();
					boolean case2bst = true;
					int priorityNumb = 0;
					while (case2bst) {
						System.out.println("Please Enter A Priority Number Between 0 and 100 Of The Patient You Would Like To Add: ");
						priorityNumb = scan.nextInt();
						if (priorityNumb >= 0 && priorityNumb <= 100) {
							case2bst = false;
						} else {
							System.out.println("This number dose not fit the restrictions");
						}
					}
					
					Patient p = new Patient(priorityNumb, name);
					Node n = new Node(p);
					bst.TreeInsert(n);
					System.out.println("Patient added!");
					break;

				case 3:
					System.out.println("Please Enter The Priority Number Of The Patient You Would Like To Treet: ");
					int priorityNumber = scan.nextInt();
					if(bst.TreeSearch(bst.getRoot(), priorityNumber) == null) {
						System.out.println("No patient exists with that priority number!");
					} else {
						bst.TreeDelete(bst.TreeSearch(bst.getRoot(), priorityNumber));
						System.out.println("Patient Treated!!");
					}
					

					break;
			
				case 4:
					exit = true;
					break;
				}
				System.out.println("=======================================");
			}
		} else if (choice1 == 2) {
			ChainNode cn1 = new ChainNode(p1);
			ChainNode cn2 = new ChainNode(p2);
			ChainNode cn3 = new ChainNode(p3);
			ChainNode cn4 = new ChainNode(p4);
			ChainNode cn5 = new ChainNode(p5);
			ChainNode cn6 = new ChainNode(p6);
			ChainNode cn7 = new ChainNode(p7);
			ChainNode cn8 = new ChainNode(p8);
			ChainNode cn9 = new ChainNode(p9);
			ChainNode cn10 = new ChainNode(p10);
			ChainNode cn11 = new ChainNode(p11);
			ChainNode cn12 = new ChainNode(p12);
			ChainNode cn13 = new ChainNode(p13);
			ChainNode cn14 = new ChainNode(p14);
			ChainNode cn15 = new ChainNode(p15);
			ChainNode cn16 = new ChainNode(p16);
			ChainNode cn17 = new ChainNode(p17);
			ChainNode cn18 = new ChainNode(p18);

			HashTable ht = new HashTable(20);
			ht.Insert(cn1);
			ht.Insert(cn2);
			ht.Insert(cn3);
			ht.Insert(cn4);
			ht.Insert(cn5);
			ht.Insert(cn6);
			ht.Insert(cn7);
			ht.Insert(cn8);
			ht.Insert(cn9);
			ht.Insert(cn10);
			ht.Insert(cn11);
			ht.Insert(cn12);
			ht.Insert(cn13);
			ht.Insert(cn14);
			ht.Insert(cn15);
			ht.Insert(cn16);
			ht.Insert(cn17);
			ht.Insert(cn18);

			Boolean exit2 = false;
			while (!exit2) {

				Scanner scan = new Scanner(System.in);
			
				System.out.println("1: Print Patient List");
				System.out.println("2: Add A Patient To The List");
				System.out.println("3: Treat A Patient");
				System.out.println("4: Find A Patient By Priority Number");
				System.out.println("5: Exit");

				int choice = scan.nextInt();

				switch (choice) {
				case 1:
					System.out.println(ht);
					break;
				case 2:
					System.out.println("Enter The First Name Of The New Patient:");
					String name = scan.next();
					boolean case2ht = true;
					int priorityNumb = 0;
					while (case2ht) {
						System.out.println("Please Enter A Priority Number Between 0 and 100 Of The Patient You Would Like To Find: ");
						priorityNumb = scan.nextInt();
						if (priorityNumb >= 0 && priorityNumb <= 100) {
							case2ht = false;
						} else {
							System.out.println("This number dose not fit the restrictions");
						}
					}
					Patient p = new Patient(priorityNumb, name);
					ChainNode n = new ChainNode(p);
					ht.Insert(n);
					break;

				case 3:
					System.out.println("Please Enter The Priority Number Of The Patient You Would Like To Treet: ");
					int priorityNumber = scan.nextInt();
					ht.delete(priorityNumber);
					System.out.println("Patient Treated!!");

					break;
				case 4:
					boolean case4 = true;
					int priorityNum = 0;
					while (case4) {
						System.out.println("Please Enter A Priority Number Between 0 and 100 Of The Patient You Would Like To Find: ");
						priorityNum = scan.nextInt();
						if (priorityNum >= 0 && priorityNum <= 100) {
							case4 = false;
						} else {
							System.out.println("This number dose not fit the restrictions");
						}
					}
					System.out.println(ht.Search(priorityNum).getPatient());

					break;
				case 5:
					exit2 = true;
					break;
				}
				System.out.println("=======================================");
			}
		}
	}

}
