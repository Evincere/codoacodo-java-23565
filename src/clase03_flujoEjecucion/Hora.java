package clase03_flujoEjecucion;

import java.time.LocalTime;

public class Hora {

	public static void main(String[] args) {
		// Obtener la hora actual del sistema
        LocalTime horaActual = LocalTime.now();

        // Obtener la hora y los minutos
        int hora = horaActual.getHour();
        int minutos = horaActual.getMinute();
        String minutosFormateados = String.format("%02d", minutos);

        // Imprimir un saludo según la hora del sistema
        if (hora < 12) {
            System.out.println("Buen día");
        } else if (hora < 18) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }

        // Imprimir la hora actual
        System.out.println("La hora actual es: " + hora + ":" + minutosFormateados);
	}
}
