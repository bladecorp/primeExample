package net.tecgurus.primefaces.beans;


import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class AutocompleteBean {

	private String lenguaje;
	
	private String[] lenguajes = {"Java", "PHP", "Ruby", "Scala", "Visual Basic", "Groovy", "Javascript"};
	
	public List<String> completar(String filtro){
		List<String> encontrados = new ArrayList<String>();
		for(String lenguajePosible : lenguajes) {
			if(lenguajePosible.toUpperCase().startsWith(filtro.toUpperCase())){
				encontrados.add(lenguajePosible);
			} 
		}
		if(encontrados.isEmpty()){
			encontrados.add("Sin resultados");
		}
		return encontrados;
	}

	/**
	 * @return the lenguaje
	 */
	public final String getLenguaje() {
		return lenguaje;
	}

	/**
	 * @param lenguaje the lenguaje to set
	 */
	public final void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	
	
	
}
