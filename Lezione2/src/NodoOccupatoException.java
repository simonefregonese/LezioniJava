//Lezione 3
//Lancio un eccezione quando faccio insertRight o Left che mi indica che c'� gi� un nodo e mi dice anche da chi � occupato
// (l'oggetto exception contiene un riferimento al nodo)

public class NodoOccupatoException extends Exception{
	Node n;
	
	public NodoOccupatoException(String mex, Node existingNode){
		super(mex);
		n = existingNode;
	}
	
	public Node getNode(){
		return n;
	}
	

}
