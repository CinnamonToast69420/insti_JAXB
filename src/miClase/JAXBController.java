package miClase;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;


public class JAXBController {
	 private static JAXBController instance;
	    private Marshaller marshaller;
	    private Unmarshaller unmarshaller;
	    private Aula cecerosiete;

	public static JAXBController getInstance() 
	{
		if(instance == null) 
		{
			instance = new JAXBController();
		}
		return instance;
	}
	
	private void convertObjectToXML(Aula  aula) throws JAXBException
	{
		this.cecerosiete =  aula;
		// creación del contexto
		JAXBContext contexto = JAXBContext.newInstance(Aula.class);
		// hacer Marshall/ serializar
		this.marshaller = contexto.createMarshaller();
		this.marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	}
	
	/*cargar datos y convertirlos en XML*/
	
	public void setAula(Aula aula) throws JAXBException 
	{
		convertObjectToXML(aula);
	}
	
	public void  writeXMLFile(String uri) throws JAXBException
	{
		this.marshaller.marshal(cecerosiete, new File(uri));
		System.out.println("Fichero generado con éxito!");
		
	}
	
	//Mostrar el contenido del aula.
	public void printXML() throws JAXBException
	{
		this.marshaller.marshal(cecerosiete, System.out);
	}

	private Aula convertXMLToObject(String uri) throws JAXBException
	{
		//Se crea el contexto
		JAXBContext contexto  = JAXBContext.newInstance(Aula.class);
		this.unmarshaller = contexto.createUnmarshaller();
		// unmarshall 
		this.cecerosiete = (Aula) this.unmarshaller.unmarshal(new File(uri));
		return this.cecerosiete;
	}
	
	// carga los datos de un xml con un aula y los convierte en objetos
	public Aula getAula(String uri) throws JAXBException
	{
		return convertXMLToObject(uri);
	}
	
	
}

