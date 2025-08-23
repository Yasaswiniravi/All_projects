package collection_framework;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> originalList = new LinkedList<>();
        originalList.add(10);
        originalList.add(20);
        originalList.add(30);

		LinkedList<Integer> clonedList = (LinkedList<Integer>) originalList.clone();

        System.out.println("Original LinkedList: " + originalList);

        System.out.println("Cloned LinkedList: " + clonedList);
    }
}