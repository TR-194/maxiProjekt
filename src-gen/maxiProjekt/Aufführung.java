/**
 */
package maxiProjekt;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aufführung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.Aufführung#getDatum <em>Datum</em>}</li>
 *   <li>{@link maxiProjekt.Aufführung#getUhrzeit <em>Uhrzeit</em>}</li>
 *   <li>{@link maxiProjekt.Aufführung#getKinosaal <em>Kinosaal</em>}</li>
 *   <li>{@link maxiProjekt.Aufführung#getPreismodell <em>Preismodell</em>}</li>
 *   <li>{@link maxiProjekt.Aufführung#getStatistik <em>Statistik</em>}</li>
 *   <li>{@link maxiProjekt.Aufführung#getFilm <em>Film</em>}</li>
 * </ul>
 *
 * @see maxiProjekt.MaxiProjektPackage#getAufführung()
 * @model
 * @generated
 */
public interface Aufführung extends EObject {
	/**
	 * Returns the value of the '<em><b>Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datum</em>' attribute.
	 * @see #setDatum(Date)
	 * @see maxiProjekt.MaxiProjektPackage#getAufführung_Datum()
	 * @model
	 * @generated
	 */
	Date getDatum();

	/**
	 * Sets the value of the '{@link maxiProjekt.Aufführung#getDatum <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum</em>' attribute.
	 * @see #getDatum()
	 * @generated
	 */
	void setDatum(Date value);

	/**
	 * Returns the value of the '<em><b>Uhrzeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uhrzeit</em>' attribute.
	 * @see #setUhrzeit(int)
	 * @see maxiProjekt.MaxiProjektPackage#getAufführung_Uhrzeit()
	 * @model
	 * @generated
	 */
	int getUhrzeit();

	/**
	 * Sets the value of the '{@link maxiProjekt.Aufführung#getUhrzeit <em>Uhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uhrzeit</em>' attribute.
	 * @see #getUhrzeit()
	 * @generated
	 */
	void setUhrzeit(int value);

	/**
	 * Returns the value of the '<em><b>Kinosaal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinosaal</em>' reference.
	 * @see #setKinosaal(Kinosaal)
	 * @see maxiProjekt.MaxiProjektPackage#getAufführung_Kinosaal()
	 * @model required="true"
	 * @generated
	 */
	Kinosaal getKinosaal();

	/**
	 * Sets the value of the '{@link maxiProjekt.Aufführung#getKinosaal <em>Kinosaal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinosaal</em>' reference.
	 * @see #getKinosaal()
	 * @generated
	 */
	void setKinosaal(Kinosaal value);

	/**
	 * Returns the value of the '<em><b>Preismodell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preismodell</em>' reference.
	 * @see #setPreismodell(Preismodell)
	 * @see maxiProjekt.MaxiProjektPackage#getAufführung_Preismodell()
	 * @model required="true"
	 * @generated
	 */
	Preismodell getPreismodell();

	/**
	 * Sets the value of the '{@link maxiProjekt.Aufführung#getPreismodell <em>Preismodell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preismodell</em>' reference.
	 * @see #getPreismodell()
	 * @generated
	 */
	void setPreismodell(Preismodell value);

	/**
	 * Returns the value of the '<em><b>Statistik</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistik</em>' reference.
	 * @see #setStatistik(Statistik)
	 * @see maxiProjekt.MaxiProjektPackage#getAufführung_Statistik()
	 * @model required="true"
	 * @generated
	 */
	Statistik getStatistik();

	/**
	 * Sets the value of the '{@link maxiProjekt.Aufführung#getStatistik <em>Statistik</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistik</em>' reference.
	 * @see #getStatistik()
	 * @generated
	 */
	void setStatistik(Statistik value);

	/**
	 * Returns the value of the '<em><b>Film</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link maxiProjekt.Film#getAufführung <em>Aufführung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Film</em>' reference.
	 * @see #setFilm(Film)
	 * @see maxiProjekt.MaxiProjektPackage#getAufführung_Film()
	 * @see maxiProjekt.Film#getAufführung
	 * @model opposite="aufführung" required="true"
	 * @generated
	 */
	Film getFilm();

	/**
	 * Sets the value of the '{@link maxiProjekt.Aufführung#getFilm <em>Film</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Film</em>' reference.
	 * @see #getFilm()
	 * @generated
	 */
	void setFilm(Film value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean istVerfügbar();

} // Aufführung
