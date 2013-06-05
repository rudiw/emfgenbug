/**
 * 
 */
package org.soluvas.emfgenbug;

import static org.junit.Assert.assertNotNull;

import org.eclipse.emf.ecore.EClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * @author rudi
 *
 */
public class EmfGenBugTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void createNasiPadang() {
		NasiPadang obj = (NasiPadang) EmfgenbugFactory.eINSTANCE.create(EmfgenbugPackage.Literals.NASI_PADANG);
		assertNotNull(obj);
	}

	@Test
	public void createLotek() {
		EClass lotekEClass = (EClass) EmfgenbugPackage.eINSTANCE.getEClassifier("Lotek");
		Lotek obj = (Lotek) EmfgenbugFactory.eINSTANCE.create(lotekEClass);
		assertNotNull(obj);
	}

	@Test
	public void createKaredok() {
		Karedok obj = (Karedok) EmfgenbugFactory.eINSTANCE.create(EmfgenbugPackage.Literals.KAREDOK);
		assertNotNull(obj);
	}

}
