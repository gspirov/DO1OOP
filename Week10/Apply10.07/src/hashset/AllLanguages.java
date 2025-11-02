package hashset;

public class AllLanguages extends Languages {
    AllLanguages(MyLanguages myLanguages, YourLanguages yourLanguages) {
        super();
        this.languages.addAll(myLanguages.languages);
        this.languages.addAll(yourLanguages.languages);
    }

    @Override
    public String getClassIdentifier() {
        return "All Languages";
    }
}
