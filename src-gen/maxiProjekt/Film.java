/**
 */
package maxiProjekt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Film</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.Film#getTitel <em>Titel</em>}</li>
 *   <li>{@link maxiProjekt.Film#getAltersbeschränkung <em>Altersbeschränkung</em>}</li>
 *   <li>{@link maxiProjekt.Film#getDauer <em>Dauer</em>}</li>
 *   <li>{@link maxiProjekt.Film#getStatistik <em>Statistik</em>}</li>
 *   <li>{@link maxiProjekt.Film#getAufführung <em>Aufführung</em>}</li>
 * </ul>
 *
 * @see maxiProjekt.MaxiProjektPackage#getFilm()
 * @model
 * @generated
 */
public interface Film extends EObject {
	/**
	 * Returns the value of the '<em><b>Titel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titel</em>' attribute.
	 * @see #setTitel(String)
	 * @see maxiProjekt.MaxiProjektPackage#getFilm_Titel()
	 * @model
	 * @generated
	 */
	String getTitel();

	/**
	 * Sets the value of the '{@link maxiProjekt.Film#getTitel <em>Titel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titel</em>' attribute.
	 * @see #getTitel()
	 * @generated
	 */
	void setTitel(String value);

	/**
	 * Returns the value of the '<em><b>Altersbeschränkung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altersbeschränkung</em>' attribute.
	 * @see #setAltersbeschränkung(int)
	 * @see maxiProjekt.MaxiProjektPackage#getFilm_Altersbeschränkung()
	 * @model
	 * @generated
	 */
	int getAltersbeschränkung();

	/**
	 * Sets the value of the '{@link maxiProjekt.Film#getAltersbeschränkung <em>Altersbeschränkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altersbeschränkung</em>' attribute.
	 * @see #getAltersbeschränkung()
	 * @generated
	 */
	void setAltersbeschränkung(int value);

	/**
	 * Returns the value of the '<em><b>Dauer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dauer</em>' attribute.
	 * @see #setDauer(int)
	 * @see maxiProjekt.MaxiProjektPackage#getFilm_Dauer()
	 * @model
	 * @generated
	 */
	int getDauer();

	/**
	 * Sets the value of the '{@link maxiProjekt.Film#getDauer <em>Dauer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dauer</em>' attribute.
	 * @see #getDauer()
	 * @generated
	 */
	void setDauer(int value);

	/**
	 * Returns the value of the '<em><b>Statistik</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistik</em>' reference.
	 * @see #setStatistik(Statistik)
	 * @see maxiProjekt.MaxiProjektPackage#getFilm_Statistik()
	 * @model required="true"
	 * @generated
	 */
	Statistik getStatistik();

	/**
	 * Sets the value of the '{@link maxiProjekt.Film#getStatistik <em>Statistik</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistik</em>' reference.
	 * @see #getStatistik()
	 * @generated
	 */
	void setStatistik(Statistik value);

	/**
	 * Returns the value of the '<em><b>Aufführung</b></em>' reference list.
	 * The list contents are of type {@link maxiProjekt.Aufführung}.
	 * It is bidirectional and its opposite is '{@link maxiProjekt.Aufführung#getFilm <em>Film</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aufführung</em>' reference list.
	 * @see maxiProjekt.MaxiProjektPackage#getFilm_Aufführung()
	 * @see maxiProjekt.Aufführung#getFilm
	 * @model opposite="film" required="true"
	 * @generated
	 */
	EList<Aufführung> getAufführung();

} // Film
