package interfacezeug;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class CartTest {

    static HashMap<HashSet<iBuyable>, Double> testShoppingCarts = new HashMap<HashSet<iBuyable>, Double>();

    @Before
    public void setUp(){

        HashSet<iBuyable> cart1 = new HashSet<>();
        testShoppingCarts.put(cart1, 0.0);

        HashSet<iBuyable> cart2 = new HashSet<>();
        Main.addProduct(cart2, 5, "k");
        testShoppingCarts.put(cart2, 42.5);

        HashSet<iBuyable> cart3 = new HashSet<>();
        Main.addProduct(cart3, 10, "g");
        testShoppingCarts.put(cart3, 10.0);

        HashSet<iBuyable> cart4 = new HashSet<>();
        Main.addProduct(cart4, 1, "k");
        Main.addProduct(cart4, 2, "s");
        Main.addProduct(cart4, 3, "m");
        Main.addProduct(cart4, 4, "g");
        testShoppingCarts.put(cart4, 20.9);
    }

    @Test
    public void tests() {
        for (Map.Entry<HashSet<iBuyable>, Double> entry : testShoppingCarts.entrySet()){
            assertTrue(Main.calculateSum(entry.getKey()) == entry.getValue());

        }
    }


}
