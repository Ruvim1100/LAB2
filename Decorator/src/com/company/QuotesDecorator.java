package com.company;

public class QuotesDecorator extends Decorator{
    public QuotesDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.println("\"");
    }

}
