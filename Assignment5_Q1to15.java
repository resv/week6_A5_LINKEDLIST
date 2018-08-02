// WEEK 6 ASSIGNMENT 5 - LINKEDLIST

package week6_A5_LINKEDLIST;

import java.util.Arrays;
import java.util.LinkedList;

public class Assignment5_Q1to15 {

	public static void main(String[] args) {
		// INITIALIZE LINKEDLIST
		LinkedList<String> colors = new LinkedList<String>((Arrays.asList
		("Blue", "Yellow","Red", "Green", "Orange", "White", "Black")));

		// CALLING ALL METHODS, ONE AFTER ANOTHER
		appendLL(colors);
		iterate(colors);
//		iterateAt(colors);
		iterateReverse(colors);
		insertAt(colors, 5, "Brown");
		insertFirstLast(colors,"Brown", "Gray");
		insertFirst(colors, "Brown");
		insertLast(colors);
		insertFewAt(colors);
		getFirstLast(colors);
		removeFirstLast(colors);
		removeAll(colors);
		swapTwo(colors);
		convert(colors);
		isEmpty(colors);
		
	}

	// 1. Write a Java program to append the specified element to the end of a linked list.
	private static void appendLL(LinkedList<String> list) {
		System.out.println("\nQUESTION 1 -----------------------");
		
		list.addFirst("Green");
		System.out.println(list);
		System.out.println("(Appended \"Green\" at the end of the LinkedList)");
		
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));
	}

	
	// 2. Write a Java program to iterate through all elements in a linked list.
	private static void iterate(LinkedList<String> list) {
		System.out.println("\nQUESTION 2 -----------------------");
		for (String elements : list) {
			System.out.printf(elements + " ");
		}	
		System.out.println("\r\n(Iterating through the LinkedList)");
	}
	
	
//	// 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
//	private static void iterateAt(LinkedList<String> list) {
//		System.out.println("\nQUESTION 3 -----------------------");
//		for (String elements : list.indexOf(list.get(4))) {
//			System.out.printf(elements + " ");
//		}	
//		System.out.println("\r\n(Iterating through the LinkedList)");
//		
//	}
	// 4. Write a Java program to iterate a linked list in reverse order.
	private static void iterateReverse(LinkedList<String> list) {
		System.out.println("\nQUESTION 4 -----------------------");
		
		//PRINT OUT ORIGINAL LINKEDLIST ORDER
		System.out.println("Current order :" + list);
		
		//FOR LOOP TO PUSH ELEMENT TO THE LAST INDEX AND TO POP THE FIRST ELEMENT
		for (int i = 0, k = list.size() - 1; i < k; i++) {
			list.add(i, list.remove(k));
		}
		System.out.println("New reversed order : " + list);
		
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));
	}

	// 5. Write a Java program to insert the specified element at the specified position in the linked list.
	private static void insertAt(LinkedList<String> list, int index, String element) {
		System.out.println("\nQUESTION 5 -----------------------");
		
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " ");
		
		list.add(index, element);	//METHOD USED TO INSERT AT SPECIFIC INDEX
		
		System.out.println("\r\nWe inserted " + element + " at the " + index + " index : ");
		System.out.println(list);
		System.out.println("(Inserting an element " + "[" + element + "] at index "+ index +")");
		
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));
	}
	
	
	// 6. Write a Java program to insert elements into the linked list at the first and last position.
	private static void insertFirstLast(LinkedList<String> list, String elementFirst, String elementLast) {
		System.out.println("\nQUESTION 6 -----------------------");
		
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " \r\n");
		list.addFirst(elementFirst);	//METHOD USED TO INSERT AT SPECIFIC INDEX
		list.addLast(elementLast);
		System.out.println("New appended array :");

		System.out.println(list);
		System.out.println("(Inserted [" + elementFirst +  "] to the front & [" + elementLast + "] to the end)");
		
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));
		
	}
	
	
	// 7. Write a Java program to insert the specified element at the front of a linked list.
	private static void insertFirst(LinkedList<String> list, String element) {
		System.out.println("\nQUESTION 7 -----------------------");
	
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " \r\n");
		
		
		list.addFirst(element);	//METHOD USED TO INSERT AT SPECIFIC INDEX
		System.out.println("New appended array :");

		System.out.println(list); //PRINTING OUT LIST
		System.out.println("(Inserted [" + element +  "] to the front)");
		
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));
	}	
	

	// 8. Write a Java program to insert the specified element at the end of a linked list.
	private static void insertLast(LinkedList<String> list) {
		System.out.println("\nQUESTION 8 -----------------------");
		
	}
	// 9. Write a Java program to insert some elements at the specified position into a linked list.
	private static void insertFewAt(LinkedList<String> list) {
		System.out.println("\nQUESTION 9 -----------------------");
		
	}
	
	// 10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
	private static void getFirstLast(LinkedList<String> list) {
		System.out.println("\nQUESTION 10 ----------------------");
		
	}
	
	// 11. Write a Java program to remove first and last element from a linked list.
	private static void removeFirstLast(LinkedList<String> list) {
		System.out.println("\nQUESTION 11 ----------------------");
		
	}
	
	
	// 12. Write a Java program to remove all the elements from a linked list.
	private static void removeAll(LinkedList<String> list) {
		System.out.println("\nQUESTION 12 ----------------------");
		
	}
	
	// 13. Write a Java program of swap two elements in an linked list
	private static void swapTwo(LinkedList<String> list) {
		System.out.println("\nQUESTION 13 ----------------------");
		
	}
	// 14. Write a Java program to convert a linked list to array list.
	private static void convert(LinkedList<String> list) {
		System.out.println("\nQUESTION 14 ----------------------");
		
	}
	
	// 15. Write a Java program to test an linked list is empty or not.
	private static void isEmpty(LinkedList<String> list) {
		System.out.println("\nQUESTION 15 ----------------------");
		
	}

}
