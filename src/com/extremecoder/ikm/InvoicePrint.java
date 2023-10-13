package com.extremecoder.ikm;

public class InvoicePrint {
    static class Invoice {
        public static String formatId(String oldId) {
            return oldId + "_Invoice";
        }
    }

    static class SalesInvoice extends Invoice {
        public static String formatId(String oldId) {
            return oldId + "_SalesInvoice";
        }
    }
    // there are no polymorphism
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        System.out.println(invoice.formatId("1234"));
    }

}
