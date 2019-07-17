package ox_file;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import javax.swing.filechooser.FileSystemView;
import org.hyperic.sigar.*;

public class OX_FILE {

    //VARIABLES GLOBALES
    static String PATH = "";         //VARIABLE QUE CONTIENE EN TEXTO  EL DIRECTORIO O LA RUTA
    static String FILE = "";         //VARIABLE QUE CONTIENE EL NOMBRE DEL ARCHIVO ACTUAL
    static boolean TYPE;        //AUXILIAR PARA IDENTIFICAR SI ES ARCHIVO O NO
    static int CONT = 0;            //AUXILIAR PARA CONTAR
    static int OPTION = 0;          //AUXILIAR DEL MENU
    static String TEXT="";          //AUXILIAR DE TEXTO
    //AUXILIAR DEL TEXTO DEL INTERFAZ
    static String P[] = {" Actual ", " Nueva ", " del Archivo ", " de la Carpeta",
        "______________________________________________________________________________________",
        
        "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯",
        "────────────────────────────────────────────────────",
        "--------------------------------------------------------------------"};
    static int i = 0;
    //LECTOR PRINCIPAL
    static BufferedReader L = new BufferedReader(new InputStreamReader(System.in));

    public static class MENU {

        MENU() throws IOException {
            //VALIDACION DEL MENU CON CICLO DO/WHILE
            do {
                //DEPURACION DE VARIABLES
                int errores = 0;
                System.out.println("=================================MENU=DEL=EXPLORADOR==================================\n"
                        + P[4] + "\n"
                        + "Ruta actual > " + PATH + (("".equals(PATH)) ? "Ninguna" : "") + "\n"
                        + P[5] + "\n"
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
                System.out.print("¿Que deceas hacer?: ");

                //VALIDACION DE LA OPCION DEL MENU
                try {
                    OPTION = Integer.parseInt(L.readLine());
                } catch (IOException e) {
                    System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
                    errores++;
                } catch (NumberFormatException e) {
                    System.err.println("HAS INGRESADO CARACTERES NO VALIDOS ");
                    errores++;
                } catch (Exception e) {
                    System.err.println("ERROR DESCONOCIDO");
                    errores++;
                }

                //SOLO ENTRA SI NO HAY ALGUN ERROR EN LA ENTRADA DE LA OPCION
                if (errores == 0) {

                    //ENTRADA DE OPCIONES
                    OPTIONS();
                }

            } while (OPTION != 20);//NO SALIR AL MENOS QUE SE SELECCIONE LA OPCION 20 LA DE SALIR            
        }

        public static void OPTIONS() throws IOException {
            switch (OPTION) {
                case 1:
                    OS.DIR();
                    OPTION_1();
                    break;
                case 2:
                    OS.DIR();
                    OPTION_2();
                    break;
                case 3:
                    OS.DIR();
                    OPTION_3();
                    break;
                case 4:
                    OS.DIR();
                    OPTION_4();
                    break;
                case 5:
                    OS.DIR();
                    OPTION_5();
                    ;
                    break;
                case 6:
                    OPTION_6();
                    break;
                case 7:
                    OPTION_7();
                    break;
                case 8:
                    OPTION_8();
                    break;
                case 9:
                    OPTION_9();
                    break;
                case 10:
                    OPTION_10();
                    break;
                case 11:
                    OPTION_11();
                    break;
                case 12:
                    OS.DIR();
                    OPTION_12();
                    break;
                case 13:
                    OPTION_13();
                    break;
                case 14:
                    OPTION_14();
                    break;
                case 15:
                    OPTION_15();
                    break;
                case 16:
                    OPTION_16();
                    break;
                case 17:
                    OPTION_17();
                    break;
                case 18:
                    OPTION_18();
                    break;
                case 19:
                    OPTION_19();
                    break;
                case 20:
                    break;
                default:
                    System.err.println("OPCION INVALIDA");
                    break;
            }
        }

        public static void OPTION_1() {

            System.out.println(P[5]);
            System.out.println("Buscando Archivos, espere...");
            TYPE = true;
            try {
                OS.FILE();
            } catch (NullPointerException e) {
                System.err.println("NO HAY MEDIOS");
            } catch (Exception e) {
                System.err.println("ERROR DESCONOCIDO");
            }
            System.out.println(P[4]);
            System.out.println("RESULTADO: Se han encontrado " + CONT + ((CONT == 1) ? " Archivo" : " Archivos"));
            System.out.println(P[5]);
        }

        public static void OPTION_2() {

            System.out.println(P[4]);
            System.out.println("Buscando carpetas, espere...");
            TYPE = false;
            try {
                OS.FILE();
            } catch (NullPointerException e) {
                System.err.println("NO HAY MEDIOS");
            } catch (Exception e) {
                System.err.println("ERROR DESCONOCIDO");
            }
            System.out.println(P[4]);
            System.out.println("RESULTADO: Se han encontrado " + CONT + ((CONT == 1) ? " Carpeta" : " Carpetas"));
            System.out.println(P[5]);
        }

        public static void OPTION_3() {

            PATH = "";
            i = 1;
            OS.DIR();
        }

        public static void OPTION_4() {
            File a = new File(PATH);
            Path p = a.toPath();

            try {
                PATH = p.getParent().toString();
            } catch (NullPointerException e) {
                System.err.println("NO EXISTE RUTA PADRE PARA \"" + PATH + "\"");
            } catch (Exception e) {
                System.out.println("ERROR DESCONOCIDO");
            }
            System.out.println("Se ha regresado a la Ruta padre \"" + PATH + "\"");
            System.out.println(P[5]);

        }

        public static void OPTION_5() {

            File a = new File(PATH);
            Path p = a.toPath();

            try {
                PATH = p.getRoot().toString();
            } catch (NullPointerException e) {
                System.err.println("NO EXISTE RAIZ PARA \"" + PATH + "\"");
            } catch (Exception e) {
                System.out.println("ERROR DESCONOCIDO");
            }
            System.out.println("Se ha regresado a la raiz \"" + PATH + "\"");
            System.out.println(P[5]);
        }

        public static void OPTION_6() {

            File a[] = File.listRoots();

            PATH = "";
            while ("".equals(PATH)) {

                //IMPRESION DE LA LISTA DE LAS UNIDADES DISPONIBLES
                System.out.println(P[4]);
                System.out.println("Unidades disponibles");
                System.out.println(P[5]);

                for (int i = 0; i < a.length; i++) {

                    //STRINGS AUXILIARES PARA MOSTRAR NOMBRES Y DESCIPCIONES DE LAS UNIDADES LOCALES
                    String temp = FileSystemView.getFileSystemView().getSystemDisplayName(a[i]);
                    String temp2 = FileSystemView.getFileSystemView().getSystemTypeDescription(a[i]);

                    System.out.println(i + ".-[" + a[i] + "]" + (("".equals(temp)) ? temp2 : temp));
                }
                System.out.println(P[4]);

                System.out.print("Selecciona unidad: ");
                try {
                    int root = Integer.parseInt(L.readLine());
                    PATH = a[root].toString();

                } catch (IOException e) {
                    System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
                    PATH = "";
                } catch (NumberFormatException e) {
                    System.err.println("HAS INGRESADO CARACTERES NO VALIDOS\n"
                            + "INGRESA UN NUMERO PARA SELECCIONAR UNIDAD");
                    PATH = "";
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("NO EXISTE UNIDAD SELECCIONADA");
                } catch (Exception e) {
                    System.out.println("ERROR DESCONOCIDO");
                    PATH = "";
                }
                System.out.println("Has cambiado la ruta actual a \"" + PATH + "\"");
                System.out.println(P[5]);
            }
        }

        public static void OPTION_7() {
            System.out.println(P[6]);
            PATH = "";
            OS.DIR();
            OS.READ();
        }

        public static void OPTION_8() {
            OS.RENAME();
        }

        public static void OPTION_9() {
            PATH = "";
            OS.DELETE();
        }

        public static void OPTION_10() {

            i = 2;
            PATH = "";
            OS.DIR();
            FILE = PATH;
            //----------------
            i = 3;
            PATH = "";
            OS.DIR();
            //----------------
            OS.COPY();
        }

        public static void OPTION_11() {
            OS.MDIR();
        }

        public static void OPTION_12() {

            File a = new File(PATH);
            File D[] = File.listRoots();

            System.out.println(P[6]);

            int aux = 0;
            for (int i = 0; i < D.length; i++) {
                if (a.equals(D[i])) {
                    aux = 1;
                }
            }

            if (aux != 1) {
                char op = ' ';
                while (op == ' ') {
                    System.out.println("Deseas Eliminar \"" + a.getName() + "\"");
                    System.out.print("(S/N): ");

                    try {
                        op = L.readLine().toUpperCase().charAt(0);
                        if (op != 'S' & op != 'N') {
                            System.out.println("OPCION INVALIDA");
                            op = ' ';
                        }
                        // error a poner n java.lang.NullPointerException
                    } catch (IOException e) {
                        System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
                    } catch (Exception e) {
                        System.err.println("ERROR DESCONOCIDO");
                    }
                    System.out.println(P[5]);
                }
                DDIR OBJ = new DDIR(PATH);

                System.out.println(P[4]);
                System.out.println(((a.exists() == false) ? "Se ha eliminado " : "No se ha podido eliminar ") + "la Carpeta \"" + a.getName() + "\"");
                System.out.println(P[5]);
                PATH = "";
            } else {

                //STRINGS AUXILIARES
                String temp = FileSystemView.getFileSystemView().getSystemDisplayName(a);
                String temp2 = FileSystemView.getFileSystemView().getSystemTypeDescription(a);

                System.err.println("No se puede eliminar \"" + (("".equals(temp)) ? temp2 + " " + PATH : temp) + "\" porque es una unidad no una carpeta");
                System.out.println(P[5]);
            }

        }

        public static void OPTION_13() {

            //PASAR LA RUTA ACTUAL A LA RAIZ
            File a = new File(PATH);
            Path p = a.toPath();
            PATH = p.getRoot().toString();

            System.out.println(P[4]);
            System.out.println("Informacion de la unidad \"" + PATH + "\"");
            System.out.println(P[5]);

            INFO.DISC(PATH);
            System.out.println(P[4] + "\n");

        }

        public static void OPTION_14() {
            File a = new File(PATH);

            System.out.println(P[4]);
            System.out.println("Informacion de \"" + (("".equals(a.getName()) ? PATH : a.getName()) + "\""));
            System.out.println(P[5]);
            INFO.FILE();
            System.out.println(P[4] + "\n");
        }

        public static void OPTION_15() {

            try {
                InetAddress ip = InetAddress.getLocalHost();
                System.out.println(P[6]);
                System.out.println("INFORMACION DE LA PC " + ip.getHostName().toUpperCase());
            } catch (UnknownHostException e) {
                System.err.println("HOST DESCONOCIDA" + e.getMessage());
            } catch (Exception e) {
                System.err.println("ERROR DESCONOCIDO");
            }

            INFO.PC();
            System.out.println(P[5]);


        }

        public static void OPTION_16() {
        }

        public static void OPTION_17() throws IOException {
            
            INFO.PC();
            OS.WRITE();
        }

        public static void OPTION_18() {

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
            System.out.println(P[5]);
            System.out.println("Buscando Archivos, espere...");

            try {
                BROWSER B = new BROWSER(PATH);
            } catch (java.lang.NullPointerException e) {
                System.err.println("NO HAY MED");
            } catch (Exception e) {
                System.err.println("FALLO LA BUSQUEDA");
            }

            System.out.println(P[4]);
            System.out.println("RESULTADO: Se han encontrado " + CONT + ((CONT == 1) ? " coincidencia" : " coincidencias"));
            System.out.println(P[5]);
        }

        public static void OPTION_19() {
        }

        public static void OPTION_20() {
        }
    }

