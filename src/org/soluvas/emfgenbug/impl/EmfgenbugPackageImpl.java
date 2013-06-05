/**
 */
package org.soluvas.emfgenbug.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.soluvas.emfgenbug.Bumbu;
import org.soluvas.emfgenbug.EmfgenbugFactory;
import org.soluvas.emfgenbug.EmfgenbugPackage;
import org.soluvas.emfgenbug.Karedok;
import org.soluvas.emfgenbug.Lotek;
import org.soluvas.emfgenbug.NasiPadang;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfgenbugPackageImpl extends EPackageImpl implements EmfgenbugPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nasiPadangEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lotekEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass karedokEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bumbuEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.soluvas.emfgenbug.EmfgenbugPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmfgenbugPackageImpl() {
		super(eNS_URI, EmfgenbugFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EmfgenbugPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmfgenbugPackage init() {
		if (isInited) return (EmfgenbugPackage)EPackage.Registry.INSTANCE.getEPackage(EmfgenbugPackage.eNS_URI);

		// Obtain or create and register package
		EmfgenbugPackageImpl theEmfgenbugPackage = (EmfgenbugPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmfgenbugPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmfgenbugPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEmfgenbugPackage.createPackageContents();

		// Initialize created meta-data
		theEmfgenbugPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmfgenbugPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmfgenbugPackage.eNS_URI, theEmfgenbugPackage);
		return theEmfgenbugPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNasiPadang() {
		return nasiPadangEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLotek() {
		return lotekEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKaredok() {
		return karedokEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBumbu() {
		return bumbuEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfgenbugFactory getEmfgenbugFactory() {
		return (EmfgenbugFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		nasiPadangEClass = createEClass(NASI_PADANG);

		lotekEClass = createEClass(LOTEK);

		karedokEClass = createEClass(KAREDOK);

		// Create enums
		bumbuEEnum = createEEnum(BUMBU);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(nasiPadangEClass, NasiPadang.class, "NasiPadang", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lotekEClass, Lotek.class, "Lotek", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(karedokEClass, Karedok.class, "Karedok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(bumbuEEnum, Bumbu.class, "Bumbu");
		addEEnumLiteral(bumbuEEnum, Bumbu.SAMBAL);
		addEEnumLiteral(bumbuEEnum, Bumbu.PERKEDEL);

		// Create resource
		createResource(eNS_URI);
	}

} //EmfgenbugPackageImpl
