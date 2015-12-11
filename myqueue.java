public class myqueue {

    // implement the stack using an array
	int myarray[] = new int[100];
	// declare additional variables here

	int front = 0 ;
	int rear = -1  ;

	public void enqueue(int element) {
		if(rear-front<100){
	rear=rear+1;

	myarray[rear] = element ;
}	else
		return;
		// ..... fill the stub function ......
	}

	public int dequeue() {
	if (front <=rear)

	return myarray[front++] ;
	else 
	System.out.println("queueisempty");
	return 0;
		// ..... fill the stub function ......
	
	}

	public boolean isEmpty() {

	if (front > rear )
	return true ;
	else 
		return false ;

		// ..... fill the stub function ......
	}
}
