/**
 */
package maxiProjekt.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import maxiProjekt.Admin;
import maxiProjekt.Aufführung;
import maxiProjekt.Film;
import maxiProjekt.Kinosaal;
import maxiProjekt.MaxiProjektPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.impl.AdminImpl#getVerwaltetFilm <em>Verwaltet Film</em>}</li>
 *   <li>{@link maxiProjekt.impl.AdminImpl#getVerwaltetKinosaal <em>Verwaltet Kinosaal</em>}</li>
 *   <li>{@link maxiProjekt.impl.AdminImpl#getVerwaltetAufführung <em>Verwaltet Aufführung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdminImpl extends MinimalEObjectImpl.Container implements Admin {
	/**
	 * The cached value of the '{@link #getVerwaltetFilm() <em>Verwaltet Film</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerwaltetFilm()
	 * @generated
	 * @ordered
	 */
	protected EList<Film> verwaltetFilm;

	/**
	 * The cached value of the '{@link #getVerwaltetKinosaal() <em>Verwaltet Kinosaal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerwaltetKinosaal()
	 * @generated
	 * @ordered
	 */
	protected EList<Kinosaal> verwaltetKinosaal;

	/**
	 * The cached value of the '{@link #getVerwaltetAufführung() <em>Verwaltet Aufführung</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerwaltetAufführung()
	 * @generated
	 * @ordered
	 */
	protected EList<Aufführung> verwaltetAufführung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaxiProjektPackage.Literals.ADMIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Film> getVerwaltetFilm() {
		if (verwaltetFilm == null) {
			verwaltetFilm = new EObjectResolvingEList<Film>(Film.class, this, MaxiProjektPackage.ADMIN__VERWALTET_FILM);
		}
		return verwaltetFilm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Kinosaal> getVerwaltetKinosaal() {
		if (verwaltetKinosaal == null) {
			verwaltetKinosaal = new EObjectResolvingEList<Kinosaal>(Kinosaal.class, this,
					MaxiProjektPackage.ADMIN__VERWALTET_KINOSAAL);
		}
		return verwaltetKinosaal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aufführung> getVerwaltetAufführung() {
		if (verwaltetAufführung == null) {
			verwaltetAufführung = new EObjectResolvingEList<Aufführung>(Aufführung.class, this,
					MaxiProjektPackage.ADMIN__VERWALTET_AUFFÜHRUNG);
		}
		return verwaltetAufführung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void bearbeiteFilm() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void löscheFilm() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void bearbeiteAufführung() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void löscheAufführung() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MaxiProjektPackage.ADMIN__VERWALTET_FILM:
			return getVerwaltetFilm();
		case MaxiProjektPackage.ADMIN__VERWALTET_KINOSAAL:
			return getVerwaltetKinosaal();
		case MaxiProjektPackage.ADMIN__VERWALTET_AUFFÜHRUNG:
			return getVerwaltetAufführung();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MaxiProjektPackage.ADMIN__VERWALTET_FILM:
			getVerwaltetFilm().clear();
			getVerwaltetFilm().addAll((Collection<? extends Film>) newValue);
			return;
		case MaxiProjektPackage.ADMIN__VERWALTET_KINOSAAL:
			getVerwaltetKinosaal().clear();
			getVerwaltetKinosaal().addAll((Collection<? extends Kinosaal>) newValue);
			return;
		case MaxiProjektPackage.ADMIN__VERWALTET_AUFFÜHRUNG:
			getVerwaltetAufführung().clear();
			getVerwaltetAufführung().addAll((Collection<? extends Aufführung>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MaxiProjektPackage.ADMIN__VERWALTET_FILM:
			getVerwaltetFilm().clear();
			return;
		case MaxiProjektPackage.ADMIN__VERWALTET_KINOSAAL:
			getVerwaltetKinosaal().clear();
			return;
		case MaxiProjektPackage.ADMIN__VERWALTET_AUFFÜHRUNG:
			getVerwaltetAufführung().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MaxiProjektPackage.ADMIN__VERWALTET_FILM:
			return verwaltetFilm != null && !verwaltetFilm.isEmpty();
		case MaxiProjektPackage.ADMIN__VERWALTET_KINOSAAL:
			return verwaltetKinosaal != null && !verwaltetKinosaal.isEmpty();
		case MaxiProjektPackage.ADMIN__VERWALTET_AUFFÜHRUNG:
			return verwaltetAufführung != null && !verwaltetAufführung.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MaxiProjektPackage.ADMIN___BEARBEITE_FILM:
			bearbeiteFilm();
			return null;
		case MaxiProjektPackage.ADMIN___LÖSCHE_FILM:
			löscheFilm();
			return null;
		case MaxiProjektPackage.ADMIN___BEARBEITE_AUFFÜHRUNG:
			bearbeiteAufführung();
			return null;
		case MaxiProjektPackage.ADMIN___LÖSCHE_AUFFÜHRUNG:
			löscheAufführung();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AdminImpl
