package com.example;
import java.io.File;

public class App 
{
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        System.out.println("Directory tree starting from " + currentDir + ":");
        printDirectoryTree(new File(currentDir), "");
    }

    public static void printDirectoryTree(File folder, String prefix) {
        for (File file : folder.listFiles()) {
            System.out.println(prefix + file.getName());
            if (file.isDirectory()) {
                printDirectoryTree(file, prefix + "\t");
            }
        }
    }
}
