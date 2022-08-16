public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full ");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public int pop() throws Exception{
         if(isEmpty()){
              throw new Exception("Can't pop from empty stack !!");
         }
        int removed = data[ptr];
         ptr--;
         return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("empty stack !!");
        }
        return data[ptr];
    }

    public static void main(String[] args)throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(4);
        stack.push(444);
        stack.push(44);
        stack.push(44444);
        stack.push(444444);
        stack.push(444444444);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
