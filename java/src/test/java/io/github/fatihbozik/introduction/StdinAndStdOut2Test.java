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
public class StdinAndStdOut2Test {
    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void shouldPrintStringDoubleAndIntegerValuesReadFromConsole() {
        systemInMock.provideLines("42", "3.1415", "Welcome to HackerRank's Java tutorials!");
        StdinAndStdout2.main(new String[0]);
        Assert.assertEquals(
                "String: Welcome to HackerRank's Java tutorials!\n" +
                        "Double: 3.1415\n" +
                        "Int: 42\n", systemOutRule.getLog());
    }

}
