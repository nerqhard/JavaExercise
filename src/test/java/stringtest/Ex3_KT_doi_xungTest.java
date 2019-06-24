package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex3_KT_doi_xung;

import static org.junit.Assert.*;

public class Ex3_KT_doi_xungTest {

    @Test
    public void str_mirror() {
        Assert.assertEquals(new Ex3_KT_doi_xung().str_mirror("manchesteretsehcnam"),true);
        Assert.assertEquals(new Ex3_KT_doi_xung().str_mirror("Manchesteretsehcnam"),false);
        Assert.assertEquals(new Ex3_KT_doi_xung().str_mirror("anchesteretsehcnam"),false);
    }
}