/**
 */
package maxiProjekt.impl;

import maxiProjekt.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaxiProjektFactoryImpl extends EFactoryImpl implements MaxiProjektFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MaxiProjektFactory init() {
		try {
			MaxiProjektFactory theMaxiProjektFactory = (MaxiProjektFactory) EPackage.Registry.INSTANCE
					.getEFactory(MaxiProjektPackage.eNS_URI);
			if (theMaxiProjektFactory != null) {
				return theMaxiProjektFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MaxiProjektFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxiProjektFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MaxiProjektPackage.KINOSAAL:
			return createKinosaal();
		case MaxiProjektPackage.SITZREIHE:
			return createSitzreihe();
		case MaxiProjektPackage.SITZPLATZ:
			return createSitzplatz();
		case MaxiProjektPackage.RESERVIERUNG:
			return createReservierung();
		case MaxiProjektPackage.BUCHUNG:
			return createBuchung();
		case MaxiProjektPackage.AUFFÜHRUNG:
			return createAufführung();
		case MaxiProjektPackage.STATISTIK:
			return createStatistik();
		case MaxiProjektPackage.FILM:
			return createFilm();
		case MaxiProjektPackage.PREISMODELL:
			return createPreismodell();
		case MaxiProjektPackage.ADMIN:
			return createAdmin();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MaxiProjektPackage.KATEGORIE:
			return createKategorieFromString(eDataType, initialValue);
		case MaxiProjektPackage.STATUS:
			return createStatusFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MaxiProjektPackage.KATEGORIE:
			return convertKategorieToString(eDataType, instanceValue);
		case MaxiProjektPackage.STATUS:
			return convertStatusToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kinosaal createKinosaal() {
		KinosaalImpl kinosaal = new KinosaalImpl();
		return kinosaal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sitzreihe createSitzreihe() {
		SitzreiheImpl sitzreihe = new SitzreiheImpl();
		return sitzreihe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sitzplatz createSitzplatz() {
		SitzplatzImpl sitzplatz = new SitzplatzImpl();
		return sitzplatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reservierung createReservierung() {
		ReservierungImpl reservierung = new ReservierungImpl();
		return reservierung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Buchung createBuchung() {
		BuchungImpl buchung = new BuchungImpl();
		return buchung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aufführung createAufführung() {
		AufführungImpl aufführung = new AufführungImpl();
		return aufführung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statistik createStatistik() {
		StatistikImpl statistik = new StatistikImpl();
		return statistik;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Film createFilm() {
		FilmImpl film = new FilmImpl();
		return film;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Preismodell createPreismodell() {
		PreismodellImpl preismodell = new PreismodellImpl();
		return preismodell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Admin createAdmin() {
		AdminImpl admin = new AdminImpl();
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kategorie createKategorieFromString(EDataType eDataType, String initialValue) {
		Kategorie result = Kategorie.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKategorieToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaxiProjektPackage getMaxiProjektPackage() {
		return (MaxiProjektPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MaxiProjektPackage getPackage() {
		return MaxiProjektPackage.eINSTANCE;
	}

} //MaxiProjektFactoryImpl
