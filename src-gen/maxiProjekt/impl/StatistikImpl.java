/**
 */
package maxiProjekt.impl;

import java.lang.reflect.InvocationTargetException;

import maxiProjekt.Aufführung;
import maxiProjekt.Film;
import maxiProjekt.MaxiProjektPackage;
import maxiProjekt.Statistik;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistik</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.impl.StatistikImpl#getEinnahmen <em>Einnahmen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatistikImpl extends MinimalEObjectImpl.Container implements Statistik {
	/**
	 * The default value of the '{@link #getEinnahmen() <em>Einnahmen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinnahmen()
	 * @generated
	 * @ordered
	 */
	protected static final double EINNAHMEN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEinnahmen() <em>Einnahmen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinnahmen()
	 * @generated
	 * @ordered
	 */
	protected double einnahmen = EINNAHMEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatistikImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaxiProjektPackage.Literals.STATISTIK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEinnahmen() {
		return einnahmen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinnahmen(double newEinnahmen) {
		double oldEinnahmen = einnahmen;
		einnahmen = newEinnahmen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.STATISTIK__EINNAHMEN, oldEinnahmen,
					einnahmen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void berechneEinnahmenProAufführung(Aufführung aufführung) {
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
	public void berechneEinnahmenProFilm(Film film) {
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
		case MaxiProjektPackage.STATISTIK__EINNAHMEN:
			return getEinnahmen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MaxiProjektPackage.STATISTIK__EINNAHMEN:
			setEinnahmen((Double) newValue);
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
		case MaxiProjektPackage.STATISTIK__EINNAHMEN:
			setEinnahmen(EINNAHMEN_EDEFAULT);
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
		case MaxiProjektPackage.STATISTIK__EINNAHMEN:
			return einnahmen != EINNAHMEN_EDEFAULT;
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
		case MaxiProjektPackage.STATISTIK___BERECHNE_EINNAHMEN_PRO_AUFFÜHRUNG__AUFFÜHRUNG:
			berechneEinnahmenProAufführung((Aufführung) arguments.get(0));
			return null;
		case MaxiProjektPackage.STATISTIK___BERECHNE_EINNAHMEN_PRO_FILM__FILM:
			berechneEinnahmenProFilm((Film) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (einnahmen: ");
		result.append(einnahmen);
		result.append(')');
		return result.toString();
	}

} //StatistikImpl
