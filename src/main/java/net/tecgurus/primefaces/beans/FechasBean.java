package net.tecgurus.primefaces.beans;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


@ManagedBean
public class FechasBean {

	private Date fechaInicio;
	private Date fechaFin;
	
	public String registrar(){
		if(!fechaInicio.before(fechaFin)){
			FacesMessage message = new FacesMessage("Error Validación 1" + "fecha inicio" + " no puede ser posterior a fecha fin");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, message);
			FacesContext.getCurrentInstance().addMessage(null, message);
			return null;
		} else {
			return "muestra-fechas";
		}
		
	}
	
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
	
}
