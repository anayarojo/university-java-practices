package os_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class OS_FILE {

    //VARIABLES GLOBALRES
    
    static String DIR = "";     //  |RAIZ O DIRECTORIO ACTUAL
    static String AR = "";      //  |ARCHIVO ACTUAL 
    static boolean TIPO;        //  |TIPO ARCHIVO/CARPETA
    static boolean TYPE;        //  |AUXILIAR DE FILE
    static int cont = 0;          //  |CONTADOR AUXILIAR
    static String text = "";      //  |STRING AUXILIAR
    static int opcion = 0;
    
    
    static String P[]={" Actual ", " Nueva "," del Archivo ", " de la Carpeta"};
    static int i=0;
    
    static BufferedReader L = new BufferedReader(new InputStreamReader(System.in));


    private static class FILES {

        //CONTRUCTOR
        FILES(String D) {

            //CREACION DEL OBJETO FILE APARTIR DE LA RUTA ACTUAL
            File a = new File(D);
            //ENLISTADO DE ARCHIVOS Y CARPETAS QUE CON TIENE EL FILE A
            String A[] = a.list();


            for (int i = 0; i < A.length; i++) {
                File b = new File(a.getAbsolutePath() + "\\" + A[i]);

                //SOLO INICIA SI SE SELECCIONO LA OPCION 1 O 2 PARA ENLISTAR ARCHIVOS
                if (opcion == 1 | opcion == 2) {
                    //IMPRESION SI ES ARCHIVO O CARPETA, DEPENDIENDO EL VALOR DE TIPO
                    if (b.isFile() == TIPO) {
                        System.out.println("=========================");
                        System.out.println("Nombre: " + A[i]);
                        System.out.println("Tipo: " + ((TIPO == true) ? "Archivo" : "Carpeta"));
                        System.out.println("Tamaño: " + b.length() + " Bytes");
                        System.out.println("Directorio : " + b.getAbsolutePath());
                        cont++;
                    }
                }

                //SOLO INICIA SI SE SELECCIONO LA OPCION 18 LA DEL BUSCADOR
                if (opcion == 18) {

                    //IMPRESION DE BUSCADOR
                    if (A[i].startsWith(AR)) {
                        System.out.println("=======================");
                        System.out.println("Nombre: " + A[i] + " \"" + b.getName() + "\"");
                        System.out.println("Tipo: " + ((b.isFile()) ? "Archivo" : "Carpeta") + "");
                        System.out.println("Tamaño: " + b.length() + " Bytes");
                        System.out.println("Directorio: " + b.getAbsolutePath() + "");
                        cont++;
                    }
                }


                //RECURSIVIDAD DE LA CLASE SI ES CARPETA
                if (b.isFile() == false) {
                    FILES OBJ = new FILES(b.getAbsolutePath());
                }
            }
        }

        public static void READ() {
            
            OS_FILE.DIR();
            
            try {
                //LECTOR DE ARCHIVOS .TXT
                File a =new File(DIR);
                java.io.BufferedReader L = new java.io.BufferedReader(new java.io.FileReader(DIR));
                
                
                System.out.println("______________________________________________________________________________________");
                System.out.println("CONTENIDO DEL ARCHIVO: "+"\""+a.getName()+"\"");
                System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                //IMPRIMIR EL ARCHIVO
                String S = null;
                while ((S = L.readLine()) != null) {
                    System.out.println(S);
                }

                //CERRAR EL LECTOR
                L.close();

            } catch (FileNotFoundException e) {
                System.err.println("NO SE HA ENCONTRADO EL ARCHIVO");
            } catch (IOException e) {
                System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
            } catch (Exception e) {
                System.err.println("ERROR DESCONOCIDO");
            }
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        }

        public static void WRITE() {
        }
        public static void DELETE(){
            
            OS_FILE.DIR();
            
            File a = new File(DIR);
            
            System.out.println(((a.delete()) ? "Se ha eliminado " : "No se ha eliminado ") + "el archivo \"" + a.getName() + "\"");
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        }
        
        public static void COPY(){
           
            try{
                
                File a=new File(AR);
                FileInputStream C=new FileInputStream(AR);
                FileOutputStream V=new FileOutputStream(DIR+"\\"+a.getName());
                
                File b=new File(DIR+"\\"+a.getName());
                if(b.exists()){
                    
                    System.out.println("______________________________________________________________________________________");
                    System.out.println("Has copiado el archivo \""+b.getName()+"\" a \""+b.getAbsolutePath()+"\"");
                    System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                }
                
            }catch(FileNotFoundException e){
                System.err.println("NO SE HA ENCONTRADO EL ARCHIVO");
            }catch(IOException e){
                System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
            }catch(Exception e){
                System.err.println("ERROR DESCONOCIDO");
            }
        }
    }

    public static void DIR() {
        while ("".equals(DIR)) { //CONDICIONES PARA QUE ENTRE 

            //VALIDACION DE LA ENTRADA DE LA RUTA
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("Ingresa Ruta"+P[i]);
            try {
                DIR = L.readLine();

                File a = new File(DIR);
                if (a.exists() == true) {
                    
                    
                    //¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
                    if (opcion == 7) {
                        //VALIDAR QUE SEA ARCHIVO DE TEXTO .TXT
                        if (a.isFile() & a.getName().endsWith(".txt")) {
                            System.out.println("Has seleccionado un archivo llamado \"" + a.getName() + "\"");
                        } else {
                            System.out.println("NO se puede leer el archivo \"" + a.getName() + "\"");
                            DIR = "";
                        }
                    }
                        
                        
                    //¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
                    if(opcion==10&a.isFile()){
                        //VALIDAR QUE SEA ARCHIVO
                        if (a.isFile()) {
                            System.out.println("Has seleccionado un archivo llamado \"" + a.getName() + "\"");
                        } else {
                            System.out.println("NO se puede leer el archivo \"" + a.getName() + "\"");
                            DIR = "";
                        }
                    }
                        
                        
                    //¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
                    if(opcion==10&a.isDirectory()){
                        //VALIDAR QUE SEA CARPETA
                        if (a.isDirectory()) {
                            System.out.println("Has seleccionado la Carpeta llamada \"" +(("".equals(a.getName())==true)? a.getAbsolutePath():a.getName()) + "\"");
                        } else {
                            System.out.println("No es un un directorio el objeto \"" + a.getName() + "\"");
                            DIR = "";
                        }
                    }
                    
                        
                    //¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
                    System.out.println(("".equals(DIR))?"":"Has cambiado la Ruta actual");
                } else {
                    System.out.println("RUTA INVALIDA");
                    DIR = "";
                }



            } catch (IOException e) {
                System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
            } catch (Exception e) {
                System.err.println("ERROR DESCONOCIDO");
            }
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        }
    }

    public static void MENU() {

        //VALIDACION DEL MENU CON CICLO DO/WHILE
        do {

            //DEPURACION DE VARIABLES
            int errores = 0;
            cont = 0;
            text = "";

            System.out.println("=================================MENU=DEL=EXPLORADOR==================================\n"
                    + "______________________________________________________________________________________\n"
                    + "Ruta actual > " + DIR + (("".equals(DIR)) ? "Ninguna" : "") + "\n"
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

            //SOLO ENTRA SI NO HAY ALGUN ERROR EN LA ENTRADA DE LA OPCION
            if (errores == 0) {

                //VALIDACION CON CICLO
                //VALIDACION LA ENTRADA
                if (opcion != 20 & opcion != 3 & opcion != 6 & opcion != 7 & opcion != 8 & opcion != 9) {
                    i=0;
                    OS_FILE.DIR();
                }

                OPCIONES OBJ = new OPCIONES();

                switch (opcion) {
                    case 1:
                        OBJ.OPCION_1();
                        break;
                    case 2:
                        OBJ.OPCION_2();
                        break;
                    case 3:
                        OBJ.OPCION_3();
                        break;
                    case 4:
                        OBJ.OPCION_4();
                        break;
                    case 5:
                        OBJ.OPCION_5();
                        break;
                    case 6:
                        OBJ.OPCION_6();
                        break;
                    case 7:
                        OBJ.OPCION_7();
                        break;
                    case 8:
                        OBJ.OPCION_8();
                        break;
                    case 9:
                        OBJ.OPCION_9();
                        break;
                    case 10:
                        OBJ.OPCION_10();
                        break;
                    case 11:
                        OBJ.OPCION_11();
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        break;
                    case 16:
                        break;
                    case 17:
                        break;
                    case 18:
                        OBJ.OPCION_18();
                        break;
                    case 19:
                        break;
                    case 20:
                        break;
                    default:
                        System.out.println("OPCION INVALIDA");
                        break;
                }
            }

        } while (opcion != 20);//NO SALIR AL MENOS QUE SE SELECCIONE LA OPCION 20 LA DE SALIR

    }

    public static class OPCIONES {

        public void OPCION_1() {

            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            TIPO = true;
            System.out.println("Buscando archivos, espere...");

            //VALIDAR ERROR NULL POINTER EN LA CLASE
            try {
                FILES OBJ = new FILES(DIR);
            } catch (NullPointerException e) {
                System.err.println("NO HAY MEDIOS");
            } catch (Exception e) {
                System.err.println("ERROR DESCONOCIDO");
            }

            System.out.println("______________________________________________________________________________________");
            System.out.println("RESULTADO: Se han encontrado " + cont + ((cont == 1) ? " Archivo" : " Archivos"));
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        }

        public void OPCION_2() {

            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            TIPO = false;
            System.out.println("Buscando carpetas, espere...");

            //VALIDAR ERROR NULL POINTER EN LA CLASE
            try {
                FILES OBJ = new FILES(DIR);
            } catch (NullPointerException e) {
                System.err.println("NO HAY MEDIOS");
            } catch (Exception e) {
                System.err.println("ERROR DESCONOCIDO");
            }


            System.out.println("______________________________________________________________________________________");
            System.out.println("RESULTADO: Se han encontrado " + cont + ((cont == 1) ? " Carpeta" : " Carpetas"));
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        }

        public void OPCION_3() {
            
            i=1;
            OS_FILE.DIR();
            
        }
        public void OPCION_4() {
            File a = new File(DIR);
            Path d = a.toPath();

            try {
                DIR = d.getParent().toString();
            } catch (NullPointerException e) {
                System.err.println("NO EXISTE RUTA PADRE PARA \"" + DIR + "\"");
            } catch (Exception e) {
                System.out.println("ERROR DESCONOCIDO");
            }
            System.out.println("Se ha regresado a la Ruta padre \"" + DIR + "\"");
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");


        }

        public void OPCION_5() {
            File a = new File(DIR);
            Path d = a.toPath();

            DIR = d.getRoot().toString();
            System.out.println("Se ha cambiado la Ruta a la Raiz \"" + DIR + "\"");
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        }

        public void OPCION_6() {
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
                    DIR = a[root].toString();

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

        public void OPCION_7() {
            FILES.READ();
        }

        public void OPCION_8() {

            //VALIDAR EL INPUT DEL NOMBRE
            String nombre = "";
            
            //VALIDACION DE RUTA DEL ARCHIVO
            OS_FILE.DIR();
            
            System.out.println("______________________________________________________________________________________");
            
            while ("".equals(nombre)) {
                try {
                    System.out.println("Ingresa el nuevo nombre");
                    nombre = L.readLine();
                } catch (IOException e) {
                    System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
                } catch (Exception e) {
                    System.err.println("ERROR DESCONOCIDO");
                }
            }

            File a = new File(DIR);
            File b = new File(a.getParent() + "\\" + nombre);

            System.out.println((a.renameTo(b) ? "Se ha cambiado el nombre" : "No se ha cambiado el nombre") + ((a.isFile()) ? " del archivo" : " de la carpeta"));
            System.out.println("De \"" + a.getName() + "\" a \"" + b.getName() + "\" ");

            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

        }

        public void OPCION_9() {
            FILES.DELETE();
        }

        public void OPCION_10() {
            
            i=2;
            DIR="";
            OS_FILE.DIR();
            AR=DIR;
            
            i=3;
            DIR="";
            OS_FILE.DIR();

            FILES.COPY();
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
                AR = L.readLine();
            } catch (IOException e) {
                System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
            } catch (Exception e) {
                System.err.println("ERROR DESCONOCIDO");
            }

            //CREACION E INVOCACION DE LA INSTANCIA
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            FILES OBJ = new FILES(DIR);

            System.out.println("______________________________________________________________________________________");
            System.out.println("RESULTADO: Se han encontrado " + cont + ((cont == 1) ? " coincidencia" : " coincidencias"));
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("\n");
        }

        public void OPCION_19() {
        }
    }

    public static void main(String[] args) throws IOException {
        
        OS_FILE.MENU();
        
    }
}
