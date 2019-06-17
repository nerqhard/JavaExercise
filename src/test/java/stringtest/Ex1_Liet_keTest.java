package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex1_Liet_ke;

public class Ex1_Liet_keTest {

    @Test
    public void liet_ke_str() {
        Assert.assertArrayEquals(new Ex1_Liet_ke().liet_ke_str("Feeling my way through the darkness.Guided by a beating heart?I can't tell where the journey will end\nBut I know where to start!They tell me I'm too young to understand"),
                new String[]{
                        "Feeling my way through the darkness",
                        "Guided by a beating heart",
                        "I can't tell where the journey will end",
                        "But I know where to start",
                        "They tell me I'm too young to understand"
                });
    }
}