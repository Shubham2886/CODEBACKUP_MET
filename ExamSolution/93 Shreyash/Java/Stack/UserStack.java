class UserStack<V> implements StackOperations{
	private int top;
	private V Array[50];

	public UserStack(V[] item){
		int i=0;
		for (i; i<= item.length-1; ++i){
			Array[i]= item[i];
			top= Array[i];
	}

	public void push (V item){
		Array[top+1] = item;
		top = Array.length-1;

	}
	public V pop(){
		int temp = Array[top];
		top = Array.length-2;
		
	}

}
