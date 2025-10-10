package ejercicio_nueve;

public class Ejercicio_Nueve {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Santiago", "Galeno");
        Profesional profesional = new Profesional("Franco", "Oftalmologo");
        CitaMedica turno = new CitaMedica("20/10/2025", "15:00", paciente, profesional);
        
        System.out.println(turno);
        
    }
}
