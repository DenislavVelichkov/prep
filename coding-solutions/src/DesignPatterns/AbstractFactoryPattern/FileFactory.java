package DesignPatterns.AbstractFactoryPattern;

public interface FileFactory {

    TextFile createTextFile();

    VideoFile createVideoFile();

}
