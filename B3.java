// Interfețe pentru supe și desert
public interface Desert {
    void descriere();
}

// Implementări concrete
public class Papanasi implements Desert {
    public void descriere() {
        System.out.println("Desert: Papanasi.");
    }
}

public class Clatite implements Desert {
    public void descriere() {
        System.out.println("Desert: Clatite.");
    }
}

public class Cheesecake implements Desert {
    public void descriere() {
        System.out.println("Desert: Cheesecake.");
    }
}

// Abstract Factory
public interface FelDeMancareFactory {
    Supa createSupa();
    Desert createDesert();
}

// O familie de mâncare: Supă de legume + clătite
public class MeniuLegumeFactory implements FelDeMancareFactory {
    public Supa createSupa() {
        return new SupaDeLegume();
    }
    public Desert createDesert() {
        return new Clatite();
    }
}
