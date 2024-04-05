public class Studierender {
    private String name;
    private int matrikelnummer;
    private String studiengang;
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public void frageStellen(String frage, String professor) {
        System.out.println("An:" + professor);
        System.out.println(frage);
    }
}
