package com.example;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Directory directory1 = new Directory("Folder1");
        directory1.addComponent(file1);

        Directory mainDirectory = new Directory("MainFolder");
        mainDirectory.addComponent(directory1);
        mainDirectory.addComponent(file2);

        mainDirectory.showDetails();
    }
}