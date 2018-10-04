package ar.edu.unlam.pb2;

public class Equals_Hashcode {
	private String nombre;
	private String apellido;
	private Integer dni;
	private Integer edad;
	
	public Equals_Hashcode(String nombre, String apellido, Integer dni, Integer edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equals_Hashcode other = (Equals_Hashcode) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	
}





//2 personas que sean iguales por DNI solamente. 
//Atributos nombre, apellido, dni, edad.