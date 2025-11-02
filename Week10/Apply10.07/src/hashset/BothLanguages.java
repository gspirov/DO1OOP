package hashset;

public class BothLanguages extends Languages {
    BothLanguages(MyLanguages myLanguages, YourLanguages yourLanguages) {
        super();
        this.languages.addAll(myLanguages.languages);
        this.languages.retainAll(yourLanguages.languages);
    }

    @Override
    public String getClassIdentifier() {
        return "Both Languages";
    }
}
