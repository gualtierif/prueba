package coleccionesGenericas.excepciones;

public class CupoExcedidoException extends Exception {
	/**
	 * CupoExcedidoException es una excepci�n creada para indicar que se 
	 * quiere asignar m�s socios de los permitidos a una clase.
	 */
	private static final long serialVersionUID = -2537419023689256036L;
	private final String message = "Cupo Excedido";

	/*
	 * El indicador @Override est� sobreescribiendo la definici�n del m�todo
	 * toString() que heredamos de la clase Exception. De esta forma, cuando
	 * se quiera acceder al mensaje de la excepci�n obtendremos un mensaje
	 * personalizado.
	 */
	@Override
	public String toString() {
		return (message);
	}
}
