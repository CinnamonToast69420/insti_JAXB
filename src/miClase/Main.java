package miClase;


import jakarta.xml.bind.JAXBException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String DATA = "C:\\Users\\fidel\\eclipse-workspace\\InstitutoJAXB\\fichero.xml.xml";
		System.out.println("Iniciando el controlador");
		JAXBController controller = JAXBController.getInstance();
		System.out.println("*** JAXB XML ***");
		
		List<Alumno> listaAula = new ArrayList<Alumno>();
		
		//Creamos a los alumnos del aula
		Alumno carlos = new Alumno();
		carlos.setNombre("Carlos Martinez Lopez");
		carlos.setFechaNacimiento("1997-04-14");
		carlos.setDni("67679434T");
		carlos.setNia(56574458);
		carlos.setEmail("carlos345@gmail.com");
		carlos.setTelefono(658934025);
		carlos.setNota(4.5);
		listaAula.add(carlos);
		
		Alumno luis = new Alumno();
		luis.setNombre("Luis Gonzalez gomez");
		luis.setFechaNacimiento("1999-05-19");
		luis.setDni("84594502J");
		luis.setNia(59930123);
		luis.setEmail("luisCar75@gmail.com");
		luis.setTelefono(667451295);
		luis.setNota(8.4);
		listaAula.add(luis);
		
		Alumno juan  = new Alumno();
		juan.setNombre("Juan Costa Martinez");
		juan.setFechaNacimiento("2002-12-01");
		juan.setDni("67586923G");
		juan.setNia(52367892);
		juan.setEmail("jnCosMart@gmail.com");
		juan.setTelefono(657329021);
		juan.setNota(6.7);
		listaAula.add(juan);
		
		Alumno roberto = new Alumno();
		roberto.setNombre("Roberto Kalogeropoúlou Beltrán");
		roberto.setFechaNacimiento("2001-07-21");
		roberto.setDni("83929835L");
		roberto.setNia(51903245);
		roberto.setEmail("kalosRob07_1@gmail.com");
		roberto.setTelefono(659434902);
		roberto.setNota(9.3);
		listaAula.add(roberto);
		
		Alumno sofia = new Alumno();
		sofia.setNombre("Sofía Tarazona Pérez");
		sofia.setFechaNacimiento("2000-09-24");
		sofia.setDni("73432389F");
		sofia.setNia(50945032);
		sofia.setEmail("tar_sofia@gmail.com");
		sofia.setTelefono(658934023);
		sofia.setNota(9.0);
		listaAula.add(sofia);
		
		// creamos una nueva Aula y le metemos los alumnos...
		Aula nuevaAula = new Aula();
		nuevaAula.setCentro("EDUARDO PRIMO MARQUES");
		nuevaAula.setLocalidad("Carlet");
		nuevaAula.setNombre("C.0.7");
		nuevaAula.setListAlumnos(listaAula);
		
		
		try {
		controller.setAula(nuevaAula);
	
		System.out.println("Pasando de objetos a XML");
		controller.printXML();
		controller.writeXMLFile(DATA);
		
		 System.out.println();

         // Leemos el XML y lo pasamos a objetos
         System.out.println("Pasando de XML a Objetos");
         Aula aulaNueva2 = controller.getAula(DATA);
         System.out.println();
         System.out.println("Todos los alumnos");
         System.out.println(aulaNueva2);
		} 
			catch(JAXBException e) 
		{
			e.printStackTrace();
		}
		
		
		
		
	}

}
