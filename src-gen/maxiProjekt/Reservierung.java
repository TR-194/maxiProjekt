/**
 */
package maxiProjekt;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservierung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.Reservierung#getAblaufDatum <em>Ablauf Datum</em>}</li>
 *   <li>{@link maxiProjekt.Reservierung#getUmwandeln <em>Umwandeln</em>}</li>
 *   <li>{@link maxiProjekt.Reservierung#getSitzplatz <em>Sitzplatz</em>}</li>
 * </ul>
 *
 * @see maxiProjekt.MaxiProjektPackage#getReservierung()
 * @model
 * @generated
 */
public interface Reservierung extends EObject {
	/**
	 * Returns the value of the '<em><b>Ablauf Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ablauf Datum</em>' attribute.
	 * @see #setAblaufDatum(Date)
	 * @see maxiProjekt.MaxiProjektPackage#getReservierung_AblaufDatum()
	 * @model
	 * @generated
	 */
	Date getAblaufDatum();

	/**
	 * Sets the value of the '{@link maxiProjekt.Reservierung#getAblaufDatum <em>Ablauf Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ablauf Datum</em>' attribute.
	 * @see #getAblaufDatum()
	 * @generated
	 */
	void setAblaufDatum(Date value);

	/**
	 * Returns the value of the '<em><b>Umwandeln</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Umwandeln</em>' reference.
	 * @see #setUmwandeln(Buchung)
	 * @see maxiProjekt.MaxiProjektPackage#getReservierung_Umwandeln()
	 * @model required="true"
	 * @generated
	 */
	Buchung getUmwandeln();

	/**
	 * Sets the value of the '{@link maxiProjekt.Reservierung#getUmwandeln <em>Umwandeln</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Umwandeln</em>' reference.
	 * @see #getUmwandeln()
	 * @generated
	 */
	void setUmwandeln(Buchung value);

	/**
	 * Returns the value of the '<em><b>Sitzplatz</b></em>' reference list.
	 * The list contents are of type {@link maxiProjekt.Sitzplatz}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sitzplatz</em>' reference list.
	 * @see maxiProjekt.MaxiProjektPackage#getReservierung_Sitzplatz()
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
	void stornieren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Buchung inBuchungUmwandeln();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean istGültig();

} // Reservierung
