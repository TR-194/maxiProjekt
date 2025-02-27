/**
 */
package maxiProjekt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Kategorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see maxiProjekt.MaxiProjektPackage#getKategorie()
 * @model
 * @generated
 */
public enum Kategorie implements Enumerator {
	/**
	 * The '<em><b>Parkett</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARKETT_VALUE
	 * @generated
	 * @ordered
	 */
	PARKETT(0, "Parkett", "Parkett"),

	/**
	 * The '<em><b>Loge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGE_VALUE
	 * @generated
	 * @ordered
	 */
	LOGE(1, "Loge", "Loge"),

	/**
	 * The '<em><b>Loge Mit Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGE_MIT_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	LOGE_MIT_SERVICE(2, "LogeMitService", "LogeMitService");

	/**
	 * The '<em><b>Parkett</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARKETT
	 * @model name="Parkett"
	 * @generated
	 * @ordered
	 */
	public static final int PARKETT_VALUE = 0;

	/**
	 * The '<em><b>Loge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGE
	 * @model name="Loge"
	 * @generated
	 * @ordered
	 */
	public static final int LOGE_VALUE = 1;

	/**
	 * The '<em><b>Loge Mit Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGE_MIT_SERVICE
	 * @model name="LogeMitService"
	 * @generated
	 * @ordered
	 */
	public static final int LOGE_MIT_SERVICE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Kategorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Kategorie[] VALUES_ARRAY = new Kategorie[] { PARKETT, LOGE, LOGE_MIT_SERVICE, };

	/**
	 * A public read-only list of all the '<em><b>Kategorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Kategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Kategorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Kategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Kategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kategorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Kategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Kategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kategorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Kategorie get(int value) {
		switch (value) {
		case PARKETT_VALUE:
			return PARKETT;
		case LOGE_VALUE:
			return LOGE;
		case LOGE_MIT_SERVICE_VALUE:
			return LOGE_MIT_SERVICE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Kategorie(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Kategorie
