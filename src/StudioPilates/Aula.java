package StudioPilates;

public class Aula {

	private float hora;
	private String data;

	public float getHora() {
		return hora;
	}

	public void setHora(float hora) {
		this.hora = hora;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	Aula(String data, float hora){
		this.data = data;
		this.hora = hora;
		
	}
	
}
