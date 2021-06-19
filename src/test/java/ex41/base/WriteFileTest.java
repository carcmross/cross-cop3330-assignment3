package ex41.base;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WriteFileTest {

    @Test
    void createFile_returns_true_after_creating_txt_file_named_exercise41_input_in_resources() {
        WriteFile writer = new WriteFile();
        boolean expected = true;
        boolean actual = writer.createFile();
        assertEquals(expected, actual);
    }

    @Test
    void writeToFile_() {
        WriteFile writer = new WriteFile();
        List<String> output = Arrays.asList("Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina", "Jones, Chris",
                "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong");
        boolean expected = true;
        boolean actual = writer.writeToFile(output);
        assertEquals(expected, actual);
    }
}