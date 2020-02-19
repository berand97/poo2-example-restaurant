import com.unac.edu.co.*;

import java.util.*;


public class Main {

    public static void main(String[] args) {

    Plato pizza1 = new Pizza("Pollo",15000.0);
    Plato lasagna1 = new Lasagna("veggie",12000.0);
    Plato pasta1 = new Pasta("italiana",25000.0);
    Plato bebida1 = new Bebida("Colombiana", 1800.0, "Personal");
    Combo combo1 = new Combo();

    List<Combo> combos = new ArrayList<>();
        combos.add(combo1);

    }
}

