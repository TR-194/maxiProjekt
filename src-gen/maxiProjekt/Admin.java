/**
 */
package maxiProjekt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxiProjekt.Admin#getVerwaltetFilm <em>Verwaltet Film</em>}</li>
 *   <li>{@link maxiProjekt.Admin#getVerwaltetKinosaal <em>Verwaltet Kinosaal</em>}</li>
 *   <li>{@link maxiProjekt.Admin#getVerwaltetAufführung <em>Verwaltet Aufführung</em>}</li>
 * </ul>
 *
 * @see maxiProjekt.MaxiProjektPackage#getAdmin()
 * @model
 * @generated
 */
public interface Admin extends EObject {
	/**
	 * Returns the value of the '<em><b>Verwaltet Film</b></em>' reference list.
	 * The list contents are of type {@link maxiProjekt.Film}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verwaltet Film</em>' reference list.
	 * @see maxiProjekt.MaxiProjektPackage#getAdmin_VerwaltetFilm()
	 * @model required="true"
	 * @generated
	 */
	EList<Film> getVerwaltetFilm();

	/**
	 * Returns the value of the '<em><b>Verwaltet Kinosaal</b></em>' reference list.
	 * The list contents are of type {@link maxiProjekt.Kinosaal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verwaltet Kinosaal</em>' reference list.
	 * @see maxiProjekt.MaxiProjektPackage#getAdmin_VerwaltetKinosaal()
	 * @model required="true"
	 * @generated
	 */
	EList<Kinosaal> getVerwaltetKinosaal();

	/**
	 * Returns the value of the '<em><b>Verwaltet Aufführung</b></em>' reference list.
	 * The list contents are of type {@link maxiProjekt.Aufführung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verwaltet Aufführung</em>' reference list.
	 * @see maxiProjekt.MaxiProjektPackage#getAdmin_VerwaltetAufführung()
	 * @model required="true"
	 * @generated
	 */
	EList<Aufführung> getVerwaltetAufführung();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bearbeiteFilm();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void löscheFilm();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bearbeiteAufführung();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void löscheAufführung();

} // Admin
