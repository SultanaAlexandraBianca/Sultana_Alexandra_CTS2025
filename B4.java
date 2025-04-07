public class Client {
    private static Client instance;
    private String nume;

    private Client(String nume) {
        this.nume = nume;
    }

    public static Client getInstance(String nume) {
        if (instance == null) {
            instance = new Client(nume);
        }
        return instance;
    }

    public void afiseaza() {
        System.out.println("Client: " + nume);
    }
}
