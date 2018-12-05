package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsExample {

    public static void main(String[] args) {

        //
        // Example of Queue list
        //

        System.out.println("\n\nThis begins the Queue List");
        Queue<String> waitingQueue = new LinkedList<>();

        waitingQueue.add("Alma");
        waitingQueue.add("Omni");
        waitingQueue.add("Moroni");
        waitingQueue.add("Lehi");
        waitingQueue.add("Nephi");
        waitingQueue.add("Samuel");
        waitingQueue.add("Limhi");

        System.out.println("Current WaitingQueue : " + waitingQueue);

        // Check is a Queue is empty
        System.out.println("Is the waitingQueue empty? : " + waitingQueue.isEmpty());

        // Find the size of the Queue
        System.out.println("Size of waitingQueue : " + waitingQueue.size());

        // Check if the Queue contains an element
        String qName = "Alma";
        if (waitingQueue.contains(qName)) {
            System.out.println("The WaitingQueue contains " + qName);
        } else {
            System.out.println("Waiting Queue doesn't contain " + qName);
        }

        // Get the element at the front of the Queue without removing it using element()
        // The element() method throws NoSuchElementException if the Queue is empty
        String firstPersonInTheWaitingQueue = waitingQueue.element();
        System.out.println("First Person in the Waiting Queue (element()) : " + firstPersonInTheWaitingQueue);

        // Get the element at the front of the Queue without removing it using peek()
        // The peek() method is similar to element() except that it returns null if the Queue is empty
        firstPersonInTheWaitingQueue = waitingQueue.peek();
        System.out.println("First Person in the Waiting Queue : " + firstPersonInTheWaitingQueue);

        //
        // Example of  a LinkedList
        //

        System.out.println("\n\nThis begins the Linked List");
        LinkedList<String> enemy = new LinkedList<>();

        // Adding new elements to the end of the LinkedList using add() method.
        enemy.add("Cameron");
        enemy.add("Sterling");
        enemy.add("Issac");
        enemy.add("Jack");

        System.out.println("Initial LinkedList is : " + enemy);

        // Adding an element at the specified position in the LinkedList
        enemy.add(3, "Christian");
        System.out.println("After add(3, \"Christian\") : " + enemy);

        // Adding an element at the beginning of the LinkedList
        enemy.addFirst("Jacob");
        System.out.println("After addFirst(\"Jacob\") : " + enemy);

        // Adding an element at the end of the LinkedList (This method is equivalent to the add() method)
        enemy.addLast("Jill");
        System.out.println("After addLast(\"Jill\") : " + enemy);

        // Adding all the elements from an existing collection to the end of the LinkedList
        List<String> familyEnemy = new ArrayList<>();
        familyEnemy.add("Billy");
        familyEnemy.add("Jon");

        enemy.addAll(familyEnemy);
        System.out.println("After addAll(familyEnemy) : " + enemy);

        // Getting the first element in the LinkedList using getFirst()
        // The getFirst() method throws NoSuchElementException if the LinkedList is empty
        String firstElement = enemy.getFirst();
        System.out.println("Enemy in the first index : " + firstElement);

        // Getting the last element in the LinkedList using getLast()
        // The getLast() method throws NoSuchElementException if the LinkedList is empty
        String lastElement = enemy.getLast();
        System.out.println("Enemy in the last index : " + lastElement);

        // Getting the element at a given position in the LinkedList
        String thirdEnemy = enemy.get(2);
        System.out.println("Enemy in the third index : " + thirdEnemy);

        //
        // Example of a TreeSet
        //

        System.out.println("\n\nThis begins the Tree Set");
        TreeSet<String> sandwich = new TreeSet<>();

        // Adding new elements to a TreeSet
        sandwich.add("Bread");
        sandwich.add("Lettuce");
        sandwich.add("Tomato");
        sandwich.add("Bacon");

        System.out.println("sandwich Set : " + sandwich);

        // Duplicate elements are ignored
        sandwich.add("Lettuce");
        System.out.println("After adding duplicate element \"Lettuce\" : " + sandwich);

        // Not allowed because it's in lowercase.
        sandwich.add("bread");
        System.out.println("After adding \"Bread\" : " + sandwich);

        // Finding the size of a TreeSet
        System.out.println("Number of elements in the TreeSet : " + sandwich.size());

        // Check if an element exists in the TreeSet
        String name = "Bread";
        if (sandwich.contains(name)) {
            System.out.println("TreeSet contains the element : " + name);
        } else {
            System.out.println("TreeSet does not contain the element : " + name);
        }

        // Navigating through the TreeSet
        System.out.println("First element : " + sandwich.first());
        System.out.println("Last element : " + sandwich.last());

        name = "Bacon";
        System.out.println("Element just greater than " + name + " : " + sandwich.higher(name));
        System.out.println("Element just lower than " + name + " : " + sandwich.lower(name));

        //
        // Example of a Tree Map
        //

        System.out.println("\n\nThis begins the Tree Map");
        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(1013, "Cameron");
        students.put(1011, "Sterling");
        students.put(1012, "Issac");
        students.put(1014, "Jack");

        System.out.println("Students map : " + students);

        // Finding the size of a TreeMap
        System.out.println("Total number of students : " + students.size());

        // Check if a given key exists in a TreeMap
        Integer id = 1014;
        if (students.containsKey(id)) {
            // Get the value associated with a given key in a TreeMap
            String desig = students.get(id);
            System.out.println("Employee with id " + id + " : " + desig);
        } else {
            System.out.println("Employee does not exist with id : " + id);
        }

        // Find the first and last entry
        System.out.println("First entry in students map : " + students.firstEntry());
        System.out.println("Last entry in students map : " + students.lastEntry());

        // Find the entry whose key is just less than the given key
        Map.Entry<Integer, String> studentJustBelow = students.lowerEntry(1012);
        System.out.println("Employee just below id 841002 : " + studentJustBelow);

        // Find the entry whose key is just higher than the given key
        Map.Entry<Integer, String> studentJustAbove = students.higherEntry(1012);
        System.out.println("Employee just above id 841002 : " + studentJustAbove);


    }

}