package br.com.aula12.questao3;

public class Fila extends Colecao{

	protected int posInserir;
	protected int posRemover;
	
	public Fila(){
		super();
	}
	
	public Fila(int tamanho){
		super(tamanho);
	}
	
	@Override
	public void inserirItem(Object item) {
		itens[posInserir] = item;
		posInserir++;
	}
	
	@Override
	public Object removerItem() {
		Object item = itens[posRemover];
		itens[posRemover] = null;
		posRemover++;
		return item;
	}
	
	@Override
	public void mostrar() {
		if(posInserir == posRemover){
			System.out.println("Lista vazia");
		}else{
			for(int i = 0; i < itens.length; i++){
				if(itens[i] != null)
					System.out.println(itens[i]);				
			}
		}
	}
}
