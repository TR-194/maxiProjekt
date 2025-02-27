/**
 */
package maxiProjekt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistik</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.Statistik#getEinnahmen <em>Einnahmen</em>}</li>
 * </ul>
 *
 * @see maxiProjekt.MaxiProjektPackage#getStatistik()
 * @model
 * @generated
 */
public interface Statistik extends EObject {
	/**
	 * Returns the value of the '<em><b>Einnahmen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Einnahmen</em>' attribute.
	 * @see #setEinnahmen(double)
	 * @see maxiProjekt.MaxiProjektPackage#getStatistik_Einnahmen()
	 * @model
	 * @generated
	 */
	double getEinnahmen();

	/**
	 * Sets the value of the '{@link maxiProjekt.Statistik#getEinnahmen <em>Einnahmen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einnahmen</em>' attribute.
	 * @see #getEinnahmen()
	 * @generated
	 */
	void setEinnahmen(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void berechneEinnahmenProAufführung(Aufführung aufführung);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void berechneEinnahmenProFilm(Film film);

} // Statistik
