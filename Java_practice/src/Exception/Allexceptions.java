package Exception;

import java.util.*;

public class Allexceptions{
    public static void main(String[] args) {
        try {
            // 1. NullPointerException
            String str = null;
            System.out.println("Length: " + str.length());

            // 2. ClassCastException
            Object obj = "Hello";
            Integer num = (Integer) obj;
            System.out.println("Number: " + num);

            // 3.  ClassNotFoundException
            Class.forName("com.example.NonExistentClass");

            // 4. IllegalArgumentException
            printSquare(-5);

            // 5. NumberFormatException
            String invalid = "abc";
            int val = Integer.parseInt(invalid);
            System.out.println("Parsed int: " + val);

            // 6. UnsupportedOperationException
            List<String> immutableList = List.of("A", "B");
            immutableList.add("C"); 
            
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        } catch (NumberFormatException e) { 
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught UnsupportedOperationException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void printSquare(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        System.out.println("Square: " + (num * num));
    }
}
