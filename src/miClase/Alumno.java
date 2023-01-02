package miClase;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import lombok.Data;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;



import java.util.UUID;

@XmlRootElement(name = "alumno")
@XmlType(propOrder = {
		"nombre",
		"fechaNacimiento",
        "dni",
        "nia",
        "email",
        "telefono",
        "nota"
})
@Data
public class Alumno {		
	private String nombre;
	private String fechaNac;
	private String dni;
	private int nia;
	private int telefono;
	private String email;
	private double nota;


	public String getNombre() {
		return this.nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNacimiento() {
		return fechaNac;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNac=fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getNia() {
		return nia;
	}
	public void setNia(int nia) {
		this.nia = nia;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	/*public int getEdad() 
	{
		Period p = Period.between(getFechaNacimiento(), LocalDate.now());
		return p.getYears();
		
	}*/

	@Override
	public String toString() {
	    return
	        "\n\nNombre del alumno: " + getNombre() +
	        "\nTelefono: " + getTelefono() +
	        "\nDNI: " + getDni() +
	        "\nNIA: " + getNia() +
	        "\nEmail: " + getEmail() +
	        "\ntelefono: "+ getTelefono()+
	        "\nFecha de nacimiento: " + getFechaNacimiento()+
	        "\nNota: " + getNota();
	}

}


