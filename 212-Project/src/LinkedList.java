
public class LinkedList <T>{
	private Node<T> head;
	private Node<T> current;
	
	public LinkedList() {
		head = current = null;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public boolean isFull() {
		return false;
	}
	public boolean last() {
		return current.next==null;
	}
	public void findFirst() {
		current= head;
	}
	public void findNext() {
		current=current.next;
	}
	public void Update(T d) {
		current.data=d;
	}
	public T retrive() {
		return current.data;
	}
	public void insert(T d) {
		Node<T> temp = new Node<T>(d);
		if(head == null) {
			head = temp;
			current = temp;
		}else {
			temp.next = current.next;
			current.next = temp;
			current = temp;
		}
	}
	public void remove() {
		if(current == head) {
			head = head.next;
			current = current.next;
		}else {
			Node<T> p = head;
			while(p.next!= current) {
				p=p.next;
			}
			p.next = current.next;
			if(current.next!= null)
				current = current.next;
			else
				current = head;
		}
	}
	public boolean search(T x) {
		Node<T> temp = head;
		while(temp != null) {
			if(temp.data.equals(x))
				return true;
			else 
				temp = temp.next;
		}
		return false;
	}
	public void display() {
		Node<T> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void addSorted(T x) {
		Node<T> temp = new Node(x);
		if(head == null) {
			head = temp;
			current = temp;
		}else {
			if(((Contact)x).compareTo((Contact)head.data)<0){
				temp.next = head;
				head = temp;
				current = temp;
			}else {
				Node<T> temp2 = head, temp3=null;
				while(temp2!= null && (((Contact)temp2.data).compareTo((Contact)x)<=0)){
					temp3 = temp2;
					temp2 = temp2.next;
				}
				temp3.next = temp;
				temp.next = temp2;
			}
		}
	}
	public static void main(String[] args) {
		
	}

}
