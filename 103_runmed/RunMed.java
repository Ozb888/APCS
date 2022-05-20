/*
Team Pom Pom: Max Schneider, Perry Huang, Oscar Breen
APCS
HW103 -- Erica's Friends, Hugo, and The One in the Middle
2022-05-18
time spent: 1 hr

DISCO
Using keys made it much easier to visualize and make an algo.

QCC
Should there be a helper method called balance to balance the heaps or should that be in add?
Which one is better design?

ALGO for getMedian
If the sum of the sizes of the two heaps are even, then return the sum of the greatest value in lilVals
and the least value in bigVals divided by two. Otherwise return the least value in bigVals. 

*/
public class RunMed {

    ALHeapMax lilVals;
    ALHeapMin bigVals;

    public RunMed() {
        lilVals = new ALHeapMax();
        bigVals = new ALHeapMin();
    }

    public void balance() {

        if (lilVals.size() > bigVals.size()) {
            bigVals.add(lilVals.removeMax());
        }
        else if (bigVals.size() > lilVals.size() + 1) {
            lilVals.add(bigVals.removeMin());
        }

    }

    public double getMedian() {
        if ((lilVals.size() + bigVals.size()) % 2 == 0) {
            return ((double)lilVals.peekMax() + bigVals.peekMin()) / 2;
        }
        else {
            return (double)lilVals.peekMax();
        }
    }

    public void add(Integer newVal) {
        if (bigVals.isEmpty()) {
            bigVals.add(newVal);
            return;
        }
        if (newVal > bigVals.peekMin()) {
            bigVals.add(newVal);
        }
        else {
            lilVals.add(newVal);
        }
        balance();
    }

    public static void main(String[] args) {

        RunMed perry = new RunMed();
        perry.add(6);
        perry.add(5);
        perry.getMedian();
        /*
        perry.add();
        perry.add();
        perry.add();
        perry.add();
        perry.add();
        perry.add();
        perry.add();
        perry.add();
        */


    }
}