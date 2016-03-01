package p3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/*
 * Created by carguell on 3/1/2016.
 * write to a file in append mode
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //open the file for writing in append mode
        //FileOutputStream file =;
        try (PrintWriter output = new PrintWriter( new FileOutputStream("out1.txt", true))){

        for (int i = 1; i < 101; i+=2)
            output.println(i);
        }
    }
}
