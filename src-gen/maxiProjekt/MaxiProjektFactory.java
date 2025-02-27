/**
 */
package maxiProjekt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see maxiProjekt.MaxiProjektPackage
 * @generated
 */
public interface MaxiProjektFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaxiProjektFactory eINSTANCE = maxiProjekt.impl.MaxiProjektFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Kinosaal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kinosaal</em>'.
	 * @generated
	 */
	Kinosaal createKinosaal();

	/**
	 * Returns a new object of class '<em>Sitzreihe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sitzreihe</em>'.
	 * @generated
	 */
	Sitzreihe createSitzreihe();

	/**
	 * Returns a new object of class '<em>Sitzplatz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sitzplatz</em>'.
	 * @generated
	 */
	Sitzplatz createSitzplatz();

	/**
	 * Returns a new object of class '<em>Reservierung</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservierung</em>'.
	 * @generated
	 */
	Reservierung createReservierung();

	/**
	 * Returns a new object of class '<em>Buchung</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buchung</em>'.
	 * @generated
	 */
	Buchung createBuchung();

	/**
	 * Returns a new object of class '<em>Aufführung</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aufführung</em>'.
	 * @generated
	 */
	Aufführung createAufführung();

	/**
	 * Returns a new object of class '<em>Statistik</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistik</em>'.
	 * @generated
	 */
	Statistik createStatistik();

	/**
	 * Returns a new object of class '<em>Film</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Film</em>'.
	 * @generated
	 */
	Film createFilm();

	/**
	 * Returns a new object of class '<em>Preismodell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preismodell</em>'.
	 * @generated
	 */
	Preismodell createPreismodell();

	/**
	 * Returns a new object of class '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admin</em>'.
	 * @generated
	 */
	Admin createAdmin();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MaxiProjektPackage getMaxiProjektPackage();

} //MaxiProjektFactory
