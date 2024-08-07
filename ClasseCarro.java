package diaSETE;

public class ClasseCarro {

	private String marca;
	private String modelo;
	private int ano;
	private double preco;

	public void Carro(String marca, String modelo, int ano, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano > 1885) {  
			this.ano = ano;
		} else {
			System.out.println("Ano inválido!");
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco > 0) {
			this.preco = preco;
		} else {
			System.out.println("Preço inválido!");
		}
	}

	public void exibirInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Preço: R$ " + preco);
	}

	public void depreciar(double percentual) {
		if (percentual > 0 && percentual <= 100) {
			preco -= preco * (percentual / 100);
		} else {
			System.out.println("Percentual de depreciação inválido!");
		}
	}


}


