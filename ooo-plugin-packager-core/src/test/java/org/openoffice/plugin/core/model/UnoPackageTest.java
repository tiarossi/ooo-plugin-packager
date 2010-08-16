/*************************************************************************
 * UnoPackageTest.java
 *
 * The Contents of this file are made available subject to the terms of
 * either of the GNU Lesser General Public License Version 2.1
 * 
 * GNU Lesser General Public License Version 2.1
 * =============================================
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 * MA 02111-1307 USA
 *
 * Contributor(s): oliver.boehm@agentes.de
 ************************************************************************/

package org.openoffice.plugin.core.model;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.junit.Test;

/**
 * This is the first JUnit test class for the ooo-plugin-package-core project.
 * 
 * @author oliver (oliver.boehm@agentes.de)
 * @since 0.0.1 (16.08.2010)
 */
public class UnoPackageTest {
	
	private static final Logger log = Logger.getLogger(UnoPackage.class.getName());

	/**
	 * Test method for {@link UnoPackage#UnoPackage(java.io.File)}.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Test
	public void testUnoPackage() throws IOException {
		File tmpFile = File.createTempFile("test", ".oxt");
		log.info("using " + tmpFile + " to create package...");
		UnoPackage pkg = new UnoPackage(tmpFile);
		pkg.close();
		assertTrue(tmpFile.isFile());
		tmpFile.delete();
	}

}
