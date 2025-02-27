/**
 */
package maxiProjekt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sitzreihe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.Sitzreihe#getReihenNr <em>Reihen Nr</em>}</li>
 *   <li>{@link maxiProjekt.Sitzreihe#getKategorie <em>Kategorie</em>}</li>
 *   <li>{@link maxiProjekt.Sitzreihe#getSitzplatz <em>Sitzplatz</em>}</li>
 * </ul>
 *
 * @see maxiProjekt.MaxiProjektPackage#getSitzreihe()
 * @model
 * @generated
 */
public interface Sitzreihe extends EObject {
	/**
	 * Returns the value of the '<em><b>Reihen Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reihen Nr</em>' attribute.
	 * @see #setReihenNr(int)
	 * @see maxiProjekt.MaxiProjektPackage#getSitzreihe_ReihenNr()
	 * @model
	 * @generated
	 */
	int getReihenNr();

	/**
	 * Sets the value of the '{@link maxiProjekt.Sitzreihe#getReihenNr <em>Reihen Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reihen Nr</em>' attribute.
	 * @see #getReihenNr()
	 * @generated
	 */
	void setReihenNr(int value);

	/**
	 * Returns the value of the '<em><b>Kategorie</b></em>' attribute.
	 * The literals are from the enumeration {@link maxiProjekt.Kategorie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kategorie</em>' attribute.
	 * @see maxiProjekt.Kategorie
	 * @see #setKategorie(Kategorie)
	 * @see maxiProjekt.MaxiProjektPackage#getSitzreihe_Kategorie()
	 * @model
	 * @generated
	 */
	Kategorie getKategorie();

	/**
	 * Sets the value of the '{@link maxiProjekt.Sitzreihe#getKategorie <em>Kategorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kategorie</em>' attribute.
	 * @see maxiProjekt.Kategorie
	 * @see #getKategorie()
	 * @generated
	 */
	void setKategorie(Kategorie value);

	/**
	 * Returns the value of the '<em><b>Sitzplatz</b></em>' reference list.
	 * The list contents are of type {@link maxiProjekt.Sitzplatz}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sitzplatz</em>' reference list.
	 * @see maxiProjekt.MaxiProjektPackage#getSitzreihe_Sitzplatz()
	 * @model required="true"
	 * @generated
	 */
	EList<Sitzplatz> getSitzplatz();

} // Sitzreihe
