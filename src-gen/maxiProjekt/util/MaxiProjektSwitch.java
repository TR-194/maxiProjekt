/**
 */
package maxiProjekt.util;

import maxiProjekt.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see maxiProjekt.MaxiProjektPackage
 * @generated
 */
public class MaxiProjektSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MaxiProjektPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxiProjektSwitch() {
		if (modelPackage == null) {
			modelPackage = MaxiProjektPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MaxiProjektPackage.KINOSAAL: {
			Kinosaal kinosaal = (Kinosaal) theEObject;
			T result = caseKinosaal(kinosaal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MaxiProjektPackage.SITZREIHE: {
			Sitzreihe sitzreihe = (Sitzreihe) theEObject;
			T result = caseSitzreihe(sitzreihe);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MaxiProjektPackage.SITZPLATZ: {
			Sitzplatz sitzplatz = (Sitzplatz) theEObject;
			T result = caseSitzplatz(sitzplatz);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MaxiProjektPackage.RESERVIERUNG: {
			Reservierung reservierung = (Reservierung) theEObject;
			T result = caseReservierung(reservierung);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MaxiProjektPackage.BUCHUNG: {
			Buchung buchung = (Buchung) theEObject;
			T result = caseBuchung(buchung);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MaxiProjektPackage.AUFFÜHRUNG: {
			Aufführung aufführung = (Aufführung) theEObject;
			T result = caseAufführung(aufführung);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MaxiProjektPackage.STATISTIK: {
			Statistik statistik = (Statistik) theEObject;
			T result = caseStatistik(statistik);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MaxiProjektPackage.FILM: {
			Film film = (Film) theEObject;
			T result = caseFilm(film);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MaxiProjektPackage.PREISMODELL: {
			Preismodell preismodell = (Preismodell) theEObject;
			T result = casePreismodell(preismodell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MaxiProjektPackage.ADMIN: {
			Admin admin = (Admin) theEObject;
			T result = caseAdmin(admin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kinosaal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kinosaal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKinosaal(Kinosaal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sitzreihe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sitzreihe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSitzreihe(Sitzreihe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sitzplatz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sitzplatz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSitzplatz(Sitzplatz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservierung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservierung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservierung(Reservierung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buchung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buchung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuchung(Buchung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aufführung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aufführung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAufführung(Aufführung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistik</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistik</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatistik(Statistik object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Film</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Film</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilm(Film object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preismodell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preismodell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreismodell(Preismodell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmin(Admin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MaxiProjektSwitch
