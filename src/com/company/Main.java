package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50,true);
        System.out.println(printer.getPagesPrinted());
        int pagesPrinted = printer.pagesPrinting(4);
        printer.tonerFillUp(23);
    }
}
