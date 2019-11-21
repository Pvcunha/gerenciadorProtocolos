package br.com.poli.gd.bancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
	
	/*
	 * Banco de dados n�o est� pronto,
	 * por enquanto o projeto est� funcionando atrav�s de array.
	 */
	
	private Connection conexao;
	
	public Conexao() {
		try {
			String url = "jdbc:sqlite:db/teste.sqlite"; //String que determina onde o banco de dados ser� criado
			
			/**
			 * Cria a conexao com o banco de dados e
			 * quando inicializado a primeia vez criar� o arquivo no
			 * endere�o tra�ado na variavel url
			 */
			this.conexao = DriverManager.getConnection(url); 
			
			if(conexao != null) {
				System.out.println("Conectado!");
			}
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	public void desconectar() {
		try {
			if(this.conexao.isClosed() == false){
				this.conexao.close();
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	/*
	 * Cria os statements para que o sql os execute
	 */
	public Statement criarStatement() {
		try {
			return this.conexao.createStatement();
		} catch (SQLException e) {
			return null;
		}
	}

	public Connection getConexao() {
		return this.conexao;
	}
}
