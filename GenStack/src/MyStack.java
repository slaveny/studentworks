import rzp.generics.stack.StackException;
import rzp.generics.stack.Stack;
import java.util.ArrayList;

public class MyStack<T> implements Stack<T>{
	private int capacity=0;
    // Индекс начала очереди в массиве
    private int enqueuePointer;
    // Индекс конца очереди в массиве
    private int dequeuePointer;
    // Сам массив
    private ArrayList<T> data;

	/**
	 * Инициализирует стек
	 * @param maxSize максимальное количество элементов в стеке
	 * @throws StackException при повторной инициализации (и не выполняет её)
	 */
	public void init(int maxSize) throws StackException{
		if(capacity!=0)throw new StackException("Initialized already!");
		this.capacity = maxSize;
        this.data=new ArrayList<>();
	}
	
	/**
	 * @return пуст ли стек
	 */
	public boolean isEmpty() {
		int size = (enqueuePointer - dequeuePointer) % (capacity + 1);
	    if (size == 0) 
	    return true;
	    else return false;
	}
	
	/**
	 * @return заполнен ли стек
	 */
	public boolean isFull() {
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
	public boolean contains(T item) {
		if(data!=null)
		return this.data.contains(item);
		return false;
	}
	
	/**
	 * Возвращает элемент с вершины стека
	 * @return элемент с вершины стека
	 * @throws StackException если стек пуст
	 */
	public T peek() throws StackException{
		if(enqueuePointer==dequeuePointer) throw new StackException("Stack is Emply!");
		else return this.data.get(dequeuePointer);
	}
	
	/**
	 * Удаляет элемент с вершины стека и возвращает его
	 * @return элемент с вершины стека
	 * @throws StackException если стек пуст
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
	 * Добавляет элемент в вершину стека
	 * @param item элемент
	 * @throws StackException если стек уже переполнен
	 */
	public void push(T item) throws StackException{
		if(isFull()) throw new StackException("Full already!");
		else 
		{
			data.add(dequeuePointer, item);
	        enqueuePointer = (enqueuePointer + 1) % (capacity + 1);}
	}
	
}
