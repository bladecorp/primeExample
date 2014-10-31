package net.tecgurus.primefaces.beans;

import java.util.Random;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class ImagenesBean {

	private int numeroImagenes = 6;
	private Random random = new Random();
	private String template = "../images/cursos/%s.png";
	
	public String getRandomImage(){
		int numero = random.nextInt(numeroImagenes + 1);
		String path = String.format(template, numero);
		return path;
	}
	
}
