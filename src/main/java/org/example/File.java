package org.example;

public class File extends FileSystemObject {

    private String content;

    public File(String name, String content) {
        super(name);
        this.content = content;
    }

    public File(String name) {
        super(name);
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public long getSize() {
        if (content != null) {
            return content.getBytes().length;
        }

        return 0;
    }

    @Override
    public void print(String upperPath) {
        System.out.println(upperPath + "/" + this);
    }
}
