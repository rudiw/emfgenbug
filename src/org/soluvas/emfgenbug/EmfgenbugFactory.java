/**
 */
package org.soluvas.emfgenbug;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.soluvas.emfgenbug.EmfgenbugPackage
 * @generated
 */
public interface EmfgenbugFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmfgenbugFactory eINSTANCE = org.soluvas.emfgenbug.impl.EmfgenbugFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Nasi Padang</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nasi Padang</em>'.
	 * @generated
	 */
	NasiPadang createNasiPadang();

	/**
	 * Returns a new object of class '<em>Lotek</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lotek</em>'.
	 * @generated
	 */
	Lotek createLotek();

	/**
	 * Returns a new object of class '<em>Karedok</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Karedok</em>'.
	 * @generated
	 */
	Karedok createKaredok();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmfgenbugPackage getEmfgenbugPackage();

} //EmfgenbugFactory
