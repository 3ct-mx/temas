package com.tresct;

public class App 
{
    public static void main( String[] args )
    {
        MyCollection<String> lista = new MyCollection<>();
        lista.add("Hola");
        lista.add("Crayola");
        //lista.add(35);

        System.out.println( lista );
    }
}
