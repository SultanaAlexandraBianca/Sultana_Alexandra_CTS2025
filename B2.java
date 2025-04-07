public class Rezervare {
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;
    private String genMuzica;

    private Rezervare(Builder builder) {
        this.asezareLaGeam = builder.asezareLaGeam;
        this.scauneErgonomice = builder.scauneErgonomice;
        this.decorareMasa = builder.decorareMasa;
        this.muzicaAmbientala = builder.muzicaAmbientala;
        this.genMuzica = builder.genMuzica;
    }

    public static class Builder {
        private boolean asezareLaGeam = false;
        private boolean scauneErgonomice = false;
        private boolean decorareMasa = false;
        private boolean muzicaAmbientala = false;
        private String genMuzica = "N/A";

        public Builder asezareLaGeam(boolean valoare) {
            this.asezareLaGeam = valoare;
            return this;
        }

        public Builder scauneErgonomice(boolean valoare) {
            this.scauneErgonomice = valoare;
            return this;
        }

        public Builder decorareMasa(boolean valoare) {
            this.decorareMasa = valoare;
            return this;
        }

        public Builder muzicaAmbientala(boolean valoare, String gen) {
            this.muzicaAmbientala = valoare;
            this.genMuzica = gen;
            return this;
        }

        public Rezervare build() {
            return new Rezervare(this);
        }
    }

    public void afiseaza() {
        System.out.println("Rezervare: Geam=" + asezareLaGeam +
                ", ScauneErgonomice=" + scauneErgonomice +
                ", DecorareMasa=" + decorareMasa +
                ", MuzicaAmbientala=" + muzicaAmbientala +
                ", GenMuzica=" + genMuzica);
    }
}
