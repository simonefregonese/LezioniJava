
public class Main {
	
	public static void main(String[] args){
		
		Tree tree = new Tree(2);
		Node root = tree.getRoot();
		try {
			tree.insertLeft(root, 3);
		} catch (NodoOccupatoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Node nx = null;
		try {
			nx = tree.insertRight(root,3);
		} catch (NodoOccupatoException e) {
			System.out.println(e.getMessage());
		  }
		try {
			tree.insertLeft(nx.getNodeFather(),5);
		} catch (NodoOccupatoException e) {
			
			System.out.println(e.getMessage() + e.getNode());
		}
		
		Node n5 = tree.searchFirst(root, 5); 	// all'esecuzione dà un'eccezione perchè sopra ho tentato di inserire   
		tree.delete(n5);						// un nodo in una posizione già occupata, quindi non l'ha inserito e  
		tree.update(nx, 10);					// quindi non ha potuto effettuare la cancellazione di quel nodo
		Node n3 = tree.searchFirst(root,3);
		System.out.println("n3 != nx -->"+ (n3 != nx));
		
		
	}

}
