package org.example;

public abstract class FileSystemObject {

    private Folder root;
    private final String name;

    public FileSystemObject(String name) {
        this.name = name;
    }

    public String getPath() {

        return root != null ? root.getPath() + "/" + name : name;
    }

    public FileSystemObject getParent() {
        return root;
    }

    public abstract long getSize();

    public abstract void print(String upperPath);

    public String getName() {
        return name;
    }

    public boolean isDirectory() {

        return this instanceof Folder;
    }

    public void setRoot(Folder root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }


}
