package dispositivos.multifuncional;

import dispositivos.AparelhoTelefonico.Celular;
import dispositivos.NavegadorInternet.MacBook;
import dispositivos.ReprodutorMusical.Ipod;

public class Iphone implements Celular, MacBook, Ipod{
	
	public void tocar() {
		System.out.println("Tocando musica pelo Iphone");
	}
	public void pausar() {
		System.out.println("musica pausada pelo Iphone");
	}
	public void selecionarMusica() {
		System.out.println("Escolhendo a musica pelo Iphone");
	}
	public void exibirPagina() {
		System.out.println("Exibindo pagina pelo Iphone");
	}
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba pelo Iphone");
	}
	public void atualizarPagina() {
		System.out.println("Atualizando a pagina pelo Iphone");
	}
	public void ligar() {
		System.out.println("Fazendo uma ligação pelo Iphone");
	}
	public void atender() {
		System.out.println("Atendendo a ligação pelo Iphone");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o Correio de Voz pelo Iphone");
	}
}