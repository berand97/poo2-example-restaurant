import com.unac.edu.co.*;

import java.util.*;
import java.util.zip.CheckedOutputStream;


public class Main {

    public static void main(String[] args) {

        Plato pizza1 = new Pizza("Pizza de Pollo", 15000.0);
        Plato lasagna1 = new Lasagna("Lasagna veggie", 12000.0);
        Plato pasta1 = new Pasta("Pasta italiana", 25000.0);
        Bebida bebida1 = new Bebida("Gaseosa colombiana", "Personal", 1800.0);
        Combo combo1 = new Combo(pizza1, bebida1);
        Combo combo2 = new Combo(lasagna1,bebida1);
        Combo combo3 = new Combo(pasta1,bebida1);

        List<Combo> combos = new ArrayList<>();
        combos.add(combo1);
        combos.add(combo2);
        combos.add(combo3);

        Map<Integer, Combo> pedidos = new HashMap<>();
            pedidos.put(1, combos.get(0));
            pedidos.put(2, combos.get(1));
            pedidos.put(3, combos.get(2));


        //System.out.println("Has pedido:" + pedidos.get(1));
        System.out.println("Has pedido:\n" + pedidos.get(2).getPlatos().getFlavor() + "\nBebida: " + pedidos.get(1).getBebidas().getFlavor());
        System.out.println("Precio: " + pedidos.get(2).getPrice());
        System.out.println("total: " + pedidos.get(2).getDescuento());

    }
}

