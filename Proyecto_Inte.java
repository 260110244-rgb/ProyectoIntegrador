package com.mycompany.ticsluisf;
import java.util.Scanner;
public class Proyecto_Inte {
       public static void main(String[] args) {
           int modulo;
           Scanner leer=new Scanner(System.in);
      //Estructura/MENU
      do{
      System.out.println("**********************************");
      System.out.println("PROYECTO INTEGRADOR TICS 1B-ITSOEH");
      System.out.println("----------------------------------");
      System.out.println("1.Modulo geometrico vectorial");
      System.out.println("2.Modulo Financiero logico");
      System.out.println("3.Salir");
      //Si el numero no es entero
   
      while(!leer.hasNextInt()){
          System.out.println("Error el numero ingresado no es valido ingrese un número del (1-3).");
          leer.next();
          System.out.println("Seleccione una opción (1-3):");
      }
      modulo=leer.nextInt();
      //Modulos
      switch(modulo){
          case 1:
              privatee.ModGeo(leer);
              break;
          case 2:
              privatee.ModFin(leer);
              break;
          case 3:
              System.out.println("Saliendo del programa...");
              break;
          default:
              System.out.println("Opción no valida elige una opcion (1-3)");
              break;
              
      }
      } while (modulo != 3);
       }private static void ModGeo(Scanner scanner){
            System.out.println("******************************");
            System.out.println("1. MODULO GEOMETRICO VECTORIAL");
            System.out.println("******************************");
            
            //Ingreso de cordenadas
              System.out.println("Ingresa la cordenada x para P1:");
              double x1=scanner.nextDouble();
              System.out.println("Ingresa la cordenada y para P1:");
              double y1=scanner.nextDouble();
              //ingreso de cordenadas 2
               System.out.println("Ingresa la cordenada x para P2:");
                double x2=scanner.nextDouble();
               System.out.println("Ingresa la cordenada y para P2:");
                double y2=scanner.nextDouble();
                //Calcular incrementos
                double increX=x2-x1;
                double increY=y2-y1;
                //Calcular distancias
                double distancia=Math.sqrt(Math.pow(increX,2)+Math.pow(increY,2));
                //Resultados
                System.out.println("***RESULTADOS***");
                System.out.printf("***Punto 1(%2f,%2f)"+x1,y1);
                System.out.printf("***Punto 1(%2f,%2f)"+x2,y2);
                System.out.printf("Incremento en X(%2f,2f)"+increX);
                System.out.printf("Incremento en Y(%2f,2f)"+increY);
                System.out.printf("La distancia entre los dos puntos/Magnitud del vector es(%2f,2f"+distancia);
       //Modulo financiero
       }private static void ModFin(Scanner scanner){
           System.out.println("**************************");
           System.out.println("2 MODULO FINANCIERO LOGICO");
           System.out.println("**************************");
           
           System.out.println("ingrese el precio base del equipo deseado:$");
           double precioB=scanner.nextDouble();
            if (precioB<0){
                System.out.println("PENDEJO como va ser precio menor a 0");
                return;
            }
            
            System.out.println("PROPOSICIONES LOGICAS ATOMICAS");
            System.out.println("p:¿El comprador es estudiante acreditado?(1=verdadero/0=falso");
            int inputP=scanner.nextInt();
            boolean p= (inputP==1);
            
            System.out.println("q: ¿El equipo es de catologo educativo?");
             int inputQ=scanner.nextInt();
            boolean q= (inputQ==1);
            
            double porcentajeImp;
            String politicaFiscal;
           
           if(p&&q){
               porcentajeImp=0.00;
               politicaFiscal="Total de impuesto (Tasa0%";
               
           }else if (p^q){
               
               porcentajeImp=0.08;
               politicaFiscal="Impuesto Subvencionado/Reducido(Tasa 8%)";
               
           }else{
               porcentajeImp=0.16;
               politicaFiscal="Impuesto General Standart(Tasa 16%)";
               
               //Calculos
               
               double montoimp=precioB*porcentajeImp;
               double totalPagar=precioB+montoimp;
               
               //Resultados
               System.out.println("****DICTAMEN FISCAL Y FINANCIERO****");
               System.out.printf("Precio Base del equipo:$%.2f\n",precioB);
               System.out.println("Preposición p (estudiante):"+(p?"1(verdadero)":"0 (Falso"));
               System.out.println("Preposición q (educativo):"+(q?"1(verdadero)":"0 (Falso"));
               System.out.println("Politica aplicada:"+politicaFiscal);
               System.out.printf("Monto de impuesto:$%.2f\n",montoimp);
               System.out.printf("TOTAL A PAGAR: $%.2\n",totalPagar);
               
               
           }
           
               
       }
    }
    

