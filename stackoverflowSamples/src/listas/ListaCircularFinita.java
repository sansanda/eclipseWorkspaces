package listas;

import java.util.Arrays;

public class ListaCircularFinita {

	//Inicializamos la lista de listas
	private Object[] lista; 
	private int size;
	
	public ListaCircularFinita(int filas) {
		lista = new Object[filas];
		size = filas;
		for (int i=0;i<filas;i++) {
			lista[i] = new String("fila" + i); 
		}
	}
	
	public void add(int index, Object o) {
		if (index < 0 || index > size) {
			throw new IllegalArgumentException("add : " + index + "< 0 || " + index + ">" + size);
			}
		if (isEmpty()) { // LISTA VACIA
			lista[index] = o;
		} 
		else if (index == 0) { // INSERTAR AL INICIO
			lista[index] = o;
		} else if (index == (size-1)) { //INSERTAR AL FINAL
			lista[index] = o;
			} else { // INSERTAR POR EL MEDIO
				moveR(index);
				lista[index] = o;
				}
		//size++;
	}
	
	public void printLista() {
		for (int i=0;i<lista.length;i++)
		{
			System.out.println(i + ". " + lista[i].toString());
		}
	}
	private void moveR(int index) {
		Object last = lista[lista.length-1];
		for (int i=lista.length-1;i>index;i--)
		{
			lista[i] = lista[i-1];
		}
		lista[0] = last;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	public static void main(String[] args) 
	{
		ListaCircularFinita lc = new ListaCircularFinita(8);
		
		lc.printLista();
		String[] l = {"1","2","3"}; 
		lc.add(5, Arrays.toString(l));
		lc.printLista();
		String[] l2 = {"1","2","3","4","5"}; 
		lc.add(5, Arrays.toString(l2));
		lc.printLista();
	}

}
