/**
 */
package org.soluvas.emfgenbug;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.soluvas.emfgenbug.EmfgenbugFactory
 * @model kind="package"
 * @generated
 */
public interface EmfgenbugPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emfgenbug";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://emfgenbug/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emfgenbug";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmfgenbugPackage eINSTANCE = org.soluvas.emfgenbug.impl.EmfgenbugPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.soluvas.emfgenbug.impl.NasiPadangImpl <em>Nasi Padang</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.emfgenbug.impl.NasiPadangImpl
	 * @see org.soluvas.emfgenbug.impl.EmfgenbugPackageImpl#getNasiPadang()
	 * @generated
	 */
	int NASI_PADANG = 0;

	/**
	 * The number of structural features of the '<em>Nasi Padang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NASI_PADANG_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.soluvas.emfgenbug.impl.LotekImpl <em>Lotek</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.emfgenbug.impl.LotekImpl
	 * @see org.soluvas.emfgenbug.impl.EmfgenbugPackageImpl#getLotek()
	 * @generated
	 */
	int LOTEK = 1;

	/**
	 * The number of structural features of the '<em>Lotek</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTEK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.soluvas.emfgenbug.impl.KaredokImpl <em>Karedok</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.emfgenbug.impl.KaredokImpl
	 * @see org.soluvas.emfgenbug.impl.EmfgenbugPackageImpl#getKaredok()
	 * @generated
	 */
	int KAREDOK = 2;

	/**
	 * The number of structural features of the '<em>Karedok</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAREDOK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.soluvas.emfgenbug.Bumbu <em>Bumbu</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.emfgenbug.Bumbu
	 * @see org.soluvas.emfgenbug.impl.EmfgenbugPackageImpl#getBumbu()
	 * @generated
	 */
	int BUMBU = 3;


	/**
	 * Returns the meta object for class '{@link org.soluvas.emfgenbug.NasiPadang <em>Nasi Padang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nasi Padang</em>'.
	 * @see org.soluvas.emfgenbug.NasiPadang
	 * @generated
	 */
	EClass getNasiPadang();

	/**
	 * Returns the meta object for class '{@link org.soluvas.emfgenbug.Lotek <em>Lotek</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lotek</em>'.
	 * @see org.soluvas.emfgenbug.Lotek
	 * @generated
	 */
	EClass getLotek();

	/**
	 * Returns the meta object for class '{@link org.soluvas.emfgenbug.Karedok <em>Karedok</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Karedok</em>'.
	 * @see org.soluvas.emfgenbug.Karedok
	 * @generated
	 */
	EClass getKaredok();

	/**
	 * Returns the meta object for enum '{@link org.soluvas.emfgenbug.Bumbu <em>Bumbu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bumbu</em>'.
	 * @see org.soluvas.emfgenbug.Bumbu
	 * @generated
	 */
	EEnum getBumbu();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmfgenbugFactory getEmfgenbugFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.soluvas.emfgenbug.impl.NasiPadangImpl <em>Nasi Padang</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.emfgenbug.impl.NasiPadangImpl
		 * @see org.soluvas.emfgenbug.impl.EmfgenbugPackageImpl#getNasiPadang()
		 * @generated
		 */
		EClass NASI_PADANG = eINSTANCE.getNasiPadang();

		/**
		 * The meta object literal for the '{@link org.soluvas.emfgenbug.impl.LotekImpl <em>Lotek</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.emfgenbug.impl.LotekImpl
		 * @see org.soluvas.emfgenbug.impl.EmfgenbugPackageImpl#getLotek()
		 * @generated
		 */
		EClass LOTEK = eINSTANCE.getLotek();

		/**
		 * The meta object literal for the '{@link org.soluvas.emfgenbug.impl.KaredokImpl <em>Karedok</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.emfgenbug.impl.KaredokImpl
		 * @see org.soluvas.emfgenbug.impl.EmfgenbugPackageImpl#getKaredok()
		 * @generated
		 */
		EClass KAREDOK = eINSTANCE.getKaredok();

		/**
		 * The meta object literal for the '{@link org.soluvas.emfgenbug.Bumbu <em>Bumbu</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.emfgenbug.Bumbu
		 * @see org.soluvas.emfgenbug.impl.EmfgenbugPackageImpl#getBumbu()
		 * @generated
		 */
		EEnum BUMBU = eINSTANCE.getBumbu();

	}

} //EmfgenbugPackage
