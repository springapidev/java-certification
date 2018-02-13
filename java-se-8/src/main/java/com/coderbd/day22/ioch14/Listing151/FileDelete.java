package com.coderbd.day22.ioch14.Listing151;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDelete {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("usage: FileDelete <source-path>");
            System.exit(1);
        }
        Path pathSource = Paths.get(args[0]);
        try {
            Files.delete(pathSource);
            System.out.println("File deleted successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
