/**
 */
package maxiProjekt.impl;

import maxiProjekt.MaxiProjektPackage;
import maxiProjekt.Preismodell;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preismodell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.impl.PreismodellImpl#getParkettPreis <em>Parkett Preis</em>}</li>
 *   <li>{@link maxiProjekt.impl.PreismodellImpl#getLogePreis <em>Loge Preis</em>}</li>
 *   <li>{@link maxiProjekt.impl.PreismodellImpl#getLogeMitServicePreis <em>Loge Mit Service Preis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreismodellImpl extends MinimalEObjectImpl.Container implements Preismodell {
	/**
	 * The default value of the '{@link #getParkettPreis() <em>Parkett Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParkettPreis()
	 * @generated
	 * @ordered
	 */
	protected static final double PARKETT_PREIS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getParkettPreis() <em>Parkett Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParkettPreis()
	 * @generated
	 * @ordered
	 */
	protected double parkettPreis = PARKETT_PREIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogePreis() <em>Loge Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogePreis()
	 * @generated
	 * @ordered
	 */
	protected static final double LOGE_PREIS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLogePreis() <em>Loge Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogePreis()
	 * @generated
	 * @ordered
	 */
	protected double logePreis = LOGE_PREIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogeMitServicePreis() <em>Loge Mit Service Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogeMitServicePreis()
	 * @generated
	 * @ordered
	 */
	protected static final double LOGE_MIT_SERVICE_PREIS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLogeMitServicePreis() <em>Loge Mit Service Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogeMitServicePreis()
	 * @generated
	 * @ordered
	 */
	protected double logeMitServicePreis = LOGE_MIT_SERVICE_PREIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreismodellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaxiProjektPackage.Literals.PREISMODELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getParkettPreis() {
		return parkettPreis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParkettPreis(double newParkettPreis) {
		double oldParkettPreis = parkettPreis;
		parkettPreis = newParkettPreis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.PREISMODELL__PARKETT_PREIS,
					oldParkettPreis, parkettPreis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLogePreis() {
		return logePreis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogePreis(double newLogePreis) {
		double oldLogePreis = logePreis;
		logePreis = newLogePreis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.PREISMODELL__LOGE_PREIS,
					oldLogePreis, logePreis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLogeMitServicePreis() {
		return logeMitServicePreis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogeMitServicePreis(double newLogeMitServicePreis) {
		double oldLogeMitServicePreis = logeMitServicePreis;
		logeMitServicePreis = newLogeMitServicePreis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MaxiProjektPackage.PREISMODELL__LOGE_MIT_SERVICE_PREIS, oldLogeMitServicePreis,
					logeMitServicePreis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MaxiProjektPackage.PREISMODELL__PARKETT_PREIS:
			return getParkettPreis();
		case MaxiProjektPackage.PREISMODELL__LOGE_PREIS:
			return getLogePreis();
		case MaxiProjektPackage.PREISMODELL__LOGE_MIT_SERVICE_PREIS:
			return getLogeMitServicePreis();
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
		case MaxiProjektPackage.PREISMODELL__PARKETT_PREIS:
			setParkettPreis((Double) newValue);
			return;
		case MaxiProjektPackage.PREISMODELL__LOGE_PREIS:
			setLogePreis((Double) newValue);
			return;
		case MaxiProjektPackage.PREISMODELL__LOGE_MIT_SERVICE_PREIS:
			setLogeMitServicePreis((Double) newValue);
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
		case MaxiProjektPackage.PREISMODELL__PARKETT_PREIS:
			setParkettPreis(PARKETT_PREIS_EDEFAULT);
			return;
		case MaxiProjektPackage.PREISMODELL__LOGE_PREIS:
			setLogePreis(LOGE_PREIS_EDEFAULT);
			return;
		case MaxiProjektPackage.PREISMODELL__LOGE_MIT_SERVICE_PREIS:
			setLogeMitServicePreis(LOGE_MIT_SERVICE_PREIS_EDEFAULT);
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
		case MaxiProjektPackage.PREISMODELL__PARKETT_PREIS:
			return parkettPreis != PARKETT_PREIS_EDEFAULT;
		case MaxiProjektPackage.PREISMODELL__LOGE_PREIS:
			return logePreis != LOGE_PREIS_EDEFAULT;
		case MaxiProjektPackage.PREISMODELL__LOGE_MIT_SERVICE_PREIS:
			return logeMitServicePreis != LOGE_MIT_SERVICE_PREIS_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (parkettPreis: ");
		result.append(parkettPreis);
		result.append(", logePreis: ");
		result.append(logePreis);
		result.append(", logeMitServicePreis: ");
		result.append(logeMitServicePreis);
		result.append(')');
		return result.toString();
	}

} //PreismodellImpl
