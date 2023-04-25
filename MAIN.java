import java.util.Scanner;

public class MAIN {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean selector= true;    
    do{ 
      int opcion=0; 
      System.out.println("\n=====================================================================");
      System.out.println("Que desea realizar?");
      System.out.println("1.- Crear una instancia de Automovil de combustion");
      System.out.println("2.- Crear una instancia de Automovil electrico");
      System.out.println("3.- Crear una instancia de Avion");
      System.out.println("4.- Crear una instancia de Autobus");
      System.out.println("5.- Crear una instancia de Motocicleta");
      System.out.println("6.- SALIR");
      System.out.print("Ingresa tu opcion: ");
      opcion = scanner.nextInt();
      System.out.println("=====================================================================");
      
      switch(opcion){
        case 1: 
          System.out.println("\n\n#########################################");
          System.out.println("PROBANDO CLASE DE AUTOMOVIL DE COMBUSTION");
          System.out.println("#########################################");
          System.out.println("Ingrese la marca: ");
          scanner.nextLine();
          String marca =scanner.nextLine();
          System.out.println("ingrese el modelo");
          String modelo =scanner.nextLine();
          System.out.println("ingrese el año del vehiculo ");
          int año = scanner.nextInt();
          System.out.println("Ingrese los litros de comustible ");
          float combustible  = scanner.nextFloat();
          System.out.println("Ingrese el cilindraje: ");
          float cilindraje = scanner.nextFloat();
          Combustion obj= new Combustion(marca, modelo, año, combustible , cilindraje ); 
          System.out.println("\nSe creo un objeto auto de combustion");
          System.out.println("A contiuacion se usan los metodos set para mostrar las propiedades del producto ");
          System.out.println("Marca:"+ obj.getMarca()); 
          System.out.println("Modelo:"+obj.getModelo()); 
          System.out.println("year:"+obj.getYear()); 
          System.out.println("Combustible"+obj.getCombustible()); 
          System.out.println("Numero de cilindros "+obj.getCilindraje()); 
          System.out.println("\nPROBANDO EL METODO toString() DE LA CLASE");
          System.out.println(obj);
          //HERENCIA
          //De vehiculo
          System.out.println("\nPROBANDO LOS METODOS Y ATRIBUTOS HEREDADOS DE VEHICULO");
          System.out.println("Encender motor desde carro combustion: "+obj.encenderMotor());
          System.out.println("Acelerar desde carro de combustion: " + obj.acelerar(10));
          //De automovil
          System.out.println("\nPROBANDO LOS METODOS Y ATRIBUTOS HEREDADOS DE AUTOMOVIL");
          System.out.println("Probando los metodos heredados:");
          System.out.println("Encender aire desde el carro: " + obj.encenderAire());
          System.out.println("Encender intermitentes desde carro: " + obj.encenderIntermitentes());
          System.out.println("Inclinar asientos desde carro: " + obj.inclinarAsientos());
          System.out.println("Abrir puertas desde carro: "+obj.abrirPuertas());
          System.out.println("#########################################");
          break; 
        case 2: 
          System.out.println("\n\n#########################################");
          System.out.println("PROBANDO CLASE DE AUTOMOVIL ELECTRICO");
          System.out.println("#########################################");
          imprimir("Ingrese la marca del vehiculo");
          scanner.nextLine();
          marca =scanner.nextLine(); 
          imprimir("Ingrese el modelo");
          modelo=scanner.nextLine();
          imprimir ("Ingrese el año del vehicuo"); 
          int  year=scanner.nextInt(); 
          imprimir("Ingrese el numero de Ampers de la bateria"); 
          float ampers = scanner.nextFloat();
          imprimir("Ingrese el numero de volts de la bateria");
          float volts = scanner.nextFloat();
          Electrico obje= new Electrico(marca, modelo, year);//Se crea el obj electrico
          Bateria bat = new Bateria( 33, volts); // se crea el obj bateria
          System.out.println("Se creo un objeto auto de electrico y un objeto bateria ");
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
          System.out.println("\nPROBANDO EL METODO toString() DE LA CLASES");
          System.out.println(obje);
          System.out.println(bat);
          //HERENCIA
          //De vehiculo
          System.out.println("\nPROBANDO LOS METODOS Y ATRIBUTOS HEREDADOS DE VEHICULO");
          System.out.println("Encender motor desde carro electrico: "+obje.encenderMotor());
          System.out.println("Acelerar desde carro de electrico: " + obje.acelerar(10));
          //De automovil
          System.out.println("\nPROBANDO LOS METODOS Y ATRIBUTOS HEREDADOS DE AUTOMOVIL");
          System.out.println("Probando los metodos heredados:");
          System.out.println("Encender aire desde el carro: " + obje.encenderAire());
          System.out.println("Encender intermitentes desde carro: " + obje.encenderIntermitentes());
          System.out.println("Inclinar asientos desde carro: " + obje.inclinarAsientos());
          System.out.println("Abrir puertas desde carro: "+obje.abrirPuertas());
          System.out.println("#########################################");
          break; 
        case 3: // Para la clase avion 
          System.out.println("\n\n#########################################");
          System.out.println("PROBANDO CLASE AVION");
          System.out.println("#########################################");
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
          // Crear objeto Avion con los valores ingresados
          Avion avion = new Avion(aerolinea, numVuelo, altitud, pasajeros);
          // Imprimir los valores
          System.out.println("Aerolínea: " + avion.aerolinea);
          System.out.println("Número de vuelo: " + avion.getNumVuelo());
          System.out.println("Altitud: " + avion.altitud);
          System.out.println("Pasajeros:" + numPasajeros);
          imprimir("Llamando a  los métodos propios de la clase Avion"); 
          imprimir(avion.aterrizar());
          imprimir(avion.despegar());
          System.out.println("\nPROBANDO EL METODO toString() DE LA CLASE");
          System.out.println(avion);
          //HERENCIA
          System.out.println("\nPROBANDO LOS METODOS Y ATRIBUTOS HEREDADOS POR VEHICULO");
          System.out.println("Encender motor desde avion: " + avion.encenderMotor());
          System.out.println("Acelerar desde avion: " + avion.acelerar(10));
          Pasajero p10 = new Pasajero("Volare", 1);
          System.out.println("\nPROBANDO LO REFERENTE A PASAJERO");
          System.out.println("Tomar asiento por un pasajero: " + p10.tomarAsiento());
          System.out.println("Reclinar Asiento por un pasajero: " +p10.reclinarAsiento(1));
          System.out.println("\nPROBANDO EL METODO toString() DE LA CLASE");
          System.out.println(p10);
          System.out.println("#########################################");
          break;
        case 4:  
          System.out.println("\n\n#########################################");
          System.out.println("PROBANDO CLASE AUTOBUS");
          System.out.println("#########################################");
          Autobus bus = new Autobus();
          Pasajero[] pasajerosAutobus = new Pasajero[28];
          bus.pasajeros = pasajerosAutobus;
          bus.asientos = 30; 
          Pasajero p = new Pasajero(bus.EMPRESA, 1);
          System.out.println("\nPROBANDO LOS METODOS Y ATRIBUTOS PROPIOS");
          System.out.println("El autobus ha sido creado con capacidad de " + bus.asientos+ " asientos.");
          System.out.println("Los pasajeros abordo son " + bus.pasajeros.length+" pasajeros.");
          System.out.println("Abrir compuertas: "+bus.abrirCompuerta());
          System.out.println("Prender intermitentes: " + bus.prenderIntermitentes(100));
          System.out.println("Apagar intermitentes: " + bus.apagarIntermitentes());
          System.out.println("\nPROBANDO EL METODO toString() DE LA CLASE");
          System.out.println(bus);
          //HERENCIA
          System.out.println("\nPROBANDO LOS METODOS Y ATRIBUTOS HEREDADOS POR VEHICULO");
          System.out.println("Encender motor desde autobus: " + bus.encenderMotor());
          System.out.println("Acelerar desde autobus: " + bus.acelerar(10));
          System.out.println("\nPROBANDO LOS METODOS Y ATRIBUTOS HEREDADOS POR TAQUILLA");
          System.out.println("Comprar boletod desde autobus: " + bus.comprarBoleto(100) );
          System.out.println("Asignar lugar desde autobus: " + bus.asingnarLugar(1));
          System.out.println("Empresa: " + bus.EMPRESA);
          System.out.println("Precio a estudiantes: " + bus.PRECIO_SUGERIDO);
          System.out.println("\nPROBANDO LO REFERENTE A PASAJERO");
          System.out.println("Tomar asiento por un pasajero: " + p.tomarAsiento());
          System.out.println("Reclinar Asiento por un pasajero: " +p.reclinarAsiento(1));
          System.out.println("#########################################");
          break; 
        case 5: 
          System.out.println("\n\n#########################################");
          System.out.println("PROBANDO CLASE MOTOCICLETA");
          System.out.println("#########################################");
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
          System.out.println("Casco creado usando valores default.");
          System.out.println("Una motocicleta ha sido creada usando valores default.");
          moto.llantas = llantas;
          System.out.println("\nPROBANDO LOS EMTODOS Y ATRIBUTOS PROPIOS DE LA MOTO");
          System.out.println("Marca: " + moto.marca);
          System.out.println("Modelo: " + moto.modelo);
          System.out.println("Cilindros: " + moto.cilindraje);
          System.out.println("Año: " + moto.year);
          System.out.println("Tamaño de las llantas: " + moto.tamanoDeLaLlanta);
          System.out.println("Combustible: " + moto.combustible);
          System.out.println("Llantas: " + moto.llantas.length);
          System.out.println("Las llantas has sido asignadas a la moto.");
          System.out.println("\nPROBANDO EL METODO toString() DE LA CLASE");
          System.out.println(moto);
          System.out.println("\nPROBANDO LO REFERENTE AL CASCO");
          System.out.println("Marca: " + casco.marca);
          System.out.println("Talla: " + casco.talla);
          System.out.println("Modelo: " + casco.modelo);
          System.out.println("Abrir lente del casco: " + casco.abrirLente(1));
          System.out.println("Apretar casco: " + casco.apretarCaso());
          System.out.println("Poner casco: " + casco.ponerCasco());
          System.out.println("Quitar casco: " + casco.quitarCasco());
          System.out.println("\nPROBANDO EL METODO toString() DE LA CLASE");
          System.out.println(casco);
          System.out.println("\nPROBANDO LO REFERENTE A LAS LLANTAS POR DEFAULT");
          LlantaDeMoto ll = new LlantaDeMoto();
          ll.rodada = "Grande";
          ll.medida = 10;
          ll.presion = 100; 
          System.out.println("Rodada: " + ll.rodada);
          System.out.println("Medidas de las llantas: " + ll.medida);
          System.out.println("Presion en bares de la llanta: " + ll.presion);
          System.out.println("Ajustar presion de la llanta: " + ll.ajustarPresion(100));
          System.out.println("\nPROBANDO EL METODO toString() DE LA CLASE");
          System.out.println(ll);
          System.out.println("#########################################");
          break; 
        case 6: 
          System.out.println("\n\n#########################################");
          System.out.println("Nos vemos hasta la proxima");
          System.out.println("#########################################");
          selector=false; 
          break; 
      }
    }while(selector==true); 
    scanner.close();
    System.out.println("El escaner fue cerrado.");
  }
  public static void imprimir(String texto){ //funciones creadas para facilar el código
    System.out.println(texto); 
  }
}


