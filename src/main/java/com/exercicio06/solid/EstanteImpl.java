package com.exercicio06.solid;

import java.util.ArrayList;
import java.util.List;

public class EstanteImpl  implements Estante{
	List<Item> itens = new ArrayList<>();

	@Override
	public void adicionarItem(Item item) {
		itens.add(item);		
	}

	@Override
	public void customizarEstante() {
		// TODO Auto-generated method stub
		
	}
}
