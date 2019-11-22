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
public class IfElseTest {
    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void shouldPrintWeirdIfTheIntegerIsOdd() {
        systemInMock.provideLines("7");
        IfElse.main(new String[0]);
        Assert.assertEquals("Weird\n", systemOutRule.getLog());
    }

    @Test
    public void shouldPrintNotWeirdIfIntegerIsEvenAndInTheRangeOf2to5() {
        systemInMock.provideLines("4");
        IfElse.main(new String[0]);
        Assert.assertEquals("Not Weird\n", systemOutRule.getLog());
    }

    @Test
    public void shouldPrintWeirdIfTheIntegerIsEvenAndInTheRangeOf6to20() {
        systemInMock.provideLines("18");
        IfElse.main(new String[0]);
        Assert.assertEquals("Weird\n", systemOutRule.getLog());
    }

    @Test
    public void shouldPrintNotWeirdIfTheIntegerIsEvenAndGreaterThan20() {
        systemInMock.provideLines("22");
        IfElse.main(new String[0]);
        Assert.assertEquals("Not Weird\n", systemOutRule.getLog());
    }
}
