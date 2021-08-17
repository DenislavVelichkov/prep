package DesignPatterns.AbstractFactoryPattern;

public class VideoFile {
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VideoFile{" +
                "name='" + name + '\'' +
                '}';
    }
}
