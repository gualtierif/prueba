package coleccionesGenericas;

import java.util.Collections;
import java.util.List;

import coleccionesGenericas.clases.*;
import coleccionesGenericas.excepciones.CupoExcedidoException;

public class Main {

	public static void main(String[] args) {
		/*
		 * En este ejemplo se crear� un listado de socios, que se asociar�n a un
		 * curso y de esta forma determinar si la clase est� llena o no.
		 */
		List<Socio> socios = Socio.getListaDeSocios(15);
		Curso curso = Curso.getDefaultInstance();

		// Creo la inscripci�n con los objetos generados previamente.
		Inscripcion inscripcion = new Inscripcion(curso, 20);
		try {
			/*
			 * Incluyo el listado de Socios a la inscripci�n. En caso que el
			 * cupo se exceda se generar� una Excepci�n de tipo
			 * CupoExcedidoException.
			 */
			inscripcion.setSocios(socios);
		} catch (CupoExcedidoException e) {
			e.printStackTrace();
		}

		/*
		 * Dentro del println se ejecuta de forma autom�tica el m�todo toString
		 * de la clase que queremos imprimir,por eso al sobreescribir el m�todo
		 * toString en la clase Inscripcion obtenemos un mensaje personalizado y
		 * al utilizarlo en la clase Curso, donde no sobreescribimos el m�todo
		 * toString, obtenemos un valor de referencia de la clase como
		 * respuesta.
		 */
		System.out.println(curso);
		System.out.println(inscripcion);

		/*
		 * Ahora vamos a ordenar la lista de socios de forma descendente por
		 * DNI. Esto lo hacemos gracias al m�todo compareTo que sobreescribimos
		 * en la clase Socio.
		 */
		Collections.sort(inscripcion.getSocios(), Collections.reverseOrder());
		System.out.println(inscripcion);

		/*
		 * Ahora vamos a ordenar la lista de socios de forma ascendente por
		 * Nombre. Esto lo hacemos gracias al m�todo est�tico
		 * compararSociosPorNombre que definimos en la clase Socio.
		 */
		Collections.sort(inscripcion.getSocios(), Socio.compararSociosPorNombre);
		System.out.println(inscripcion);

		System.out.println("FIN");
	}

}
