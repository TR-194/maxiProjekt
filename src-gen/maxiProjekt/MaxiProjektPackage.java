/**
 */
package maxiProjekt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see maxiProjekt.MaxiProjektFactory
 * @model kind="package"
 * @generated
 */
public interface MaxiProjektPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "maxiProjekt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/maxiProjekt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "maxiProjekt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaxiProjektPackage eINSTANCE = maxiProjekt.impl.MaxiProjektPackageImpl.init();

	/**
	 * The meta object id for the '{@link maxiProjekt.impl.KinosaalImpl <em>Kinosaal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maxiProjekt.impl.KinosaalImpl
	 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getKinosaal()
	 * @generated
	 */
	int KINOSAAL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINOSAAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Freigegeben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINOSAAL__FREIGEGEBEN = 1;

	/**
	 * The feature id for the '<em><b>Sitzreihe</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINOSAAL__SITZREIHE = 2;

	/**
	 * The number of structural features of the '<em>Kinosaal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINOSAAL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Freigeben</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINOSAAL___FREIGEBEN = 0;

	/**
	 * The number of operations of the '<em>Kinosaal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINOSAAL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link maxiProjekt.impl.SitzreiheImpl <em>Sitzreihe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maxiProjekt.impl.SitzreiheImpl
	 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getSitzreihe()
	 * @generated
	 */
	int SITZREIHE = 1;

	/**
	 * The feature id for the '<em><b>Reihen Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITZREIHE__REIHEN_NR = 0;

	/**
	 * The feature id for the '<em><b>Kategorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITZREIHE__KATEGORIE = 1;

	/**
	 * The feature id for the '<em><b>Sitzplatz</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITZREIHE__SITZPLATZ = 2;

	/**
	 * The number of structural features of the '<em>Sitzreihe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITZREIHE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sitzreihe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITZREIHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maxiProjekt.impl.SitzplatzImpl <em>Sitzplatz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maxiProjekt.impl.SitzplatzImpl
	 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getSitzplatz()
	 * @generated
	 */
	int SITZPLATZ = 2;

	/**
	 * The feature id for the '<em><b>Platz Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITZPLATZ__PLATZ_NR = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITZPLATZ__STATUS = 1;

	/**
	 * The number of structural features of the '<em>Sitzplatz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITZPLATZ_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Ist Frei</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITZPLATZ___IST_FREI = 0;

	/**
	 * The number of operations of the '<em>Sitzplatz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITZPLATZ_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link maxiProjekt.impl.ReservierungImpl <em>Reservierung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maxiProjekt.impl.ReservierungImpl
	 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getReservierung()
	 * @generated
	 */
	int RESERVIERUNG = 3;

	/**
	 * The feature id for the '<em><b>Ablauf Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVIERUNG__ABLAUF_DATUM = 0;

	/**
	 * The feature id for the '<em><b>Umwandeln</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVIERUNG__UMWANDELN = 1;

	/**
	 * The feature id for the '<em><b>Sitzplatz</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVIERUNG__SITZPLATZ = 2;

	/**
	 * The number of structural features of the '<em>Reservierung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVIERUNG_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Stornieren</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVIERUNG___STORNIEREN = 0;

	/**
	 * The operation id for the '<em>In Buchung Umwandeln</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVIERUNG___IN_BUCHUNG_UMWANDELN = 1;

	/**
	 * The operation id for the '<em>Ist Gültig</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVIERUNG___IST_GÜLTIG = 2;

	/**
	 * The number of operations of the '<em>Reservierung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVIERUNG_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link maxiProjekt.impl.BuchungImpl <em>Buchung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maxiProjekt.impl.BuchungImpl
	 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getBuchung()
	 * @generated
	 */
	int BUCHUNG = 4;

	/**
	 * The feature id for the '<em><b>Sitzplatz</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCHUNG__SITZPLATZ = 0;

	/**
	 * The number of structural features of the '<em>Buchung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCHUNG_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Bezahlen</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCHUNG___BEZAHLEN = 0;

	/**
	 * The number of operations of the '<em>Buchung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCHUNG_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link maxiProjekt.impl.AufführungImpl <em>Aufführung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maxiProjekt.impl.AufführungImpl
	 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getAufführung()
	 * @generated
	 */
	int AUFFÜHRUNG = 5;

	/**
	 * The feature id for the '<em><b>Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFFÜHRUNG__DATUM = 0;

	/**
	 * The feature id for the '<em><b>Uhrzeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFFÜHRUNG__UHRZEIT = 1;

	/**
	 * The feature id for the '<em><b>Kinosaal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFFÜHRUNG__KINOSAAL = 2;

	/**
	 * The feature id for the '<em><b>Preismodell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFFÜHRUNG__PREISMODELL = 3;

	/**
	 * The feature id for the '<em><b>Statistik</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFFÜHRUNG__STATISTIK = 4;

	/**
	 * The feature id for the '<em><b>Film</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFFÜHRUNG__FILM = 5;

	/**
	 * The number of structural features of the '<em>Aufführung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFFÜHRUNG_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Ist Verfügbar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFFÜHRUNG___IST_VERFÜGBAR = 0;

	/**
	 * The number of operations of the '<em>Aufführung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFFÜHRUNG_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link maxiProjekt.impl.StatistikImpl <em>Statistik</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maxiProjekt.impl.StatistikImpl
	 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getStatistik()
	 * @generated
	 */
	int STATISTIK = 6;

	/**
	 * The feature id for the '<em><b>Einnahmen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIK__EINNAHMEN = 0;

	/**
	 * The number of structural features of the '<em>Statistik</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIK_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Berechne Einnahmen Pro Aufführung</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIK___BERECHNE_EINNAHMEN_PRO_AUFFÜHRUNG__AUFFÜHRUNG = 0;

	/**
	 * The operation id for the '<em>Berechne Einnahmen Pro Film</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIK___BERECHNE_EINNAHMEN_PRO_FILM__FILM = 1;

	/**
	 * The number of operations of the '<em>Statistik</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIK_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link maxiProjekt.impl.FilmImpl <em>Film</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maxiProjekt.impl.FilmImpl
	 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getFilm()
	 * @generated
	 */
	int FILM = 7;

	/**
	 * The feature id for the '<em><b>Titel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__TITEL = 0;

	/**
	 * The feature id for the '<em><b>Altersbeschränkung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__ALTERSBESCHRÄNKUNG = 1;

	/**
	 * The feature id for the '<em><b>Dauer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__DAUER = 2;

	/**
	 * The feature id for the '<em><b>Statistik</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__STATISTIK = 3;

	/**
	 * The feature id for the '<em><b>Aufführung</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__AUFFÜHRUNG = 4;

	/**
	 * The number of structural features of the '<em>Film</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Film</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maxiProjekt.impl.PreismodellImpl <em>Preismodell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maxiProjekt.impl.PreismodellImpl
	 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getPreismodell()
	 * @generated
	 */
	int PREISMODELL = 8;

	/**
	 * The feature id for the '<em><b>Parkett Preis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREISMODELL__PARKETT_PREIS = 0;

	/**
	 * The feature id for the '<em><b>Loge Preis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREISMODELL__LOGE_PREIS = 1;

	/**
	 * The feature id for the '<em><b>Loge Mit Service Preis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREISMODELL__LOGE_MIT_SERVICE_PREIS = 2;

	/**
	 * The number of structural features of the '<em>Preismodell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREISMODELL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Preismodell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREISMODELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maxiProjekt.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maxiProjekt.impl.AdminImpl
	 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 9;

	/**
	 * The feature id for the '<em><b>Verwaltet Film</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__VERWALTET_FILM = 0;

	/**
	 * The feature id for the '<em><b>Verwaltet Kinosaal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__VERWALTET_KINOSAAL = 1;

	/**
	 * The feature id for the '<em><b>Verwaltet Aufführung</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__VERWALTET_AUFFÜHRUNG = 2;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Bearbeite Film</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___BEARBEITE_FILM = 0;

	/**
	 * The operation id for the '<em>Lösche Film</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___LÖSCHE_FILM = 1;

	/**
	 * The operation id for the '<em>Bearbeite Aufführung</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___BEARBEITE_AUFFÜHRUNG = 2;

	/**
	 * The operation id for the '<em>Lösche Aufführung</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___LÖSCHE_AUFFÜHRUNG = 3;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link maxiProjekt.Kategorie <em>Kategorie</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maxiProjekt.Kategorie
	 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getKategorie()
	 * @generated
	 */
	int KATEGORIE = 10;

	/**
	 * The meta object id for the '{@link maxiProjekt.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maxiProjekt.Status
	 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 11;

	/**
	 * Returns the meta object for class '{@link maxiProjekt.Kinosaal <em>Kinosaal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kinosaal</em>'.
	 * @see maxiProjekt.Kinosaal
	 * @generated
	 */
	EClass getKinosaal();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Kinosaal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maxiProjekt.Kinosaal#getName()
	 * @see #getKinosaal()
	 * @generated
	 */
	EAttribute getKinosaal_Name();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Kinosaal#isFreigegeben <em>Freigegeben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freigegeben</em>'.
	 * @see maxiProjekt.Kinosaal#isFreigegeben()
	 * @see #getKinosaal()
	 * @generated
	 */
	EAttribute getKinosaal_Freigegeben();

	/**
	 * Returns the meta object for the reference list '{@link maxiProjekt.Kinosaal#getSitzreihe <em>Sitzreihe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sitzreihe</em>'.
	 * @see maxiProjekt.Kinosaal#getSitzreihe()
	 * @see #getKinosaal()
	 * @generated
	 */
	EReference getKinosaal_Sitzreihe();

	/**
	 * Returns the meta object for the '{@link maxiProjekt.Kinosaal#freigeben() <em>Freigeben</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Freigeben</em>' operation.
	 * @see maxiProjekt.Kinosaal#freigeben()
	 * @generated
	 */
	EOperation getKinosaal__Freigeben();

	/**
	 * Returns the meta object for class '{@link maxiProjekt.Sitzreihe <em>Sitzreihe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sitzreihe</em>'.
	 * @see maxiProjekt.Sitzreihe
	 * @generated
	 */
	EClass getSitzreihe();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Sitzreihe#getReihenNr <em>Reihen Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reihen Nr</em>'.
	 * @see maxiProjekt.Sitzreihe#getReihenNr()
	 * @see #getSitzreihe()
	 * @generated
	 */
	EAttribute getSitzreihe_ReihenNr();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Sitzreihe#getKategorie <em>Kategorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kategorie</em>'.
	 * @see maxiProjekt.Sitzreihe#getKategorie()
	 * @see #getSitzreihe()
	 * @generated
	 */
	EAttribute getSitzreihe_Kategorie();

	/**
	 * Returns the meta object for the reference list '{@link maxiProjekt.Sitzreihe#getSitzplatz <em>Sitzplatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sitzplatz</em>'.
	 * @see maxiProjekt.Sitzreihe#getSitzplatz()
	 * @see #getSitzreihe()
	 * @generated
	 */
	EReference getSitzreihe_Sitzplatz();

	/**
	 * Returns the meta object for class '{@link maxiProjekt.Sitzplatz <em>Sitzplatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sitzplatz</em>'.
	 * @see maxiProjekt.Sitzplatz
	 * @generated
	 */
	EClass getSitzplatz();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Sitzplatz#getPlatzNr <em>Platz Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platz Nr</em>'.
	 * @see maxiProjekt.Sitzplatz#getPlatzNr()
	 * @see #getSitzplatz()
	 * @generated
	 */
	EAttribute getSitzplatz_PlatzNr();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Sitzplatz#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see maxiProjekt.Sitzplatz#getStatus()
	 * @see #getSitzplatz()
	 * @generated
	 */
	EAttribute getSitzplatz_Status();

	/**
	 * Returns the meta object for the '{@link maxiProjekt.Sitzplatz#istFrei() <em>Ist Frei</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ist Frei</em>' operation.
	 * @see maxiProjekt.Sitzplatz#istFrei()
	 * @generated
	 */
	EOperation getSitzplatz__IstFrei();

	/**
	 * Returns the meta object for class '{@link maxiProjekt.Reservierung <em>Reservierung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservierung</em>'.
	 * @see maxiProjekt.Reservierung
	 * @generated
	 */
	EClass getReservierung();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Reservierung#getAblaufDatum <em>Ablauf Datum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ablauf Datum</em>'.
	 * @see maxiProjekt.Reservierung#getAblaufDatum()
	 * @see #getReservierung()
	 * @generated
	 */
	EAttribute getReservierung_AblaufDatum();

	/**
	 * Returns the meta object for the reference '{@link maxiProjekt.Reservierung#getUmwandeln <em>Umwandeln</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Umwandeln</em>'.
	 * @see maxiProjekt.Reservierung#getUmwandeln()
	 * @see #getReservierung()
	 * @generated
	 */
	EReference getReservierung_Umwandeln();

	/**
	 * Returns the meta object for the reference list '{@link maxiProjekt.Reservierung#getSitzplatz <em>Sitzplatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sitzplatz</em>'.
	 * @see maxiProjekt.Reservierung#getSitzplatz()
	 * @see #getReservierung()
	 * @generated
	 */
	EReference getReservierung_Sitzplatz();

	/**
	 * Returns the meta object for the '{@link maxiProjekt.Reservierung#stornieren() <em>Stornieren</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stornieren</em>' operation.
	 * @see maxiProjekt.Reservierung#stornieren()
	 * @generated
	 */
	EOperation getReservierung__Stornieren();

	/**
	 * Returns the meta object for the '{@link maxiProjekt.Reservierung#inBuchungUmwandeln() <em>In Buchung Umwandeln</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>In Buchung Umwandeln</em>' operation.
	 * @see maxiProjekt.Reservierung#inBuchungUmwandeln()
	 * @generated
	 */
	EOperation getReservierung__InBuchungUmwandeln();

	/**
	 * Returns the meta object for the '{@link maxiProjekt.Reservierung#istGültig() <em>Ist Gültig</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ist Gültig</em>' operation.
	 * @see maxiProjekt.Reservierung#istGültig()
	 * @generated
	 */
	EOperation getReservierung__IstGültig();

	/**
	 * Returns the meta object for class '{@link maxiProjekt.Buchung <em>Buchung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buchung</em>'.
	 * @see maxiProjekt.Buchung
	 * @generated
	 */
	EClass getBuchung();

	/**
	 * Returns the meta object for the reference list '{@link maxiProjekt.Buchung#getSitzplatz <em>Sitzplatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sitzplatz</em>'.
	 * @see maxiProjekt.Buchung#getSitzplatz()
	 * @see #getBuchung()
	 * @generated
	 */
	EReference getBuchung_Sitzplatz();

	/**
	 * Returns the meta object for the '{@link maxiProjekt.Buchung#bezahlen() <em>Bezahlen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bezahlen</em>' operation.
	 * @see maxiProjekt.Buchung#bezahlen()
	 * @generated
	 */
	EOperation getBuchung__Bezahlen();

	/**
	 * Returns the meta object for class '{@link maxiProjekt.Aufführung <em>Aufführung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aufführung</em>'.
	 * @see maxiProjekt.Aufführung
	 * @generated
	 */
	EClass getAufführung();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Aufführung#getDatum <em>Datum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datum</em>'.
	 * @see maxiProjekt.Aufführung#getDatum()
	 * @see #getAufführung()
	 * @generated
	 */
	EAttribute getAufführung_Datum();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Aufführung#getUhrzeit <em>Uhrzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uhrzeit</em>'.
	 * @see maxiProjekt.Aufführung#getUhrzeit()
	 * @see #getAufführung()
	 * @generated
	 */
	EAttribute getAufführung_Uhrzeit();

	/**
	 * Returns the meta object for the reference '{@link maxiProjekt.Aufführung#getKinosaal <em>Kinosaal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kinosaal</em>'.
	 * @see maxiProjekt.Aufführung#getKinosaal()
	 * @see #getAufführung()
	 * @generated
	 */
	EReference getAufführung_Kinosaal();

	/**
	 * Returns the meta object for the reference '{@link maxiProjekt.Aufführung#getPreismodell <em>Preismodell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Preismodell</em>'.
	 * @see maxiProjekt.Aufführung#getPreismodell()
	 * @see #getAufführung()
	 * @generated
	 */
	EReference getAufführung_Preismodell();

	/**
	 * Returns the meta object for the reference '{@link maxiProjekt.Aufführung#getStatistik <em>Statistik</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statistik</em>'.
	 * @see maxiProjekt.Aufführung#getStatistik()
	 * @see #getAufführung()
	 * @generated
	 */
	EReference getAufführung_Statistik();

	/**
	 * Returns the meta object for the reference '{@link maxiProjekt.Aufführung#getFilm <em>Film</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Film</em>'.
	 * @see maxiProjekt.Aufführung#getFilm()
	 * @see #getAufführung()
	 * @generated
	 */
	EReference getAufführung_Film();

	/**
	 * Returns the meta object for the '{@link maxiProjekt.Aufführung#istVerfügbar() <em>Ist Verfügbar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ist Verfügbar</em>' operation.
	 * @see maxiProjekt.Aufführung#istVerfügbar()
	 * @generated
	 */
	EOperation getAufführung__IstVerfügbar();

	/**
	 * Returns the meta object for class '{@link maxiProjekt.Statistik <em>Statistik</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistik</em>'.
	 * @see maxiProjekt.Statistik
	 * @generated
	 */
	EClass getStatistik();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Statistik#getEinnahmen <em>Einnahmen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einnahmen</em>'.
	 * @see maxiProjekt.Statistik#getEinnahmen()
	 * @see #getStatistik()
	 * @generated
	 */
	EAttribute getStatistik_Einnahmen();

	/**
	 * Returns the meta object for the '{@link maxiProjekt.Statistik#berechneEinnahmenProAufführung(maxiProjekt.Aufführung) <em>Berechne Einnahmen Pro Aufführung</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Berechne Einnahmen Pro Aufführung</em>' operation.
	 * @see maxiProjekt.Statistik#berechneEinnahmenProAufführung(maxiProjekt.Aufführung)
	 * @generated
	 */
	EOperation getStatistik__BerechneEinnahmenProAufführung__Aufführung();

	/**
	 * Returns the meta object for the '{@link maxiProjekt.Statistik#berechneEinnahmenProFilm(maxiProjekt.Film) <em>Berechne Einnahmen Pro Film</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Berechne Einnahmen Pro Film</em>' operation.
	 * @see maxiProjekt.Statistik#berechneEinnahmenProFilm(maxiProjekt.Film)
	 * @generated
	 */
	EOperation getStatistik__BerechneEinnahmenProFilm__Film();

	/**
	 * Returns the meta object for class '{@link maxiProjekt.Film <em>Film</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Film</em>'.
	 * @see maxiProjekt.Film
	 * @generated
	 */
	EClass getFilm();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Film#getTitel <em>Titel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titel</em>'.
	 * @see maxiProjekt.Film#getTitel()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Titel();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Film#getAltersbeschränkung <em>Altersbeschränkung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altersbeschränkung</em>'.
	 * @see maxiProjekt.Film#getAltersbeschränkung()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Altersbeschränkung();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Film#getDauer <em>Dauer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dauer</em>'.
	 * @see maxiProjekt.Film#getDauer()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Dauer();

	/**
	 * Returns the meta object for the reference '{@link maxiProjekt.Film#getStatistik <em>Statistik</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statistik</em>'.
	 * @see maxiProjekt.Film#getStatistik()
	 * @see #getFilm()
	 * @generated
	 */
	EReference getFilm_Statistik();

	/**
	 * Returns the meta object for the reference list '{@link maxiProjekt.Film#getAufführung <em>Aufführung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aufführung</em>'.
	 * @see maxiProjekt.Film#getAufführung()
	 * @see #getFilm()
	 * @generated
	 */
	EReference getFilm_Aufführung();

	/**
	 * Returns the meta object for class '{@link maxiProjekt.Preismodell <em>Preismodell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preismodell</em>'.
	 * @see maxiProjekt.Preismodell
	 * @generated
	 */
	EClass getPreismodell();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Preismodell#getParkettPreis <em>Parkett Preis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parkett Preis</em>'.
	 * @see maxiProjekt.Preismodell#getParkettPreis()
	 * @see #getPreismodell()
	 * @generated
	 */
	EAttribute getPreismodell_ParkettPreis();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Preismodell#getLogePreis <em>Loge Preis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loge Preis</em>'.
	 * @see maxiProjekt.Preismodell#getLogePreis()
	 * @see #getPreismodell()
	 * @generated
	 */
	EAttribute getPreismodell_LogePreis();

	/**
	 * Returns the meta object for the attribute '{@link maxiProjekt.Preismodell#getLogeMitServicePreis <em>Loge Mit Service Preis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loge Mit Service Preis</em>'.
	 * @see maxiProjekt.Preismodell#getLogeMitServicePreis()
	 * @see #getPreismodell()
	 * @generated
	 */
	EAttribute getPreismodell_LogeMitServicePreis();

	/**
	 * Returns the meta object for class '{@link maxiProjekt.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see maxiProjekt.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the reference list '{@link maxiProjekt.Admin#getVerwaltetFilm <em>Verwaltet Film</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verwaltet Film</em>'.
	 * @see maxiProjekt.Admin#getVerwaltetFilm()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_VerwaltetFilm();

	/**
	 * Returns the meta object for the reference list '{@link maxiProjekt.Admin#getVerwaltetKinosaal <em>Verwaltet Kinosaal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verwaltet Kinosaal</em>'.
	 * @see maxiProjekt.Admin#getVerwaltetKinosaal()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_VerwaltetKinosaal();

	/**
	 * Returns the meta object for the reference list '{@link maxiProjekt.Admin#getVerwaltetAufführung <em>Verwaltet Aufführung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verwaltet Aufführung</em>'.
	 * @see maxiProjekt.Admin#getVerwaltetAufführung()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_VerwaltetAufführung();

	/**
	 * Returns the meta object for the '{@link maxiProjekt.Admin#bearbeiteFilm() <em>Bearbeite Film</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bearbeite Film</em>' operation.
	 * @see maxiProjekt.Admin#bearbeiteFilm()
	 * @generated
	 */
	EOperation getAdmin__BearbeiteFilm();

	/**
	 * Returns the meta object for the '{@link maxiProjekt.Admin#löscheFilm() <em>Lösche Film</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lösche Film</em>' operation.
	 * @see maxiProjekt.Admin#löscheFilm()
	 * @generated
	 */
	EOperation getAdmin__LöscheFilm();

	/**
	 * Returns the meta object for the '{@link maxiProjekt.Admin#bearbeiteAufführung() <em>Bearbeite Aufführung</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bearbeite Aufführung</em>' operation.
	 * @see maxiProjekt.Admin#bearbeiteAufführung()
	 * @generated
	 */
	EOperation getAdmin__BearbeiteAufführung();

	/**
	 * Returns the meta object for the '{@link maxiProjekt.Admin#löscheAufführung() <em>Lösche Aufführung</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lösche Aufführung</em>' operation.
	 * @see maxiProjekt.Admin#löscheAufführung()
	 * @generated
	 */
	EOperation getAdmin__LöscheAufführung();

	/**
	 * Returns the meta object for enum '{@link maxiProjekt.Kategorie <em>Kategorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kategorie</em>'.
	 * @see maxiProjekt.Kategorie
	 * @generated
	 */
	EEnum getKategorie();

	/**
	 * Returns the meta object for enum '{@link maxiProjekt.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see maxiProjekt.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MaxiProjektFactory getMaxiProjektFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link maxiProjekt.impl.KinosaalImpl <em>Kinosaal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maxiProjekt.impl.KinosaalImpl
		 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getKinosaal()
		 * @generated
		 */
		EClass KINOSAAL = eINSTANCE.getKinosaal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KINOSAAL__NAME = eINSTANCE.getKinosaal_Name();

		/**
		 * The meta object literal for the '<em><b>Freigegeben</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KINOSAAL__FREIGEGEBEN = eINSTANCE.getKinosaal_Freigegeben();

		/**
		 * The meta object literal for the '<em><b>Sitzreihe</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINOSAAL__SITZREIHE = eINSTANCE.getKinosaal_Sitzreihe();

		/**
		 * The meta object literal for the '<em><b>Freigeben</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KINOSAAL___FREIGEBEN = eINSTANCE.getKinosaal__Freigeben();

		/**
		 * The meta object literal for the '{@link maxiProjekt.impl.SitzreiheImpl <em>Sitzreihe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maxiProjekt.impl.SitzreiheImpl
		 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getSitzreihe()
		 * @generated
		 */
		EClass SITZREIHE = eINSTANCE.getSitzreihe();

		/**
		 * The meta object literal for the '<em><b>Reihen Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITZREIHE__REIHEN_NR = eINSTANCE.getSitzreihe_ReihenNr();

		/**
		 * The meta object literal for the '<em><b>Kategorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITZREIHE__KATEGORIE = eINSTANCE.getSitzreihe_Kategorie();

		/**
		 * The meta object literal for the '<em><b>Sitzplatz</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITZREIHE__SITZPLATZ = eINSTANCE.getSitzreihe_Sitzplatz();

		/**
		 * The meta object literal for the '{@link maxiProjekt.impl.SitzplatzImpl <em>Sitzplatz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maxiProjekt.impl.SitzplatzImpl
		 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getSitzplatz()
		 * @generated
		 */
		EClass SITZPLATZ = eINSTANCE.getSitzplatz();

		/**
		 * The meta object literal for the '<em><b>Platz Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITZPLATZ__PLATZ_NR = eINSTANCE.getSitzplatz_PlatzNr();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITZPLATZ__STATUS = eINSTANCE.getSitzplatz_Status();

		/**
		 * The meta object literal for the '<em><b>Ist Frei</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SITZPLATZ___IST_FREI = eINSTANCE.getSitzplatz__IstFrei();

		/**
		 * The meta object literal for the '{@link maxiProjekt.impl.ReservierungImpl <em>Reservierung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maxiProjekt.impl.ReservierungImpl
		 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getReservierung()
		 * @generated
		 */
		EClass RESERVIERUNG = eINSTANCE.getReservierung();

		/**
		 * The meta object literal for the '<em><b>Ablauf Datum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVIERUNG__ABLAUF_DATUM = eINSTANCE.getReservierung_AblaufDatum();

		/**
		 * The meta object literal for the '<em><b>Umwandeln</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVIERUNG__UMWANDELN = eINSTANCE.getReservierung_Umwandeln();

		/**
		 * The meta object literal for the '<em><b>Sitzplatz</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVIERUNG__SITZPLATZ = eINSTANCE.getReservierung_Sitzplatz();

		/**
		 * The meta object literal for the '<em><b>Stornieren</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVIERUNG___STORNIEREN = eINSTANCE.getReservierung__Stornieren();

		/**
		 * The meta object literal for the '<em><b>In Buchung Umwandeln</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVIERUNG___IN_BUCHUNG_UMWANDELN = eINSTANCE.getReservierung__InBuchungUmwandeln();

		/**
		 * The meta object literal for the '<em><b>Ist Gültig</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVIERUNG___IST_GÜLTIG = eINSTANCE.getReservierung__IstGültig();

		/**
		 * The meta object literal for the '{@link maxiProjekt.impl.BuchungImpl <em>Buchung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maxiProjekt.impl.BuchungImpl
		 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getBuchung()
		 * @generated
		 */
		EClass BUCHUNG = eINSTANCE.getBuchung();

		/**
		 * The meta object literal for the '<em><b>Sitzplatz</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUCHUNG__SITZPLATZ = eINSTANCE.getBuchung_Sitzplatz();

		/**
		 * The meta object literal for the '<em><b>Bezahlen</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUCHUNG___BEZAHLEN = eINSTANCE.getBuchung__Bezahlen();

		/**
		 * The meta object literal for the '{@link maxiProjekt.impl.AufführungImpl <em>Aufführung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maxiProjekt.impl.AufführungImpl
		 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getAufführung()
		 * @generated
		 */
		EClass AUFFÜHRUNG = eINSTANCE.getAufführung();

		/**
		 * The meta object literal for the '<em><b>Datum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUFFÜHRUNG__DATUM = eINSTANCE.getAufführung_Datum();

		/**
		 * The meta object literal for the '<em><b>Uhrzeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUFFÜHRUNG__UHRZEIT = eINSTANCE.getAufführung_Uhrzeit();

		/**
		 * The meta object literal for the '<em><b>Kinosaal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUFFÜHRUNG__KINOSAAL = eINSTANCE.getAufführung_Kinosaal();

		/**
		 * The meta object literal for the '<em><b>Preismodell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUFFÜHRUNG__PREISMODELL = eINSTANCE.getAufführung_Preismodell();

		/**
		 * The meta object literal for the '<em><b>Statistik</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUFFÜHRUNG__STATISTIK = eINSTANCE.getAufführung_Statistik();

		/**
		 * The meta object literal for the '<em><b>Film</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUFFÜHRUNG__FILM = eINSTANCE.getAufführung_Film();

		/**
		 * The meta object literal for the '<em><b>Ist Verfügbar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUFFÜHRUNG___IST_VERFÜGBAR = eINSTANCE.getAufführung__IstVerfügbar();

		/**
		 * The meta object literal for the '{@link maxiProjekt.impl.StatistikImpl <em>Statistik</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maxiProjekt.impl.StatistikImpl
		 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getStatistik()
		 * @generated
		 */
		EClass STATISTIK = eINSTANCE.getStatistik();

		/**
		 * The meta object literal for the '<em><b>Einnahmen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIK__EINNAHMEN = eINSTANCE.getStatistik_Einnahmen();

		/**
		 * The meta object literal for the '<em><b>Berechne Einnahmen Pro Aufführung</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATISTIK___BERECHNE_EINNAHMEN_PRO_AUFFÜHRUNG__AUFFÜHRUNG = eINSTANCE
				.getStatistik__BerechneEinnahmenProAufführung__Aufführung();

		/**
		 * The meta object literal for the '<em><b>Berechne Einnahmen Pro Film</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATISTIK___BERECHNE_EINNAHMEN_PRO_FILM__FILM = eINSTANCE
				.getStatistik__BerechneEinnahmenProFilm__Film();

		/**
		 * The meta object literal for the '{@link maxiProjekt.impl.FilmImpl <em>Film</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maxiProjekt.impl.FilmImpl
		 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getFilm()
		 * @generated
		 */
		EClass FILM = eINSTANCE.getFilm();

		/**
		 * The meta object literal for the '<em><b>Titel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILM__TITEL = eINSTANCE.getFilm_Titel();

		/**
		 * The meta object literal for the '<em><b>Altersbeschränkung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILM__ALTERSBESCHRÄNKUNG = eINSTANCE.getFilm_Altersbeschränkung();

		/**
		 * The meta object literal for the '<em><b>Dauer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILM__DAUER = eINSTANCE.getFilm_Dauer();

		/**
		 * The meta object literal for the '<em><b>Statistik</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILM__STATISTIK = eINSTANCE.getFilm_Statistik();

		/**
		 * The meta object literal for the '<em><b>Aufführung</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILM__AUFFÜHRUNG = eINSTANCE.getFilm_Aufführung();

		/**
		 * The meta object literal for the '{@link maxiProjekt.impl.PreismodellImpl <em>Preismodell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maxiProjekt.impl.PreismodellImpl
		 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getPreismodell()
		 * @generated
		 */
		EClass PREISMODELL = eINSTANCE.getPreismodell();

		/**
		 * The meta object literal for the '<em><b>Parkett Preis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREISMODELL__PARKETT_PREIS = eINSTANCE.getPreismodell_ParkettPreis();

		/**
		 * The meta object literal for the '<em><b>Loge Preis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREISMODELL__LOGE_PREIS = eINSTANCE.getPreismodell_LogePreis();

		/**
		 * The meta object literal for the '<em><b>Loge Mit Service Preis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREISMODELL__LOGE_MIT_SERVICE_PREIS = eINSTANCE.getPreismodell_LogeMitServicePreis();

		/**
		 * The meta object literal for the '{@link maxiProjekt.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maxiProjekt.impl.AdminImpl
		 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Verwaltet Film</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__VERWALTET_FILM = eINSTANCE.getAdmin_VerwaltetFilm();

		/**
		 * The meta object literal for the '<em><b>Verwaltet Kinosaal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__VERWALTET_KINOSAAL = eINSTANCE.getAdmin_VerwaltetKinosaal();

		/**
		 * The meta object literal for the '<em><b>Verwaltet Aufführung</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__VERWALTET_AUFFÜHRUNG = eINSTANCE.getAdmin_VerwaltetAufführung();

		/**
		 * The meta object literal for the '<em><b>Bearbeite Film</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___BEARBEITE_FILM = eINSTANCE.getAdmin__BearbeiteFilm();

		/**
		 * The meta object literal for the '<em><b>Lösche Film</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___LÖSCHE_FILM = eINSTANCE.getAdmin__LöscheFilm();

		/**
		 * The meta object literal for the '<em><b>Bearbeite Aufführung</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___BEARBEITE_AUFFÜHRUNG = eINSTANCE.getAdmin__BearbeiteAufführung();

		/**
		 * The meta object literal for the '<em><b>Lösche Aufführung</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___LÖSCHE_AUFFÜHRUNG = eINSTANCE.getAdmin__LöscheAufführung();

		/**
		 * The meta object literal for the '{@link maxiProjekt.Kategorie <em>Kategorie</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maxiProjekt.Kategorie
		 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getKategorie()
		 * @generated
		 */
		EEnum KATEGORIE = eINSTANCE.getKategorie();

		/**
		 * The meta object literal for the '{@link maxiProjekt.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maxiProjekt.Status
		 * @see maxiProjekt.impl.MaxiProjektPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

	}

} //MaxiProjektPackage
