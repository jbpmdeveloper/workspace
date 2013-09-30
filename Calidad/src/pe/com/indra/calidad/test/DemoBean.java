package pe.com.indra.calidad.test;

import java.io.Serializable;
import java.util.Date;

public class DemoBean implements Serializable {
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date fecha;

	
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
     
	public String action(){
		System.out.println("Fecha Ingresada:"+fecha);
		return "index";
	}
	
}