    public static class OS {

        public static void DIR() {

            while ("".equals(PATH)) { //CONDICIONES PARA QUE ENTRE 

                //VALIDACION DE LA ENTRADA DE LA RUTA
                System.out.println(P[6]);
                System.out.println("Ingresa Ruta" + P[i]);
                try {
                    PATH = L.readLine();

                    File a = new File(PATH);
                    if (a.exists() == true) {

                        //──────────────────────────────────────────────────────────────────────────────────────
                        //¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
                        if (OPTION == 7) {
                            //VALIDAR QUE SEA ARCHIVO DE TEXTO .TXT
                            if (a.isFile() & a.getName().endsWith(".txt")) {
                                System.out.println("Has seleccionado un archivo llamado \"" + a.getName() + "\"");
                            } else {
                                System.out.println("NO se puede leer el archivo \"" + a.getName() + "\"");
                                PATH = "";
                            }
                        }


                        //¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
                        if (OPTION == 10 & i == 2) {
                            //VALIDAR QUE SEA ARCHIVO
                            if (a.isFile()) {
                                System.out.println("Has seleccionado un archivo llamado \"" + a.getName() + "\"");
                            } else {
                                System.out.println("NO se puede leer el archivo \"" + a.getName() + "\"");
                                PATH = "";
                            }
                        }


                        //¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
                        if (OPTION == 10 & i == 3) {
                            //VALIDAR QUE SEA CARPETA
                            if (a.isDirectory()) {
                                System.out.println("Has seleccionado la Carpeta llamada \"" + (("".equals(a.getName()) == true) ? a.getAbsolutePath() : a.getName()) + "\"");
                            } else {
                                System.out.println("No es un un directorio el objeto \"" + a.getName() + "\"");
                                PATH = "";
                            }
                        }


                        //¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
                        System.out.println(("".equals(PATH)) ? "" : "Has cambiado la Ruta actual");
                    } else {
                        System.err.println("RUTA INVALIDA");
                        PATH = "";
                    }


                } catch (IOException e) {
                    System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
                } catch (Exception e) {
                    System.err.println("ERROR DESCONOCIDO");
                }
                System.out.println(P[5]);
            }
        }

