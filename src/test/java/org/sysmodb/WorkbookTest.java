package org.sysmodb;

import java.io.InputStream;
import java.net.URL;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class WorkbookTest {

	@Test
	public void testConstruct() throws Exception {
		URL resourceURL = WorkbookTest.class.getResource("/test-spreadsheet.xls");
		assertNotNull(resourceURL);
		InputStream stream = resourceURL.openStream();
		new Workbook(stream);		
	}
}
