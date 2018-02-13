package com.coderbd.day22.ioch14.Listing148;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

class FileAttributes2 {
    public static void main(String[] args) {
        Path path = Paths.get(args[0]);
        try {
            BasicFileAttributes fileAttributes = 
               Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("File size: " + fileAttributes.size());
            System.out.println("isDirectory: " + fileAttributes.isDirectory());
            System.out.println("isRegularFile: " + fileAttributes.isRegularFile());
            System.out.println("isSymbolicLink: " + fileAttributes.isSymbolicLink());
            System.out.println("File last accessed time: " + fileAttributes.lastAccessTime());
            System.out.println("File last modified time: " +
                fileAttributes.lastModifiedTime());
            System.out.println("File creation time: " + fileAttributes.creationTime());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
