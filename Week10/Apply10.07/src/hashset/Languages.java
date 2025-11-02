package hashset;

import java.util.HashSet;

public class Languages {
    protected HashSet<String> languages;

    public Languages() {
        this.languages = new HashSet<>();
    }

    public void addLanguage(String newLanguage) {
        this.languages.add(newLanguage);
    }

    public void removeLanguage(String languageToRemove) {
        this.languages.remove(languageToRemove);
    }

    public void clearAllLanguages() {
        this.languages.clear();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(this.getClassIdentifier() + "\n---------\n");
        for (String language : this.languages) {
            output.append(language).append("\n");
        }
        return output.toString();
    }

    protected String getClassIdentifier() {
        return "Languages";
    }
}
