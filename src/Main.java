
public class Main {
    public static void main(String[] args) {
        Pascal pascal = new Pascal();

        System.out.println("---- n = 5 ----");
        long start = System.nanoTime();
        System.out.println("iterative: " + pascal.pascalRowSumIterative(5));
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("iterative time: " + duration);


        long start2 = System.nanoTime();
        System.out.println("recursive: " + pascal.pascalRowSumRecursive(5));
        long end2 = System.nanoTime();
        long duration2 = end2 - start2;
        System.out.println("recursive time: " + duration2);

        System.out.println("---- n = 10 ----");
        long start3 = System.nanoTime();
        System.out.println("iterative: " + pascal.pascalRowSumIterative(10));
        long end3 = System.nanoTime();
        long duration3 = end3 - start3;
        System.out.println("iterative time: " + duration3);


        long start4 = System.nanoTime();
        System.out.println("recursive: " + pascal.pascalRowSumRecursive(10));
        long end4 = System.nanoTime();
        long duration4 = end4 - start4;
        System.out.println("recursive time: " + duration4);

        System.out.println("---- n = 15 ----");
        long start5 = System.nanoTime();
        System.out.println("iterative: " + pascal.pascalRowSumIterative(15));
        long end5 = System.nanoTime();
        long duration5 = end5 - start5;
        System.out.println("iterative time: " + duration5);


        long start6 = System.nanoTime();
        System.out.println("recursive: " + pascal.pascalRowSumRecursive(15));
        long end6 = System.nanoTime();
        long duration6 = end6 - start6;
        System.out.println("recursive time: " + duration6);

        System.out.println("---- n = 20 ----");
        long start7 = System.nanoTime();
        System.out.println("iterative: " + pascal.pascalRowSumIterative(20));
        long end7 = System.nanoTime();
        long duration7 = end7 - start7;
        System.out.println("iterative time: " + duration7);


        long start8 = System.nanoTime();
        System.out.println("recursive: " + pascal.pascalRowSumRecursive(20));
        long end8 = System.nanoTime();
        long duration8 = end8 - start8;
        System.out.println("recursive time: " + duration8);

        System.out.println("---- n = 25 ----");
        long start9 = System.nanoTime();
        System.out.println("iterative: " + pascal.pascalRowSumIterative(25));
        long end9 = System.nanoTime();
        long duration9 = end9 - start9;
        System.out.println("iterative time: " + duration9);


        long start10 = System.nanoTime();
        System.out.println("recursive: " + pascal.pascalRowSumRecursive(25));
        long end10 = System.nanoTime();
        long duration10 = end10 - start10;
        System.out.println("recursive time: " + duration10);

        System.out.println("---- n = 30 ----");
        long start11 = System.nanoTime();
        System.out.println("iterative: " + pascal.pascalRowSumIterative(30));
        long end11 = System.nanoTime();
        long duration11 = end11 - start11;
        System.out.println("iterative time: " + duration11);


        long start12 = System.nanoTime();
        System.out.println("recursive: " + pascal.pascalRowSumRecursive(30));
        long end12 = System.nanoTime();
        long duration12 = end12 - start12;
        System.out.println("recursive time: " + duration12);
    }
}