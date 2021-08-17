package DesignPatterns.AbstractFactoryPattern;

public class VideoFile {
    private String name;

    public VideoFile() {
        this.name = "I'm a video file!";
    }

    @Override
    public String toString() {
        return "VideoFile{" +
                "name='" + name + '\'' +
                '}';
    }
}
