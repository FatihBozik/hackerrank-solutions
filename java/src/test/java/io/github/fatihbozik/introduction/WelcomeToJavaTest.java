package io.github.fatihbozik.introduction;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 * @author Fatih Bozik
 */
public class WelcomeToJavaTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void shouldPrintHelloWorld() {
        WelcomeToJava.main(new String[0]);
        Assert.assertEquals("Hello, World.\nHello, Java.\n", systemOutRule.getLog());
    }
}
