package com.albert.app;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

class FileOptionalTest {

    @Test
    void should_read_content_of_file_when_given_file_path() {
        String content = new FileOptional().readAllContentByFileStream(
                this.getClass().getResourceAsStream("/test_whether_can_read_the_content_in_file.md"));
        assertNotNull(content);
        assertEquals("hello word", content);
    }
}