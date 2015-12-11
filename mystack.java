public class mystack {

    // implement the stack using an array
	int myarray[] = new int [100];
	// declare additional variables here

	int top = -1 ; 

	public void push(int element) {

	if (top < 99 && top >= -1){
	top = top+ 1 ;
	myarray[top] = element ;  

	}
	return;

		// ..... fill the stub function ......
	}

	public int pop() {
	if (top > -1)
	return myarray[top--];

		 System.out.println("stackisempty");
			return 0;
		// ..... fill the stub function ......
	
	}

	public boolean isEmpty() {

	if(top < 0) 
		return true ;
	else 
		return false ;
		// ..... fill the stub function ......
	}

	public int getElementAtTopOfStack() {

	if (top > -1 )
		return myarray[top];
	else 
		 System.out.println("stackisempty");
		return 0;
		// ..... fill the stub function ......
	}
}
