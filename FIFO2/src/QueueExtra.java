
public class QueueExtra implements rzp.oop.queue.QueueExtra{
	private int capacity;
    // ������ ������ ������� � �������
    private int enqueuePointer;
    // ������ ����� ������� � �������
    private int dequeuePointer;
    // ��� ������
    private int[] data;
	/**
	 * @return ����������� �������� �������
	 */
	public int getMin() {
		int min=data[enqueuePointer-1];
		for(int i=enqueuePointer-1;i>=dequeuePointer;i--) {
			if(min>data[i])
				min=data[i];
		}
	return min;	
	}
	
	/**
	 * @return ������������ �������� �������
	 */
	public int getMax() {
		int max=data[enqueuePointer-1];
		for(int i=enqueuePointer-1;i>=dequeuePointer;i--) {
			if(max<data[i])
				max=data[i];
		}
	return max;
	}
	
	/**
	 * ������� ������� �� ���� ���������
	 */
	public void clear() {
		dequeuePointer=0;
		enqueuePointer=0;
		capacity=0;		
	}

	public
	void init(int maxSize) {
		this.capacity = maxSize;
        this.data = new int[maxSize];
	}
	
	/**
	 * @return ����� �� �������
	 */

	public
	boolean isEmpty() {
	int size = (enqueuePointer - dequeuePointer) % (capacity + 1);
    if (size == 0) 
    return true;
    else return false;
	}
	
	/**
	 * @return ��������� �� �������
	 */

	public
	boolean isFull() {
		int size = (enqueuePointer - dequeuePointer) % (capacity + 1);
		if(size==0)size=-1;
        return size==capacity;
	}
	
	/**
	 * @return ���������� ������� ������ �������
	 */

	public
	int size() {
		int size = (enqueuePointer - dequeuePointer) % (capacity + 1);
        if (size < 0) {
            size += capacity;
        }
        return size;
	}
	
	/**
	 * @param item �������
	 * @return ���������� �� ������� � �������
	 */

	public
	boolean contains(int item){
		for(int i=enqueuePointer-1;i>=dequeuePointer;i--)if(data[i]==item)return true;
		return false;
	}
	
	/**
	 * ���������� ������� � ������� �������
	 * @return ������� � ������� �������
	 */

	public
	int peek() {
		int a=data[dequeuePointer];
		return a;
	}
	
	/**
	 * ������� ������� � ������� ������� � ���������� ���
	 * @return ������� � ������� �������
	 */

	public
	int poll() {
		int a=data[dequeuePointer];
		dequeuePointer = (dequeuePointer + 1) % (capacity + 1);
		return a;
	}
	
	/**
	 * ��������� ������� � ����� �������
	 * @param item �������
	 */

	public void offer(int item) {
		if(enqueuePointer!=capacity) {
		data[enqueuePointer] = item;
        enqueuePointer = (enqueuePointer + 1) % (capacity + 1);}
	}
	
	public void pq() {
		System.out.printf("��������� ��������� %d; �������� ��������� %d\n",enqueuePointer,dequeuePointer);
		System.out.println(data[dequeuePointer]);
	}

}
