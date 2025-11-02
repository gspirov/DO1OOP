package hashset;

public class MyLanguages extends Languages {
    MyLanguages() {
        super();
        this.addLanguage("Java");
        this.addLanguage("Python");
        this.addLanguage("C#");
    }

    @Override
    public String getClassIdentifier() {
        return "My Languages";
    }
}
