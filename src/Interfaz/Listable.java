/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**Es la interfaz para enunciar las operaciones de la lista
 *
 * @author JoseDiaz,BrayanHerrera
 * @since 06/03/2017
 */
public interface Listable {
    
    /**Metodo que indica si una lista es vacia
     * 
     * @return retorna true si el conjunto es vacio y false si no
     */
    public boolean esVacia();
    
    /**Metodo que inserta un objecto a la lista
     * 
     * @param ob objeto a insertar en la lista
     */
 
    
    /**Metodo que elimina un objeto de la lista
     * 
     * @param ob objeto a eliminar en la lista
     */
    public void elminar(Object ob);
    
    /**Metodo que vacia la lista
     * 
     */
    public void vaciar();
    
    /**Metodo que determina si una lista contiene a un elemento
     * 
     * @param ob metodo a analizar en la lista
     * @return true si lo contiene o false si no lo contiene en la lista
     */
    public boolean contiene(Object ob);
    
    /**Primer elemento de la lista
     * 
     * @return Primer objeto de la lista
     */
    public Object primerElmento();

    public Object ultimoElemento();

    
    /**Metodo que sustituye un elemento en la lista 
     * 
     * @param ob1 Objeto que se insertara en la lista
     * @param ob2 Objeto que se sustituira en la lista
     */
        
    
    public void sustituir(Object ob1, Object ob2);
    
    /**Iterador para recorrer la lista
     * 
     * @return retorna un iterador 
     */
    public java.util.Iterator iterador();

}
