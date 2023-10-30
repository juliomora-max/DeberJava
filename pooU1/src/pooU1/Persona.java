package pooU1;

public class Persona {

	public static void main(String[] args) {
		import java.security.SecureRandom;
		import java.util.Scanner;

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SecureRandom random = new SecureRandom();

		System.out.println("Bienvenido al Programa de Instrucción Asistida por Computadora”);
		System.out.println("Elegir nivel de dificultad:”);
		System.out.println("1 - Números de un dígito:”);
		System.out.println("2 – Números de dos dígitos:”);
		int nivelDificultad = scanner.nextInt();

		System.out.println("Elige el tipo de problema aritmético:”);
		System.out.println("1 – Suma”);
		System.out.println("2 – Resta”);
		System.out.println("3 – Multiplicación”);
		System.out.println("4 – División”);
		System.out.println("5 – Mezcla Aleatoria”);
		int tipoProblema = scanner.nextInt();

		int preguntasCorrectas = 0;
		int preguntasIncorrectas = 0;
		int totalPreguntas = 0;
		while (preguntasCorrectas <10) {
		    int num1 = generateNumber(nivelDificultad);
		    int num2 = generateNumber(nivelDificultad);
		    String operador = getOperator(tipoProblema);
		                        
		    int respuesta = askQuestion(num1, num2, operador);
		    totalPreguntas++;

		    if (checkAnswer(num1, num2, operador, respuesta)) {
                preguntasCorrectas++;
                displayPositiveResponse(random);
            } else {
                  preguntasIncorrectas++;
                  displayNegativeResponse(random);
            }
            if (preguntasCorrectas + preguntasIncorrectas == 10) {
                 double porcentajeCorrecto = (double) preguntasCorrectas / totalPreguntas * 100;
                 if (porcentajeCorrecto < 75) {
                	 System.out.println("Por favor pide ayuda adicional a tu instructor.");
                 } else {
                	 System.out.println("Felicidades, estás listo para pasar al siguiente nivel!");
                	 System.out.println("Reiniciando el programa para otro estudiante.");
                	 preguntasCorrectas = 0;
                	 preguntasIncorrectas = 0;
                	 totalPreguntas = 0;
                 }
            }
		}
    }
    
    private static int generaNumber(int nivelDificultad) {
    	if (nivelDificultad == 1) {
    		return (int)(Math.random() * 10);
    	} else {
    		return (int)(math.random() * 100);
    	}
    }
    
    private static String getOperator(int tipoProblema) { 
    	String[] operadores = {"+", "-", "*", "/"};
    	if(tipoProblema ==5) {
    		return operadores[(int)(Math.random() *operadores.length)];
    	}else {
    		return operadores[tipoProblema -1];
    	}
    }
    
    private static int askQuestion(int num1, int num2, String operador) {
    	System.out.print("¿Cuanto es" + num1 + "" + operador + "" + num2+ "?");
    	Scanner scanner = new Scanner(System.in);
    	return scanner.nextInt();
    }
    
    private static boolean checkAnswer(int num1, int num2, String operador,int respuesta) {
    	switch (operador) {
    	case "+":
    		return num1 + num2 == respuesta;
    	case "-":
    		return num1 + num2 == respuesta;
    	case "*":
    		return num1 + num2 == respuesta;
    	case "/":
    		return num2 != 0 && num1 / num2 == respuesta;
    	}
    	return false;
    }
    
    private static void displayPositiveResponse(SecureRandom random) {
    	String[] respuestasPositivas = {"¡Muy bien!", "¡Excelente!", "¡Buen trabajo!", "¡Sigue así!"};
    	int index = random.nextInt(respuestasPositivas.length);
    	System.out.println(respuestasPositivas[index];)
    }
    }
    }