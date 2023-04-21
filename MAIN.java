import java.util.Scanner;

public class MAIN {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean selector= true;    
    do{ 
      int opcion=0; 
        System.out.println("Que desea realizar?");
        System.out.println("1.- Crear una instancia de Automovil de combustion");
        System.out.println("2.- Crear una instancia de Automovil electrico");
        System.out.println("3.- Crear una instancia de Avion");
        System.out.println("4.- Crear una instancia de Autobus");
        System.out.println("5.- Crear una instancia de Motocicleta");
        System.out.println("6.- SALIR");
        opcion = scanner.nextInt();
        
        switch(opcion){
          case 1: 
              System.out.println("Ingrese la marca: ");
              scanner.nextLine();
              String marca =scanner.nextLine();
              linea(); 
              System.out.println("ingrese el modelo");
              String modelo =scanner.nextLine();
              linea(); 
              System.out.println("ingrese el año del vehiculo ");
              int año = scanner.nextInt();
              linea(); 
              System.out.println("Ingrese los litros de comustible ");
               float combustible  = scanner.nextFloat();
              linea(); 
              System.out.println("Ingrese el cilindraje: ");
              float cilindraje = scanner.nextFloat();
              linea(); 
              Combustion obj= new Combustion(marca, modelo, año, combustible , cilindraje ); 
              System.out.println("Se creo un objeto auto de combustion");
              System.out.println("A contiuacion se usan los metodos set para mostrar las propiedades del producto ");
                  System.out.println("Marca:"+ obj.getMarca()); 
                   System.out.println("Modelo:"+obj.getModelo()); 
                   System.out.println("year:"+obj.getYear()); 
                   System.out.println("Combustible"+obj.getCombustible()); 
                   System.out.println("Numero de cilindros "+obj.getCilindraje()); 
                   linea(); 
              break; 
          case 2: 
            imprimir("Ingrese la marca del vehiculo");
            scanner.nextLine();
            marca =scanner.nextLine(); 
            linea(); 
            imprimir("Ingrese el modelo");
            modelo=scanner.nextLine();
            linea(); 
            imprimir ("Ingrese el año del vehicuo"); 
            int  year=scanner.nextInt(); 
            linea(); 
            imprimir("Ingrese el numero de Ampers de la bateria"); 
            float ampers = scanner.nextFloat();
            linea(); 
            imprimir("Ingrese el numero de volts de la bateria");
            float volts = scanner.nextFloat();
            linea(); 
            Electrico obje= new Electrico(marca, modelo, year);//Se crea el obj electrico
            Bateria bat = new Bateria( 33, volts); // se crea el obj bateria
            linea();
            System.out.println("Se creo un objeto auto de electrico y un objeto bateria ");
            linea(); 
            System.out.println("Marca:"+ obje.getMarca());
            System.out.println("Modelo:"+obje.getModelo()); 
            System.out.println("year:"+obje.getYear());
            imprimir("Ampers :" + bat.getAmpers());      
            imprimir("Volts :" + bat.getVoltaje()); 
            imprimir("Se usan los metodos propios de bateria y Electrico"); 
            imprimir(obje.iniciarAhorroBateria()); 
            imprimir( obje.recargarBateria(volts)); 
            imprimir(bat.cargar()); 
            imprimir(bat.descargar()); 
            //menu();       
            break; 
          case 3: // Para la clase avion 
            System.out.println("Ingrese la aerolínea: ");
            scanner.nextLine();
            String aerolinea = scanner.nextLine();
    
            System.out.println("Ingrese el número de vuelo: ");
            int numVuelo = scanner.nextInt();
    
            System.out.println("Ingrese la altitud: ");
            float altitud = scanner.nextFloat();
    
            System.out.println("Ingrese el número de pasajeros: ");
            int numPasajeros = scanner.nextInt();
            scanner.nextLine();
            Pasajero[] pasajeros = new Pasajero[numPasajeros];
            for (int i = 0; i < numPasajeros; i++) {
               // Solicitar los datos del pasajero
               System.out.println("Ingrese el nombre del pasajero " + (i+1) + ":");
               scanner.nextLine();
               String nombrePasajero = scanner.nextLine();
               System.out.println("Ingrese el número de asiento del pasajero " + (i+1) + ":");
               int numAsiento = scanner.nextInt();
               // Crear el objeto Pasajero y agregarlo al arreglo
               Pasajero pasajero = new Pasajero(nombrePasajero, numAsiento);
               pasajeros[i] = pasajero;
            }
            linea(); 
            // Crear objeto Avion con los valores ingresados
            Avion avion = new Avion(aerolinea, numVuelo, altitud, pasajeros);
            // Imprimir los valores
            linea();
            System.out.println("Aerolínea: " + avion.aerolinea);
            System.out.println("Número de vuelo: " + avion.getNumVuelo());
            System.out.println("Altitud: " + avion.altitud);
            System.out.println("Pasajeros:" + numPasajeros);
            imprimir("Llamando a  los métodos propios de la clase Avion"); 
            imprimir(avion.aterrizar());
            imprimir(avion.despegar());
            linea(); 
            break;
          case 4:  
            Autobus bus = new Autobus();
            Pasajero[] pasajerosAutobus = new Pasajero[28];
            bus.pasajeros = pasajerosAutobus;
            bus.asientos = 30;
            System.out.println("\n######################################################");
            System.out.println("El autobus ha sido creado con capacidad de " + bus.asientos+ " asientos.");
            System.out.println("Los pasajeros abordo son " + bus.pasajeros.length+" pasajeros.");
            System.out.println("######################################################\n");
            linea();
            break; 
          case 5: 
            Motocicleta moto = new Motocicleta();
            Casco casco = new Casco();
            LlantaDeMoto[] llantas = new LlantaDeMoto[2];
            casco.marca = "Italika";
            casco.talla = 2;
            casco.modelo = 1.1;
            moto.marca = "Italika";
            moto.modelo = "cakarstioe";
            moto.cilindraje = 4;
            moto.year = 2002;
            moto.tamanoDeLaLlanta = 30;
            moto.combustible = 40;
            moto.casco = casco;
            System.out.println("\n######################################################");
            System.out.println("Casco creado usando valores default.");
            System.out.println("Una motocicleta ha sido creada usando valores default.");
            moto.llantas = llantas;
            System.out.println("Las llantas has sido asignadas a la moto.");
            System.out.println("######################################################\n");
            break; 
          case 6: 
            System.out.println("Usted eligio salir.");
            selector=false; 
            break; 
        }
    }while(selector==true); 
    scanner.close();
    System.out.println("El escaner fue cerrado.");
  }
  public static void linea() {  
    System.out.println("\n"); 
  } 
  public static void imprimir(String texto){ 
    System.out.println(texto); 
  }
}


