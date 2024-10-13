package simuladorrr;

public class Programa {
    public static void main(String[] args) {
        
        Coche coche = new Coche("ABC123", 4);
        System.out.println("Información del coche:");
        System.out.println(coche);  

        
        coche.acelerar(50);
        System.out.println("El coche después de acelerar 50 km/h:");
        System.out.println(coche);  

        
        Camion camion = new Camion("DEF456");
        System.out.println("\nInformación del camión sin remolque:");
        System.out.println(camion);  

        
        camion.acelerar(80);
        System.out.println("El camión después de acelerar 80 km/h:");
        System.out.println(camion);  

        
        Remolque remolque = new Remolque(1500);
        camion.setRemolque(remolque);
        System.out.println("\nInformación del camión con remolque:");
        System.out.println(camion);  

        
        camion.acelerar(30);
        System.out.println("El camión después de acelerar 30 km/h más (debería aparecer un mensaje de advertencia):");
        System.out.println(camion);  

        
        camion.quitarRemolque();
        System.out.println("\nInformación del camión después de quitar el remolque:");
        System.out.println(camion); 
    }
}

