package view;

import model.Pessoa;

public class Execucao {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub//
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Pedro Amador");
		
		System.out.println(pessoa.getNome());
		
		pessoa.setEndereco("Rua Raimundo Brandão Cela");
		
		System.out.println(pessoa.getEndereco());
		
		pessoa.setBairro("Parque Boturussu");
		
		System.out.println(pessoa.getBairro());
		
		pessoa.setCep(99568976);
		
		System.out.println(pessoa.getCep());
		
		pessoa.setCidade("São Paulo");
		
		System.out.println(pessoa.getCidade());
		
		pessoa.setEstado("São Paulo");
		
		System.out.println(pessoa.getEstado());
		
	}

		
		
}
