package practica6;

public class Coche {
	/**
	 * 
	 * @author Daniel Rodríguez Cea
	 * 
	 * Clase Coche en la que definimos los atributos del coche y después le implementamos los metodos de TipoDeCombustible
	 * 
	 * GasolinaCoche, DieselCoche, HibridoCoche y MatriculaCoche.
	 *
	 */

	//creamos la constante
	private static final String EL_COCHE_CON_MATRICULA = "El coche con matricula";
	
	 String matricula;
	 String combustible;
	 String modelo;
	 String fabricante;
	 

	public Coche() {
		matricula="";
		combustible="";
		modelo="";
		fabricante ="";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula=m;
		combustible=c;
		modelo=mo;
		fabricante=f;
	}
	
	//Método que nos devuelve la matrícula del coche.
	
	
	/**
	* 
	* @return cadena con la matrícula del coche
	* 
	*/

	private String MatriculaCoche() {
		return EL_COCHE_CON_MATRICULA + matricula + " ";
	}
	
	
	
	//Método que devuelve el resultado de los coches que utilizan gasolina
	/**
	 * 
	 * @param modelo le pasamos el tipo de modelo del coche.
	 * 
	 * @param fabricante le pasamos el tipo de fabricante del coche.
	 * 
	 * @return Devuelve el consumo de combustible del coche que utiliza gasolina.
	*/

	
	public String GasolinaCoche (String modelo, String fabricante)
	{
	
		String resultado =" es un "+ fabricante + modelo + "y gasta 1,337 euros por litro.";
		return resultado;
	}
	
	//Método que devuelve el resultado de los coches que utilizan Diesel
	/**
	 * 
	 * @param modelo le pasamos el tipo de modelo del coche.
	 * 
	 * @param fabricante le pasamos el tipo de fabricante del coche.
	 * 
	 * @return Devuelve el consumo de combustible del coche que utiliza Diesel.
	 */

	
	public String DieselCoche (String modelo, String fabricante)
	{
		String resultado =" es un "+ fabricante + modelo + "y gasta 1,052 euros por litro.";
		return resultado;
	}
	
	//Método que devuelve el resultado de los coches hibridos
	/**
	 * 
	 * @param modelo le pasamos el tipo de modelo del coche.
	 * 
	 * @param fabricante le pasamos el tipo de fabricante del coche.
	 * 
	 * @return Devuelve que no necesita cumbustible.
	 */
	
	
	public String HibridoCoche (String modelo, String fabricante)
	{
		String resultado =" es un "+ fabricante + modelo + "y no necesita combustible.";
		return resultado;
	}
	
	//Método que según el tipo de combustible que utiliza coche nos devuelve una cadena.
	/**
	 * 
	 * @return reultado es la información de cada coche según los atributos.
	 *
	 */
	
	public String tipoDeCombustible() {
		String resultado = "";
		switch(combustible) {
		case "Gasolina":
			resultado += MatriculaCoche() + GasolinaCoche(modelo, fabricante);
			break;
		case "Diésel":
			resultado += MatriculaCoche() + DieselCoche(modelo, fabricante);
			break;
		case "Híbrido":
			resultado += MatriculaCoche() + HibridoCoche(modelo, fabricante);
			break;
		default:
			resultado += MatriculaCoche() + "no dispone de información";
		}
		return resultado;

	}

	
}
