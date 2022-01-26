import rzp.exceptions.stack.StackException;

public class StackExtra extends Stack implements rzp.exceptions.stack.StackExtra{
	/**
	 * Добавляет все указанные элементы в вершину стека по очереди
	 * @param items элементы
	 * @throws StackException если элементов больше, чем свободного места в стеке
	 *                         (элементы при этом не добавлять в стек!)
	 * @throws IllegalStateException если стек ещё не был инициализирован {@link Stack#init(int)}
	 *                          (элементы при этом не добавлять в стек!)
	 */
	public void push(int... items) throws StackException, IllegalStateException {
		if(super.capacity==0)throw new IllegalStateException("Стек не инициализирован!");
		if(super.size()+items.length>super.capacity) {throw new StackException("Переполнение стека!");}
		else {
			for(int i=0;i<items.length;i++) {
				super.push(items[i]);
			}
		}
	}

	
}
