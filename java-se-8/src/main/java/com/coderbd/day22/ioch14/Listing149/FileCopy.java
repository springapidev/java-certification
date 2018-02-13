package com.coderbd.day22.ioch14.Listing149;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopy {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("usage: FileCopy <source-path> <destination-path>");
            System.exit(1);
        }
        Path pathSource = Paths.get(args[0]);
        Path pathDestination = Paths.get(args[1]);
        try {
            Files.copy(pathSource, pathDestination);
            System.out.println("Source file copied successfully");                
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
