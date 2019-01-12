package com.TimBuchalka;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(50, true);
	System.out.print("Initial Page Count " + printer.getPagesPrinted());
	int pagesPrinted = printer.printPages(4);
	System.out.println("Pages Printed was" + pagesPrinted + " New total page count " + printer.getPagesPrinted());
    }
}
