package org.sahil.CollectionFramework;

public class QueueUsingArray 
{
	private int queueSize;
	private int[] queueArray;
	private int front, rear;

	public QueueUsingArray(int queueSize){
		this.queueSize = queueSize;
		this.queueArray = new int[queueSize];
		front = 0;
		rear = -1;
	}

	public void push(int newData)
	{
		if(rear < this.queueSize-1)
		{
			this.queueArray[++rear] = newData;
			System.out.println("Pushed "+newData);
		}

		else	
			System.out.println("Queue full");
	}

	public void pop()
	{
		if(rear > -1)
		{
			System.out.println("Popped "+this.queueArray[front]);
			for(int i = 0;i<rear;i++)
			{
				this.queueArray[i] = this.queueArray[i+1];
			}
			rear--;
		}
		else
			System.out.println("Queue Empty");
	}


	public static void main(String[] args) {
	QueueUsingArray q = new QueueUsingArray(5);
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		q.push(50);
		for(int i =0;i<q.queueArray.length;i++)
		System.out.println("Queue Elements are : "+q.queueArray[i]);
		
		q.pop();
		System.out.println("After pop operation");
		for(int i =0;i<q.queueArray.length;i++)
			System.out.println("Queue Elements are : "+q.queueArray[i]);
		
}


}