/**
 */
package maxiProjekt.impl;

import java.util.Collection;

import maxiProjekt.Aufführung;
import maxiProjekt.Film;
import maxiProjekt.MaxiProjektPackage;
import maxiProjekt.Statistik;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Film</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.impl.FilmImpl#getTitel <em>Titel</em>}</li>
 *   <li>{@link maxiProjekt.impl.FilmImpl#getAltersbeschränkung <em>Altersbeschränkung</em>}</li>
 *   <li>{@link maxiProjekt.impl.FilmImpl#getDauer <em>Dauer</em>}</li>
 *   <li>{@link maxiProjekt.impl.FilmImpl#getStatistik <em>Statistik</em>}</li>
 *   <li>{@link maxiProjekt.impl.FilmImpl#getAufführung <em>Aufführung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilmImpl extends MinimalEObjectImpl.Container implements Film {
	/**
	 * The default value of the '{@link #getTitel() <em>Titel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitel()
	 * @generated
	 * @ordered
	 */
	protected static final String TITEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitel() <em>Titel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitel()
	 * @generated
	 * @ordered
	 */
	protected String titel = TITEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltersbeschränkung() <em>Altersbeschränkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltersbeschränkung()
	 * @generated
	 * @ordered
	 */
	protected static final int ALTERSBESCHRÄNKUNG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAltersbeschränkung() <em>Altersbeschränkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltersbeschränkung()
	 * @generated
	 * @ordered
	 */
	protected int altersbeschränkung = ALTERSBESCHRÄNKUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getDauer() <em>Dauer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauer()
	 * @generated
	 * @ordered
	 */
	protected static final int DAUER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDauer() <em>Dauer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauer()
	 * @generated
	 * @ordered
	 */
	protected int dauer = DAUER_EDEFAULT;

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
	 * The cached value of the '{@link #getAufführung() <em>Aufführung</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufführung()
	 * @generated
	 * @ordered
	 */
	protected EList<Aufführung> aufführung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaxiProjektPackage.Literals.FILM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitel() {
		return titel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitel(String newTitel) {
		String oldTitel = titel;
		titel = newTitel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.FILM__TITEL, oldTitel, titel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAltersbeschränkung() {
		return altersbeschränkung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAltersbeschränkung(int newAltersbeschränkung) {
		int oldAltersbeschränkung = altersbeschränkung;
		altersbeschränkung = newAltersbeschränkung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.FILM__ALTERSBESCHRÄNKUNG,
					oldAltersbeschränkung, altersbeschränkung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDauer() {
		return dauer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDauer(int newDauer) {
		int oldDauer = dauer;
		dauer = newDauer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.FILM__DAUER, oldDauer, dauer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MaxiProjektPackage.FILM__STATISTIK,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.FILM__STATISTIK, oldStatistik,
					statistik));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aufführung> getAufführung() {
		if (aufführung == null) {
			aufführung = new EObjectWithInverseResolvingEList<Aufführung>(Aufführung.class, this,
					MaxiProjektPackage.FILM__AUFFÜHRUNG, MaxiProjektPackage.AUFFÜHRUNG__FILM);
		}
		return aufführung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MaxiProjektPackage.FILM__AUFFÜHRUNG:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAufführung()).basicAdd(otherEnd, msgs);
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
		case MaxiProjektPackage.FILM__AUFFÜHRUNG:
			return ((InternalEList<?>) getAufführung()).basicRemove(otherEnd, msgs);
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
		case MaxiProjektPackage.FILM__TITEL:
			return getTitel();
		case MaxiProjektPackage.FILM__ALTERSBESCHRÄNKUNG:
			return getAltersbeschränkung();
		case MaxiProjektPackage.FILM__DAUER:
			return getDauer();
		case MaxiProjektPackage.FILM__STATISTIK:
			if (resolve)
				return getStatistik();
			return basicGetStatistik();
		case MaxiProjektPackage.FILM__AUFFÜHRUNG:
			return getAufführung();
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
		case MaxiProjektPackage.FILM__TITEL:
			setTitel((String) newValue);
			return;
		case MaxiProjektPackage.FILM__ALTERSBESCHRÄNKUNG:
			setAltersbeschränkung((Integer) newValue);
			return;
		case MaxiProjektPackage.FILM__DAUER:
			setDauer((Integer) newValue);
			return;
		case MaxiProjektPackage.FILM__STATISTIK:
			setStatistik((Statistik) newValue);
			return;
		case MaxiProjektPackage.FILM__AUFFÜHRUNG:
			getAufführung().clear();
			getAufführung().addAll((Collection<? extends Aufführung>) newValue);
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
		case MaxiProjektPackage.FILM__TITEL:
			setTitel(TITEL_EDEFAULT);
			return;
		case MaxiProjektPackage.FILM__ALTERSBESCHRÄNKUNG:
			setAltersbeschränkung(ALTERSBESCHRÄNKUNG_EDEFAULT);
			return;
		case MaxiProjektPackage.FILM__DAUER:
			setDauer(DAUER_EDEFAULT);
			return;
		case MaxiProjektPackage.FILM__STATISTIK:
			setStatistik((Statistik) null);
			return;
		case MaxiProjektPackage.FILM__AUFFÜHRUNG:
			getAufführung().clear();
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
		case MaxiProjektPackage.FILM__TITEL:
			return TITEL_EDEFAULT == null ? titel != null : !TITEL_EDEFAULT.equals(titel);
		case MaxiProjektPackage.FILM__ALTERSBESCHRÄNKUNG:
			return altersbeschränkung != ALTERSBESCHRÄNKUNG_EDEFAULT;
		case MaxiProjektPackage.FILM__DAUER:
			return dauer != DAUER_EDEFAULT;
		case MaxiProjektPackage.FILM__STATISTIK:
			return statistik != null;
		case MaxiProjektPackage.FILM__AUFFÜHRUNG:
			return aufführung != null && !aufführung.isEmpty();
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
		result.append(" (titel: ");
		result.append(titel);
		result.append(", altersbeschränkung: ");
		result.append(altersbeschränkung);
		result.append(", dauer: ");
		result.append(dauer);
		result.append(')');
		return result.toString();
	}

} //FilmImpl
