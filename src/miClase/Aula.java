package miClase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.UUID;

@XmlRootElement(namespace = "miClase")
public class Aula {
	
@XmlElementWrapper(name = "alumnosDeEstaClase")
@XmlElement(name = "alumno")
private List<Alumno> alumnosDeEstaClase = new ArrayList<Alumno>();
public String nombre;
public String centro;
public String localidad;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setCentro(String centro) {
		this.centro = centro;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public void alumnoNuevo(Alumno a) 
	{
		
		alumnosDeEstaClase.add(a);
	}
	
	public void setListAlumnos(List<Alumno> listaAlumnos)
	{
		this.alumnosDeEstaClase=listaAlumnos;
	}
	
	public List<Alumno> getList() {
        return this.alumnosDeEstaClase;
    }

	/*int contarAlumnosMayoresQue (int edad) 
	{
		return  (int) alumnosDeEstaClase.stream()
		.filter((a)->(a).getEdad()>edad).count();
	}
	
	float edadMedia() 
	{
		return this.alumnosDeEstaClase.stream()
		.collect(Collectors.averagingDouble(a -> a.getEdad())).floatValue();
	}*/
	
	List<String> nombreSuspendidos()
	{
		return alumnosDeEstaClase.stream()
		.filter((a) -> (a).getNota()<5f)
		.map(Alumno::getNombre)
		.collect(Collectors.toList());
		
	} 
	
	 public void listadoPorNiaDescendente (){
	      alumnosDeEstaClase.sort(null);
	      alumnosDeEstaClase.forEach(System.out::println);
	    }
	 
	/* public boolean encontarAlumnosDelMismoMesQue(Alumno a) {
	        return alumnosDeEstaClase.stream()
	                .filter(b -> a.getFechaNacimiento().getMonthValue() == b.getFechaNacimiento().getMonthValue())
	                .count() > 0;
	    }*/
	 @Override
	public String toString() {
		return "Aula alumnosDeEstaClase: " + alumnosDeEstaClase + "\n";
	}

	
	/*void escribirFichero() 
	{
		List<Alumno> l;
		
		for(int i=0; i<alumnosDeEstaClase.size(); i++) 
		{
			Alumno a = l.get(i);
		}
		
		for(Alumno a:alumnosDeEstaClase) 
		{
		
		}
		
		String out = l.stream()
				.map(a -> "<alumno><nombre>" + a.getNombre()+.a..)
				.collect(Collectors.joining("\n")));
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
		
	}

}


