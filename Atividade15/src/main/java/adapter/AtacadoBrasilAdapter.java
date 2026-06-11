package adapter;

import domain.ItemAtacado;
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
        for (ItemAtacado item : api.buscarProdutos()) {
            produtos.add(new Produto(
                    item.getCodigo(),
                    item.getNome(),
                    item.getPreco(),
                    item.getEstoque(),
                    "Atacado Brasil"
            ));
        }
        return produtos;
    }
}
