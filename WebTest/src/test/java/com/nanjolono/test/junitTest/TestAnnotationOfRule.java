package com.nanjolono.test.junitTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;

public class TestAnnotationOfRule {

    @Rule
    public TemporaryFolder folder= new TemporaryFolder();

    @Test
    public void testUsingTempFolder() throws IOException {

    }

}
