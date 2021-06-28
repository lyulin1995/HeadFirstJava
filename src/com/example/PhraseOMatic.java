package com.example;

public class PhraseOMatic {
    public static void main (String[] args) {
        String[] wordListOne = {
                "24/7",
                "multi-Tier",
                "30,000 foot",
                "B-to-B",
                "win-win",
                "front-end",
                "web-based",
                "pervasive",
                "smart",
                "six-sigma",
                "critical-path",
                "dynamic",
                "Internet-connected"
        };

        String[] wordListTwo = {
                "empowered",
                "powered",
                "sticky",
                "value-added",
                "oriented",
                "centric",
                "distributed",
                "clustered",
                "branded",
                "outside-the-box",
                "positioned",
                "networked",
                "focused",
                "leveraged",
                "aligned",
                "targeted",
                "shared",
                "cooperative",
                "accelerated"
        };

        String[] wordListThree = {
                "tipping point",
                "solution",
                "process",
                "architecture",
                "core competency",
                "strategy",
                "mindshare",
                "portal",
                "space",
                "vision",
                "paradigm",
                "mission"
        };
        // find out how many words  are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // now build a phrase
        String phase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // print out the phrase
        System.out.println("what we need is a " + phase);
    }
}
