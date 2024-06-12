//throw--> to declare that exception may generate..to generate the exception
//throws--> to declare the possibility of exception
//checked exceptions are the exceptions which can be predicted by compiler in advance eg..FileNotFound
//unchecked exception are not predicted by compiler in advance eg:ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException




class Display{
    void show()throws ArithmeticException{ //throws blindly assumes that exception maybe created
        
    }
}

public class throwThrows {
    public static void main(String[] args) throws Exception {
        Display obj=new Display();
        // try
        // {
            obj.show();
        // }
        // catch(Exception e){

        // }
        
    }
}
