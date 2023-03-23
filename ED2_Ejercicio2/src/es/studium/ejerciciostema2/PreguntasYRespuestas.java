package es.studium.ejerciciostema2;

import java.util.Scanner;

public class PreguntasYRespuestas
{

	private static String preguntaNombre = "¿Cómo te llamas?"; //la hemos extraído seleccionando field declaration en refactor -> convert local variable to field para que nos salga fuera del main y así poderla utilizar en toda la clase y no solo en el main
	private static String preguntaEdad = "¿Cuántos años tienes?";
	private static String preguntaCurso = "¿En qué curso estás?";
	
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in); //instanciar un objeto de tipo scanner
		
		String nombre = preguntaNombreUsuario(teclado); //rename
		
		String edad = preguntaEdadUsuario(teclado); //rename
		
		String curso = preguntaCursoUsuario(teclado); //rename
		
		mensaje(nombre, edad, curso);
		
		teclado.close();
	}

	public static String preguntaCursoUsuario(Scanner teclado)
	{
		System.out.println(preguntaCurso); //extraer como variable local
		String curso = teclado.nextLine();
		return curso;
	}

	public static String preguntaEdadUsuario(Scanner teclado)
	{
		System.out.println(preguntaEdad); //extraer como variable local
		String edad = teclado.nextLine();
		return edad;
	}

	public static String preguntaNombreUsuario(Scanner teclado) //lo extraemos como método
	{
		System.out.println(preguntaNombre); //extraer como variable local por si necesitaramos cambiar la cadena más adelante
		String nombre = teclado.nextLine();
		return nombre;
	}
	
	public static void mensaje(String nombre, String edad, String curso) //rename
	{
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " años y estás en " + curso);
	}


}


