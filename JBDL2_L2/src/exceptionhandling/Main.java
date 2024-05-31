package exceptionhandling;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            n();
        }
        catch (Exception ex){

        }
    }

    public static void p() throws IOException {
        int a = 10/0;
        throw new IOException();
    }

    public static void m() throws IOException {
       p();
    }
    public static void n() throws IOException {
        m();
    }

}
