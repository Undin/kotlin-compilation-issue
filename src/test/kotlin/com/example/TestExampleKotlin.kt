package com.example

import com.intellij.testFramework.InspectionTestUtil
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import com.jetbrains.clones.DuplicateInspection

class TestExampleKotlin : BasePlatformTestCase() {

    override fun setUp() {
        super.setUp()
        val inspection = InspectionTestUtil.instantiateTool(DuplicateInspection::class.java)
        myFixture.enableInspections(inspection)

        val state = inspection.state
    }
}
