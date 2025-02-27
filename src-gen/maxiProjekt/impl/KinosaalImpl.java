/**
 */
package maxiProjekt.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import maxiProjekt.Kinosaal;
import maxiProjekt.MaxiProjektPackage;
import maxiProjekt.Sitzreihe;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kinosaal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.impl.KinosaalImpl#getName <em>Name</em>}</li>
 *   <li>{@link maxiProjekt.impl.KinosaalImpl#isFreigegeben <em>Freigegeben</em>}</li>
 *   <li>{@link maxiProjekt.impl.KinosaalImpl#getSitzreihe <em>Sitzreihe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KinosaalImpl extends MinimalEObjectImpl.Container implements Kinosaal {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isFreigegeben() <em>Freigegeben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFreigegeben()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FREIGEGEBEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFreigegeben() <em>Freigegeben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFreigegeben()
	 * @generated
	 * @ordered
	 */
	protected boolean freigegeben = FREIGEGEBEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSitzreihe() <em>Sitzreihe</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSitzreihe()
	 * @generated
	 * @ordered
	 */
	protected EList<Sitzreihe> sitzreihe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KinosaalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaxiProjektPackage.Literals.KINOSAAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.KINOSAAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFreigegeben() {
		return freigegeben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreigegeben(boolean newFreigegeben) {
		boolean oldFreigegeben = freigegeben;
		freigegeben = newFreigegeben;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaxiProjektPackage.KINOSAAL__FREIGEGEBEN,
					oldFreigegeben, freigegeben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sitzreihe> getSitzreihe() {
		if (sitzreihe == null) {
			sitzreihe = new EObjectResolvingEList<Sitzreihe>(Sitzreihe.class, this,
					MaxiProjektPackage.KINOSAAL__SITZREIHE);
		}
		return sitzreihe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void freigeben() {
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
		case MaxiProjektPackage.KINOSAAL__NAME:
			return getName();
		case MaxiProjektPackage.KINOSAAL__FREIGEGEBEN:
			return isFreigegeben();
		case MaxiProjektPackage.KINOSAAL__SITZREIHE:
			return getSitzreihe();
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
		case MaxiProjektPackage.KINOSAAL__NAME:
			setName((String) newValue);
			return;
		case MaxiProjektPackage.KINOSAAL__FREIGEGEBEN:
			setFreigegeben((Boolean) newValue);
			return;
		case MaxiProjektPackage.KINOSAAL__SITZREIHE:
			getSitzreihe().clear();
			getSitzreihe().addAll((Collection<? extends Sitzreihe>) newValue);
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
		case MaxiProjektPackage.KINOSAAL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MaxiProjektPackage.KINOSAAL__FREIGEGEBEN:
			setFreigegeben(FREIGEGEBEN_EDEFAULT);
			return;
		case MaxiProjektPackage.KINOSAAL__SITZREIHE:
			getSitzreihe().clear();
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
		case MaxiProjektPackage.KINOSAAL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MaxiProjektPackage.KINOSAAL__FREIGEGEBEN:
			return freigegeben != FREIGEGEBEN_EDEFAULT;
		case MaxiProjektPackage.KINOSAAL__SITZREIHE:
			return sitzreihe != null && !sitzreihe.isEmpty();
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
		case MaxiProjektPackage.KINOSAAL___FREIGEBEN:
			freigeben();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", freigegeben: ");
		result.append(freigegeben);
		result.append(')');
		return result.toString();
	}

} //KinosaalImpl
