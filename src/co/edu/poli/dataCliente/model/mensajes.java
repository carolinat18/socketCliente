package co.edu.poli.dataCliente.model;

public class mensajes {
	   private String emisor;
	   private String receptor;
	   private String mensaje;

	    public mensajes() {
	    }

	    public mensajes(String emisor, String receptor, String mensaje) {
	        this.emisor = emisor;
	        this.receptor = receptor;
	        this.mensaje = mensaje;
	    }

	    /**
	     * @return the emisor
	     */
	    public String getEmisor() {
	        return emisor;
	    }

	    /**
	     * @param emisor the emisor to set
	     */
	    public void setEmisor(String emisor) {
	        this.emisor = emisor;
	    }

	    /**
	     * @return the receptor
	     */
	    public String getReceptor() {
	        return receptor;
	    }

	    /**
	     * @param receptor the receptor to set
	     */
	    public void setReceptor(String receptor) {
	        this.receptor = receptor;
	    }

	    /**
	     * @return the mensaje
	     */
	    public String getMensaje() {
	        return mensaje;
	    }

	    /**
	     * @param mensaje the mensaje to set
	     */
	    public void setMensaje(String mensaje) {
	        this.mensaje = mensaje;
	    }
	   
	   
	}
