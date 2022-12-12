package org.example;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemObject {

    private final List<FileSystemObject> listOfItems;

    public Directory(String path) {
        super(path);
        listOfItems = new ArrayList<>();
    }

    @Override
    public long getSize() {
        long size = 0;
        for (FileSystemObject node : listOfItems) {
            size += node.getSize();
        }
        return size;
    }

    @Override
    public void print(String upperPath) {
        System.out.println(upperPath + "/" + this);
        listOfItems.forEach(item -> item.print(upperPath + "/" + super.getName()));
    }

    public void add(FileSystemObject item) {
        if (item == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        item.setRoot(this);
        listOfItems.add(item);
    }

}
