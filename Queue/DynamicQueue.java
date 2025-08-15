public class DynamicQueue {
    public static void main(String[] args) {
        CustomQ q = new CustomQ(5);
        q.add(10);
        q.display();
        q.size();
        q.peek();
        q.add(20);
        q.display();
        q.size();
        q.peek();
        q.add(30);
        q.display();
        q.size();
        q.peek();
        q.remove();
        q.display();
        q.add(30);
        q.display();
        q.add(30);
        q.display();
        q.add(30);
        q.display();
        q.add(30);
        q.display();
    }   

public static class CustomQ{
int [] data;
int front;
int size;

    public CustomQ(int cap){
        data = new int[cap];
        front=0;
        size=0;
    }
    //size
    int size()
    {
        return data.length;
    }
    //display
    void display()
    {
            for(int i = 0 ;i<size;i++)
            {
                int pos = (front+i)%data.length;
                System.out.print(data[pos]+",");
            }
        System.out.println();
    }
    //add
    void add(int x)
    {
        size ++;
        if(size == data.length)
        {
            size--;
            int [] ndata = new int[data.length];
            for(int i = 0; i<size;i++)
            {
                int idx = (front+i)%data.length;
                ndata[i] = data[idx]; 
            }
            data = ndata;
            front=0;
            return;
        }
        int pos = front+size-1;
        if(pos>data.length-1)
        {
            pos=pos%data.length;
        }
        data[pos]=x; 
    }
    //remove
    int remove()
    {
        if(size==0)
        {
            System.out.println("Queue underflow");
        }
        int value = data[front];
        size--;
        front = (front+1)%data.length ;
        return value;
    }
    //peek()
    int peek()
    {
        if(size==0)
        {
            System.out.println("Queue underflow");
            return -1;
        }
        return data[front];
    }

}
}