        public static void FILE() {

            CONT = 0;
            File a = new File(PATH);
            String A[] = a.list();

            for (int i = 0; i < A.length; i++) {
                File b = new File(a.getAbsolutePath() + File.separator + A[i]);

                if (b.isFile() == TYPE) {
                    System.out.println("=========================");
                    System.out.println("Nombre: " + b.getName());
                    System.out.println("Tipo: " + ((b.isFile()) ? "Archivo" : "Carpeta"));
                    System.out.println("Tamaño: " + b.length() + " Bytes");
                    System.out.println("Modificado: " + b.lastModified() / 1000 + " segundos");
                    System.out.println("Directorio: " + b.getAbsolutePath());
                    CONT++;
                }
            }
        }

        public static void READ() {

            try {
                //LECTOR DE ARCHIVOS .TXT
                File a = new File(PATH);
                java.io.BufferedReader L = new java.io.BufferedReader(new java.io.FileReader(PATH));

                System.out.println(P[4]);
                System.out.println("CONTENIDO DEL ARCHIVO: " + "\"" + a.getName() + "\"");
                System.out.println(P[5]);
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
            System.out.println(P[4]);
        }

        public static void WRITE() throws IOException {
            
            File a=new File("E:\\INFO.txt");
            java.io.BufferedWriter W=new java.io.BufferedWriter(new java.io.FileWriter(a));
            W.write(TEXT); 
            W.close();
                    
        }

        public static void DELETE() {

            DIR();
            File a = new File(PATH);
            System.out.println(((a.delete()) ? "Se ha eliminado " : "No se ha eliminado ") + "el archivo \"" + a.getName() + "\"");
            System.out.println(P[5]);
        }

        public static void COPY() {

            try {

                File a = new File(FILE);
                FileInputStream in = new FileInputStream(a);
                FileOutputStream out = new FileOutputStream(PATH + File.separator + a.getName());

                byte Buffer[] = new byte[1024];
                int x;

                System.out.println("Se esta copiando el archivo, espere...");
                while ((x = in.read(Buffer)) > 0) {
                    out.write(Buffer, 0, x);
                }
                File b = new File(PATH + File.separator + a.getName());

                //GUARDAR Y LIBERAR BUFFER
                in.close();
                out.close();
                out.flush();


                if (b.exists()) {

                    System.out.println(P[4]);
                    System.out.println("Has copiado el archivo \"" + b.getName() + "\" a \"" + b.getParent() + "\"");
                    System.out.println(P[5]);
                }

            } catch (FileNotFoundException e) {
                System.err.println("NO SE HA ENCONTRADO EL ARCHIVO");
            } catch (IOException e) {
                System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
            } catch (Exception e) {
                System.err.println("ERROR DESCONOCIDO");
            }
        }

        public static void RENAME() {

            //ARCHIVO ACTUAL
            File a = new File(PATH);
            String nombre = "";

            System.out.println(P[4]);
            System.out.println("Nombre actual: " + a.getName());
            System.out.println(P[5]);

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

            //ARCHIVO CON NUEVO NOMBRE
            File b = new File(a.getParent() + File.separator + nombre);

            System.out.println((a.renameTo(b) ? "Se ha cambiado el nombre" : "No se ha cambiado el nombre") + ((a.isFile()) ? " del archivo" : " de la carpeta"));
            System.out.println("De \"" + a.getName() + "\" a \"" + b.getName() + "\" ");
            PATH = b.getAbsolutePath();
            System.out.println(P[5]);
        }

        public static void MDIR() {

            System.out.println(P[6]);

            int x = 0;

            while (x == 0) {
                System.out.println("Ingresa Directorio a crear");
                try {
                    PATH = L.readLine();
                    File a = new File(PATH);

                    if (a.exists()) {
                        System.out.println("YA EXISTE LA CARPETA, INTENTA PONER OTRA RUTA");
                    } else {
                        System.out.println(((a.mkdirs()) ? "Se ha creado la carpeta " : "No se a podido crear la carpeta ") + "\"" + a.getName() + "\"");
                        x = 1;
                    }


                } catch (IOException e) {
                    System.err.println("NO SE HA ENCONTRADO DISPOSITIVO\n" + e.getMessage());
                } catch (Exception e) {
                    System.err.println("ERROR DESCONOCIDO \n" + e.getMessage());
                }
                System.out.println(P[5]);
            }
        }
    }

