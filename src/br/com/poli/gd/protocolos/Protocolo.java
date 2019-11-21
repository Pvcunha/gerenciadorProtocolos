package br.com.poli.gd.protocolos;

import br.com.poli.gd.pessoa.Aluno;

public class Protocolo {

	private int numProtocolo; // Refere-se ao numero do protocolo, ou a identificac�o do protocolo.
	private boolean Status; // Refere-se ao status atribuido ao protocolo
	private static int protocolosCriados; // Conta o n�mero de instancias que foi feita ao objeto
	private Aluno aluno;

	public Protocolo(Aluno aluno) {
		this.aluno = aluno;
		setNumProtocolo(10);
		setStatus(false);
	}

	public int geraNumProtocolo() {
		int numProtocolo = getProtocolosCriados() + 1;
		return numProtocolo;
	}

	// Vai retornar os dados'b�sicos' do protocolo
	@Override
	public String toString() {

		return "Sum�rio do Protocolo \n" + "\nNome do aluno: " + this.aluno.getNome() + "\nCurso do aluno: "
				+ this.aluno.getCurso() + "\nCPF do aluno: " + this.aluno.getCPF() + "\nEndere�o: "
				+ this.aluno.getEndereco() + "\nEmail: " + this.aluno.getEmail() + "\nNumero de telefone: "
				+ aluno.getNumTelefone();

	}

	public void setNumProtocolo(int numero) {
		this.numProtocolo = numero;
	}

	public int getNumProtocolo() {
		return this.numProtocolo;
	}

	public int getProtocolosCriados() {
		return Protocolo.protocolosCriados;
	}

	public boolean getStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Aluno getAluno() {
		return this.aluno;
	}
}