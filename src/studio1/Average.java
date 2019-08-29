package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args)
    {
        ArgsProcessor ap = new ArgsProcessor(args);
        double x = ap.nextInt("The first of two integers to be averaged?");
        double y = ap.nextInt("The second of two integers to be averaged?");

        double avg = ((x+y)/2);
        System.out.println("The average is " + avg + ".");
    }
}
