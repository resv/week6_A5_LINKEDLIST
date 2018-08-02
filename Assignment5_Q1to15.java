// WEEK 6 ASSIGNMENT 5 - LINKEDLIST

package week6_A5_LINKEDLIST;

import java.util.Arrays;
import java.util.LinkedList;

public class Assignment5_Q1to15 {

	public static void main(String[] args) {
		// TODO 

		// INITIALIZE LINKEDLIST
		LinkedList<String> colors = new LinkedList<String>((Arrays.asList
		("Blue", "Yellow","Red", "Green", "Orange", "White", "Black")));

		// CALLING ALL METHODS, ONE AFTER ANOTHER
		appendLL(colors);
		iterate(colors);
		iterateAt(colors);
		iterateReverse(colors);
		insertAt(colors);
		insertFirstLast(colors);
		insertFirst(colors);
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
	private static void iterate(LinkedList<String> colors) {
		
	}
	// 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
	private static void iterateAt(LinkedList<String> colors) {
	
		
	}
	// 4. Write a Java program to iterate a linked list in reverse order.
	private static void iterateReverse(LinkedList<String> colors) {
	
		
	}

	// 5. Write a Java program to insert the specified element at the specified position in the linked list.
	private static void insertAt(LinkedList<String> colors) {
	
		
	}
	// 6. Write a Java program to insert elements into the linked list at the first and last position.
	private static void insertFirstLast(LinkedList<String> colors) {
	
		
	}
	
	
	// 7. Write a Java program to insert the specified element at the front of a linked list.
	private static void insertFirst(LinkedList<String> colors) {
		
		
	}

	// 8. Write a Java program to insert the specified element at the end of a linked list.
	private static void insertLast(LinkedList<String> colors) {
		
		
	}
	// 9. Write a Java program to insert some elements at the specified position into a linked list.
	private static void insertFewAt(LinkedList<String> colors) {
	
		
	}
	
	// 10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
	private static void getFirstLast(LinkedList<String> colors) {
	
		
	}
	
	// 11. Write a Java program to remove first and last element from a linked list.
	private static void removeFirstLast(LinkedList<String> colors) {
		
		
	}
	
	
	// 12. Write a Java program to remove all the elements from a linked list.
	private static void removeAll(LinkedList<String> colors) {
		
		
	}
	
	// 13. Write a Java program of swap two elements in an linked list
	private static void swapTwo(LinkedList<String> colors) {
		 
		
	}
	// 14. Write a Java program to convert a linked list to array list.
	private static void convert(LinkedList<String> colors) {
		 
		
	}
	
	// 15. Write a Java program to test an linked list is empty or not.
	private static void isEmpty(LinkedList<String> colors) {
	
		
	}

}