    public static class BROWSER {

        BROWSER(String D) {

            File a = new File(D);
            String A[] = a.list();

            for (int i = 0; i < A.length; i++) {
                File b = new File(a.getAbsolutePath() + File.separator + A[i]);


                if (A[i].startsWith(FILE)) {

                    System.out.println("=======================");
                    System.out.println("Nombre: " + b.getName());
                    System.out.println("Tipo: " + ((b.isFile()) ? "Archivo" : "Carpeta"));
                    System.out.println("Tamaño: " + b.length() + " Bytes");
                    System.out.println("Modificado: " + b.lastModified() / 1000 + " s");
                    System.out.println("Directorio: " + b.getAbsolutePath());
                    CONT++;
                }

                if (b.isDirectory()) {
                    BROWSER OBJ = new BROWSER(a.getAbsolutePath() + File.separator + A[i]);
                }
            }
        }
    }

    public static class DDIR {

        DDIR(String D) {
            File a = new File(D);
            String A[] = a.list();

            for (int i = 0; i < A.length; i++) {
                File b = new File(a.getAbsolutePath() + File.separator + A[i]);

                if (b.isFile()) {
                    System.out.println(((b.delete()) ? "Se ha eliminado " : "No se ha eliminado ") + "el archivo \"" + b.getName() + "\"");
                } else {
                    DDIR OBJ = new DDIR(a.getAbsolutePath() + File.separator + A[i]);
                }
            }
            System.out.println(((a.delete()) ? "Se ha eliminado " : "No se ha eliminado ") + "\"" + a.getName() + "\"");

        }
    }

