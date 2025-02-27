/**
 */
package maxiProjekt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buchung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.Buchung#getSitzplatz <em>Sitzplatz</em>}</li>
 * </ul>
 *
 * @see maxiProjekt.MaxiProjektPackage#getBuchung()
 * @model
 * @generated
 */
public interface Buchung extends EObject {
	/**
	 * Returns the value of the '<em><b>Sitzplatz</b></em>' reference list.
	 * The list contents are of type {@link maxiProjekt.Sitzplatz}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sitzplatz</em>' reference list.
	 * @see maxiProjekt.MaxiProjektPackage#getBuchung_Sitzplatz()
	 * @model required="true"
	 * @generated
	 */
	EList<Sitzplatz> getSitzplatz();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bezahlen();

} // Buchung
