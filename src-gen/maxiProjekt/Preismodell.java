/**
 */
package maxiProjekt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preismodell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.Preismodell#getParkettPreis <em>Parkett Preis</em>}</li>
 *   <li>{@link maxiProjekt.Preismodell#getLogePreis <em>Loge Preis</em>}</li>
 *   <li>{@link maxiProjekt.Preismodell#getLogeMitServicePreis <em>Loge Mit Service Preis</em>}</li>
 * </ul>
 *
 * @see maxiProjekt.MaxiProjektPackage#getPreismodell()
 * @model
 * @generated
 */
public interface Preismodell extends EObject {
	/**
	 * Returns the value of the '<em><b>Parkett Preis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parkett Preis</em>' attribute.
	 * @see #setParkettPreis(double)
	 * @see maxiProjekt.MaxiProjektPackage#getPreismodell_ParkettPreis()
	 * @model
	 * @generated
	 */
	double getParkettPreis();

	/**
	 * Sets the value of the '{@link maxiProjekt.Preismodell#getParkettPreis <em>Parkett Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parkett Preis</em>' attribute.
	 * @see #getParkettPreis()
	 * @generated
	 */
	void setParkettPreis(double value);

	/**
	 * Returns the value of the '<em><b>Loge Preis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loge Preis</em>' attribute.
	 * @see #setLogePreis(double)
	 * @see maxiProjekt.MaxiProjektPackage#getPreismodell_LogePreis()
	 * @model
	 * @generated
	 */
	double getLogePreis();

	/**
	 * Sets the value of the '{@link maxiProjekt.Preismodell#getLogePreis <em>Loge Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loge Preis</em>' attribute.
	 * @see #getLogePreis()
	 * @generated
	 */
	void setLogePreis(double value);

	/**
	 * Returns the value of the '<em><b>Loge Mit Service Preis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loge Mit Service Preis</em>' attribute.
	 * @see #setLogeMitServicePreis(double)
	 * @see maxiProjekt.MaxiProjektPackage#getPreismodell_LogeMitServicePreis()
	 * @model
	 * @generated
	 */
	double getLogeMitServicePreis();

	/**
	 * Sets the value of the '{@link maxiProjekt.Preismodell#getLogeMitServicePreis <em>Loge Mit Service Preis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loge Mit Service Preis</em>' attribute.
	 * @see #getLogeMitServicePreis()
	 * @generated
	 */
	void setLogeMitServicePreis(double value);

} // Preismodell
