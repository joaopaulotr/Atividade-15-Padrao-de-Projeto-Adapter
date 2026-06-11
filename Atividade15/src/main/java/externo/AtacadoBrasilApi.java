package externo;

import domain.ItemAtacado;
import java.util.ArrayList;
import java.util.List;

public class AtacadoBrasilApi {

    public List<ItemAtacado> buscarProdutos() {
        List<ItemAtacado> items = new ArrayList<>();

        items.add(new ItemAtacado("A100", "Teclado Mecânico", 250.0, 12));
        items.add(new ItemAtacado("A200", "Monitor 24 Polegadas", 899.9, 4));
        items.add(new ItemAtacado("A300", "Cadeira Gamer", 1200.0, 0));

        return items;
    }
}
