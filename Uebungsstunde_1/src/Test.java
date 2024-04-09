public class Test {
    public static void main(String[] args) throws Exception {
        Dozierender dozent1 = new Dozierender("Herr Müller", "Informatik", "G101");
        Dozierender dozent2 = new Dozierender();

        dozent2.setName("Frau Bauer");
        dozent2.setFakultaet("Maschinenbau");
        dozent2.setBueronummer("B104");

        String[][] buerozeiten1 = { { "Montag", "Dienstag" }, { "13:00 Uhr" } };
        dozent1.setBuerozeiten(buerozeiten1);

        Studierender student1 = new Studierender("Elmar Lienert", 000001, "Informatik");
        Studierender student2 = new Studierender("Felix Weber", 000002, "KI");
        Studierender student3 = new Studierender();

        student3.setName("Alexander Horn");
        student3.setMatrikelnummer(000003);
        student3.setStudiengang("Informatik");

        student1.frageStellen(dozent1);
        dozent1.answerQuestion(student1);
        // Probleme: man kann Fragen stellen, aber nicht sehr dynamisch, da man den
        // kompletten ablauf in der Main Methode vorher eingeben muss

        Lehrveranstaltung kurs1 = new Lehrveranstaltung("Grundlagen der Informatik", 0, 0, 0);
        Lehrveranstaltung kurs2 = new Lehrveranstaltung();

        kurs2.setTitel("Datenbanken");

        student2.fürLehrveranstaltungAnmelden(kurs1);
        System.out.println(kurs1.getStudent(1).getName());

    }
}
