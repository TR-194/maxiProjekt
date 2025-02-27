/**
 */
package maxiProjekt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kinosaal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.Kinosaal#getName <em>Name</em>}</li>
 *   <li>{@link maxiProjekt.Kinosaal#isFreigegeben <em>Freigegeben</em>}</li>
 *   <li>{@link maxiProjekt.Kinosaal#getSitzreihe <em>Sitzreihe</em>}</li>
 * </ul>
 *
 * @see maxiProjekt.MaxiProjektPackage#getKinosaal()
 * @model
 * @generated
 */
public interface Kinosaal extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see maxiProjekt.MaxiProjektPackage#getKinosaal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maxiProjekt.Kinosaal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Freigegeben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freigegeben</em>' attribute.
	 * @see #setFreigegeben(boolean)
	 * @see maxiProjekt.MaxiProjektPackage#getKinosaal_Freigegeben()
	 * @model
	 * @generated
	 */
	boolean isFreigegeben();

	/**
	 * Sets the value of the '{@link maxiProjekt.Kinosaal#isFreigegeben <em>Freigegeben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freigegeben</em>' attribute.
	 * @see #isFreigegeben()
	 * @generated
	 */
	void setFreigegeben(boolean value);

	/**
	 * Returns the value of the '<em><b>Sitzreihe</b></em>' reference list.
	 * The list contents are of type {@link maxiProjekt.Sitzreihe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sitzreihe</em>' reference list.
	 * @see maxiProjekt.MaxiProjektPackage#getKinosaal_Sitzreihe()
	 * @model required="true"
	 * @generated
	 */
	EList<Sitzreihe> getSitzreihe();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void freigeben();

} // Kinosaal
