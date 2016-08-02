package br.com.caelum.blog.jenkins;

public class Imposto {

	public Imposto() {
	}

	public double calcula(Orcamento orcamento) {
		System.out.println("teste no meu repositorio.");
		return orcamento.getValor() * 0.1;
	}

}
