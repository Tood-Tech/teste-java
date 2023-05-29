/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pipi;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Logger;


public class LogJava {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("C:\\\\Users\\\\aleex\\\\OneDrive\\\\Área de Trabalho\\\\writerFile.txt", true)) {
            fileWriter.write(LocalDateTime.now() + " - Log de informação\n");
            fileWriter.write(LocalDateTime.now() + " - Log de aviso\n");
            fileWriter.write(LocalDateTime.now() + " - Log de erro grave\n");
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo de log");
        }
    }}

    