public class test {

	public boolean isStackSortablePermutation(myqueue input) {
	mystack S = new mystack();
	myqueue Q = new myqueue();
	int element = 0 ;

	S.push(input.dequeue());
	while (input.isEmpty() == false )
	{
				element = input.dequeue();
		
		while (S.isEmpty() == false && element > S.getElementAtTopOfStack())
		{
			Q.enqueue(S.pop());


		}
		S.push(element);
	}
	while (S.isEmpty() == false )
	{
		element = S.pop();
		Q.enqueue(element);

	}
	int value1 = Q.dequeue();
	int value2 = 0 ;
	
	while(Q.isEmpty() == false)
	{
		value2 = Q.dequeue() ;
		if (value2 > value1)
		value1 = value2 ;
		else
			return false;


	}
return true;





	// ..... fill the stub function ......
	}

}
