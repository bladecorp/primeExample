package net.tecgurus.primefaces.beans;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class FarenheitBean {

	private double f = 32;
	
	public double getC(){
		return (((f - 32) * (5.0/9.0)));
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}
	
	
	
}
