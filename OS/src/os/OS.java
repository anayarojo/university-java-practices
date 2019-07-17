package os;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class OS {

    //VARIABLES GLOBALRES
    static String PATH = "";        //  |RAIZ O DIRECTORIO ACTUAL
    static String FILE = "";        //  |ARCHIVO ACTUAL 
    static boolean TYPE;            //  |TIPO ARCHIVO/CARPETA
    static int CONT = 0;            //  |CONTADOR AUXILIAR
    static String TEXT = "";        //  |STRING AUXILIAR
    static int opcion=0;            //  |VARIABLE INT AUXILIAR DEL MENU Y LA CLASE FILE
    //LECTOR PRINCIPAL
    static BufferedReader L = new BufferedReader(new InputStreamReader(System.in));

    public static final class MENU {

        MENU() {

            //VALIDACION DEL MENU CON CICLO DO/WHILE
            do {

                //DEPURACION DE VARIABLES
                int errores = 0;
                CONT = 0;
                TEXT = "";

                System.out.println("=================================MENU=DEL=EXPLORADOR==================================\n"
                        + "______________________________________________________________________________________\n"
                        + "Ruta actual > " + PATH + (("".equals(PATH)) ? "Ninguna" : "") + "\n"
                        + "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n"
                        + " 1.-Mostrar Lista de Archivos\t\t\t2.-Mostrar Lista de Carpetas\n"
                        + " 3.-Cambiar la Ruta actual\t\t\t4.-Ir a la Ruta padre\n"
                        + " 5.-Ir a la Raiz de la Ruta\t\t\t6.-Cambiar la Unidad de la Ruta\n"
                        + " 7.-Ver un archivo tipo .txt\t\t\t8.-Cambiar nombre de un archivo\n"
                        + " 9.-Eliminar un archivo\t\t\t\t10.-Copiar un archivo a otro\n"
                        + " 11.-Crear una carpeta\t\t\t\t12.-Eliminar una carpeta\n"
                        + " 13.-Obtener informacion del disco\t\t14.-Obtener informacion de un archivo\n"
                        + " 15.-Obtener informacion del PC\t\t\t16.-Guardar listado de archivos\n"
                        + " 17.-Guardar informacion a un archivo\t\t18.-Buscar archivo\n"
                        + " 19.-Explorar por carpetas\t\t\t20.-Salir\n"
                        + "======================================================================================");

                //VALIDACION DE LA OPCION DEL MENU
                try {
                    opcion = Integer.parseInt(L.readLine());
                } catch (IOException e) {
                    System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
                    errores++;
                } catch (NumberFormatException e) {
                    System.err.println("HAS INGRESADO CARACTERES NO VALIDOS");
                    errores++;
                } catch (Exception e) {
                    System.err.println("ERROR DESCONOCIDO");
                    errores++;
                }


                //CONDICIONES PARA ENTRAR
                if (opcion != 20 & errores == 0) {
                    PATH();
                }


                //SOLO ENTRA SI NO HAY ALGUN ERROR EN LA ENTRADA DE LA OPCION
                if (errores == 0) {

                    

                    switch (opcion) {
                        case 1:
                            OPCION_1();
                            break;
                        case 2:
                            OPCION_2();
                            break;
                        case 3:
                            OPCION_3();
                            break;
                        case 4:
                            OPCION_4();
                            break;
                        case 5:
                            OPCION_5();
                            break;
                        case 6:
                            OPCION_6();
                            break;
                        case 7:
                            OPCION_7();
                            break;
                        case 8:
                            OPCION_8();
                            break;
                        case 9:
                            OPCION_9();
                            break;
                        case 10:
                            OPCION_10();
                            break;
                        case 11:
                            OPCION_11();
                            break;
                        case 12:
                            OPCION_12();
                            break;
                        case 13:
                            OPCION_13();
                            break;
                        case 14:
                            OPCION_14();
                            break;
                        case 15:
                            OPCION_15();
                            break;
                        case 16:
                            OPCION_16();
                            break;
                        case 17:
                            OPCION_16();
                            break;
                        case 18:
                            OPCION_17();
                            break;
                        case 19:
                            OPCION_18();
                            break;
                        case 20:
                            OPCION_19();
                            break;
                        default:
                            System.out.println("OPCION INVALIDA");
                            break;
                    }
                }
            } while (opcion != 20);
        }
        
        public static void OPCION_1() {

            TYPE = true;

            try {
                FILES F = new FILES(PATH);
            } catch (NullPointerException e) {
                System.err.println("NO HAY MEDIOS");
            } catch (Exception e) {
                System.err.println("ERROR DESCONOCIDO");
            }

            System.out.println("______________________________________________________________________________________");
            System.out.println("RESULTADO: " + CONT + ((CONT == 1) ? " Archivo" : " Archivos"));
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        }

        public static void OPCION_2() {

            TYPE = false;

            try {
                FILES F = new FILES(PATH);
            } catch (NullPointerException e) {
                System.err.println("NO HAY MEDIOS");
            } catch (Exception e) {
                System.err.println("ERROR DESCONOCIDO");
            }

            System.out.println("______________________________________________________________________________________");
            System.out.println("RESULTADO: " + CONT + ((CONT == 1) ? " Carpeta" : " Carpetas"));
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        }

        public static void OPCION_3() {
            //VALIDACION CON CICLO
            //VALIDACION LA ENTRADA
            PATH = "";
            while ("".equals(PATH)) { //ENTRA SI NO HAY DIRECTORIO

                //VALIDACION DE LA ENTRADA DE LA RUTA
                System.out.println("______________________________________________________________________________________");
                System.out.println("Ingresa la nueva Ruta");
                try {
                    PATH = L.readLine();

                    File a = new File(PATH);
                    if (a.exists() == true) {
                        System.out.println("Has cambiado la Ruta actual");
                    } else {
                        System.out.println("RUTA INVALIDA");
                        PATH = "";
                    }
                } catch (IOException e) {
                    System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
                } catch (Exception e) {
                    System.err.println("ERROR DESCONOCIDO");
                }
                System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            }
        }

        public static void OPCION_4() {

            File a = new File(PATH);
            Path d = a.toPath();

            try {
                PATH = d.getParent().toString();
            } catch (NullPointerException e) {
                System.err.println("NO EXISTE RUTA PADRE PARA \"" + PATH + "\"");
            } catch (Exception e) {
                System.out.println("ERROR DESCONOCIDO");
            }
            System.out.println("Se ha regresado a la Ruta padre \"" + PATH + "\"");
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        }

        public static void OPCION_5() {

            File a = new File(PATH);
            Path d = a.toPath();

            PATH = d.getRoot().toString();
            System.out.println("Se ha cambiado la Ruta a la Raiz \"" + PATH + "\"");
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        }

        public static  void OPCION_6() {

            //OBTENCION DE LAS UNIDADES
            File a[] = File.listRoots();

            //IMPRESION DE LA LISTA DE LAS UNIDADES DISPONIBLES
            System.out.println("______________________________________________________________________________________");
            System.out.println("Selecciona la unidad");
            for (int i = 0; i < a.length; i++) {
                System.out.println(i + ".-[" + a[i] + "]");
            }
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

            int root = -1;
            while (root == -1) {
                try {
                    root = Integer.parseInt(L.readLine());
                    PATH = a[root].toString();

                } catch (IOException e) {
                    System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
                } catch (NumberFormatException e) {
                    System.err.println("HAS INGRESADO CARACTERES NO VALIDOS\n"
                            + "INGRESA UN NUMERO PARA SELECCIONAR UNIDAD");
                } catch (Exception e) {
                    System.err.println("ERROR DESCONOCIDO");
                }
                System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            }
        }

        public static void OPCION_7() {

            File a = new File(PATH);
            String A[] = a.list();



            for (int i = 0; i < A.length; i++) {
                if (A[i].endsWith(".txt")) {
                }
            }

        }

        public static void OPCION_8() {
        }

        public void OPCION_9() {
        }

        public void OPCION_10() {
        }

        public void OPCION_11() {
        }

        public void OPCION_12() {
        }

        public void OPCION_13() {
        }

        public void OPCION_14() {
        }

        public void OPCION_15() {
        }

        public void OPCION_16() {
        }

        public void OPCION_17() {
        }

        public void OPCION_18() {

            System.out.println("Ingresa nombre de Archivo a buscar");

            //VALIDACION DE LA ENTRADA DEL NOMBRE DEL ARCHIVO
            try {
                FILE = L.readLine();
            } catch (IOException e) {
                System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
            } catch (Exception e) {
                System.err.println("ERROR DESCONOCIDO");
            }

            //CREACION E INVOCACION DE LA INSTANCIA
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");


            try {
                FILES B = new FILES(PATH);
            } catch (NullPointerException e) {
                System.err.println("NO HAY MEDIOS");
            } catch (Exception e) {
                System.err.println("ERROR DESCONOCIDO");
            }
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("RESULTADO: Se han encontrado " + CONT + ((CONT == 1) ? " coincidencia" : " coincidencias"));
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("\n");
        }

        public void OPCION_19() {
        }
        
        
    }


    public static void PATH() {
        while ("".equals(PATH)) { //CONDICIONES PARA QUE ENTRE 

            //VALIDACION DE LA ENTRADA DE LA RUTA
            System.out.println("______________________________________________________________________________________");
            System.out.println("Ingresa Ruta actual");
            try {
                PATH = L.readLine().toUpperCase();

                File a = new File(PATH);
                if (a.exists() == true) {
                    System.out.println("Has cambiado la Ruta actual");
                } else {
                    System.out.println("RUTA INVALIDA");
                    PATH = "";
                }
            } catch (IOException e) {
                System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
            } catch (Exception e) {
                System.err.println("ERROR DESCONOCIDO");
            }
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        }
    }

    public static class FILES{

        FILES(String D) {

            //CREACION DEL OBJETO FILE APARTIR DE LA RUTA ACTUAL
            File a = new File(D);
            //ENLISTADO DE ARCHIVOS Y CARPETAS QUE CON TIENE EL FILE A
            String A[] = a.list();

            for (int i = 0; i < A.length; i++) {
                File b = new File(a.getAbsolutePath() + "\\" + A[i]);
                
                
                //ENTRA SI SE A ELEGINO ENLISTAR ARCHIVOS O CARPETAS
                //if(opcion==1|opcion==2){
                 
                  
                    
                    if (a.isFile() == TYPE) {
                    System.out.println("=========================");
                    System.out.println("Nombre: " + a.getName());
                    System.out.println("Tipo: " + ((a.isFile() == true) ? "Archivo" : "Carpeta"));
                    System.out.println("Tamaño: " + a.length() + " Bytes");
                    System.out.println("Directorio : " + a.getAbsolutePath());
                    CONT++;
                    
                    }
                //}
                //¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\\
                
                /*
                //ENTRA SI SE A ELEGINO BUSCAR ARCHIVOS
                if(opcion==18){
                    
                    if (A[i].startsWith(FILE)) {
                    System.out.println("=========================");
                    System.out.println("Nombre: " + A[i] + " \"" + b.getName() + "\"");
                    System.out.println("Tipo: " + ((b.isFile()) ? "Archivo" : "Carpeta") + "");
                    System.out.println("Tamaño: " + b.length() + " Bytes\n");
                    System.out.println("Directorio: " + b.getAbsolutePath() + "");
                    CONT++;
                    }
                }
                 * 
                 */
                
                     

                //RECURSIVIDAD DE LA CLASE SI ES CARPETA
                if (b.isFile() == false) {
                    FILES OBJ = new FILES(a.getAbsolutePath() + "\\" + A[i]);
                }
            }
        }
    }



    public static void main(String[] args) {

        MENU OBJ=new MENU();


    }
}
