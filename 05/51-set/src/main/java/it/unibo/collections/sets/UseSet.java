package it.unibo.collections.sets;

import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */

        final Set<String> set = new TreeSet<>();

        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */

        for (int i = 1; i < ELEMS; i++) {
            set.add(Integer.toString(i));
        }
        
        /*
         * 3) Prints its content
         */

        System.out.println(set);
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */

        final Iterator<String> iter1 = set.iterator();
        while (iter1.hasNext()) {
            if (Integer.parseInt(iter1.next()) % 3 == 0) {
                iter1.remove();
            }
        }

        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        System.out.print("[ ");
        for (final String s: set) {
            System.out.print (s + " ");
        }
        System.out.println("]");

        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        
        boolean allNumbersAreEven = true;
        final Iterator<String> iter2 = set.iterator();
        while (iter2.hasNext() && allNumbersAreEven) {
            if (Integer.parseInt(iter2.next()) % 2 != 0) {
                allNumbersAreEven = false;
            }
        }
        System.out.println(allNumbersAreEven ? "All Even." : "Not All Even.");
    }
}
