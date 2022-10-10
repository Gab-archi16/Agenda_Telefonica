/*
Tomando como base el programa de la agenda telefónica con menú de opciones, realice un programa que almacene los datos
de múltiples personas en un arreglo de cadenas bidimensional inicializado con 1000 filas vacías con las columnas necesarias
para almacenar los datos requeridos, y que permita efectuar las operaciones de consulta, modificación y baja proporcionando el número
de fila de la matriz para localizar los datos respectivos.
 */
package agenda_telefónica;
import java.util.Scanner;
/**
 *
 * @author Gabriel García
 */
public class Agenda_Telefónica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      int filas, columnas=10;
      System.out.println ("¿Cuantas personas desea ingresar a la agenda?");
      filas= leer.nextInt();
      int personas [][]=new int [filas][columnas];
       
      String nombres[]=new String [filas]; 
      String CALLE[]=new String [filas];
      int NÚMERO []=new int [filas];
      String COLONIA []=new String [filas];
      String LOCALIDAD []=new String [filas];
      String PAÍS []=new String [filas];
      long TELEFONO []=new long [filas];
      String CORREO []=new String [filas];
      String NACIMIENTO []=new String [filas];
      String TRABAJO []=new String [filas];
      for (int procesos=0; procesos<filas; procesos++){ 
        for (int j=0; j<filas; j++){ //Declaracion de filas (cantidad de personas)
            System.out.println ("Favor de ingresar los datos de la persona numero "+ (j+1)+":");
            for (int i=0; i<1; i++){
                System.out.println ("Ingrese su nombre: ");
                nombres[i]=leer.next();
                System.out.println ("Ingrese la calle donde vive: ");
                CALLE[i]=leer.next();
                System.out.println ("Ingrese el número: ");
                NÚMERO [i]=leer.nextInt();
                System.out.println ("Ingrese la colonia donde vive: ");
                COLONIA[i]=leer.next();
                System.out.println ("Ingrese su localidad: ");
                LOCALIDAD [i]=leer.next();
                System.out.println ("Ingrese su Pais: ");
                PAÍS[i]=leer.next();
                System.out.println ("Ingrese su telefono: " );
                TELEFONO[i]=leer.nextLong();
                System.out.println ("Ingrese su correo electronico: ");
                CORREO[i]=leer.next();
                System.out.println ("Ingrese su fecha de nacimiento: " );
                NACIMIENTO[i]=leer.next();
                System.out.println ("Ingrese su lugar de trabajo: ");
                TRABAJO[i]=leer.next();
                System.out.println ("               ¡¡¡¡Bien hecho!!!!    "); 
                System.out.println ("");
                System.out.println ("");
            }
        }
        boolean salir= false;
        int x;    
        do{
            System.out.println("MENU DE OPCIONES");
            System.out.println("Seleccione el número segun sea el caso");
            System.out.println("Si quiere consultar su etiqueta, por favor seleccione 1");
            System.out.println("Si quiere modificar datos, por favor seleccione 2");
            System.out.println("Si quiere darse de baja, por favor seleccione 3");
            System.out.println("Para salir seleccione 4");
            x=leer.nextInt();
            
            
            switch (x)
            {
             case 1:
             System.out.println ("CONSULTA");
             System.out.println ("  Favor de ingresar el numero de la persona a consultar:");
             int c=leer.nextInt();
             int a=c-1;
             if (procesos == personas[a][filas]){
              System.out.println ("ETIQUETA DE INFORMACION:");
              System.out.println ("NOMBRE: "+ nombres [procesos] );
              System.out.println ("CALLE: "+ CALLE [procesos] );
              System.out.println ("NUMERO: "+ NÚMERO [procesos]);
              System.out.println ("COLONIA: "+ COLONIA [procesos] );
              System.out.println ("LOCALIDAD: "+ LOCALIDAD [procesos]);
              System.out.println ("PAIS: "+ PAÍS [procesos]);
              System.out.println ("TELEFONO: "+ TELEFONO [procesos]);
              System.out.println ("CORREO ELECTRONICO: "+ CORREO [procesos] );
              System.out.println ("FECHA DE NACIMIENTO: "+ NACIMIENTO [procesos]);
              System.out.println ("LUGAR DE TRABAJO: "+ TRABAJO [procesos]);
             }else{
                 System.out.println("ELEMENTO NO ENCONTRADO");
             }
             break;
             case 2:
             System.out.println("MODIFICACION DE DATOS ");
             System.out.println ("INGRESE EL NUMERO DE LA PERSONA A MODIFICAR");
             int m=leer.nextInt();
             if ((m)==(procesos)){
              System.out.println ("FICHA DE AGENDA TELEFONICA");
              System.out.println ("Ingrese su nombre: ");
              nombres [procesos]=leer.next ();
              System.out.println ("Ingrese la calle donde vive: ");
              CALLE [procesos]=leer.next ();
              System.out.println ("Ingrese el numero: ");
              NÚMERO [procesos]=leer.nextInt ();
              System.out.println ("Ingrese la colonia donde vive: ");
              COLONIA [procesos]=leer.next();
              System.out.println ("Ingrese su localidad: ");
              LOCALIDAD [procesos]=leer.next();
              System.out.println ("Ingrese su Pais: ");
              PAÍS [procesos]=leer.next();
              System.out.println ("Ingrese su telefono: " );
              TELEFONO [procesos]=leer.nextLong();
              System.out.println ("Ingrese su correo electronico: ");
              CORREO [procesos]=leer.next();
              System.out.println ("Ingrese su fecha de nacimiento: " );
              NACIMIENTO [procesos]=leer.next();
              System.out.println ("Ingrese su lugar de trabajo: ");
              TRABAJO
                      [procesos]=leer.next();
              System.out.println ("Usted esta dado de alta     ¡¡¡¡Bien hecho!!!!    ");
              break;
            }
             case 3:
             System.out.println("Usted esta en proceso para darse de baja");
             System.out.println("Usted esta dado de baja");
             break;
             case 4: 
             salir=true;
             break;
             default:
             System.out.println("Las opciones deben ser solamente del 1 al 5");
           }
       }while(!salir);
    }
   }
}
    

