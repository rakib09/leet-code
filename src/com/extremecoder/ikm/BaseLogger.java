package com.extremecoder.ikm;

public class BaseLogger {
    private static BaseLogger log = new BaseLogger();
    private BaseLogger() {

    }
    public synchronized static BaseLogger getInstance() {
        return log;
    }
    private StringBuilder sb = new StringBuilder();
    public void addLog(String logMessage) {
        this.sb.append(logMessage + " | ");
    }

    public void printLog() {
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            BaseLogger bs = BaseLogger.getInstance();
            bs.addLog("Thread 1");
            bs.printLog();
        });
        Thread t2 = new Thread(() -> {
            BaseLogger bs = BaseLogger.getInstance();
            bs.addLog("Thread 2");
            bs.printLog();
        });
        t1.start();
        t2.start();
    }
}
