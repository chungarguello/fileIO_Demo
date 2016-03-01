package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File("data1.txt");
        Scanner input = new Scanner(new File("data1.txt"));

        while (input.hasNext()){
            try {
                double grade = input.nextDouble();
                System.out.println("grade: " + grade);
            } catch (Exception e) {
                //options to spit out message or skip exception with a SOUT..
                System.out.println("Fuck OFF");

                //flushes the buffer
                input.next();
            }
        }
    }
}
