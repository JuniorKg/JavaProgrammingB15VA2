package OfficeHours;

import java.util.*;

public class OfficeHour15 {
        public static void main(String[] args) {
        /*
            Under List Interface:
            - ArrayList (indexes, faster to read, slower when we
            do manipulations(remove or add elements))
            - Vector (same as ArrayList, but thread safe)
                - Stack (Last in First out (like a stack of paper))
            - LinkedList (node (each element reference to previous
            and next element in the list))
            (performance-sensitive, memory allocation)
            [2, 5, 3] -> [2, 3]
            [2] [5] [3]
         */
        /*
            Set Interface: (contain only unique values)
            HashSet: no indexes - faster because it is using hashing
            (it does not keep an order), allows 1 null
            TreeSet: sorted set - no nulls
            LinkedHashSet: keeps the order
         */
            HashSet <String> hashSet = new HashSet<>();
            TreeSet <String> treeSet = new TreeSet<>();
            LinkedHashSet <String> linkedHashSet = new LinkedHashSet<>();
            for (String each : Arrays.asList("Value5", "Value1", "Value3")){
                hashSet.add(each);
                treeSet.add(each);
                linkedHashSet.add(each);
            }
            System.out.println("hashset: " + hashSet);
            System.out.println("treeset: " + treeSet);
            System.out.println("LinkedHashSet: " + linkedHashSet);

            Iterator<String> iteratorSet = hashSet.iterator();
            while (iteratorSet.hasNext()){
                System.out.print(iteratorSet.next() + " ");
            }

           ArrayList <Integer> dropDown = new ArrayList<>();

            dropDown.add(1);
            dropDown.add(2);
            dropDown.add(3);
            dropDown.add(4);
            dropDown.add(5);

            //[1,2,3,4,5]

            HashSet <Integer> optionSet = new HashSet<>(dropDown);
            System.out.println("List: " + dropDown);
            System.out.println("Option Set : " + optionSet);

            if (optionSet.size() == dropDown.size()){
                System.out.println("Expected is the same as actual");
            } else {
                System.out.println("Options contains duplicates");
            }

            //====================================================

            /**
             * PriorityQueue  - First in first out
             * can accept duplicates, does not have index
             * --ArrayDequeue - special in adding and removing
             *
             */

            PriorityQueue<String> priorityQueue = new PriorityQueue<>();
            priorityQueue.add("John");
            priorityQueue.add("Kate");
            priorityQueue.add("Tom");

            System.out.println("Queue " + priorityQueue);
            System.out.println(priorityQueue.peek());
            //peeking (.peek()) - it will check and return the first in queue
            System.out.println("Queue after peek: " + priorityQueue);
            System.out.println(priorityQueue.poll());
            System.out.println(priorityQueue);
            //polling will return the first value in a queue and removed it

            ArrayDeque <String> deque = new ArrayDeque<>();


        }
}
