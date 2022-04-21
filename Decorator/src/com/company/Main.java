package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(" \nРабота без декоратора:");
        PrinterInterface printer = new Printer("This is Decorator pattern");
        printer.print();

        System.out.println(" \n\nРабота с одним декоратором:");
        printer = new ColorTextDecorator(new Printer("This is Decorator pattern"));
        printer.print();

        System.out.println(" \n\nРабота со всеми декораторами:");
        printer = new QuotesDecorator(new ColorBackgroundDecorator(new ColorTextDecorator(new Printer("This is Decorator pattern"))));
        printer.print();


    }
}
