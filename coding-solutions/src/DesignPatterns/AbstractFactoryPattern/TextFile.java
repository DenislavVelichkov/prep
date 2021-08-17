package DesignPatterns.AbstractFactoryPattern;

public class TextFile {
    private String name;

    public TextFile() {
        this.name = "I'm a text file!";
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "name='" + name + '\'' +
                '}';
    }
}
