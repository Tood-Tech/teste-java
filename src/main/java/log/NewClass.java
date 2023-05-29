/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log;

/**
 *
 * @author aleex
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;

public class NewClass {
    public static void main(String[] args) {
        PrintWriter printWriter = null;
        String textToBeWritten = "Hello";
        try {
            printWriter = new PrintWriter("C:\\\\Users\\\\aleex\\\\OneDrive\\\\Área de Trabalho\\\\writerFile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Unable to locate the fileName: " + e.getMessage());
        }
        Objects.requireNonNull(printWriter).println(textToBeWritten);
        printWriter.close();
    }
}