public class Lehrveranstaltung {

    // Datenfelder
    private String titel;
    private Dozierender dozierender;

    private Studierender[] studierende = new Studierender[100];
    private int veranstaltungsgröße = 0;

    private Vorlesungsstunde[] vorlesungsstunden = new Vorlesungsstunde[100];
    private int anzahlVorlesungsstunden = 0;

    private Praktikumsstunde[] praktikumsstunden = new Praktikumsstunde[100];
    private int anzahlPraktikumsstunden = 0;

    // Getter und Setter für Titel und Dozent
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public Dozierender getDozierender() {
        return dozierender;
    }

    public void setDozierender(Dozierender dozierender) {
        this.dozierender = dozierender;
    }

    // Getter und Setter für Studierende, bzw. Studierende Hinzufügen und entfernen
    public Studierender getStudent(int index) {
        return studierende[index - 1];
    }

    public Studierender[] getStudierende() {
        return studierende;
    }

    public void newStudierender(Studierender student) {
        studierende[veranstaltungsgröße] = student;
        veranstaltungsgröße++;
    }

    public void studentEntfernen(Studierender student) {
        for (int i = 0; i < veranstaltungsgröße; i++) {
            if (this.studierende[i].getMatrikelnummer() == student.getMatrikelnummer()) {
                studierende[i] = null;
                for (int j = i; j > veranstaltungsgröße; j++) {
                    studierende[j] = studierende[j + 1];
                }
                veranstaltungsgröße--;
                break;
            }
        }
    }

    // Getter und Setter rings um Vorlesungsstunden
    public Vorlesungsstunde[] getVorlesungsstunden() {
        return vorlesungsstunden;
    }

    public Vorlesungsstunde getVorlesungsstunden(int index) {
        return vorlesungsstunden[index - 1];
    }

    public void setVorlesungsstunden(Vorlesungsstunde vorlesungsstunden) {
        this.vorlesungsstunden[anzahlVorlesungsstunden] = vorlesungsstunden;
        anzahlVorlesungsstunden++;
    }

    // Getter und Setter rings um Praktikumsstunden
    public Praktikumsstunde[] getPraktikumsstunden() {
        return praktikumsstunden;
    }

    public Praktikumsstunde getPraktikumsstunde(int index) {
        return praktikumsstunden[index - 1];
    }

    public void setPraktikumsstunden(Praktikumsstunde praktikumsstunden) {
        this.praktikumsstunden[anzahlPraktikumsstunden] = praktikumsstunden;
        anzahlPraktikumsstunden++;
    }

    // Ausgabe
    public void detaisAnzeige() {
        System.out.print("Titel: ");
        System.out.println(titel);
        System.out.print("Dozent: ");
        System.out.println(dozierender.getName());
        System.out.print("Veranstaltungsgröße: ");
        System.out.println(veranstaltungsgröße);
        System.out.print("Anzahl der Praktikumsstunden: ");
        System.out.println(anzahlPraktikumsstunden);
        System.out.print("Anzahl der Vorlesungsstunden: ");
        System.out.println(anzahlVorlesungsstunden);
        System.out.println("Teilnehmer");
        for (int i = 0; i < veranstaltungsgröße; i++) {
            if (studierende[i] != null) {
                System.out.println(studierende[i] + " ");
            }
        }
    }

    // Lehrer Konstruktor
    public Lehrveranstaltung() {

    }

    // Standardkonstruktor
    public Lehrveranstaltung(String titel, int veranstaltungsgröße, int anzahlPraktikumsstunden,
            int anzahlVorlesungsstunden) {
        this.titel = titel;
        this.veranstaltungsgröße = veranstaltungsgröße;
        this.anzahlPraktikumsstunden = anzahlPraktikumsstunden;
        this.anzahlVorlesungsstunden = anzahlVorlesungsstunden;
    }
}
