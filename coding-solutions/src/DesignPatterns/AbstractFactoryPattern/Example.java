package DesignPatterns.AbstractFactoryPattern;

public class Example {

    public static class FileFactory {

        private FileFactory() {}

        public TextFile createTextFile() {
            return new TextFile();
        }

        public VideoFile createVideoFile() {
            return new VideoFile();
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
        TextFile doc = FileFactory.getInstance().createTextFile();
        VideoFile video = FileFactory.getInstance().createVideoFile();

        System.out.println(doc.toString());
        System.out.println(video.toString());
    }
}
