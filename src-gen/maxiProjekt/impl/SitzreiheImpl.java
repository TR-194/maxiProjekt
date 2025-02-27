/**
 */
package maxiProjekt.impl;

import java.util.Collection;

import maxiProjekt.Kategorie;
import maxiProjekt.MaxiProjektPackage;
import maxiProjekt.Sitzplatz;
import maxiProjekt.Sitzreihe;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sitzreihe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.impl.SitzreiheImpl#getReihenNr <em>Reihen Nr</em>}</li>
 *   <li>{@link maxiProjekt.impl.SitzreiheImpl#getKategorie <em>Kategorie</em>}</li>
 *   <li>{@link maxiProjekt.impl.SitzreiheImpl#getSitzplatz <em>Sitzplatz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SitzreiheImpl extends MinimalEObjectImpl.Container implements Sitzreihe {
	/**
	 * The default value of the '{@link #getReihenNr() <em>Reihen Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReihenNr()
	 * @generated
	 * @ordered
	 */
	protected static final int REIHEN_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReihenNr() <em>Reihen Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReihenNr()
	 * @generated
	 * @ordered
	 */
	protected int reihenNr = REIHEN_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getKategorie() <em>Kategorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKategorie()
	 * @generated
	 * @ordered
	 */
	protected static final Kategorie KATEGORIE_EDEFAULT = Kategorie.PARKETT;

	/**
	 * The cached value of the '{@link #getKategorie() <em>Kategorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKategorie()
	 * @generated
	 * @ordered
	 */
	protected Kategorie kategorie = KATEGORIE_EDEFAULT;

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
	protected SitzreiheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaxiProjektPackage.Literals.SITZREIHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReihenNr() {
		return reihenNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReihenNr(int newReihenNr) {
		int oldReihenNr = reihenNr;
		reihenNr = newReihenNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.SITZREIHE__REIHEN_NR, oldReihenNr,
					reihenNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kategorie getKategorie() {
		return kategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKategorie(Kategorie newKategorie) {
		Kategorie oldKategorie = kategorie;
		kategorie = newKategorie == null ? KATEGORIE_EDEFAULT : newKategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.SITZREIHE__KATEGORIE, oldKategorie,
					kategorie));
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
					MaxiProjektPackage.SITZREIHE__SITZPLATZ);
		}
		return sitzplatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MaxiProjektPackage.SITZREIHE__REIHEN_NR:
			return getReihenNr();
		case MaxiProjektPackage.SITZREIHE__KATEGORIE:
			return getKategorie();
		case MaxiProjektPackage.SITZREIHE__SITZPLATZ:
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
		case MaxiProjektPackage.SITZREIHE__REIHEN_NR:
			setReihenNr((Integer) newValue);
			return;
		case MaxiProjektPackage.SITZREIHE__KATEGORIE:
			setKategorie((Kategorie) newValue);
			return;
		case MaxiProjektPackage.SITZREIHE__SITZPLATZ:
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
		case MaxiProjektPackage.SITZREIHE__REIHEN_NR:
			setReihenNr(REIHEN_NR_EDEFAULT);
			return;
		case MaxiProjektPackage.SITZREIHE__KATEGORIE:
			setKategorie(KATEGORIE_EDEFAULT);
			return;
		case MaxiProjektPackage.SITZREIHE__SITZPLATZ:
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
		case MaxiProjektPackage.SITZREIHE__REIHEN_NR:
			return reihenNr != REIHEN_NR_EDEFAULT;
		case MaxiProjektPackage.SITZREIHE__KATEGORIE:
			return kategorie != KATEGORIE_EDEFAULT;
		case MaxiProjektPackage.SITZREIHE__SITZPLATZ:
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
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (reihenNr: ");
		result.append(reihenNr);
		result.append(", kategorie: ");
		result.append(kategorie);
		result.append(')');
		return result.toString();
	}

} //SitzreiheImpl
