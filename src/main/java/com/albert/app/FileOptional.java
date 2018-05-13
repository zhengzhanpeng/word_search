package com.albert.app;

import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;
import java.util.Scanner;

@Slf4j
public class FileOptional {

    public String readAllContentByFileStream(InputStream inputStream) {
        String content;
        try (Scanner scanner = new Scanner(inputStream)) {
            content = scanner.useDelimiter("\\Z").next();
        }
        return content;
    }
}
