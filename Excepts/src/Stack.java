import rzp.exceptions.stack.StackException;

public class Stack implements rzp.exceptions.stack.Stack{
	
	// ������ �������
    protected int capacity;
    // ������ ������ ������� � �������
    protected int enqueuePointer;
    // ������ ����� ������� � �������
    protected int dequeuePointer;
    // ��� ������
    protected int[] data;
	/**
	 * �������������� ����
	 * @param maxSize ������������ ���������� ��������� � �����
	 * @throws StackException ��� ��������� ������������� (� �� ��������� �)
	 */
	public void init(int maxSize) throws StackException{
		if(data==null) {
		data = new int[maxSize];capacity=maxSize;}
		else {throw new StackException("���� ��� ���������������!");}
	}
	
	/**
	 * @return ���� �� ����
	 */
	public boolean isEmpty(){
		int size = (enqueuePointer - dequeuePointer) % (capacity + 1);
	    if (size == 0) 
	    return true;
	    else return false;
	}
	
	/**
	 * @return �������� �� ����
	 */
	public boolean isFull(){
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
	public boolean contains(int item) {
		for(int i=enqueuePointer-1;i>=dequeuePointer;i--)if(data[i]==item)return true;
		return false;
	}
	
	/**
	 * ���������� ������� � ������� �����
	 * @return ������� � ������� �����
	 * @throws StackException ���� ���� ����
	 */
	public int peek() throws StackException{
		if(isEmpty()) 
		{throw new StackException("���� ����");}
		else {
			int a=data[enqueuePointer-1];
			return a;
		}
	}
	
	/**
	 * ������� ������� � ������� ����� � ���������� ���
	 * @return ������� � ������� �����
	 * @throws StackException ���� ���� ����
	 */
	public int pop() throws StackException{
		if(isEmpty()) 
		{throw new StackException("���� ����");}
		else {
			int a=data[enqueuePointer-1];
			enqueuePointer = (enqueuePointer - 1) % (capacity + 1);
			return a;
		}
	}
	
	/**
	 * ��������� ������� � ������� �����
	 * @param item �������
	 * @throws StackException ���� ���� ��� ����������
	 */
	public void push(int item) throws StackException{
		if(isFull()) 
		{throw new StackException("���� �����!");}
		else {
			data[enqueuePointer] = item;
	        enqueuePointer = (enqueuePointer + 1) % (capacity + 1);
		}
	}
}
