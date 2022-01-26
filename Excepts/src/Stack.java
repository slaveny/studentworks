import rzp.exceptions.stack.StackException;

public class Stack implements rzp.exceptions.stack.Stack{
	
	// Размер массива
    protected int capacity;
    // Индекс начала очереди в массиве
    protected int enqueuePointer;
    // Индекс конца очереди в массиве
    protected int dequeuePointer;
    // Сам массив
    protected int[] data;
	/**
	 * Инициализирует стек
	 * @param maxSize максимальное количество элементов в стеке
	 * @throws StackException при повторной инициализации (и не выполняет её)
	 */
	public void init(int maxSize) throws StackException{
		if(data==null) {
		data = new int[maxSize];capacity=maxSize;}
		else {throw new StackException("Стек уже инициализирован!");}
	}
	
	/**
	 * @return пуст ли стек
	 */
	public boolean isEmpty(){
		int size = (enqueuePointer - dequeuePointer) % (capacity + 1);
	    if (size == 0) 
	    return true;
	    else return false;
	}
	
	/**
	 * @return заполнен ли стек
	 */
	public boolean isFull(){
		int size = (enqueuePointer - dequeuePointer) % (capacity + 1);
		if(size==0)size=-1;
        return size==capacity;
	}
	
	/**
	 * @return размер стека
	 */
	public int size() {
		int size = (enqueuePointer - dequeuePointer) % (capacity + 1);
        if (size < 0) {
            size += capacity;
        }
        return size;
	}
	
	/**
	 * @param item элемент
	 * @return содержится ли элемент в стеке
	 */
	public boolean contains(int item) {
		for(int i=enqueuePointer-1;i>=dequeuePointer;i--)if(data[i]==item)return true;
		return false;
	}
	
	/**
	 * Возвращает элемент с вершины стека
	 * @return элемент с вершины стека
	 * @throws StackException если стек пуст
	 */
	public int peek() throws StackException{
		if(isEmpty()) 
		{throw new StackException("Стэк пуст");}
		else {
			int a=data[enqueuePointer-1];
			return a;
		}
	}
	
	/**
	 * Удаляет элемент с вершины стека и возвращает его
	 * @return элемент с вершины стека
	 * @throws StackException если стек пуст
	 */
	public int pop() throws StackException{
		if(isEmpty()) 
		{throw new StackException("Стэк пуст");}
		else {
			int a=data[enqueuePointer-1];
			enqueuePointer = (enqueuePointer - 1) % (capacity + 1);
			return a;
		}
	}
	
	/**
	 * Добавляет элемент в вершину стека
	 * @param item элемент
	 * @throws StackException если стек уже переполнен
	 */
	public void push(int item) throws StackException{
		if(isFull()) 
		{throw new StackException("Стэк полон!");}
		else {
			data[enqueuePointer] = item;
	        enqueuePointer = (enqueuePointer + 1) % (capacity + 1);
		}
	}
}
