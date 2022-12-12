package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating a file system...");

        Directory bin = new Directory("bin");
        File lsFile = new File("ls");
        bin.add(lsFile);
        File mkdir = new File("mkdir");
        bin.add(mkdir);

        Directory work = new Directory("english");
        File homework = new File("homework.txt");
        homework.setContent("english homework");
        work.add(homework);

        Directory study = new Directory("books");
        File book = new File("book.pdf");
        book.setContent("java book");
        study.add(book);

        Directory home = new Directory("home");
        home.add(work);
        home.add(study);

        Directory rootDir = new Directory("root");
        rootDir.add(home);
        rootDir.add(bin);

        rootDir.print("");
    }
}