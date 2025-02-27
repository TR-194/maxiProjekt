/**
 */
package maxiProjekt.impl;

import maxiProjekt.Admin;
import maxiProjekt.Aufführung;
import maxiProjekt.Buchung;
import maxiProjekt.Film;
import maxiProjekt.Kategorie;
import maxiProjekt.Kinosaal;
import maxiProjekt.MaxiProjektFactory;
import maxiProjekt.MaxiProjektPackage;
import maxiProjekt.Preismodell;
import maxiProjekt.Reservierung;
import maxiProjekt.Sitzplatz;
import maxiProjekt.Sitzreihe;
import maxiProjekt.Statistik;
import maxiProjekt.Status;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaxiProjektPackageImpl extends EPackageImpl implements MaxiProjektPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kinosaalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sitzreiheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sitzplatzEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservierungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buchungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aufführungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statistikEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preismodellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kategorieEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

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
	 * @see maxiProjekt.MaxiProjektPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MaxiProjektPackageImpl() {
		super(eNS_URI, MaxiProjektFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MaxiProjektPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MaxiProjektPackage init() {
		if (isInited)
			return (MaxiProjektPackage) EPackage.Registry.INSTANCE.getEPackage(MaxiProjektPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMaxiProjektPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MaxiProjektPackageImpl theMaxiProjektPackage = registeredMaxiProjektPackage instanceof MaxiProjektPackageImpl
				? (MaxiProjektPackageImpl) registeredMaxiProjektPackage
				: new MaxiProjektPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMaxiProjektPackage.createPackageContents();

		// Initialize created meta-data
		theMaxiProjektPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMaxiProjektPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MaxiProjektPackage.eNS_URI, theMaxiProjektPackage);
		return theMaxiProjektPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKinosaal() {
		return kinosaalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinosaal_Name() {
		return (EAttribute) kinosaalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKinosaal_Freigegeben() {
		return (EAttribute) kinosaalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKinosaal_Sitzreihe() {
		return (EReference) kinosaalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getKinosaal__Freigeben() {
		return kinosaalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSitzreihe() {
		return sitzreiheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSitzreihe_ReihenNr() {
		return (EAttribute) sitzreiheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSitzreihe_Kategorie() {
		return (EAttribute) sitzreiheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSitzreihe_Sitzplatz() {
		return (EReference) sitzreiheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSitzplatz() {
		return sitzplatzEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSitzplatz_PlatzNr() {
		return (EAttribute) sitzplatzEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSitzplatz_Status() {
		return (EAttribute) sitzplatzEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSitzplatz__IstFrei() {
		return sitzplatzEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReservierung() {
		return reservierungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReservierung_AblaufDatum() {
		return (EAttribute) reservierungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReservierung_Umwandeln() {
		return (EReference) reservierungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReservierung_Sitzplatz() {
		return (EReference) reservierungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReservierung__Stornieren() {
		return reservierungEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReservierung__InBuchungUmwandeln() {
		return reservierungEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReservierung__IstGültig() {
		return reservierungEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuchung() {
		return buchungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBuchung_Sitzplatz() {
		return (EReference) buchungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBuchung__Bezahlen() {
		return buchungEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAufführung() {
		return aufführungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAufführung_Datum() {
		return (EAttribute) aufführungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAufführung_Uhrzeit() {
		return (EAttribute) aufführungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAufführung_Kinosaal() {
		return (EReference) aufführungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAufführung_Preismodell() {
		return (EReference) aufführungEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAufführung_Statistik() {
		return (EReference) aufführungEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAufführung_Film() {
		return (EReference) aufführungEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAufführung__IstVerfügbar() {
		return aufführungEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatistik() {
		return statistikEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatistik_Einnahmen() {
		return (EAttribute) statistikEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatistik__BerechneEinnahmenProAufführung__Aufführung() {
		return statistikEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatistik__BerechneEinnahmenProFilm__Film() {
		return statistikEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilm() {
		return filmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilm_Titel() {
		return (EAttribute) filmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilm_Altersbeschränkung() {
		return (EAttribute) filmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilm_Dauer() {
		return (EAttribute) filmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilm_Statistik() {
		return (EReference) filmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilm_Aufführung() {
		return (EReference) filmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreismodell() {
		return preismodellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreismodell_ParkettPreis() {
		return (EAttribute) preismodellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreismodell_LogePreis() {
		return (EAttribute) preismodellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreismodell_LogeMitServicePreis() {
		return (EAttribute) preismodellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmin() {
		return adminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmin_VerwaltetFilm() {
		return (EReference) adminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmin_VerwaltetKinosaal() {
		return (EReference) adminEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmin_VerwaltetAufführung() {
		return (EReference) adminEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdmin__BearbeiteFilm() {
		return adminEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdmin__LöscheFilm() {
		return adminEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdmin__BearbeiteAufführung() {
		return adminEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdmin__LöscheAufführung() {
		return adminEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getKategorie() {
		return kategorieEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaxiProjektFactory getMaxiProjektFactory() {
		return (MaxiProjektFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		kinosaalEClass = createEClass(KINOSAAL);
		createEAttribute(kinosaalEClass, KINOSAAL__NAME);
		createEAttribute(kinosaalEClass, KINOSAAL__FREIGEGEBEN);
		createEReference(kinosaalEClass, KINOSAAL__SITZREIHE);
		createEOperation(kinosaalEClass, KINOSAAL___FREIGEBEN);

		sitzreiheEClass = createEClass(SITZREIHE);
		createEAttribute(sitzreiheEClass, SITZREIHE__REIHEN_NR);
		createEAttribute(sitzreiheEClass, SITZREIHE__KATEGORIE);
		createEReference(sitzreiheEClass, SITZREIHE__SITZPLATZ);

		sitzplatzEClass = createEClass(SITZPLATZ);
		createEAttribute(sitzplatzEClass, SITZPLATZ__PLATZ_NR);
		createEAttribute(sitzplatzEClass, SITZPLATZ__STATUS);
		createEOperation(sitzplatzEClass, SITZPLATZ___IST_FREI);

		reservierungEClass = createEClass(RESERVIERUNG);
		createEAttribute(reservierungEClass, RESERVIERUNG__ABLAUF_DATUM);
		createEReference(reservierungEClass, RESERVIERUNG__UMWANDELN);
		createEReference(reservierungEClass, RESERVIERUNG__SITZPLATZ);
		createEOperation(reservierungEClass, RESERVIERUNG___STORNIEREN);
		createEOperation(reservierungEClass, RESERVIERUNG___IN_BUCHUNG_UMWANDELN);
		createEOperation(reservierungEClass, RESERVIERUNG___IST_GÜLTIG);

		buchungEClass = createEClass(BUCHUNG);
		createEReference(buchungEClass, BUCHUNG__SITZPLATZ);
		createEOperation(buchungEClass, BUCHUNG___BEZAHLEN);

		aufführungEClass = createEClass(AUFFÜHRUNG);
		createEAttribute(aufführungEClass, AUFFÜHRUNG__DATUM);
		createEAttribute(aufführungEClass, AUFFÜHRUNG__UHRZEIT);
		createEReference(aufführungEClass, AUFFÜHRUNG__KINOSAAL);
		createEReference(aufführungEClass, AUFFÜHRUNG__PREISMODELL);
		createEReference(aufführungEClass, AUFFÜHRUNG__STATISTIK);
		createEReference(aufführungEClass, AUFFÜHRUNG__FILM);
		createEOperation(aufführungEClass, AUFFÜHRUNG___IST_VERFÜGBAR);

		statistikEClass = createEClass(STATISTIK);
		createEAttribute(statistikEClass, STATISTIK__EINNAHMEN);
		createEOperation(statistikEClass, STATISTIK___BERECHNE_EINNAHMEN_PRO_AUFFÜHRUNG__AUFFÜHRUNG);
		createEOperation(statistikEClass, STATISTIK___BERECHNE_EINNAHMEN_PRO_FILM__FILM);

		filmEClass = createEClass(FILM);
		createEAttribute(filmEClass, FILM__TITEL);
		createEAttribute(filmEClass, FILM__ALTERSBESCHRÄNKUNG);
		createEAttribute(filmEClass, FILM__DAUER);
		createEReference(filmEClass, FILM__STATISTIK);
		createEReference(filmEClass, FILM__AUFFÜHRUNG);

		preismodellEClass = createEClass(PREISMODELL);
		createEAttribute(preismodellEClass, PREISMODELL__PARKETT_PREIS);
		createEAttribute(preismodellEClass, PREISMODELL__LOGE_PREIS);
		createEAttribute(preismodellEClass, PREISMODELL__LOGE_MIT_SERVICE_PREIS);

		adminEClass = createEClass(ADMIN);
		createEReference(adminEClass, ADMIN__VERWALTET_FILM);
		createEReference(adminEClass, ADMIN__VERWALTET_KINOSAAL);
		createEReference(adminEClass, ADMIN__VERWALTET_AUFFÜHRUNG);
		createEOperation(adminEClass, ADMIN___BEARBEITE_FILM);
		createEOperation(adminEClass, ADMIN___LÖSCHE_FILM);
		createEOperation(adminEClass, ADMIN___BEARBEITE_AUFFÜHRUNG);
		createEOperation(adminEClass, ADMIN___LÖSCHE_AUFFÜHRUNG);

		// Create enums
		kategorieEEnum = createEEnum(KATEGORIE);
		statusEEnum = createEEnum(STATUS);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(kinosaalEClass, Kinosaal.class, "Kinosaal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKinosaal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Kinosaal.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinosaal_Freigegeben(), ecorePackage.getEBoolean(), "freigegeben", null, 0, 1, Kinosaal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKinosaal_Sitzreihe(), this.getSitzreihe(), null, "sitzreihe", null, 1, -1, Kinosaal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getKinosaal__Freigeben(), null, "freigeben", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sitzreiheEClass, Sitzreihe.class, "Sitzreihe", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSitzreihe_ReihenNr(), ecorePackage.getEInt(), "reihenNr", null, 0, 1, Sitzreihe.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSitzreihe_Kategorie(), this.getKategorie(), "kategorie", null, 0, 1, Sitzreihe.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSitzreihe_Sitzplatz(), this.getSitzplatz(), null, "sitzplatz", null, 1, -1, Sitzreihe.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sitzplatzEClass, Sitzplatz.class, "Sitzplatz", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSitzplatz_PlatzNr(), ecorePackage.getEInt(), "platzNr", null, 0, 1, Sitzplatz.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSitzplatz_Status(), this.getStatus(), "Status", null, 0, 1, Sitzplatz.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSitzplatz__IstFrei(), ecorePackage.getEBoolean(), "istFrei", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reservierungEClass, Reservierung.class, "Reservierung", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservierung_AblaufDatum(), ecorePackage.getEDate(), "ablaufDatum", null, 0, 1,
				Reservierung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getReservierung_Umwandeln(), this.getBuchung(), null, "umwandeln", null, 1, 1,
				Reservierung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservierung_Sitzplatz(), this.getSitzplatz(), null, "sitzplatz", null, 1, -1,
				Reservierung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReservierung__Stornieren(), null, "stornieren", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReservierung__InBuchungUmwandeln(), this.getBuchung(), "inBuchungUmwandeln", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getReservierung__IstGültig(), ecorePackage.getEBoolean(), "istGültig", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(buchungEClass, Buchung.class, "Buchung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuchung_Sitzplatz(), this.getSitzplatz(), null, "sitzplatz", null, 1, -1, Buchung.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBuchung__Bezahlen(), null, "bezahlen", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(aufführungEClass, Aufführung.class, "Aufführung", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAufführung_Datum(), ecorePackage.getEDate(), "datum", null, 0, 1, Aufführung.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAufführung_Uhrzeit(), ecorePackage.getEInt(), "uhrzeit", null, 0, 1, Aufführung.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAufführung_Kinosaal(), this.getKinosaal(), null, "kinosaal", null, 1, 1, Aufführung.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAufführung_Preismodell(), this.getPreismodell(), null, "preismodell", null, 1, 1,
				Aufführung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAufführung_Statistik(), this.getStatistik(), null, "statistik", null, 1, 1, Aufführung.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAufführung_Film(), this.getFilm(), this.getFilm_Aufführung(), "film", null, 1, 1,
				Aufführung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAufführung__IstVerfügbar(), ecorePackage.getEBoolean(), "istVerfügbar", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(statistikEClass, Statistik.class, "Statistik", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatistik_Einnahmen(), ecorePackage.getEDouble(), "einnahmen", null, 0, 1, Statistik.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getStatistik__BerechneEinnahmenProAufführung__Aufführung(), null,
				"berechneEinnahmenProAufführung", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAufführung(), "aufführung", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStatistik__BerechneEinnahmenProFilm__Film(), null, "berechneEinnahmenProFilm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFilm(), "film", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(filmEClass, Film.class, "Film", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilm_Titel(), ecorePackage.getEString(), "titel", null, 0, 1, Film.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilm_Altersbeschränkung(), ecorePackage.getEInt(), "altersbeschränkung", null, 0, 1,
				Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFilm_Dauer(), ecorePackage.getEInt(), "dauer", null, 0, 1, Film.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilm_Statistik(), this.getStatistik(), null, "statistik", null, 1, 1, Film.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilm_Aufführung(), this.getAufführung(), this.getAufführung_Film(), "aufführung", null, 1, -1,
				Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preismodellEClass, Preismodell.class, "Preismodell", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreismodell_ParkettPreis(), ecorePackage.getEDouble(), "parkettPreis", null, 0, 1,
				Preismodell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreismodell_LogePreis(), ecorePackage.getEDouble(), "logePreis", null, 0, 1,
				Preismodell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreismodell_LogeMitServicePreis(), ecorePackage.getEDouble(), "logeMitServicePreis", null, 0,
				1, Preismodell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(adminEClass, Admin.class, "Admin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdmin_VerwaltetFilm(), this.getFilm(), null, "verwaltetFilm", null, 1, -1, Admin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdmin_VerwaltetKinosaal(), this.getKinosaal(), null, "verwaltetKinosaal", null, 1, -1,
				Admin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdmin_VerwaltetAufführung(), this.getAufführung(), null, "verwaltetAufführung", null, 1, -1,
				Admin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAdmin__BearbeiteFilm(), null, "bearbeiteFilm", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAdmin__LöscheFilm(), null, "löscheFilm", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAdmin__BearbeiteAufführung(), null, "bearbeiteAufführung", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAdmin__LöscheAufführung(), null, "löscheAufführung", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(kategorieEEnum, Kategorie.class, "Kategorie");
		addEEnumLiteral(kategorieEEnum, Kategorie.PARKETT);
		addEEnumLiteral(kategorieEEnum, Kategorie.LOGE);
		addEEnumLiteral(kategorieEEnum, Kategorie.LOGE_MIT_SERVICE);

		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.FREI);
		addEEnumLiteral(statusEEnum, Status.RESERVIERT);
		addEEnumLiteral(statusEEnum, Status.GEBUCHT);

		// Create resource
		createResource(eNS_URI);
	}

} //MaxiProjektPackageImpl
