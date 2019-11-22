package io.github.fatihbozik.introduction;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

/**
 * @author Fatih Bozik
 */
public class StdinAndStdoutTest {
    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void shouldPrintTextsFromStdIn() {
        systemInMock.provideLines("42", "177", "56");
        StdinAndStdout.main(new String[0]);
        Assert.assertEquals("\nOutput:\n42\n177\n56\n", systemOutRule.getLog());
    }
}
