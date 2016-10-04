//Binary Tree
// - inserire elemento
// - cancellare "
// - cercare "
// - modificare
// l'albero contiene dei nodi con all'interno degli elementi
// HOMEWORK: memorizzare anche il father quando si fa l'inserimento

public class Tree{

	Node root;

	public void setRoot(Node root) {
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public Tree(int root){
		
		this.root = new Node(root);
	
	}	
	
//	public Node insertRight(Node n, int x){
//		Node nx = new Node(x);
//		if(n.getNodeRight() == null){
//			n.setNodeRight(nx);
//			nx.setNodeFather(n);
//			return nx;
//		}
//		else 
//			return null;
//	}
//	
//	public Node insertLeft(Node n, int x){
//		Node nx = new Node(x);
//		if(n.getNodeLeft() == null){
//			n.setNodeLeft(nx);
//			nx.setNodeFather(n);
//			return nx;
//		}
//		else 
//			return null;
//	}
	
	
	public Node insertRight(Node n, int x) throws NodoOccupatoException{
		Node nx = new Node(x);
		if(n.getNodeRight() == null){
			n.setNodeRight(nx);
			nx.setNodeFather(n);
			return nx;
		}
		else 
			throw new NodoOccupatoException("Nodo gia' occupato da " , n.getNodeRight() );
	}
	
	public Node insertLeft(Node n, int x) throws NodoOccupatoException{
		Node nx = new Node(x);
		if(n.getNodeLeft() == null){
			n.setNodeLeft(nx);
			nx.setNodeFather(n);
			return nx;
		}
		else 
			throw new NodoOccupatoException("Nodo gia' occupato da ", n.getNodeLeft());
	}
	
	
	public void delete(Node n){
		
		/*
		 * if(father.left == n)
		 * father.setLeft(null)
		 * else
		 * father.setRight(null)
		*/
		
		if(n.getNodeFather().getNodeLeft() == n)
			n.getNodeFather().setNodeLeft(null);
		else
			n.getNodeFather().setNodeRight(null);			
		
	}
	
	public Node searchFirst(Node n, int x){
		Node left;
		Node right;
		if(n == null)
			return null;
		else if(n.getItem() == x){
			return n;
		}
		else
			left = searchFirst(n.nodeLeft, x);
		if(left != null)
			return left;
		else{ 
			right = searchFirst(n.nodeRight, x);
			return right;
		}		
			
	}

	
	
	public void update(Node n, int x){
		n.setItem(x);
		
	}		

}
