package entidades;

public class Produtos implements Comparable <Produtos>{
	
	private String produto;
	private Double preco;
	
	public Produtos() {
	}

	public Produtos(String produto, Double preco) {
		this.produto = produto;
		this.preco = preco;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return produto + ", " +  String.format("%.2f", preco);
	}

	@Override
	//metodo compara o preco do produto com outro
	public int compareTo(Produtos outro) {
		return preco.compareTo(outro.getPreco());
	}
	

}
