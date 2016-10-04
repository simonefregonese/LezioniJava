
public class Node{
	
	int item;
	Node nodeLeft;
	Node nodeRight; 
	Node nodeFather;
	
	public Node getNodeFather() {
		return nodeFather;
	}

	public void setNodeFather(Node nodeFather) {
		this.nodeFather = nodeFather;
	}

	public Node(int item){
		this.item = item;
	}
	
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public Node getNodeLeft() {
		return nodeLeft;
	}
	public void setNodeLeft(Node nodeLeft) {
		this.nodeLeft = nodeLeft;
	}
	public Node getNodeRight() {
		return nodeRight;
	}
	public void setNodeRight(Node nodeRight) {
		this.nodeRight = nodeRight;
	}
	
	
	
	

}
