package hashset;

public class Main {
    public static void main(String[] args) {
        Languages languages = new Languages();

        languages.addLanguage("Java");
        languages.addLanguage("JavaScript");
        languages.addLanguage("Python");
        languages.addLanguage("Ruby");
        /*
         * Try adding the same language, nothing will happen because HashSet do not allow duplicates.
         */
        languages.addLanguage("Python");

        /*
         * Try removing language which does not exist, nothing will happen because HashSet do not throw OutOfBoundException
         * when the item does not exist.
         */
        languages.removeLanguage("Scala");

        System.out.println(languages);

        MyLanguages myLanguages = new MyLanguages();
        YourLanguages yourLanguages = new YourLanguages();

        BothLanguages bothLanguages = new BothLanguages(myLanguages, yourLanguages);
        System.out.println(bothLanguages);

        AllLanguages allLanguages = new AllLanguages(myLanguages, yourLanguages);
        System.out.println(allLanguages);
    }
}
