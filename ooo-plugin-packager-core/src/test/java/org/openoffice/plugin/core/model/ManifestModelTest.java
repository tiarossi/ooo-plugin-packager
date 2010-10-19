/*************************************************************************
 * ManifestModelTest.java
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

import java.io.IOException;
import java.io.StringWriter;
import org.junit.Test;

/**
 * JUnit test for ManifestModel.
 * 
 * @author oliver (oliver.boehm@agentes.de)
 * @since 1.1.1 (19.10.2010)
 */
public class ManifestModelTest {
	
	private ManifestModel manifest = new ManifestModel();

	/**
	 * Test method for {@link org.openoffice.plugin.core.model.ManifestModel#addDialogLibrary(java.lang.String)}.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Test
	public void testAddDialogLibrary() throws IOException {
		manifest.addDialogLibrary("Duffy/");
		StringWriter writer = new StringWriter();
		manifest.write(writer);
		writer.close();
		String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
				+ "<manifest:manifest xmlns:manifest=\"http://openoffice.org/2001/manifest\">\n"
				+ "\t<manifest:file-entry manifest:full-path=\"Duffy\" manifest:media-type=\"application/vnd.sun.star.dialog-library\"/>\n"
				+ "</manifest:manifest>\n";
		assertEquals(expected, writer.toString());
	}

}
