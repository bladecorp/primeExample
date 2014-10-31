package net.tecgurus.primefaces.beans;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class EfectosBean {
	
	private String[] efectos = {"blind","bounce","clip",
			"drop","explode","fade","fold","highlight",
			"puff","pulsate","scale","shake","size","slide",
			"slideDown"};

	public String[] getEfectos() {
		return efectos;
	}
	
}
