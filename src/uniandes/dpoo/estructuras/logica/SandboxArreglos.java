package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	int[] copia = new int[arregloEnteros.length];
    	for (int i =0; i < copia.length; i++) {
    		copia[i] = arregloEnteros[i];
    	}
    	return copia;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
        String[] copiaCadenas = new String[arregloCadenas.length];
        for (int i = 0; i < copiaCadenas.length; i++) {
        	copiaCadenas[i] = arregloCadenas[i];
        }
    	return copiaCadenas;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        int cantidadEnteros = arregloEnteros.length;
        
    	return cantidadEnteros;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	int cantidadCadenas = arregloCadenas.length;
        return cantidadCadenas;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int nuevoTamano = arregloEnteros.length + 1;
    	int[] nuevoArregloEnt = new int[nuevoTamano];
    	for (int i = 0; i < nuevoTamano; i++) {
    		if (i == nuevoTamano - 1) {
    			nuevoArregloEnt[i] = entero;
    			
    		}
    		else{
    			nuevoArregloEnt[i] = arregloEnteros[i];
    		}
    	}
    	arregloEnteros = nuevoArregloEnt;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	int nuevoTamano = arregloCadenas.length + 1;
    	String[] nuevoArregloCad = new String[nuevoTamano];
    	for (int i = 0; i < nuevoTamano-1; i++) {
    		nuevoArregloCad[i] = arregloCadenas[i];
    	}
    	nuevoArregloCad[nuevoTamano-1] = cadena;
    	arregloCadenas = nuevoArregloCad;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int contarApariciones = 0;
    	int tamanoActual = arregloEnteros.length;
    	for (int i = 0; i  < tamanoActual; i ++) {
    		if (arregloEnteros[i] == valor) {
    			contarApariciones ++;
    		}
    	}
    	int nuevoTamano = tamanoActual - contarApariciones;
    	int[] nuevoArregloEnteros = new int[nuevoTamano];
    	int j= 0;
    	for (int i = 0; i < tamanoActual; i ++) {
    		if (arregloEnteros[i] != valor) {
    			nuevoArregloEnteros[j] = arregloEnteros[i];
    			j++;
    		}
    	}
    	arregloEnteros = nuevoArregloEnteros;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int contarApariciones = 0;
    	int tamanoActual = arregloCadenas.length;
    	for (int i = 0; i < tamanoActual; i ++) {
    		if (arregloCadenas[i].equals(cadena)) {
    			contarApariciones ++;
    		}
    	}
    	int nuevoTamano = tamanoActual - contarApariciones;
    	String[] nuevoArregloCadenas = new String[nuevoTamano];
    	int j = 0;
    	for (int i = 0; i < tamanoActual; i ++) {
    		if (! arregloCadenas[i].equals(cadena)) {
    			nuevoArregloCadenas[j] = arregloCadenas[i];
    			j ++;
    		}
    	}
    	arregloCadenas = nuevoArregloCadenas;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int tamanoActual = arregloEnteros.length;
    	int nuevoTamano = tamanoActual + 1;
    	int[] nuevoArregloEnteros = new int[nuevoTamano];
    	
    	if (posicion < 0) {
    		posicion = 0;
    	}
    	else if(posicion >= nuevoTamano) {
    		posicion = nuevoTamano - 1;
    	}
    	
    	int j = 0;
    	for (int i = 0; i < nuevoTamano; i ++) {
    		if (i == posicion) {
    			nuevoArregloEnteros[i] = entero;
    		}
    		else {
    			nuevoArregloEnteros[i] = arregloEnteros[j];
    			j ++;
    		}
    	}
    	arregloEnteros = nuevoArregloEnteros;
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	int tamanoActual = arregloEnteros.length;
    	if (posicion >= 0 && posicion < tamanoActual) {
    		int nuevoTamano = tamanoActual - 1;
    		int[] nuevoArregloEnteros = new int[nuevoTamano];
    		int j = 0;
    		for (int i = 0; i < tamanoActual; i++) {
    			if (i != posicion) {
    				nuevoArregloEnteros[j] = arregloEnteros[i];
    				j ++;
    			}
    		}
    		arregloEnteros = nuevoArregloEnteros;
    	}
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int[] nuevoArregloEnteros = new int[valores.length];
    	
    	for (int i = 0; i < valores.length; i ++) {
    		int valor = (int) valores[i];
    		nuevoArregloEnteros[i] = valor;
    	}
    	arregloEnteros = nuevoArregloEnteros;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	String[] nuevoArregloCadenas = new String[objetos.length];
    	
    	for (int i = 0; i < objetos.length; i ++) {
    		String objeto = objetos[i].toString();
    		nuevoArregloCadenas[i] = objeto;
    	}
    	arregloCadenas = nuevoArregloCadenas;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int[] nuevoArregloEnteros = new int[arregloEnteros.length];
    	for (int i = 0; i < arregloEnteros.length; i ++) {
    		int valor = arregloEnteros[i];
    		if (valor < 0) {
    			valor = valor * -1;
    		}
    		nuevoArregloEnteros[i] = valor;
    	}
    	arregloEnteros = nuevoArregloEnteros;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
        for (int i = 0; i < arregloEnteros.length; i ++) {
        	for (int j = 0; j < arregloEnteros.length - 1- i; j ++) {
            	if (arregloEnteros[j] > arregloEnteros[j + 1]) {
            		int valorMayor = arregloEnteros[j];
            		arregloEnteros[j] = arregloEnteros[j+1];
            		arregloEnteros[j+1] = valorMayor;
            	}
        	}
        }
    	

    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
        for (int i = 0; i < arregloCadenas.length; i ++) {
        	for (int j = 0; j < arregloCadenas.length - 1 - i; j ++) {
        		if (arregloCadenas[j].compareTo(arregloCadenas[j + 1]) > 0) { // si es negativo, va antes; si es positivo, va despues
            		String valorMayor = arregloCadenas[j];
            		arregloCadenas[j] = arregloCadenas[j+1];
            		arregloCadenas[j+1] = valorMayor;
            	}
        	}
        }
    	

    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
        int cantidad = 0;
        for (int i = 0; i < arregloEnteros.length; i ++) {
        	if (arregloEnteros[i] == valor) {
        		cantidad ++;
        	}
        }
        return cantidad;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
        int cantidad = 0;
        for (int i = 0; i < arregloCadenas.length; i ++) {        	
        	if (arregloCadenas[i].equalsIgnoreCase(cadena)) {
        		cantidad ++;
        	}
        }
        return cantidad;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int apariciones = 0;
    	for (int i = 0; i < arregloEnteros.length; i ++) {
    		if (arregloEnteros[i] == valor) {
    			apariciones ++;
    		}
    	}
		int[] posiciones = new int[] {};
		
		int j = 0;
    	if (apariciones != 0){
    		posiciones = new int[apariciones];
    		for (int i = 0; i < arregloEnteros.length; i ++) {
        		if (arregloEnteros[i] == valor) {
        			posiciones[j] = i;
        			j ++;
        		}
    		}
    	}

        return posiciones;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	int[] arregloRangos = new int[] {};
    	int tamano = arregloEnteros.length;
    	if (tamano > 0) {
    		arregloRangos = new int[2];
    		
    		int menor = arregloEnteros[0];
    		int mayor = arregloEnteros[0];
    		
    	    for (int i = 1; i < arregloEnteros.length; i++){
    	        if (arregloEnteros[i] < menor) {
    	            menor = arregloEnteros[i];
    	        }
    	        if (arregloEnteros[i] > mayor) {
    	            mayor = arregloEnteros[i];
    	        }
    	    }
    		arregloRangos[0] = menor;
    		arregloRangos[1] = mayor;
    	}
        return arregloRangos;
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();
    	
    	
    	for (int i = 0; i < arregloEnteros.length; i++) {
    		int valor = arregloEnteros[i];
    		if (! mapa.containsKey(valor)) {
    			mapa.put(valor, 0);
    		}
    		int cantidad = mapa.get(valor);
    		mapa.put(valor, cantidad + 1);
    	}
    	
    	return mapa;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	int cantidad = 0;
    	
    	HashMap<Integer, Integer> mapa = calcularHistograma();
    	
    	for (int veces : mapa.values()) { // Aca entonces hago un recorrido for each: veces es el valor de cada llave en el mapa.
    		if (veces > 1) {
    			cantidad++;
    		}
    	}
    	
        return cantidad;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
        boolean iguales = true;
        
        if(arregloEnteros.length == otroArreglo.length) {
        	for (int i = 0; i < arregloEnteros.length; i ++) {
        		if (arregloEnteros[i] != otroArreglo[i]) {
        			iguales = false;
        		}
        	}
        }
        else {
        	iguales = false;
        }
    	return iguales;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	boolean iguales = true;
    	HashMap<Integer, Integer> mapaA = calcularHistograma ();
        
    	HashMap<Integer, Integer> mapaB = new HashMap<Integer, Integer>();
    	
    	
    	for (int i = 0; i < otroArreglo.length; i++) {
    		int valor = otroArreglo[i];
    		if (! mapaB.containsKey(valor)) {
    			mapaB.put(valor, 0);
    		}
    		int cantidad = mapaB.get(valor);
    		mapaB.put(valor, cantidad + 1);
    	}
            
    	iguales = mapaA.equals(mapaB);
    			
        return iguales;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	int[] nuevoArreglo = new int[cantidad];
    	
        int rango = maximo - minimo + 1;

        for (int i = 0; i < cantidad; i++){
            nuevoArreglo[i] = minimo + (int)(Math.random( ) * rango);
        }
        
    	arregloEnteros = nuevoArreglo;
    }

}
