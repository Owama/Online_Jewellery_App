package Testsuites;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Tests.AssertArrayJUnitTest;
import Tests.AssertEqualsTest;
import Tests.AssertExceptionTest;
import Tests.AssertFalseTest;
import Tests.AssertFloatingPointTest;
import Tests.AssertNullTest;
import Tests.AssertObjectIdentifyTest;
import Tests.AssertTimeOutTest;
import Tests.AssertTruthTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author BONGANI
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(value={AssertArrayJUnitTest.class,AssertEqualsTest.class,AssertFalseTest.class,AssertFloatingPointTest.class,AssertNullTest.class,AssertTimeOutTest.class,AssertTruthTest.class,AssertObjectIdentifyTest.class})
public class AssertMethodsTestSuite {
    
}
