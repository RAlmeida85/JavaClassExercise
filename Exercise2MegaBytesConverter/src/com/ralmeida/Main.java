package com.ralmeida;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(3000);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        if (kiloBytes < 0 ){
            System.out.println("Invalid Value");
        } else {
            int remainingKiloBytes = (kiloBytes % 1024);
            int megaBytes = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");

        }
    }

}
