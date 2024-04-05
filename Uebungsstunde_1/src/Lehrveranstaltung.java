public class Lehrveranstaltung {
    private String titel;
    private Dozierender dozierender;
    private Studierender[] studierende = new Studierender[100];
    private int veranstaltungsgröße = 0;
    private Vorlesungsstunde vorlesungsstunden;
    private Praktikumsstunde praktikumsstunden;

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

    public Studierender[] getStudierende() {
        return studierende;
    }

    public void newStudierender(Studierender student) {
        Studierender[veranstaltungsgröße + 1] = student;
        veranstaltungsgröße++;
    }

    public void studentEntfernen(Studierender student) {
        for (int i = 0; i < veranstaltungsgröße; i++) {
            if (this.studierende[i].getMatrikelnummer().equals(student.getMatrikelnummer())) {
                for (int j = 0; j > veranstaltungsgröße - i; i++) {
                    studierende[j] = studierende[j + 1];
                }
                break;
            }
        }
    }

    public Vorlesungsstunde getVorlesungsstunden() {
        return vorlesungsstunden;
    }

    public void setVorlesungsstunden(Vorlesungsstunde vorlesungsstunden) {
        this.vorlesungsstunden = vorlesungsstunden;
    }

    public Praktikumsstunde getPraktikumsstunden() {
        return praktikumsstunden;
    }

    public void setPraktikumsstunden(Praktikumsstunde praktikumsstunden) {
        this.praktikumsstunden = praktikumsstunden;
    }

}
