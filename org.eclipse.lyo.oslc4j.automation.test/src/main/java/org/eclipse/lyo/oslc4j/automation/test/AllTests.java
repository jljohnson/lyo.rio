/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *  
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Michael Fiedler         - initial API and implementation
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.automation.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests
{
    public static Test suite()
    {
        final TestSuite suite = new TestSuite(AllTests.class.getName());

        suite.addTestSuite(AutomationPlanTest.class);
        suite.addTestSuite(AutomationRequestTest.class);
        suite.addTestSuite(AutomationResultTest.class);
        

        return suite;
    }
}