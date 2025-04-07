public class Main {
    public static void main(String[] args) {
        // B.1
        Supa supa = SupaFactory.createSupa(TipSupa.CIUPERCI);
        supa.descriere();

        // B.2
        Rezervare rezervare = new Rezervare.Builder()
                .asezareLaGeam(true)
                .scauneErgonomice(true)
                .muzicaAmbientala(true, "Jazz")
                .build();
        rezervare.afiseaza();

        // B.3
        FelDeMancareFactory meniu = new MeniuLegumeFactory();
        meniu.createSupa().descriere();
        meniu.createDesert().descriere();

        // B.4
        Client client = Client.getInstance("Andreea");
        client.afiseaza();
    }
}
