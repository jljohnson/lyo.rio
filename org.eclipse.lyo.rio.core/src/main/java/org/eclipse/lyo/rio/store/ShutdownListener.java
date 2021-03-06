/*******************************************************************************
 * Copyright (c) 2011 IBM Corporation.
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
 *    Jim Conallen - initial API and implementation
 *******************************************************************************/
package org.eclipse.lyo.rio.store;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class ShutdownListener
 *
 */
public class ShutdownListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent arg0) {
    }

    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("Shutting down RDF Store" );
        try {
			RioStore.shutdown();
		} catch (RioServerException e) {
			e.printStackTrace();
		}
    }
	
}
