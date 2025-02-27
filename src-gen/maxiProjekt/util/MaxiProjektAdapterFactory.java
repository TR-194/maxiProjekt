/**
 */
package maxiProjekt.util;

import maxiProjekt.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see maxiProjekt.MaxiProjektPackage
 * @generated
 */
public class MaxiProjektAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MaxiProjektPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxiProjektAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MaxiProjektPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaxiProjektSwitch<Adapter> modelSwitch = new MaxiProjektSwitch<Adapter>() {
		@Override
		public Adapter caseKinosaal(Kinosaal object) {
			return createKinosaalAdapter();
		}

		@Override
		public Adapter caseSitzreihe(Sitzreihe object) {
			return createSitzreiheAdapter();
		}

		@Override
		public Adapter caseSitzplatz(Sitzplatz object) {
			return createSitzplatzAdapter();
		}

		@Override
		public Adapter caseReservierung(Reservierung object) {
			return createReservierungAdapter();
		}

		@Override
		public Adapter caseBuchung(Buchung object) {
			return createBuchungAdapter();
		}

		@Override
		public Adapter caseAufführung(Aufführung object) {
			return createAufführungAdapter();
		}

		@Override
		public Adapter caseStatistik(Statistik object) {
			return createStatistikAdapter();
		}

		@Override
		public Adapter caseFilm(Film object) {
			return createFilmAdapter();
		}

		@Override
		public Adapter casePreismodell(Preismodell object) {
			return createPreismodellAdapter();
		}

		@Override
		public Adapter caseAdmin(Admin object) {
			return createAdminAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link maxiProjekt.Kinosaal <em>Kinosaal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maxiProjekt.Kinosaal
	 * @generated
	 */
	public Adapter createKinosaalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maxiProjekt.Sitzreihe <em>Sitzreihe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maxiProjekt.Sitzreihe
	 * @generated
	 */
	public Adapter createSitzreiheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maxiProjekt.Sitzplatz <em>Sitzplatz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maxiProjekt.Sitzplatz
	 * @generated
	 */
	public Adapter createSitzplatzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maxiProjekt.Reservierung <em>Reservierung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maxiProjekt.Reservierung
	 * @generated
	 */
	public Adapter createReservierungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maxiProjekt.Buchung <em>Buchung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maxiProjekt.Buchung
	 * @generated
	 */
	public Adapter createBuchungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maxiProjekt.Aufführung <em>Aufführung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maxiProjekt.Aufführung
	 * @generated
	 */
	public Adapter createAufführungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maxiProjekt.Statistik <em>Statistik</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maxiProjekt.Statistik
	 * @generated
	 */
	public Adapter createStatistikAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maxiProjekt.Film <em>Film</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maxiProjekt.Film
	 * @generated
	 */
	public Adapter createFilmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maxiProjekt.Preismodell <em>Preismodell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maxiProjekt.Preismodell
	 * @generated
	 */
	public Adapter createPreismodellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maxiProjekt.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maxiProjekt.Admin
	 * @generated
	 */
	public Adapter createAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MaxiProjektAdapterFactory
