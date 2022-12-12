package org.example;

public abstract class FileSystemObject {

    private Directory root;
    private String name;

    public FileSystemObject(String name) {
        if (isValidFileName(name)) {
            this.name = name;
        }
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

        return this instanceof Directory;
    }

    public void setRoot(Directory root) {
        this.root = root;
    }

    public boolean isValidFileName(String fileName) {
        if (fileName == null && !(fileName.length() <= 256)) {
            throw new IllegalArgumentException("Maximum length of name 256 characters");
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return getName() + "  (" + getSize() + " bytes) ";
    }


}
