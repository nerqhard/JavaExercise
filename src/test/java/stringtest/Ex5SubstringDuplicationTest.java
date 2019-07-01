package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex5SubstringDuplication;

public class Ex5SubstringDuplicationTest {

    @Test
    public void test_findDuplicated() {

        Ex5SubstringDuplication obj = new Ex5SubstringDuplication();

        Assert.assertArrayEquals(
                obj.findDuplicated("haha hihi hihi hoho haha hehe haha hihi kaka"),
                new String[]{"haha", "hihi"});

        Assert.assertArrayEquals(
                obj.findDuplicated("a a a a b b c b"),
                new String[] {"a", "b"});

        Assert.assertArrayEquals(
                obj.findDuplicated("a a a a"),
                new String[] {"a"});

        Assert.assertArrayEquals(
                obj.findDuplicated("a"),
                new String[0]);
    }
}
