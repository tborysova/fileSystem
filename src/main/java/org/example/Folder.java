package org.example;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemObject {

    private final List<FileSystemObject> nodes;

    public Folder(String path) {
        super(path);
        nodes = new ArrayList<>();
    }

    @Override
    public long getSize() {
        long size = 0;
        for (FileSystemObject node : nodes) {
            size += node.getSize();
        }
        return size;
    }

    @Override
    public void print(String upperPath) {
        System.out.println(upperPath + "/" + this);
        nodes.forEach(node -> node.print(upperPath + "/" + super.getName()));
    }

    public void add(FileSystemObject node) {
        node.setRoot(this);
        nodes.add(node);
    }

}
