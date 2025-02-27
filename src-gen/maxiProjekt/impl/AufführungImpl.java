/**
 */
package maxiProjekt.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import maxiProjekt.Aufführung;
import maxiProjekt.Film;
import maxiProjekt.Kinosaal;
import maxiProjekt.MaxiProjektPackage;
import maxiProjekt.Preismodell;
import maxiProjekt.Statistik;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aufführung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.impl.AufführungImpl#getDatum <em>Datum</em>}</li>
 *   <li>{@link maxiProjekt.impl.AufführungImpl#getUhrzeit <em>Uhrzeit</em>}</li>
 *   <li>{@link maxiProjekt.impl.AufführungImpl#getKinosaal <em>Kinosaal</em>}</li>
 *   <li>{@link maxiProjekt.impl.AufführungImpl#getPreismodell <em>Preismodell</em>}</li>
 *   <li>{@link maxiProjekt.impl.AufführungImpl#getStatistik <em>Statistik</em>}</li>
 *   <li>{@link maxiProjekt.impl.AufführungImpl#getFilm <em>Film</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AufführungImpl extends MinimalEObjectImpl.Container implements Aufführung {
	/**
	 * The default value of the '{@link #getDatum() <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatum()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatum() <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatum()
	 * @generated
	 * @ordered
	 */
	protected Date datum = DATUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getUhrzeit() <em>Uhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUhrzeit()
	 * @generated
	 * @ordered
	 */
	protected static final int UHRZEIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUhrzeit() <em>Uhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUhrzeit()
	 * @generated
	 * @ordered
	 */
	protected int uhrzeit = UHRZEIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKinosaal() <em>Kinosaal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinosaal()
	 * @generated
	 * @ordered
	 */
	protected Kinosaal kinosaal;

	/**
	 * The cached value of the '{@link #getPreismodell() <em>Preismodell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreismodell()
	 * @generated
	 * @ordered
	 */
	protected Preismodell preismodell;

	/**
	 * The cached value of the '{@link #getStatistik() <em>Statistik</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatistik()
	 * @generated
	 * @ordered
	 */
	protected Statistik statistik;

	/**
	 * The cached value of the '{@link #getFilm() <em>Film</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilm()
	 * @generated
	 * @ordered
	 */
	protected Film film;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AufführungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaxiProjektPackage.Literals.AUFFÜHRUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatum() {
		return datum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatum(Date newDatum) {
		Date oldDatum = datum;
		datum = newDatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.AUFFÜHRUNG__DATUM, oldDatum,
					datum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUhrzeit() {
		return uhrzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUhrzeit(int newUhrzeit) {
		int oldUhrzeit = uhrzeit;
		uhrzeit = newUhrzeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.AUFFÜHRUNG__UHRZEIT, oldUhrzeit,
					uhrzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kinosaal getKinosaal() {
		if (kinosaal != null && kinosaal.eIsProxy()) {
			InternalEObject oldKinosaal = (InternalEObject) kinosaal;
			kinosaal = (Kinosaal) eResolveProxy(oldKinosaal);
			if (kinosaal != oldKinosaal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MaxiProjektPackage.AUFFÜHRUNG__KINOSAAL,
							oldKinosaal, kinosaal));
			}
		}
		return kinosaal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kinosaal basicGetKinosaal() {
		return kinosaal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKinosaal(Kinosaal newKinosaal) {
		Kinosaal oldKinosaal = kinosaal;
		kinosaal = newKinosaal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.AUFFÜHRUNG__KINOSAAL, oldKinosaal,
					kinosaal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Preismodell getPreismodell() {
		if (preismodell != null && preismodell.eIsProxy()) {
			InternalEObject oldPreismodell = (InternalEObject) preismodell;
			preismodell = (Preismodell) eResolveProxy(oldPreismodell);
			if (preismodell != oldPreismodell) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MaxiProjektPackage.AUFFÜHRUNG__PREISMODELL, oldPreismodell, preismodell));
			}
		}
		return preismodell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preismodell basicGetPreismodell() {
		return preismodell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreismodell(Preismodell newPreismodell) {
		Preismodell oldPreismodell = preismodell;
		preismodell = newPreismodell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.AUFFÜHRUNG__PREISMODELL,
					oldPreismodell, preismodell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statistik getStatistik() {
		if (statistik != null && statistik.eIsProxy()) {
			InternalEObject oldStatistik = (InternalEObject) statistik;
			statistik = (Statistik) eResolveProxy(oldStatistik);
			if (statistik != oldStatistik) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MaxiProjektPackage.AUFFÜHRUNG__STATISTIK,
							oldStatistik, statistik));
			}
		}
		return statistik;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statistik basicGetStatistik() {
		return statistik;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatistik(Statistik newStatistik) {
		Statistik oldStatistik = statistik;
		statistik = newStatistik;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.AUFFÜHRUNG__STATISTIK,
					oldStatistik, statistik));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Film getFilm() {
		if (film != null && film.eIsProxy()) {
			InternalEObject oldFilm = (InternalEObject) film;
			film = (Film) eResolveProxy(oldFilm);
			if (film != oldFilm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MaxiProjektPackage.AUFFÜHRUNG__FILM,
							oldFilm, film));
			}
		}
		return film;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Film basicGetFilm() {
		return film;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilm(Film newFilm, NotificationChain msgs) {
		Film oldFilm = film;
		film = newFilm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MaxiProjektPackage.AUFFÜHRUNG__FILM, oldFilm, newFilm);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilm(Film newFilm) {
		if (newFilm != film) {
			NotificationChain msgs = null;
			if (film != null)
				msgs = ((InternalEObject) film).eInverseRemove(this, MaxiProjektPackage.FILM__AUFFÜHRUNG, Film.class,
						msgs);
			if (newFilm != null)
				msgs = ((InternalEObject) newFilm).eInverseAdd(this, MaxiProjektPackage.FILM__AUFFÜHRUNG, Film.class,
						msgs);
			msgs = basicSetFilm(newFilm, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.AUFFÜHRUNG__FILM, newFilm,
					newFilm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean istVerfügbar() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MaxiProjektPackage.AUFFÜHRUNG__FILM:
			if (film != null)
				msgs = ((InternalEObject) film).eInverseRemove(this, MaxiProjektPackage.FILM__AUFFÜHRUNG, Film.class,
						msgs);
			return basicSetFilm((Film) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MaxiProjektPackage.AUFFÜHRUNG__FILM:
			return basicSetFilm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MaxiProjektPackage.AUFFÜHRUNG__DATUM:
			return getDatum();
		case MaxiProjektPackage.AUFFÜHRUNG__UHRZEIT:
			return getUhrzeit();
		case MaxiProjektPackage.AUFFÜHRUNG__KINOSAAL:
			if (resolve)
				return getKinosaal();
			return basicGetKinosaal();
		case MaxiProjektPackage.AUFFÜHRUNG__PREISMODELL:
			if (resolve)
				return getPreismodell();
			return basicGetPreismodell();
		case MaxiProjektPackage.AUFFÜHRUNG__STATISTIK:
			if (resolve)
				return getStatistik();
			return basicGetStatistik();
		case MaxiProjektPackage.AUFFÜHRUNG__FILM:
			if (resolve)
				return getFilm();
			return basicGetFilm();
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
		case MaxiProjektPackage.AUFFÜHRUNG__DATUM:
			setDatum((Date) newValue);
			return;
		case MaxiProjektPackage.AUFFÜHRUNG__UHRZEIT:
			setUhrzeit((Integer) newValue);
			return;
		case MaxiProjektPackage.AUFFÜHRUNG__KINOSAAL:
			setKinosaal((Kinosaal) newValue);
			return;
		case MaxiProjektPackage.AUFFÜHRUNG__PREISMODELL:
			setPreismodell((Preismodell) newValue);
			return;
		case MaxiProjektPackage.AUFFÜHRUNG__STATISTIK:
			setStatistik((Statistik) newValue);
			return;
		case MaxiProjektPackage.AUFFÜHRUNG__FILM:
			setFilm((Film) newValue);
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
		case MaxiProjektPackage.AUFFÜHRUNG__DATUM:
			setDatum(DATUM_EDEFAULT);
			return;
		case MaxiProjektPackage.AUFFÜHRUNG__UHRZEIT:
			setUhrzeit(UHRZEIT_EDEFAULT);
			return;
		case MaxiProjektPackage.AUFFÜHRUNG__KINOSAAL:
			setKinosaal((Kinosaal) null);
			return;
		case MaxiProjektPackage.AUFFÜHRUNG__PREISMODELL:
			setPreismodell((Preismodell) null);
			return;
		case MaxiProjektPackage.AUFFÜHRUNG__STATISTIK:
			setStatistik((Statistik) null);
			return;
		case MaxiProjektPackage.AUFFÜHRUNG__FILM:
			setFilm((Film) null);
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
		case MaxiProjektPackage.AUFFÜHRUNG__DATUM:
			return DATUM_EDEFAULT == null ? datum != null : !DATUM_EDEFAULT.equals(datum);
		case MaxiProjektPackage.AUFFÜHRUNG__UHRZEIT:
			return uhrzeit != UHRZEIT_EDEFAULT;
		case MaxiProjektPackage.AUFFÜHRUNG__KINOSAAL:
			return kinosaal != null;
		case MaxiProjektPackage.AUFFÜHRUNG__PREISMODELL:
			return preismodell != null;
		case MaxiProjektPackage.AUFFÜHRUNG__STATISTIK:
			return statistik != null;
		case MaxiProjektPackage.AUFFÜHRUNG__FILM:
			return film != null;
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
		case MaxiProjektPackage.AUFFÜHRUNG___IST_VERFÜGBAR:
			return istVerfügbar();
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
		result.append(" (datum: ");
		result.append(datum);
		result.append(", uhrzeit: ");
		result.append(uhrzeit);
		result.append(')');
		return result.toString();
	}

} //AufführungImpl
