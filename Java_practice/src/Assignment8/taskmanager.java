package Assignment8;

import java.util.*;
public class taskmanager{
    public static void main(String[] args){
        Queue<String> tasks=new LinkedList<>();
        tasks.add("Task1");
        tasks.add("Task2");
        tasks.add("Task3");
        System.out.println("Next:"+tasks.peek());
        tasks.poll();
        System.out.println(tasks);
    }
}
