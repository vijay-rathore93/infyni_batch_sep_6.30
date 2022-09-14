package SetExamples;

import java.util.*;

public class SetUnderstanding {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        Set<Integer> set = new HashSet<>(list);
        //Set capacity is 16, load factor .75 or 75%.
        Set<Integer> set2 = new HashSet<>(20, 100);
        HashSet<Integer> set1 = new HashSet<>();

        //insertElementHashSet();

       // insertElementLinkedHashSet();

        insertElementTreeSet();

        // public int size()
        // public boolean isEmpty()
        // public boolean contains(Object o)
        // public boolean add(E e)
        // public boolean remove(Object o)
        // public void clear()

    }


    private static void insertElementHashSet() {
        Set<Integer> set = new HashSet<>();
        boolean status = set.add(1);
        System.out.println(status);
        set.add(2);
        set.add(3);
        boolean status1 = set.add(1);

        for (Integer value : set
        ) {
            System.out.println(value);
        }

        System.out.println(status1);
        System.out.println("10 element contained in set::" + set.contains(10));

        System.out.println("10 element contained in set::" + set.contains(1));


    }

    private static void insertElementLinkedHashSet() {
        Set<Integer> set = new LinkedHashSet<>();
        boolean status = set.add(1);
        System.out.println(status);
        set.add(2);
        set.add(3);
        boolean status1 = set.add(1);

        for (Integer value : set
        ) {
            System.out.println(value);
        }


    }


    private static void insertElementTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(0);


        for (Integer value : set
        ) {
            System.out.println(value);
        }
        TreeSet<Integer> res = (TreeSet<Integer>)set.descendingSet();

        for (Integer value : res
        ) {
            System.out.println(value);
        }

    }
}
