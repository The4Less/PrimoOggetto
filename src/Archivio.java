import java.util.*;

public class Archivio {
	private int indice = 0;
	private Persona[] listaPersone = new Persona[10];
	public Archivio(int dimensione) {
		listaPersone=new Persona[dimensione];
	}

	public boolean AggiungiPersona(Persona p) {
		if (indice < 10) {
			listaPersone[indice++] = p;
			return true;
		}
		return false;
	}

	public Persona cerca(String cognome) {
		for (Persona p : listaPersone) {
			if (cognome.equals(p.cognome)) {
				return p;
			}
		}
		return null;
	}

}