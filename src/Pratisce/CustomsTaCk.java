package Pratisce;

public class CustomsTaCk
{
    private int arr[];
    static final int default_capacity=10;
    int top=-1;
    public CustomsTaCk()
    {
        this(default_capacity);
    }
    public CustomsTaCk(int size) {
        this.arr = new int[size];
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public boolean isFull()
    {
        return top+1==arr.length;
    }
    public void push(int data)
    {
        if (isFull())
        {
            System.out.println("stack is full");
        }
        this.top++;
        arr[top]=data;
    }
    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("stack  is empty");
        }
        int removed = arr[top];
        this.top--;
        return removed ;
    }
    public int  peek()
    {
        if (isEmpty())
            return -1;
        return arr[top];
    }
    public void display()

    {
        for (int i = top; i >= 0; i--) {
            System.out.println(" | "+arr[i]+" |");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CustomsTaCk st=new CustomsTaCk(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
        st.display();
    }
}
