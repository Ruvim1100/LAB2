package com.company;

public class Main {

    public static void main(String[] args) {
        Report report = new realReport("Разработчики");
        System.out.println("   ==================");

        report.send();
        System.out.println("   ==================");

        System.out.println("\n Создание объекта ProxyReport:");
        report = new ProxyReport("Разработчики");
        System.out.println("   ==================");

        report.send();

    }
}
