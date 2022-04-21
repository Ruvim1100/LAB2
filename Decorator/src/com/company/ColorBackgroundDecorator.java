package com.company;

public class ColorBackgroundDecorator extends Decorator{
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";// YELLOW
    public static final String RESET = "\033[0m";

    public ColorBackgroundDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print(WHITE_BACKGROUND_BRIGHT);
        super.print();
        System.out.print(RESET);
    }

}
