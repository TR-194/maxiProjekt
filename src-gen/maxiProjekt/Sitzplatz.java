/**
 */
package maxiProjekt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sitzplatz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.Sitzplatz#getPlatzNr <em>Platz Nr</em>}</li>
 *   <li>{@link maxiProjekt.Sitzplatz#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see maxiProjekt.MaxiProjektPackage#getSitzplatz()
 * @model
 * @generated
 */
public interface Sitzplatz extends EObject {
	/**
	 * Returns the value of the '<em><b>Platz Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platz Nr</em>' attribute.
	 * @see #setPlatzNr(int)
	 * @see maxiProjekt.MaxiProjektPackage#getSitzplatz_PlatzNr()
	 * @model
	 * @generated
	 */
	int getPlatzNr();

	/**
	 * Sets the value of the '{@link maxiProjekt.Sitzplatz#getPlatzNr <em>Platz Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platz Nr</em>' attribute.
	 * @see #getPlatzNr()
	 * @generated
	 */
	void setPlatzNr(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link maxiProjekt.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see maxiProjekt.Status
	 * @see #setStatus(Status)
	 * @see maxiProjekt.MaxiProjektPackage#getSitzplatz_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link maxiProjekt.Sitzplatz#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see maxiProjekt.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean istFrei();

} // Sitzplatz
