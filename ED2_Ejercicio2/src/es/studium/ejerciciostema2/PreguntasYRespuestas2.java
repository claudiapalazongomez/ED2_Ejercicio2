package es.studium.ejerciciostema2;

import java.util.Scanner;

public class PreguntasYRespuestas2
{

	private static final String EN_QUE_CURSO_ESTAS = "¿En qué curso estás?";
	private static final String CUANTOS_ANHOS_TIENES = "¿Cuántos años tienes?";
	private static final String COMO_TE_LLAMAS = "¿Cómo te llamas?";

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		preguntar(COMO_TE_LLAMAS); //extraer como constante y como método que será la pregunta al usuario (solo nos coge uno así que tenemos que modificarlo en el public static void preguntar) y poner la pregunta entre paréntesis para que nos detecte el String que hemos puesto en el método
		String nombre = responder(teclado); //extraer método como respuesta del usuario
		
		preguntar(CUANTOS_ANHOS_TIENES); //extraer como constante
		String edad = responder(teclado);
		
		preguntar(EN_QUE_CURSO_ESTAS); //extraer como constante
		String curso = responder(teclado);
		
		mensaje(nombre, edad, curso);
		
		teclado.close();
	
	}

	public static void preguntar(String pregunta) //le ponemos String pregunta
	{
		System.out.println(pregunta); //para que nos saque la pregunta
	}

	public static String responder(Scanner teclado)
	{
		return teclado.nextLine();
	}
	
	public static void mensaje(String nombre, String edad, String curso)
	{
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " años y estás en " + curso);
	}


}