    public static class INFO {

        public static void DISC(String R) {
            File a = new File(R);

            String temp = FileSystemView.getFileSystemView().getSystemDisplayName(a);
            
            System.out.println("  Nombre: " + ("".equals(temp) ? PATH : temp));
            System.out.println("  Tipo: " + FileSystemView.getFileSystemView().getSystemTypeDescription(a));

            long aux = a.getTotalSpace();

            long T = 0;
            long D = 0;
            long U = 0;

            int u = 0;
            int d = 0;

            if (aux != 0) {
                T = a.getTotalSpace() / (1024 * 1024);
                D = a.getFreeSpace() / (1024 * 1024);
                U = T - D;

                u = (int) ((U * 100) / T);
                d = (int) ((D * 100) / T);
            }

            int x = u;
            String B = "";

            for (int i = 0; i < 20; i++) {
                x -= 5;
                if (x > 0) {
                    B += "■";
                } else {
                    B += "□";
                }
            }

            System.out.println(P[7]);
            System.out.println("\t\tTotal: " + T + " MB");
            System.out.println("\t[" + B + "]\n");
            System.out.println("    ■ Usado \t\t" + u + "%\t[" + U + " MB]");
            System.out.println("    □ Disponible\t" + d + "%\t[" + D + " MB]");

        }

