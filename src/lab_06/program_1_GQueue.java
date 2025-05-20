package lab_06;
import java.util.Arrays;
class GQueue<T> {
    T[] que;
    int size;
    public GQueue(){
        que = (T[]) new Object[2];
        size = 0;
    }

    public void enqueue(T item){
        if(size == que.length){
            que = Arrays.copyOf(que, size * 2);

        }
        que[size] = item;
        size++;
    }

    public T dequeue(){
        if(size==0){
            System.out.println("Queue is empty");
        }
        T del_element = que[size-1];
        System.arraycopy(que,1,que,0,size-1);
        que[size-1] = null;
        size--;
        return del_element;
    }

    public void display(){
        for(T element : que){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        GQueue<Integer> intQue = new GQueue<Integer>();
        intQue.enqueue(1);
        intQue.enqueue(2);
        intQue.enqueue(3);
        intQue.display();
        intQue.dequeue();

        intQue.display();
    }
}
