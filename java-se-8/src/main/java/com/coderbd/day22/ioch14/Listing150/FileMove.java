package com.coderbd.day22.ioch14.Listing150;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileMove {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("usage: FileMove <source-path> <destination-path>");
            System.exit(-1);
        }
        Path pathSource = Paths.get(args[0]);
        Path pathDestination = Paths.get(args[1]);
        try {
            Files.move(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Source file moved successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
