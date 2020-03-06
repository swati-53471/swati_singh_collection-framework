package epam.assignment.collections;
import java.util.Arrays;

public class CustomList<E> {

	private int size=0;
	private static final int default_capacity=10;
	private Object elements[];
	
	public CustomList()
	{
		elements=new Object[default_capacity];
	}
	
	public void add(E e)
	{
		if(size==elements.length)
			ensureCapacity();
		elements[size++]=e;
	}
	
	public E fetch(int i)
	{
		if(i>=size||i<0)
			throw new IndexOutOfBoundsException("Index: "+i+" Size "+i);
		return (E) elements[i];
	}
	
	public E remove(int i)
	{
		if(i>=size||i<0)
			throw new IndexOutOfBoundsException("index: "+i+" Size "+i);
		Object item=elements[i];
		int numberOfElements=elements.length-(i+1);
		System.arraycopy(elements, i+1, elements, i, numberOfElements);
		size--;
		return (E) item;
			
	}
	
	public int size()
	{
		return size;
	}
	
	private void ensureCapacity()
	{
		int newSize=elements.length*2;
		elements=Arrays.copyOf(elements, newSize);
		
	}
	@Override
	public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(elements[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
    
}
