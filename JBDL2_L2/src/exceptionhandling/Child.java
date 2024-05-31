package exceptionhandling;

import java.io.IOException;

public class Child extends Parent{
    @Override
    public void m1() throws ArithmeticException {

    }

    public static void main(String[] args) throws DataNotFoundException {
        String s = null;
        if (s==null){
            throw new DataNotFoundException("Data Not Found");
        }
    }
}
class DataNotFoundException extends Exception{
    DataNotFoundException(String s){
        super(s);
    }
}
