package practica6;

public class Coche {
	String matricula;
	String atrib;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		atrib = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		atrib = c;
		modelo = mo;
		fabricante = f;
	}
	
	
	public String Gasolinacoche (String modelo, String fabricante)
	{
		//extraer variable
		//duplicacion de codigo
		String resultado =" es un "+ fabricante + modelo + "y gasta 1,337 euros por litro.";
		return resultado;
	}
	

	public String DieseCoche (String modelo, String fabricante)
	{
		String resultado =" es un "+ fabricante + modelo + "y gasta 1,052 euros por litro.";
		return resultado;
	}
	
	
	public String HibridoCoche (String modelo, String fabricante)
	{
		String resultado =" es un "+ fabricante + modelo + "y no necesita combustible.";
		return resultado;
	}

	public String metodo1() {
		String resultado = "";
		if (atrib == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += Gasolinacoche(modelo, fabricante);
		} else if (atrib == "Diesel") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += DieseCoche(modelo, fabricante);
		} else if (atrib == "Híbrido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += HibridoCoche(modelo, fabricante);
		} else {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}
}
