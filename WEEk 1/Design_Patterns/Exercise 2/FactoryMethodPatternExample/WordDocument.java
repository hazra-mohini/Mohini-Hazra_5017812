package FactoryMethodPatternExample;

// import javax.swing.text.Document;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word.");
    }

    @Override
    public void close() {
        System.out.println("Closing word.");
    }
}
