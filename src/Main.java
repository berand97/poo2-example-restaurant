import com.unac.edu.co.*;

import java.util.*;
import java.util.zip.CheckedOutputStream;


public class Main {

    public static void main(String[] args) {

        Plato pizza1 = new Pizza("Pollo", 15000.0);
        Plato lasagna1 = new Lasagna("veggie", 12000.0);
        Plato pasta1 = new Pasta("italiana", 25000.0);
        Bebida bebida1 = new Bebida("colombiana", "Personal", 1800.0);
        Combo combo1 = new Combo(pizza1, bebida1);
        Combo combo2 = new Combo(lasagna1,bebida1);
        Combo combo3 = new Combo(pasta1,bebida1);

        List<Combo> combos = new ArrayList<>();
        for (Combo plat : combos) {
            Plato comb = new Pizza();
            comb.setCombo(plat);
            combos.add(combo1);
            combos.add(combo2);
            combos.add(combo3);

        }


    }
}

