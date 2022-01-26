
public class QueueExtra implements rzp.oop.queue.QueueExtra{
	private int capacity;
    // Индекс начала очереди в массиве
    private int enqueuePointer;
    // Индекс конца очереди в массиве
    private int dequeuePointer;
    // Сам массив
    private int[] data;
	/**
	 * @return минимальное значение очереди
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
	 * @return максимальное значение очереди
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
	 * Очищает очередь от всех элементов
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
	 * @return пуста ли очередь
	 */

	public
	boolean isEmpty() {
	int size = (enqueuePointer - dequeuePointer) % (capacity + 1);
    if (size == 0) 
    return true;
    else return false;
	}
	
	/**
	 * @return заполнена ли очередь
	 */

	public
	boolean isFull() {
		int size = (enqueuePointer - dequeuePointer) % (capacity + 1);
		if(size==0)size=-1;
        return size==capacity;
	}
	
	/**
	 * @return возвращает текущий размер очереди
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
	 * @param item элемент
	 * @return содержится ли элемент в очереди
	 */

	public
	boolean contains(int item){
		for(int i=enqueuePointer-1;i>=dequeuePointer;i--)if(data[i]==item)return true;
		return false;
	}
	
	/**
	 * Возвращает элемент с вершины очереди
	 * @return элемент с вершины очереди
	 */

	public
	int peek() {
		int a=data[dequeuePointer];
		return a;
	}
	
	/**
	 * Удаляет элемент с вершины очереди и возвращает его
	 * @return элемент с вершины очереди
	 */

	public
	int poll() {
		int a=data[dequeuePointer];
		dequeuePointer = (dequeuePointer + 1) % (capacity + 1);
		return a;
	}
	
	/**
	 * Добавляет элемент в конец очереди
	 * @param item элемент
	 */

	public void offer(int item) {
		if(enqueuePointer!=capacity) {
		data[enqueuePointer] = item;
        enqueuePointer = (enqueuePointer + 1) % (capacity + 1);}
	}
	
	public void pq() {
		System.out.printf("Начальный указатель %d; Конечный указатель %d\n",enqueuePointer,dequeuePointer);
		System.out.println(data[dequeuePointer]);
	}

}
