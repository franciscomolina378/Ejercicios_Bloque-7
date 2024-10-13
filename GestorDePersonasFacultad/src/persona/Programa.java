package persona;

public class Programa {
    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante("Pedro", "Gómez", "12345678", "Soltero", "Ingeniería de Software");
        System.out.println("Información del estudiante:");
        System.out.println(estudiante);

        
        Profesor profesor = new Profesor("Ana", "Pérez", "87654321", "Casado", 2005, "Despacho 101", "Matemáticas");
        System.out.println("\nInformación del profesor:");
        System.out.println(profesor);

        
        PersonalServicio personalServicio = new PersonalServicio("Luis", "Fernández", "56789012", "Viudo", 2010, "Despacho 202", "Biblioteca");
        System.out.println("\nInformación del personal de servicio:");
        System.out.println(personalServicio);

        
        System.out.println("\nCambiando estado civil del estudiante...");
        estudiante.setEstadoCivil("Casado");
        System.out.println(estudiante);

        
        System.out.println("\nMatriculando al estudiante en un nuevo curso...");
        estudiante.matricularEnNuevoCurso("Arquitectura");
        System.out.println(estudiante);

        
        System.out.println("\nReasignando despacho del profesor...");
        profesor.reasignarDespacho("Despacho 102");
        System.out.println(profesor);

        
        System.out.println("\nTrasladando personal de servicio a nueva sección...");
        personalServicio.trasladarSeccion("Decanato");
        System.out.println(personalServicio);
    }
}

