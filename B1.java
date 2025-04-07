// Enum pentru tipuri de supă
public enum TipSupa {
    LEGUME, CIUPERCI, VITA
}

// Interfață pentru supă
public interface Supa {
    void descriere();
}

// Implementări concrete
public class SupaDeLegume implements Supa {
    public void descriere() {
        System.out.println("Aceasta este o supă de legume.");
    }
}

public class SupaDeCiuperci implements Supa {
    public void descriere() {
        System.out.println("Aceasta este o supă de ciuperci.");
    }
}

public class SupaDeVita implements Supa {
    public void descriere() {
        System.out.println("Aceasta este o supă de vită.");
    }
}

// Factory pentru supe
public class SupaFactory {
    public static Supa createSupa(TipSupa tip) {
        switch (tip) {
            case LEGUME: return new SupaDeLegume();
            case CIUPERCI: return new SupaDeCiuperci();
            case VITA: return new SupaDeVita();
            default: throw new IllegalArgumentException("Tip de supă necunoscut!");
        }
    }
}

