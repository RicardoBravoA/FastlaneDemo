package com.rba.fastlanedemo;

import org.junit.Assert;
import org.junit.Test;

public class UtilUnitTest {

    @Test
    public void getTextTest() {
        Assert.assertNotNull(Util.getText());
    }

}
