/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chandrikadeb
 */
import java.io.*;
public class TextFileWrite 
{
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("AssignSoln.txt", true);
            writer.write("Hello World");
            writer.write("This is my assignment!\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
