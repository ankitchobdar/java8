package com.example;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {
    public static void main (String args[]) {
//        FileFilter filter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".java");
//            }
//        };

        FileFilter fileFilterLambda = (File pathname) -> pathname.getName().endsWith(".java");

        File dir = new File("G:\\Projects\\Java Projects\\atm-system-2\\src\\main\\java\\com\\project\\atm\\system");
        File[] files = dir.listFiles(fileFilterLambda);

        for(File f: files) {
            System.out.println(f);
        }
    }
}
