package DesignPatterns.AbstractFactoryPattern;

public class Example {

    public static class FileFactory {

        private FileFactory() {}

        public TextFile createTextFile(String name) {
            return new TextFile(name);
        }

        public VideoFile createVideoFile(String name) {
            return new VideoFile(name);
        }

        //Lazy initialization of the factory class instance according to best practices
        private static class ExampleFactoryInstanceGenerator {
            private static final FileFactory INSTANCE = new FileFactory();
        }

        public static FileFactory getInstance() {
            return ExampleFactoryInstanceGenerator.INSTANCE;
        }

    }

    public static void main(String[] args) {
        TextFile doc = FileFactory.getInstance().createTextFile("I'm a text file!");
        VideoFile video = FileFactory.getInstance().createVideoFile("I'm a video file!");

        System.out.println(doc.toString());
        System.out.println(video.toString());
    }
}
