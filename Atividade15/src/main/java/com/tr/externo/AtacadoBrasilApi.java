package com.tr.externo;

import com.tr.domain.Produto;
import domain.ItemAtacado;

import java.util.ArrayList;
import java.util.List;

public class AtacadoBrasilApi {

    public List<ItemAtacado> buscarProdutosAtacado() {
        List<ItemAtacado> produtos = new ArrayList<>();

        produtos.add(new ItemAtacado("A100", "Teclado Mecânico", 250.0, 12));
        produtos.add(new ItemAtacado("A200", "Monitor 24 Polegadas", 899.9, 4));
        produtos.add(new ItemAtacado("A300", "Cadeira Gamer", 1200.0, 0));

        return produtos;
    }
}

