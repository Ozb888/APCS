public class Driver {
        public static void main(String[] args) {
                Coin mine = new Coin();
                Coin yours = new Coin("quarter");
                Coin wayne = new Coin("dollar");

                System.out.println("mine: " + mine.name + " -- " + mine.upFace);
                System.out.println("yours: " + yours.name + " -- " + yours.upFace);
                System.out.println("wayne: " + wayne.name + " -- " + wayne.upFace);

                System.out.println("\nBegin flipping");

                System.out.print("mine: ");
                mine.flip();
                System.out.print("yours: ");
                yours.flip();
                System.out.print("wayne: ");
                wayne.flip();

                System.out.println("\nComparing mine");
                mine.equals();

                System.out.println("\nLooping");
                mine.headsLimit();
                mine.matchLimit();
                mine.matchYears();
        }
}

/*
Oscar Breen
APCS
HW23 -- What Does Equality Look Like? -- simulating coin flip with bias
2021-10-25
time spent: 1 hr
*/

import java.util.Random;

public class Coin {

        int value, flipCount, headsCount, tailsCount, matchCount;
        double bias;
        String name,  upFace;

        public Coin() {
                bias = 0.5;
                upFace = "heads";
        }
        public void reset (String s, double d) {
        flipsCtr = 0;
        tailsCtr = 0;
        headsCtr = 0;
        UpFace = s;
        bias = d;
}

        public Coin(String denomination) {
                bias = 0.5;
                upFace = "heads";

                if (denomination == "penny" || denomination == "nickel" || denomination == "dime" || denomination == "quarter" || denomination == "dollar" || denomination == "tiffany") {
                        name = denomination;
                }

        }

        public Coin(String denomination, String face) {
                bias = 0.5;

                if (face == "heads" || upFace == "tails") {
                        upFace = face;
                }

                if (denomination == "penny" || denomination == "nickel" || denomination == "dime" || denomination == "quarter" || denomination == "dollar" || denomination == "tiffany") {
                        name = denomination;
                }
        }

        public void flip() {
                Random rand = new Random();
                double flip = rand.nextDouble();
                if (flip > bias) {
                                                                                                                                                                                         1,2           Top

                if (flip > bias) {
                        upFace = "tails";
                        tailsCtr +=1;
                } else {
                        upFace = "heads";
                        headsCtr +=1;
                }

                System.out.println(name + " -- " + upFace);
        }

        public void equals() {
                Coin tiffany = new Coin("tiffany");
                tiffany.flip();

                if (tiffany.upFace == upFace) {
                        System.out.println("Match. Firestarter you may be.");
                        matchCount += 1;
                } else {
                        System.out.println("No match. Firestarter you can not be.");
                }
        }

        public void assignValue() {
                if (name == "penny") {
                        value = 1;
                } else if (name == "nickel") {
                        value = 5;
                } else if (name == "dime") {
                        value = 10;
                } else if (name == "quarter") {
                        value = 25;
                } else if (name == "dollar") {
                        value = 100;
                }
        }

        public void headsLimit(int threshold) {
                while (headsCount <= threshold) {
                        flip();
                }
        }

        public void matchLimit(int threshold) {
                while (matchLimit <= threshold) {
                        equals();
                }
        }

                                                                                                                                                                                         54,2-16       88%

        public void headsLimit(int threshold) {
                while (headsCount <= threshold) {
                        flip();
                }
        }

        public void matchLimit(int threshold) {
                while (matchLimit <= threshold) {
                        equals();
                }
        }

        public void matchYears() {
                while (matchCount & 2005 != 0 || matchCount 65536) {
                        equals();
                }
        }
}
                                                                                                                                                                                         108,1         Bot

