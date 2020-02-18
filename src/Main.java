import com.unac.edu.co.Bebida;
import com.unac.edu.co.Lasagna;
import com.unac.edu.co.Pasta;
import com.unac.edu.co.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Pizza p1 = new Pizza("Pollo", 15000.0 );
        Pizza p2 = new Pizza("Mexicana", 19000.0 );

        Lasagna l1 = new Lasagna("veggie", 8000.0);
        Lasagna l2 = new Lasagna("carne", 12000.0);

        Pasta ps1 = new Pasta("Italiana", 15000.0);
        Pasta ps2 = new Pasta("Penne", 17000.0);

        Bebida b1 = new Bebida( "N","colombiana", 4500.0);
        Bebida b2 = new Bebida( "S","pepsi", 1800.0);


        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(p1);
        pizzas.add(p2);
        //
        List<Lasagna> lasagnas = new ArrayList<>();
        lasagnas.add(l1);
        lasagnas.add(l2);
        //
        List<Pasta> pastas = new ArrayList<>();
        pastas.add(ps1);
        pastas.add(ps2);

        Map<Integer, String> nombreMap = new HashMap<Integer, String>();
        nombreMap.put( , );
    }
}
