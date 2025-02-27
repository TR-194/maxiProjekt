/**
 */
package maxiProjekt.impl;

import java.lang.reflect.InvocationTargetException;

import maxiProjekt.MaxiProjektPackage;
import maxiProjekt.Sitzplatz;
import maxiProjekt.Status;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sitzplatz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.impl.SitzplatzImpl#getPlatzNr <em>Platz Nr</em>}</li>
 *   <li>{@link maxiProjekt.impl.SitzplatzImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SitzplatzImpl extends MinimalEObjectImpl.Container implements Sitzplatz {
	/**
	 * The default value of the '{@link #getPlatzNr() <em>Platz Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatzNr()
	 * @generated
	 * @ordered
	 */
	protected static final int PLATZ_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPlatzNr() <em>Platz Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatzNr()
	 * @generated
	 * @ordered
	 */
	protected int platzNr = PLATZ_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.FREI;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SitzplatzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaxiProjektPackage.Literals.SITZPLATZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPlatzNr() {
		return platzNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatzNr(int newPlatzNr) {
		int oldPlatzNr = platzNr;
		platzNr = newPlatzNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.SITZPLATZ__PLATZ_NR, oldPlatzNr,
					platzNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.SITZPLATZ__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean istFrei() {
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
		case MaxiProjektPackage.SITZPLATZ__PLATZ_NR:
			return getPlatzNr();
		case MaxiProjektPackage.SITZPLATZ__STATUS:
			return getStatus();
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
		case MaxiProjektPackage.SITZPLATZ__PLATZ_NR:
			setPlatzNr((Integer) newValue);
			return;
		case MaxiProjektPackage.SITZPLATZ__STATUS:
			setStatus((Status) newValue);
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
		case MaxiProjektPackage.SITZPLATZ__PLATZ_NR:
			setPlatzNr(PLATZ_NR_EDEFAULT);
			return;
		case MaxiProjektPackage.SITZPLATZ__STATUS:
			setStatus(STATUS_EDEFAULT);
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
		case MaxiProjektPackage.SITZPLATZ__PLATZ_NR:
			return platzNr != PLATZ_NR_EDEFAULT;
		case MaxiProjektPackage.SITZPLATZ__STATUS:
			return status != STATUS_EDEFAULT;
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
		case MaxiProjektPackage.SITZPLATZ___IST_FREI:
			return istFrei();
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
		result.append(" (platzNr: ");
		result.append(platzNr);
		result.append(", Status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //SitzplatzImpl
