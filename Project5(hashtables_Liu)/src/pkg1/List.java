package pkg1;

class List{
	private Node first;
	
	public List() {
		first = null;
	}
	public void insertFirst(String name, double gdpPerCapita) {
		Node newLink = new Node(name,gdpPerCapita);
		newLink.nextNode = first;
		first = newLink;
	}
	public Node deleteFirst() {
		Node temp = first;
		first = first.nextNode;
		return temp;
	}
	public void displayList() {
		System.out.print("this is the Link list");
		Node current = first;
		while(current != null) {
			current.printNode();
			current = current.nextNode;
		}
		System.out.println("");
	}
	public boolean isEmpty() { //checks if it is empty
		return first==null;
	}
	public boolean isFull() { //checks if it is full
		return false;
	}
}
