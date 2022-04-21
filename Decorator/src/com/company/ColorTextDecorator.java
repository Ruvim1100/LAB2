package com.company;

public class ColorTextDecorator extends Decorator{
    public static final String RED_BOLD = "\033[1;91m";
    public static final String RESET = "\033[0m";

    public ColorTextDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print(RED_BOLD);
        super.print();
        System.out.print(RESET);
    }
}
