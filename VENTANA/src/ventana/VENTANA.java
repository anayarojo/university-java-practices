
package ventana;

public class VENTANA {
    
        static String PATH = ""; 
        static String P[] = {" Actual ", " Nueva ", " del Archivo ", " de la Carpeta",
        "______________________________________________________________________________________",
        "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯",
        "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯",
        "--------------------------------------------------------------------",
        "_____________________________________________",
        "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯"};

    public static void main(String[] args) {
        
        
        
                  /*  
        
         System.out.println("\n\t\t\t\t    MENU DEL EXPLORADOR\n"
                        + "╔════════════════════════════════════════════════════╗\n"
                        + "  "+P[4] + "\n"
                        + "    Ruta actual < " + PATH + (("".equals(PATH)) ? "Ninguna" : "") + ">\n"
                        + "  "+P[5] + "\n"
                        + "  01.-Mostrar Lista de Archivos\t\t\t02.-Mostrar Lista de Carpetas\n"
                        + "  03.-Cambiar la Ruta actual\t\t\t04.-Ir a la Ruta padre\n"
                        + "  05.-Ir a la Raiz de la Ruta\t\t\t06.-Cambiar la Unidad de la Ruta\n"
                        + "  07.-Ver un archivo tipo .txt\t\t\t08.-Cambiar nombre de un archivo\n"
                        + "  09.-Eliminar un archivo\t\t\t10.-Copiar un archivo a otro\n"
                        + "  11.-Crear una carpeta\t\t\t\t12.-Eliminar una carpeta\n"
                        + "  13.-Obtener informacion del disco\t\t14.-Obtener informacion de un archivo\n"
                        + "  15.-Obtener informacion del PC\t\t16.-Guardar listado de archivos\n"
                        + "  17.-Guardar informacion a un archivo\t\t18.-Buscar archivo\n"
                        + "  19.-Explorar por carpetas\t\t\t20.-Salir\n  "+P[4]+"\n"
                        + "╚════════════════════════════════════════════════════╝");
                System.out.print("¿Que deceas hacer?: ");
        
        
        
                  
                 System.out.println("\n\t\t\t\t    MENU DEL EXPLORADOR\n"
                        + "╔════════════════════════════════════════════════════╗\n"
                        + "  "+P[4] + "\n"
                        + "    Ruta actual < " + PATH + (("".equals(PATH)) ? "Ninguna" : "") + ">\n"
                        + "  "+P[5] + "\n"
                        + "  [01].-Mostrar Lista de Archivos\t\t[02].-Mostrar Lista de Carpetas\n"
                        + "  [03].-Cambiar la Ruta actual\t\t\t[04].-Ir a la Ruta padre\n"
                        + "  [05].-Ir a la Raiz de la Ruta\t\t\t[06].-Cambiar la Unidad de la Ruta\n"
                        + "  [07].-Ver un archivo tipo .txt\t\t[08].-Cambiar nombre de un archivo\n"
                        + "  [09].-Eliminar un archivo\t\t\t[10].-Copiar un archivo a otro\n"
                        + "  [11].-Crear una carpeta\t\t\t[12].-Eliminar una carpeta\n"
                        + "  [13].-Obtener informacion del disco\t\t[14].-Obtener informacion de un archivo\n"
                        + "  [15].-Obtener informacion del PC\t\t[16].-Guardar listado de archivos\n"
                        + "  [17].-Guardar informacion a un archivo\t[18].-Buscar archivo\n"
                        + "  [19].-Explorar por carpetas\t\t\t[20].-Salir\n  "+P[4]+"\n"
                        + "╚════════════════════════════════════════════════════╝");
                System.out.print("¿Que deceas hacer?: ");
        
                   * 
                   */
        
                        System.out.println("\n=================================MENU=DEL=EXPLORADOR==================================\n"
                        + P[4] + "\n"
                        + "Ruta actual < " + PATH + (("".equals(PATH)) ? "Ninguna" : "") + ">\n"
                        + P[5] + "\n"
                        + " ❶.-Mostrar Lista de Archivos\t\t\t❷.-Mostrar Lista de Carpetas\n"
                        + " ❸.-Cambiar la Ruta actual\t\t\t❹.-Ir a la Ruta padre\n"
                        + " ❺.-Ir a la Raiz de la Ruta\t\t\t❻.-Cambiar la Unidad de la Ruta\n"
                        + " ❼.-Ver un archivo tipo .txt\t\t\t❽.-Cambiar nombre de un archivo\n"
                        + " ❾.-Eliminar un archivo\t\t\t\t❿.-Copiar un archivo a otro\n"
                        + " ⓫.-Crear una carpeta\t\t\t\t⓬.-Eliminar una carpeta\n"
                        + " ⓭.-Obtener informacion del disco\t\t⓮.-Obtener informacion de un archivo\n"
                        + " ⓯.-Obtener informacion del PC\t\t\t⓰.-Guardar listado de archivos\n"
                        + " ⓱.-Guardar informacion a un archivo\t\t⓲.-Buscar archivo\n"
                        + " ⓳.-Explorar por carpetas\t\t\t⓴.-Salir\n"
                        + "======================================================================================");
                System.out.print("¿Que deceas hacer?: ");
                
        
                
                System.out.println("\n\t\t\t\t   [ MENU DEL EXPLORADOR ]\n"
                        + "╔════════════════════════════════════════════════════╗\n"
                        + "  "+P[4] + "\n"
                        + "    Ruta actual < " + PATH + (("".equals(PATH)) ? "Ninguna" : "") + ">\n"
                        + "  "+P[5] + "\n"
                        + "  [01] Mostrar Lista de Archivos\t\t[02] Mostrar Lista de Carpetas\n"
                        + "  [03] Cambiar la Ruta actual\t\t\t[04] Ir a la Ruta padre\n"
                        + "  [05] Ir a la Raiz de la Ruta\t\t\t[06] Cambiar la Unidad de la Ruta\n"
                        + "  [07] Ver un archivo tipo .txt\t\t\t[08] Cambiar nombre de un archivo\n"
                        + "  [09] Eliminar un archivo\t\t\t[10] Copiar un archivo a otro\n"
                        + "  [11] Crear una carpeta\t\t\t[12] Eliminar una carpeta\n"
                        + "  [13] Obtener informacion del disco\t\t[14] Obtener informacion de un archivo\n"
                        + "  [15] Obtener informacion del PC\t\t[16] Guardar listado de archivos\n"
                        + "  [17] Guardar informacion a un archivo\t\t[18] Buscar archivo\n"
                        + "  [19] Explorar por carpetas\t\t\t[20] Salir\n  "+P[4]+"\n"
                        + "╚════════════════════════════════════════════════════╝");
                System.out.print("¿Que deceas hacer?: ");
                
                
                
                System.out.println("\n\t\t\t\t   [ MENU DEL EXPLORADOR ]\n"
                        + "╔════════════════════════════════════════════════════╗\n"
                        + "   "+P[4] + "\n"
                        + "     Ruta actual < " + PATH + (("".equals(PATH)) ? "Ninguna" : "") + ">\n"
                        + "   "+P[5] + "\n"
                        + "   [01] Mostrar Lista de Archivos\t\t[02] Mostrar Lista de Carpetas\n"
                        + "   [03] Cambiar la Ruta actual\t\t\t[04] Ir a la Ruta padre\n"
                        + "   [05] Ir a la Raiz de la Ruta\t\t\t[06] Cambiar la Unidad de la Ruta\n"
                        + "   [07] Ver un archivo tipo .txt\t\t\t[08] Cambiar nombre de un archivo\n"
                        + "   [09] Eliminar un archivo\t\t\t[10] Copiar un archivo a otro\n"
                        + "   [11] Crear una carpeta\t\t\t[12] Eliminar una carpeta\n"
                        + "   [13] Obtener informacion del disco\t\t[14] Obtener informacion de un archivo\n"
                        + "   [15] Obtener informacion del PC\t\t[16] Guardar listado de archivos\n"
                        + "   [17] Guardar informacion a un archivo\t\t[18] Buscar archivo\n"
                        + "   [19] Explorar por carpetas\t\t\t[20] Salir\n  "+P[4]+"\n"
                        + "╚════════════════════════════════════════════════════╝");
                System.out.print("¿Que deceas hacer?: ");
                

        
        
        
    }
}
