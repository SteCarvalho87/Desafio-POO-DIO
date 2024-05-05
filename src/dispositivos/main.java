package dispositivos;

import dispositivos.AparelhoTelefonico.Celular;
import dispositivos.NavegadorInternet.MacBook;
import dispositivos.ReprodutorMusical.Ipod;
import dispositivos.multifuncional.Iphone;

public class main {
	public static void main(String [] args) {
		
		Iphone steIphone = new Iphone();
		
		Celular celular = steIphone;
		MacBook macBook = steIphone;
		Ipod ipod = steIphone;
		
		celular.ligar();
		celular.atender();
		celular.iniciarCorreioVoz();
		
		macBook.exibirPagina();
		macBook.adicionarNovaAba();
		macBook.atualizarPagina();
		
		ipod.tocar();
		ipod.pausar();
		ipod.selecionarMusica();
		
	}

}
