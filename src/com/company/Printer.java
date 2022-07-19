package com.company;

public class Printer {
    
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,boolean duplex) {
        if (tonerLevel >- 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int tonerFillUp(int fillUp){
       if (fillUp > 0 && fillUp <= 100) {
           if (this.tonerLevel + fillUp > 100) {
               return -1;
           }
           this.tonerLevel += fillUp;
           return this.tonerLevel;
       }else {
           return -1;
       }
    }
    public int pagesPrinting(int pages){
        int pagesToPrint = pages;
        if (this.duplex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
