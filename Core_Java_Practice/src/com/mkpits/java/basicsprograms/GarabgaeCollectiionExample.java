package com.java.awt.mkpits;

public class GarabgaeCollectiionExample
{
    public static void main(String[] args) throws InterruptedException
    {
        GarabgaeCollectiionExample t1 = new GarabgaeCollectiionExample();
        GarabgaeCollectiionExample t2 = new GarabgaeCollectiionExample();
        t1 = null;
        System.gc();
        t2 = null;
        Runtime.getRuntime().gc();

    }

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected : " + this);
    }
}


