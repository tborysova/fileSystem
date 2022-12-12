package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating a file system...");

        Folder binDirectory = new Folder("bin");
        File lsFile = new File("ls");
        binDirectory.add(lsFile);
        File mkdir = new File("mkdir");
        binDirectory.add(mkdir);

        Folder workDirectory = new Folder("english");
        File homework = new File("homework.txt");
        homework.setContent("english homework");
        workDirectory.add(homework);

        Folder studyDirectory = new Folder("books");
        File book = new File("book.pdf");
        book.setContent("java book");
        studyDirectory.add(book);

        Folder homeDir = new Folder("home");
        homeDir.add(workDirectory);
        homeDir.add(studyDirectory);

        Folder rootDir = new Folder("root");
        rootDir.add(homeDir);
        rootDir.add(binDirectory);

        rootDir.print("");
    }
}