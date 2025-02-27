/**
 */
package maxiProjekt.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import maxiProjekt.Buchung;
import maxiProjekt.MaxiProjektPackage;
import maxiProjekt.Reservierung;
import maxiProjekt.Sitzplatz;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservierung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.impl.ReservierungImpl#getAblaufDatum <em>Ablauf Datum</em>}</li>
 *   <li>{@link maxiProjekt.impl.ReservierungImpl#getUmwandeln <em>Umwandeln</em>}</li>
 *   <li>{@link maxiProjekt.impl.ReservierungImpl#getSitzplatz <em>Sitzplatz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservierungImpl extends MinimalEObjectImpl.Container implements Reservierung {
	/**
	 * The default value of the '{@link #getAblaufDatum() <em>Ablauf Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAblaufDatum()
	 * @generated
	 * @ordered
	 */
	protected static final Date ABLAUF_DATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAblaufDatum() <em>Ablauf Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAblaufDatum()
	 * @generated
	 * @ordered
	 */
	protected Date ablaufDatum = ABLAUF_DATUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUmwandeln() <em>Umwandeln</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmwandeln()
	 * @generated
	 * @ordered
	 */
	protected Buchung umwandeln;

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
	protected ReservierungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaxiProjektPackage.Literals.RESERVIERUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAblaufDatum() {
		return ablaufDatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAblaufDatum(Date newAblaufDatum) {
		Date oldAblaufDatum = ablaufDatum;
		ablaufDatum = newAblaufDatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.RESERVIERUNG__ABLAUF_DATUM,
					oldAblaufDatum, ablaufDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Buchung getUmwandeln() {
		if (umwandeln != null && umwandeln.eIsProxy()) {
			InternalEObject oldUmwandeln = (InternalEObject) umwandeln;
			umwandeln = (Buchung) eResolveProxy(oldUmwandeln);
			if (umwandeln != oldUmwandeln) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MaxiProjektPackage.RESERVIERUNG__UMWANDELN, oldUmwandeln, umwandeln));
			}
		}
		return umwandeln;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buchung basicGetUmwandeln() {
		return umwandeln;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUmwandeln(Buchung newUmwandeln) {
		Buchung oldUmwandeln = umwandeln;
		umwandeln = newUmwandeln;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.RESERVIERUNG__UMWANDELN,
					oldUmwandeln, umwandeln));
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
					MaxiProjektPackage.RESERVIERUNG__SITZPLATZ);
		}
		return sitzplatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void stornieren() {
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
	public Buchung inBuchungUmwandeln() {
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
	public boolean istGültig() {
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
		case MaxiProjektPackage.RESERVIERUNG__ABLAUF_DATUM:
			return getAblaufDatum();
		case MaxiProjektPackage.RESERVIERUNG__UMWANDELN:
			if (resolve)
				return getUmwandeln();
			return basicGetUmwandeln();
		case MaxiProjektPackage.RESERVIERUNG__SITZPLATZ:
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
		case MaxiProjektPackage.RESERVIERUNG__ABLAUF_DATUM:
			setAblaufDatum((Date) newValue);
			return;
		case MaxiProjektPackage.RESERVIERUNG__UMWANDELN:
			setUmwandeln((Buchung) newValue);
			return;
		case MaxiProjektPackage.RESERVIERUNG__SITZPLATZ:
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
		case MaxiProjektPackage.RESERVIERUNG__ABLAUF_DATUM:
			setAblaufDatum(ABLAUF_DATUM_EDEFAULT);
			return;
		case MaxiProjektPackage.RESERVIERUNG__UMWANDELN:
			setUmwandeln((Buchung) null);
			return;
		case MaxiProjektPackage.RESERVIERUNG__SITZPLATZ:
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
		case MaxiProjektPackage.RESERVIERUNG__ABLAUF_DATUM:
			return ABLAUF_DATUM_EDEFAULT == null ? ablaufDatum != null : !ABLAUF_DATUM_EDEFAULT.equals(ablaufDatum);
		case MaxiProjektPackage.RESERVIERUNG__UMWANDELN:
			return umwandeln != null;
		case MaxiProjektPackage.RESERVIERUNG__SITZPLATZ:
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
		case MaxiProjektPackage.RESERVIERUNG___STORNIEREN:
			stornieren();
			return null;
		case MaxiProjektPackage.RESERVIERUNG___IN_BUCHUNG_UMWANDELN:
			return inBuchungUmwandeln();
		case MaxiProjektPackage.RESERVIERUNG___IST_GÜLTIG:
			return istGültig();
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
		result.append(" (ablaufDatum: ");
		result.append(ablaufDatum);
		result.append(')');
		return result.toString();
	}

} //ReservierungImpl
