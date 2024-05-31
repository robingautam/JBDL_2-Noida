package singleton;

import java.io.Serializable;

public class singletonExample implements Serializable {

    // 1. constructor private
    // 2. public static method which will return instance

    private singletonExample(){}

    private static singletonExample instance = null;


    public static singletonExample getInstance(){
            if (instance==null){
                instance = new singletonExample();
            }
            return instance;
    }

    public Object readResolve(){
        return instance;
    }

}
