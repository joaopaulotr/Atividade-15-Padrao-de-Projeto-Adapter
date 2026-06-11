package adapter;

import domain.ItemGlobal;
import domain.Produto;
import externo.GlobalMarketApi;
import repository.CatalogoProdutos;
import java.util.ArrayList;
import java.util.List;

public class GlobalMarketAdapter implements CatalogoProdutos {

    private static final double DOLLAR_TO_REAL = 5.0;

    private GlobalMarketApi api;

    public GlobalMarketAdapter(GlobalMarketApi api) {
        this.api = api;
    }

    @Override
    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        for (ItemGlobal item : api.fetchAvailableItems()) {
            produtos.add(new Produto(
                    item.getSku(),
                    item.getDescription(),
                    item.getPriceInDollars() * DOLLAR_TO_REAL,
                    item.getAvailableUnits(),
                    "Global Market"
            ));
        }
        return produtos;
    }
}
