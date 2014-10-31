package net.tecgurus.primefaces.beans;

import javax.faces.bean.ManagedBean;

import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;


@ManagedBean
public class DashboardBean {

	private DashboardModel model;
	
	public DashboardBean(){
		model = new DefaultDashboardModel();
		DashboardColumn columna1 = new DefaultDashboardColumn();
		DashboardColumn columna2 = new DefaultDashboardColumn();
		DashboardColumn columna3 = new DefaultDashboardColumn();
		columna1.addWidget("sports");
		columna1.addWidget("finance");
		columna2.addWidget("lifestyle");
		columna2.addWidget("weather");
		columna3.addWidget("politics");
		
		model.addColumn(columna1);
		model.addColumn(columna2);
		model.addColumn(columna3);
		
	}
	
	public DashboardModel getModel(){
		return model;
	}
	
}
