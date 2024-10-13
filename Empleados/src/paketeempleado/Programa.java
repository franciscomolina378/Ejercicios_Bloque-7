package paketeempleado;

public class Programa{
    public static void main(String[] args) {
        
        Empleado supervisor = new Empleado("Juan", "Pérez", "12345678", "Calle 26", "555-1234", 50000, 10, null);
        Empleado empleado = new Empleado("Carlos", "González", "87654321", "Calle 11", "555-4321", 30000, 5, supervisor);

        
        Secretario secretario = new Secretario("Ana", "Martínez", "34567890", "Calle 13", "555-6789", 25000, 3, supervisor, "Despacho 1", "1234-5678");

        
        Vendedor vendedor = new Vendedor("Luis", "Fernández", "23456789", "Calle 24", "555-2345", 40000, 6, supervisor, "ABC-123", "555-9876", "Zona Norte", 0.10);
        vendedor.darAltaCliente("Cliente 1");
        vendedor.darAltaCliente("Cliente 2");

        
        JefeDeZona jefeDeZona = new JefeDeZona("Laura", "López", "45678901", "Calle 2", "555-1010", 60000, 12, supervisor, "Despacho Principal", "DEF-456");
        jefeDeZona.setSecretario(secretario);
        jefeDeZona.darAltaVendedor(vendedor);

        
        System.out.println("Información del empleado:");
        System.out.println(empleado);

        System.out.println("\nInformación del secretario:");
        System.out.println(secretario);

        System.out.println("\nInformación del vendedor:");
        System.out.println(vendedor);

        System.out.println("\nInformación del jefe de zona:");
        System.out.println(jefeDeZona);

       
        System.out.println("\nIncrementando salario del empleado...");
        empleado.incrementarSalario(1000);
        System.out.println(empleado);

        System.out.println("\nIncrementando salario del secretario...");
        secretario.incrementarSalario(1000);  // 5%
        System.out.println(secretario);

        System.out.println("\nIncrementando salario del vendedor...");
        vendedor.incrementarSalario(1000);  // 10%
        System.out.println(vendedor);

        System.out.println("\nIncrementando salario del jefe de zona...");
        jefeDeZona.incrementarSalario(1000);  //  20%
        System.out.println(jefeDeZona);
    }
}
