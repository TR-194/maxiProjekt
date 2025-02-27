/**
 */
package maxiProjekt.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import maxiProjekt.Buchung;
import maxiProjekt.MaxiProjektPackage;
import maxiProjekt.Sitzplatz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buchung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.impl.BuchungImpl#getSitzplatz <em>Sitzplatz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuchungImpl extends MinimalEObjectImpl.Container implements Buchung {
	/**
	 * The cached value of the '{@link #getSitzplatz() <em>Sitzplatz</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSitzplatz()
	 * @generated
	 * @ordered
	 */
	protected EList<Sitzplatz> sitzplatz;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuchungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaxiProjektPackage.Literals.BUCHUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sitzplatz> getSitzplatz() {
		if (sitzplatz == null) {
			sitzplatz = new EObjectResolvingEList<Sitzplatz>(Sitzplatz.class, this,
					MaxiProjektPackage.BUCHUNG__SITZPLATZ);
		}
		return sitzplatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void bezahlen() {
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
		case MaxiProjektPackage.BUCHUNG__SITZPLATZ:
			return getSitzplatz();
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
		case MaxiProjektPackage.BUCHUNG__SITZPLATZ:
			getSitzplatz().clear();
			getSitzplatz().addAll((Collection<? extends Sitzplatz>) newValue);
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
		case MaxiProjektPackage.BUCHUNG__SITZPLATZ:
			getSitzplatz().clear();
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
		case MaxiProjektPackage.BUCHUNG__SITZPLATZ:
			return sitzplatz != null && !sitzplatz.isEmpty();
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
		case MaxiProjektPackage.BUCHUNG___BEZAHLEN:
			bezahlen();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BuchungImpl
