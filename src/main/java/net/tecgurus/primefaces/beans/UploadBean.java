package net.tecgurus.primefaces.beans;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.naming.event.EventContext;

import org.primefaces.event.FileUploadEvent;
import org.w3c.dom.events.Event;

@ManagedBean
public class UploadBean {
	
//	private String destinoImg = "C:/Workspace/Luna/primefaces/src/main/webapp/images/otras/img/";
	private String destinoArch = "C:/Users/Yolalap/Desktop/Temps/Archivos/";
	private String destinoImg = "C:/Users/Yolalap/Desktop/Temps/Imagenes/";
	
	
	private List<String> archivos;
	private List<String> imagenes;
	private List<String> rutasImagenes;
	
	private String eliminarArch;
	private String eliminarImg;
	

	public void subirArchivoImg(FileUploadEvent event){
				
		try{
			copiarArchivo(event.getFile().getFileName(), event.getFile().getInputstream(), destinoImg);
			FacesMessage message = new FacesMessage("En hora buena!", event.getFile().getFileName() 
					+ " se subió correctamente" );
			FacesContext.getCurrentInstance().addMessage(null, message);
			
		} catch(IOException E){
			E.printStackTrace();
		}
	}
	
	public void subirArchivoTxt(FileUploadEvent event){
		
		try{
			copiarArchivo(event.getFile().getFileName(), event.getFile().getInputstream(),  destinoArch);
			FacesMessage message = new FacesMessage("En hora buena!", event.getFile().getFileName() 
					+ " se subió correctamente" );
			FacesContext.getCurrentInstance().addMessage(null, message);
			
		} catch(IOException E){
			E.printStackTrace();
		}
	}
	
	public void copiarArchivo(String nombreArchivo, InputStream is, String ruta){
				
		try{
			OutputStream out = new FileOutputStream(new File(ruta + nombreArchivo));
			int read = 0;
			byte[] bytes = new byte[1024];
			while((read = is.read(bytes)) != -1){
				out.write(bytes, 0, read);
			}
			is.close();
			out.flush();
			out.close();
			System.out.println("Nuevo archivo creado!");
		} catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

	public List<String> getImagenes() {
		File folder = new File(destinoImg);
		imagenes = new ArrayList<String>();
		File[] listaDeArchivos = folder.listFiles();
		if(listaDeArchivos.length > 0){
			for(int i = 0; i < listaDeArchivos.length; i++){
				if(listaDeArchivos[i].isFile()){
					imagenes.add(listaDeArchivos[i].getName());
					System.out.println(listaDeArchivos[i].getName());
				}
			}
		} else {
			imagenes.add("No hay imagenes");
		}
		
		
		return imagenes;
	}
	
	public List<String> getRutasImagenes() {
		File folder = new File(destinoImg);
		rutasImagenes = new ArrayList<String>();
		File[] listaDeArchivos = folder.listFiles();
		if(listaDeArchivos.length > 0){
			for(int i = 0; i < listaDeArchivos.length; i++){
				if(listaDeArchivos[i].isFile()){
					rutasImagenes.add(listaDeArchivos[i].getName());
					System.out.println(listaDeArchivos[i].getName());
				}
			}
		} else {
			rutasImagenes.add("No hay imagenes");
		}
		
		
		return rutasImagenes;
	}

	public List<String> getArchivos() {
		File folder = new File(destinoArch);
		archivos = new ArrayList<String>();
		File[] listaDeArchivos = folder.listFiles();
		if(listaDeArchivos.length > 0){
			for(int i = 0; i < listaDeArchivos.length; i++){
				if(listaDeArchivos[i].isFile()){
					archivos.add(listaDeArchivos[i].getName());
					System.out.println(listaDeArchivos[i].getName());
				}
			}
		} else {
			archivos.add("No hay archivos");
		}
		
		
		return archivos;
	}
	
	public void eliminar(){
		
		try{
			File file = new File(destinoArch + eliminarArch);
			if(file.delete()){
				FacesMessage message2 = new FacesMessage("Ok", eliminarArch + " se eliminó correctamente" );
				FacesContext.getCurrentInstance().addMessage(null, message2);
				System.out.println(eliminarArch + " borrado!");
			} else {
				FacesMessage message = new FacesMessage("Error! ", eliminarArch 
						+ " no se pudo eliminar" );
				FacesContext.getCurrentInstance().addMessage(null, message);
				System.out.println(eliminarArch + " NO se pudo borrar!");
			}
		} catch(Exception e){
			System.err.println("Error!");
		}
		
	}

	public String getEliminarArch() {
		System.out.println("Bien");
		
		return eliminarArch;
	}

	public void setEliminarArch(String eliminarArch) {
		System.out.println("Mal");
		this.eliminarArch = eliminarArch;
	}

	public String getEliminarImg() {
		return eliminarImg;
	}

	public void setEliminarImg(String eliminarImg) {
		this.eliminarImg = eliminarImg;
	}
	
	
	
	
}
