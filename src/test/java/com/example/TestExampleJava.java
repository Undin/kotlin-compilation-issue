package com.example;

import com.intellij.testFramework.InspectionTestUtil;
import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import com.jetbrains.clones.DuplicateInspection;
import com.jetbrains.clones.configuration.DuplicateInspectionState;

public class TestExampleJava extends BasePlatformTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        DuplicateInspection inspection = InspectionTestUtil.instantiateTool(DuplicateInspection.class);
        myFixture.enableInspections(inspection);

        DuplicateInspectionState state = inspection.getState();
    }
}
