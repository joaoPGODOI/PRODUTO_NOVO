package main7;
import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

public class Produto {
      
	//Inserindo atributos
	
  public static void main(String[] args) {
		
		private String nome;
		private LocalDate dataValidade;
		private double precoCusto;
		private double precoVenda;
		private LocalDate dataFabricacao;
		
		//Construtor que recebe todos os atributos
		
	public Produto(String nome, double precoVenda, double precoCusto, LocalDate dataValidade, LocalDate dataFabricacao) {
			
			this.nome = nome;
			this.precoCusto = precoCusto;
	        this.precoVenda = precoVenda;
	        this.dataFabricacao = dataFabricacao;
	        this.dataValidade = dataValidade;
	        
	        //Get para os atributos
	        
	        public String getNome() {
	        	return nome;
	        }
	        
	        public double getPrecoCusto() {
	        	return precoCusto;
	        }
	        
	        public double getPrecoVenda() {
	        	return precoVenda;
	        }
	        
	        public LocalDate getDataValidade() {
	        	return dataValidade;
	        }
	        
	        //Informações do produto e verifica se está vencido com if
	        
	        public  String exibirInfo() {
	        	 Produto p1 = new Produto("leite-condensado", 3.60 , 7.50,LocalDate.of(2024, 6, 15),LocalDate.of(2024, 07, 15));
	        	 System.out.println(p1.exibirInfo);
	    	  
	        	 if(produto1.isVencido()){
	        		 System.out.println("O produto" + p1.getNome() + "está vencido.");
	        		 
	        	 }
	        
	        }
	        
	   
		//Construtor que recebe o nome, preço de custo e calculo de 10% de acordo com a validade
		
		public Produto(String nome, double preçoCusto) {
			
			this.nome = nome;
			this.precoCusto = precoCusto;
	        this.precoVenda = preçoCusto * 1.10;
	        this.dataFabricacao = LocalDate.now();
	        this.dataValidade = dataFabricacao.plus(1, ChronoUnit.MONTHS);
			
		}
		
    }
	

  }
  
}
