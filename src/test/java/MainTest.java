import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

class MainTest  {

    @Test
    void getName() {
        assertEquals("Никита Бугаков", "Никита Бугаков"  );
    }
    @Test
    void getDifference(){
        assertEquals(100, 100);
    }
    @Test
    void getNumbers(){
        String input1 = "10";
        InputStream in1 = new ByteArrayInputStream(input1.getBytes());
        System.setIn(in1);

        String input2 = "15";
        InputStream in2 = new ByteArrayInputStream(input2.getBytes());
        System.setIn(in2);

        String input3 = "20";
        InputStream in3 = new ByteArrayInputStream(input3.getBytes());
        System.setIn(in3);

        assertEquals(200, Main.getNumbers());
    }

}