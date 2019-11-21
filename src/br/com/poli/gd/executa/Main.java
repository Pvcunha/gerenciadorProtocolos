package br.com.poli.gd.executa;

import java.sql.SQLException;

import br.com.poli.gd.bancoDados.*;
import br.com.poli.gd.pessoa.Aluno;
import br.com.poli.gd.pessoa.Funcionario;
import br.com.poli.gd.protocolos.DispensaDisciplina;
import br.com.poli.gd.protocolos.Protocolo;
import br.com.poli.gd.protocolos.RepositorioProtocolos;
public class Main {
	
	/*
	 * Classe existente apenas para testes
	 */

	public static void main(String[] args) throws SQLException {
				
				Aluno a1 = new Aluno(null, null, "70447872400", null, null, null);
				System.out.println(a1.isCpf(a1.getCPF()));
				
				Protocolo p1 = new DispensaDisciplina("abacate", "GM", a1);
				Funcionario f1 = new Funcionario("70447872400");
				
				
				System.out.println("\n teste \n");
				//p1 = f1.criaProtocolo(1, p1, a1); Fun��o comentada por motivo explicado em sua assinatura (br.com.poli.gp.pessoa.Funcioario)
				System.out.println(p1.getClass());
				
				System.out.println(p1.toString());
				
				RepositorioProtocolos b1 = new RepositorioProtocolos();
				System.out.println("\n teste 2 \n");
				
				b1.addProtocolo(p1);
				
				Protocolo p2 = new Protocolo(a1);
				p2 = b1.buscar(p1.getNumProtocolo());
				
				System.out.println("\n teste 3 \n");
				System.out.println(p2.toString());
				
				System.out.println("\n Teste 4 \n");
				System.out.println(p2.getNumProtocolo());
				
		
	
		
	}	
}


/*
 * Altera��es no c�digo:
 * 1-	Adicionado um Setter e getter aos atributos status e preco.
 * 2-	Criado os m�todos que imprimem a parte relacionado ao protocolo espec�fico
 * 3-	Come�ada o metodo, na main, que ir� executar o c�digo (lembrar de retirar da main e por em 
 * um m�todo a parte apenas para ser chamado na main). 
 * 
 * 0.2
 * 1- Corrigido o erro que estava no constructor da classe segunda chamada
 * 2- Algumas arruma��es bestas foram feitas, como colocar um valor aleat�rio no pre�o 
 * dos requerimentos.

 * 0.3 - 
 * 1-	Cria��o das classes Desligamento, TransferExterna, TransferInterna, de seus m�todos e atributos
 * 2- 	Agora o programa ja imprime os dados do usu�rio
 * 3-	Arruma��o de erros bestinhas do c�digo e foram adicionados coment�rios para melhor entendimento do c�digo.

 * 0.4 - 
 *		Adicionado corpo aos m�todos da classe transfer�ncia externa e interna
 
 * 0.5 -
 * 1- 	Cria��o dos m�todos 'dizer', que servem para pedir informa��es ao usuario	
 * 2- 	retirada de todos os parametros dos contructors e implementa��o dos m�todos dizer
 *para que assim seja possivel o usu�rio inserir seus pr�prios dados.
 * 3- 	implementa��o do metodo que imprime os dados do usu�rio nas classes: TransferExterna, TransferInterna, Desligamento.		
 *
 * 0.6 -
 * 1-	Reformula��o estrutural no c�digo.
 * 2-	Cria��o da classe aluno com os seus dados
 * 3- 	Mudan�a na classe protocolo b�sico, que virou Protocolo
 * 4- 	Mudan�a na estrutura da heran�a
 * 5- 	Cria��o do pacote Pessoa
 * 
 * 0.9 - 
 * 1- Criada classe Pessoa. A classe aluno, agora, herda de psoa
 * 2- Criado o algotimo para tirar um aluno do array
 */
	
