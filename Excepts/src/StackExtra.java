import rzp.exceptions.stack.StackException;

public class StackExtra extends Stack implements rzp.exceptions.stack.StackExtra{
	/**
	 * ��������� ��� ��������� �������� � ������� ����� �� �������
	 * @param items ��������
	 * @throws StackException ���� ��������� ������, ��� ���������� ����� � �����
	 *                         (�������� ��� ���� �� ��������� � ����!)
	 * @throws IllegalStateException ���� ���� ��� �� ��� ��������������� {@link Stack#init(int)}
	 *                          (�������� ��� ���� �� ��������� � ����!)
	 */
	public void push(int... items) throws StackException, IllegalStateException {
		if(super.capacity==0)throw new IllegalStateException("���� �� ���������������!");
		if(super.size()+items.length>super.capacity) {throw new StackException("������������ �����!");}
		else {
			for(int i=0;i<items.length;i++) {
				super.push(items[i]);
			}
		}
	}

	
}
