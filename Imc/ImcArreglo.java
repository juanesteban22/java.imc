package Imc;

import javax.swing.JOptionPane;

public class ImcArreglo {
	public void iniciar() {
		menu();
	}
	
	public void menu() {
		 int opcion = 0;
	        do {
	            opcion = mostrarMenu();
	            switch (opcion) {
	                case 1:
	                    calcularIMC();
	                    break;
	                case 2:
	                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Opción inválida. Inténtalo nuevamente.");
	                    break;
	            }
	        } while (opcion != 2);
	}

    public int mostrarMenu() {
        String opcionStr = JOptionPane.showInputDialog(
                "Calculadora de Índice de Masa Corporal (IMC)\n\n"
                        + "1. Calcular IMC\n"
                        + "2. Salir\n\n"
                        + "Ingrese el número de la opción deseada:");
        return Integer.parseInt(opcionStr);
    }

    public static void calcularIMC() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en kg:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en metros:"));

        double imc = peso / (altura * altura);
        String mensaje = "Nombre: " + nombre + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " m\n"
                + "IMC: " + imc + "\n\n";

        if (imc <= 18) {
            mensaje += "Clasificación: Sufre de anorexia";
        } else if (imc >= 18 && imc < 20) {
            mensaje += "Clasificación: Sufre de delgadez";
        } else if (imc >= 20 && imc < 27) {
            mensaje += "Clasificación: Tiene peso normal";
        } else if (imc >= 27 && imc < 30) {
            mensaje += "Clasificación: Sufre de obesidad (grado 1)";
        } else if (imc >= 30 && imc < 35) {
            mensaje += "Clasificación: Sufre de obesidad (grado 2)";
        } else if (imc >= 35 && imc < 40) {
            mensaje += "Clasificación: Sufre de obesidad (grado 3)";
        } else {
            mensaje += "Clasificación: Sufre de obesidad morbida";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
 }
 
