package br.com.aula12.questao3;

public class Pilha extends Colecao{

	protected int posAtual;
	
	public Pilha(){
		super();
	}
	
	public Pilha(int tamanho){
		super(tamanho);
	}
	
	@Override
	public void inserirItem(Object item) {
		itens[posAtual] = item;
		posAtual++;
	}
	
	@Override
	public Object removerItem() {
		posAtual--;
		Object item = itens[posAtual];
		itens[posAtual] = null;
		return item;
	}
	
	@Override
	public void mostrar() {
		if(itens[0] == null){
			System.out.println("Lista vazia");
		}else{
			for(int i = 0; i < itens.length; i++){
				if(itens[i] == null)
					break;
				System.out.println(itens[i]);
			}
		}
	}
}
