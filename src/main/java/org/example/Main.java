package org.example;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        CrptApi crptApi = new CrptApi(TimeUnit.SECONDS, 2);
        Thread thread1 = new Thread(() -> {
            CrptApi.Document document = new CrptApi.Document();
            document.setDoc_id("1");
            crptApi.createDocument(document, "s");
        });
        Thread thread2 = new Thread(() -> {
            CrptApi.Document document = new CrptApi.Document();
            document.setDoc_id("2");
            crptApi.createDocument(document, "s");
        });
        Thread thread3 = new Thread(() -> {
            CrptApi.Document document = new CrptApi.Document();
            document.setDoc_id("3");
            crptApi.createDocument(document, "s");
        });
        Thread thread4 = new Thread(() -> {
            CrptApi.Document document = new CrptApi.Document();
            document.setDoc_id("4");
            crptApi.createDocument(document, "s");
        });
        Thread thread5 = new Thread(() -> {
            CrptApi.Document document = new CrptApi.Document();
            document.setDoc_id("5");
            crptApi.createDocument(document, "s");
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }



}