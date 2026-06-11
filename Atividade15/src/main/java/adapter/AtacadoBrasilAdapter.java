package adapter;

import domain.Produto;
import externo.AtacadoBrasilApi;
import repository.CatalogoProdutos;
import java.util.ArrayList;
import java.util.List;

public class AtacadoBrasilAdapter implements CatalogoProdutos {

    private AtacadoBrasilApi api;

    public AtacadoBrasilAdapter(AtacadoBrasilApi api) {
        this.api = api;
    }

    @Override
    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        for (String[] dados : api.buscarProdutosAtacado()) {
            int estoque = Integer.parseInt(dados[3]);
            produtos.add(new Produto(
                    dados[0],
                    dados[1],
                    Double.parseDouble(dados[2]),
                    estoque,
                    "Atacado Brasil"
            ));
        }
        return produtos;
    }
}
