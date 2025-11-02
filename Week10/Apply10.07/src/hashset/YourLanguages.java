package hashset;

public class YourLanguages extends Languages {
    YourLanguages() {
        super();
        this.addLanguage("Java");
        this.addLanguage("Python");
        this.addLanguage("PHP");
    }

    @Override
    public String getClassIdentifier() {
        return "Your Languages";
    }
}
