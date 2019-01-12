package com.TimBuchalka;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >-1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        } else {
            //indicates not set correctly
            this.tonerLevel = -1;
        }

        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        //usually set by print, hence left off constructor
        this.pagesPrinted = 0;
    }// end of constructor

    public int addToner(int tonerAmount){
        if(tonerLevel > 0 && tonerAmount <= 100){
            //toner cannot be over 100%
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    } //end of addToner

    public int printPages(int pages){
        //page count allows for duplex
        int pagesToPrint = pages;
        if(this.duplex){
            //allows for odd pages
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }//end of printPages

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
