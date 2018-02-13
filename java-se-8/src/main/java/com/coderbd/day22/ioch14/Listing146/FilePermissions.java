package com.coderbd.day22.ioch14.Listing146;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class FilePermissions {
    public static void main(String[] args) {
        Path path = Paths.get(args[0]);
        System.out.printf( "Readable: %b, Writable: %b, Executable: %b ",
            Files.isReadable(path), Files.isWritable(path), Files.isExecutable(path)); 
    }
}
