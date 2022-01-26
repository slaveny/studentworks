import rzp.generics.stack.StackException;
import rzp.generics.stack.Stack;
import java.util.ArrayList;

public class MyStack<T> implements Stack<T>{
	private int capacity=0;
    // ������ ������ ������� � �������
    private int enqueuePointer;
    // ������ ����� ������� � �������
    private int dequeuePointer;
    // ��� ������
    private ArrayList<T> data;

	/**
	 * �������������� ����
	 * @param maxSize ������������ ���������� ��������� � �����
	 * @throws StackException ��� ��������� ������������� (� �� ��������� �)
	 */
	public void init(int maxSize) throws StackException{
		if(capacity!=0)throw new StackException("Initialized already!");
		this.capacity = maxSize;
        this.data=new ArrayList<>();
	}
	
	/**
	 * @return ���� �� ����
	 */
	public boolean isEmpty() {
		int size = (enqueuePointer - dequeuePointer) % (capacity + 1);
	    if (size == 0) 
	    return true;
	    else return false;
	}
	
	/**
	 * @return �������� �� ����
	 */
	public boolean isFull() {
		int size = (enqueuePointer - dequeuePointer) % (capacity + 1);
		if(size==0)size=-1;
        return size==capacity;
	}
	
	/**
	 * @return ������ �����
	 */
	public int size() {
		int size = (enqueuePointer - dequeuePointer) % (capacity + 1);
        if (size < 0) {
            size += capacity;
        }
        return size;
	}
	
	/**
	 * @param item �������
	 * @return ���������� �� ������� � �����
	 */
	public boolean contains(T item) {
		if(data!=null)
		return this.data.contains(item);
		return false;
	}
	
	/**
	 * ���������� ������� � ������� �����
	 * @return ������� � ������� �����
	 * @throws StackException ���� ���� ����
	 */
	public T peek() throws StackException{
		if(enqueuePointer==dequeuePointer) throw new StackException("Stack is Emply!");
		else return this.data.get(dequeuePointer);
	}
	
	/**
	 * ������� ������� � ������� ����� � ���������� ���
	 * @return ������� � ������� �����
	 * @throws StackException ���� ���� ����
	 */
	public T pop() throws StackException{
		if(enqueuePointer==dequeuePointer) throw new StackException("Stack is Emply!");
		else {
			T temp=this.data.get(dequeuePointer);
			this.data.remove(dequeuePointer);
			enqueuePointer = (enqueuePointer - 1) % capacity;
			return temp;}
	}
	
	/**
	 * ��������� ������� � ������� �����
	 * @param item �������
	 * @throws StackException ���� ���� ��� ����������
	 */
	public void push(T item) throws StackException{
		if(isFull()) throw new StackException("Full already!");
		else 
		{
			data.add(dequeuePointer, item);
	        enqueuePointer = (enqueuePointer + 1) % (capacity + 1);}
	}
	
}
