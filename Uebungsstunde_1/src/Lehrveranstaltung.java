public class Lehrveranstaltung {
    private String titel;
    private Dozierender dozierender;
    private Studierender[] studierende = new Studierender[100];
    private int veranstaltungsgröße = 0;
    private Vorlesungsstunde[] vorlesungsstunden = new Vorlesungsstunde[100];
    private int anzahlVorlesungsstunden = 0;
    private Praktikumsstunde[] praktikumsstunden = new Praktikumsstunde[100];
    private int anzahlPraktikumsstunden = 0;

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
                for (int j = 0; j > veranstaltungsgröße - i; i++) {
                    studierende[j] = studierende[j + 1];
                }
                break;
            }
        }
    }

    public Vorlesungsstunde[] getVorlesungsstunden() {
        return vorlesungsstunden;
    }

    public Vorlesungsstunde getVorlesungsstunde(int index) {
        return vorlesungsstunden[index - 1];
    }

    public void setVorlesungsstunden(Vorlesungsstunde vorlesungsstunden) {
        this.vorlesungsstunden[anzahlVorlesungsstunden] = vorlesungsstunden;
        anzahlVorlesungsstunden++;
    }

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

}