        public static void FILE() {

            File a = new File(PATH);

            System.out.println("Nombre: " + FileSystemView.getFileSystemView().getSystemDisplayName(a));
            System.out.println("Tipo: " + FileSystemView.getFileSystemView().getSystemTypeDescription(a));
            SimpleDateFormat D = new SimpleDateFormat("dd\\MM\\yyyy");
            System.out.println("Modificado: " + (D.format(a.lastModified())));
            System.out.println("Tamaño: " + a.length() + " Bytes");
            System.out.println("Estado: " + ((a.isHidden()) ? "Oculto" : " Visible"));
            System.out.println("Directorio: " + a.getAbsolutePath());

        }

        public static void PC() {

            String aux; //Auxiliar de texto para guardar a archivo e imprimir
            Sigar sigar = new Sigar();  //INTANCIA PRINCIPAL DE LA INFORMACION DE LA PC  

            
            OperatingSystem Sys = OperatingSystem.getInstance();
            
            //AUXILIAR PARA EL TEXTO DE LA INFORMACION DEL SO
            aux=P[6]+"\nINFORMACION DEL SISTEMA OPERATIVO\n"+P[7]+"\n"
                    +"Descripcion: " + Sys.getDescription()+ "\n"
                    +"Nombre: " + Sys.getName()+"\n"
                    + "Architectura OS: " + Sys.getArch()+"\n"
                    + "Version del SO " + Sys.getVersion()+"\n"
                    + "Fabricante: " + Sys.getVendor()+"\n"
                    + "Version SO " + Sys.getVendorVersion()+"\n";
            
            //IMPRESION DEL AUXILIAR
            System.out.println(aux);
            TEXT+=aux;


            try {
                Mem M = sigar.getMem();
                CpuInfo infos[] = sigar.getCpuInfoList();
                Cpu cpus[] = sigar.getCpuList();
                CpuInfo info = infos[0];
                
            aux=P[6]+"\nINFORMACION DE LA CPU\n"+P[7]+"\n"
                    +"Fabricante: " + info.getVendor()+ "\n"
                    +"Modelo: " + info.getModel()+"\n"
                    + "Mhz " + info.getMhz()+"\n"
                    + "CPUs " + info.getTotalSockets()+"\n"
                    + "Nucleos por CPU " + info.getCoresPerSocket()+"\n"; 
            
            //IMPRESION DEL AUXILIAR
            System.out.println(aux);
            TEXT+=aux;


                aux=P[6]+"\nLISTA DE CPUS INSTALDOS\n";
                for (int i = 0; i < cpus.length; i++) {

                    long Total = (cpus[i].getTotal()) / (1000);
                    long Usado = (cpus[i].getUser()) / (1000);
                    long Dispo = Total - Usado;

                    int u = (int) ((Usado * 100) / Total) + 1;
                    int d = (int) ((Dispo * 100) / Total);

                    int x = u;
                    String B = "";

                    for (int j = 0; j < 25; j++) {

                        x -= 4;
                        if (x > 0) {
                            B += "■";
                        } else {
                            B += "□";
                        }

                    }
                    aux+=P[7]+"\n";
                    aux+=("CPU " + (i + 1) + " [" + B + "]\n");
                    aux+=(" ■ Usado: \t" + u + "%\n");
                    aux+=(" □ Disponible: \t" + d + "%\n");

                }
            } catch (SigarException e) {
                aux=e.getMessage()+"\n";
            } catch (Exception e) {
                aux=("ERROR DESCONOCIDO\n");
            }
            
            //IMPRESION DEL AUXILIAR
            System.out.println(aux);
            TEXT+=aux;            

            try {
                Mem M = sigar.getMem();

                aux=P[6]+"\nINFORMACION DE LA MEMORIA RAM\n"+P[7]+"\n";
                long Total = M.getTotal() / (1024 * 1024);
                long Dispo = M.getFree() / (1024 * 1024);
                long Usado = Total - Dispo;

                int u = (int) ((Usado * 100) / Total);
                int d = (int) ((Dispo * 100) / Total);

                int x = u;
                String B = "";

                for (int i = 0; i < 20; i++) {

                    x -= 5;
                    if (x > 0) {
                        B += "■";
                    } else {
                        B += "□";
                    }
                }

                aux+=("\t\tTotal " + Total + " MB\n");
                aux+=("\t[" + B + "]\n");
                aux+=("  ■ Usado \t\t" + u + "%\t ■ " + Usado + " MB\n");
                aux+=("  □ Disponible \t\t" + d + "%\t □ " + Dispo + " MB\n");

            } catch (SigarException e) {
                aux=(e.getMessage()+"\n");
            } catch (Exception e) {
                aux=("ERROR DESCONOCIDO\n");
            }
            
            //IMPRESION DEL AUXILIAR
            System.out.println(aux);
            TEXT+=aux;  

            aux=P[6]+"\nUNIDADES LOCALES DISPONIBLES EN LA PC\n"+P[7]+"\n";
            File Disco[] = File.listRoots();

            //IMPRESION DEL AUXILIAR
            System.out.println(aux);
            TEXT+=aux;
            
            for (int i = 0; i < 10; i++) {
                String name = FileSystemView.getFileSystemView().getSystemDisplayName(Disco[i]);
                String tipo = FileSystemView.getFileSystemView().getSystemTypeDescription(Disco[i]);

                aux="";
                aux+=((("".equals(name)) ? tipo + " (" + Disco[i] + ")" : name)+"\n");
      
                try {

                    long Total = Disco[i].getTotalSpace() / (1024 * 1024);
                    long Dispo = Disco[i].getFreeSpace() / (1024 * 1024);
                    long Usado = Total - Dispo;

                    int u = (int) ((Usado * 100) / Total);
                    int d = (int) ((Dispo * 100) / Total);

                    
                    aux+=(" ■ Usado \t" + u + "%\n");
                    aux+=(" □ Disponible \t" + d + "%\n");


                } catch (ArithmeticException e) {
                    aux+=(" □ No Diponible\n");
                } catch (Exception e) {
                    aux+=("ERROR DESCONOCIDO\n");
                }
                aux+=P[7]+"\n";
             //IMPRESION DEL AUXILIAR
              System.out.println(aux);
              TEXT+=aux;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        MENU OS = new MENU();
        
    }
}
