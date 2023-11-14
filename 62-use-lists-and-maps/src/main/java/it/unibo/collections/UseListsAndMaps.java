package it.unibo.collections;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {

    private static final int  ELEMENT = 100000;
    private UseListsAndMaps() {
    }

    private static void printForEach(List<Integer> numberList){
        for(Integer element: numberList){
            System.out.println(element);
        }
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        List<Integer> numberList = new ArrayList<Integer>();
        long timeArray = System.nanoTime();

        for(int i = 0; i <ELEMENT; i++){
            int numbetToAdd = 1000 + i;
            numberList.add(Integer.valueOf(numbetToAdd));
        }
    
        timeArray = System.nanoTime() - timeArray;
        final var millis = TimeUnit.NANOSECONDS.toMillis(timeArray);
        System.out.println(// NOPMD
            "Add "
                + numberList.size()
                + " into an arrayList took "
                + timeArray
                + "ns ("
                + millis
                + "ms)"
        );
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        long timeLinked = System.nanoTime();
        List<Integer> numberLinkedList = new LinkedList<Integer>(numberList);

        timeLinked = System.nanoTime() - timeLinked;
        final var millisLink = TimeUnit.NANOSECONDS.toMillis(timeLinked);
        System.out.println(// NOPMD
                "Add "
                + numberList.size()
                + " into an arrayList took "
                + timeLinked
                + "ns ("
                + millisLink
                + "ms)"
        );
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        int tmp = numberList.get(numberList.size()-1);
        numberList.set(numberList.size()-1,numberList.get(0));
        numberList.set(0,tmp);

        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        //printForEach(numberList);

        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */

        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        timeArray = System.nanoTime();
        for(int j=0; j < 1000; j++){
            System.out.println(numberList.get(( numberList.size()/2 ) + j));
        }
        timeArray = System.nanoTime() - timeArray;
        final var milliArray = TimeUnit.NANOSECONDS.toMillis(timeArray);

        timeLinked = System.nanoTime();
        for(int j=0; j < 1000; j++){
            System.out.println(numberLinkedList.get(( numberList.size()/2 ) + j));
        }
        timeLinked = System.nanoTime() - timeLinked;
        final var milliLinked = TimeUnit.NANOSECONDS.toMillis(timeArray);
        System.out.println(// NOPMD
            "to read 1000 into the middle to an ArrayList took "
                + timeArray
                + "ns ("
                + milliArray
                + "ms)"
        );
        System.out.println(// NOPMD
            "to read 1000 into the middle to an LinkedList took "
                + timeArray
                + "ns ("
                + milliLinked
                + "ms)"
        );
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         *
         * Africa -> 1,110,635,000
         *
         * Americas -> 972,005,000
         *
         * Antarctica -> 0
         *
         * Asia -> 4,298,723,000
         *
         * Europe -> 742,452,000
         *
         * Oceania -> 38,304,000
         */
        Map<String,BigInteger> worldMap = new HashMap<String,BigInteger>();
        worldMap.put("Africa", BigInteger.valueOf(1110635000));
        worldMap.put("America", BigInteger.valueOf(972005000));
        worldMap.put("Antartica", BigInteger.valueOf(0));
        worldMap.put("Asia", BigInteger.valueOf(Long.parseLong("4298723000")));
        worldMap.put("Europa", BigInteger.valueOf(710635000));
        worldMap.put("Oceania", BigInteger.valueOf(310635000));
    
        

        for(BigInteger elements: worldMap.values()){
            population = population + Long.longValue(elements);
        }

    
        /*
         * 8) Compute the population of the world
         */
    }
}