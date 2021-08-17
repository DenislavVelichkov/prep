package DesignPatterns.AbstractFactoryPattern;

public class Example {

    public static class ExampleFactory implements FileFactory {

        private ExampleFactory() {
        }

        @Override
        public TextFile createTextFile() {
            return new TextFile();
        }

        @Override
        public VideoFile createVideoFile() {
            return new VideoFile();
        }

        //Lazy initialization of the factory class instance according to best practices
        private static class ExampleFactoryInstanceGenerator {
            private static final ExampleFactory INSTANCE = new ExampleFactory();
        }

        public static ExampleFactory getInstance() {
            return ExampleFactoryInstanceGenerator.INSTANCE;
        }

    }

    public static void main(String[] args) {
        TextFile doc = ExampleFactory.getInstance().createTextFile();
        VideoFile video = ExampleFactory.getInstance().createVideoFile();

        System.out.println(doc.toString());
        System.out.println(video.toString());
    }
}
