package DesignPatterns.AbstractFactoryPattern;

public class TextFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "name='" + name + '\'' +
                '}';
    }
}
