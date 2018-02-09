package com.simplymanas.learning.FileHandling;

import com.simplymanas.learning.FileInformation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAttribute {
    public static void main(String[] args) throws IOException {
        FileInformation fileInformation = new FileInformation();
        java.nio.file.Path path =  fileInformation.GetFilePath();

        BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println(attributes.creationTime());
        System.out.println(attributes.isDirectory());
        System.out.println(attributes.lastAccessTime());
        System.out.println(attributes.size());
        System.out.println(attributes.fileKey());
        System.out.println(attributes.lastModifiedTime());
    }
}
