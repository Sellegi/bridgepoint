/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtuml.bp.xtext.masl.masl.behavior.AbstractStatement;
import org.xtuml.bp.xtext.masl.masl.behavior.ConstExpression;
import org.xtuml.bp.xtext.masl.masl.behavior.Expression;

import org.xtuml.bp.xtext.masl.masl.structure.ObjectDeclaration;
import org.xtuml.bp.xtext.masl.masl.structure.Pragma;
import org.xtuml.bp.xtext.masl.masl.structure.Pragmatized;
import org.xtuml.bp.xtext.masl.masl.structure.StructurePackage;

import org.xtuml.bp.xtext.masl.masl.types.InstanceTypeReference;
import org.xtuml.bp.xtext.masl.masl.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.impl.InstanceTypeReferenceImpl#getPragmas <em>Pragmas</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.impl.InstanceTypeReferenceImpl#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.impl.InstanceTypeReferenceImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceTypeReferenceImpl extends AbstractTypeReferenceImpl implements InstanceTypeReference {
	/**
	 * The cached value of the '{@link #getPragmas() <em>Pragmas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPragmas()
	 * @generated
	 * @ordered
	 */
	protected EList<Pragma> pragmas;

	/**
	 * The default value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANONYMOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected boolean anonymous = ANONYMOUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected ObjectDeclaration instance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.INSTANCE_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pragma> getPragmas() {
		if (pragmas == null) {
			pragmas = new EObjectContainmentEList<Pragma>(Pragma.class, this, TypesPackage.INSTANCE_TYPE_REFERENCE__PRAGMAS);
		}
		return pragmas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnonymous() {
		return anonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymous(boolean newAnonymous) {
		boolean oldAnonymous = anonymous;
		anonymous = newAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.INSTANCE_TYPE_REFERENCE__ANONYMOUS, oldAnonymous, anonymous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDeclaration getInstance() {
		if (instance != null && instance.eIsProxy()) {
			InternalEObject oldInstance = (InternalEObject)instance;
			instance = (ObjectDeclaration)eResolveProxy(oldInstance);
			if (instance != oldInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.INSTANCE_TYPE_REFERENCE__INSTANCE, oldInstance, instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDeclaration basicGetInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(ObjectDeclaration newInstance) {
		ObjectDeclaration oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.INSTANCE_TYPE_REFERENCE__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.INSTANCE_TYPE_REFERENCE__PRAGMAS:
				return ((InternalEList<?>)getPragmas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.INSTANCE_TYPE_REFERENCE__PRAGMAS:
				return getPragmas();
			case TypesPackage.INSTANCE_TYPE_REFERENCE__ANONYMOUS:
				return isAnonymous();
			case TypesPackage.INSTANCE_TYPE_REFERENCE__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.INSTANCE_TYPE_REFERENCE__PRAGMAS:
				getPragmas().clear();
				getPragmas().addAll((Collection<? extends Pragma>)newValue);
				return;
			case TypesPackage.INSTANCE_TYPE_REFERENCE__ANONYMOUS:
				setAnonymous((Boolean)newValue);
				return;
			case TypesPackage.INSTANCE_TYPE_REFERENCE__INSTANCE:
				setInstance((ObjectDeclaration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TypesPackage.INSTANCE_TYPE_REFERENCE__PRAGMAS:
				getPragmas().clear();
				return;
			case TypesPackage.INSTANCE_TYPE_REFERENCE__ANONYMOUS:
				setAnonymous(ANONYMOUS_EDEFAULT);
				return;
			case TypesPackage.INSTANCE_TYPE_REFERENCE__INSTANCE:
				setInstance((ObjectDeclaration)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TypesPackage.INSTANCE_TYPE_REFERENCE__PRAGMAS:
				return pragmas != null && !pragmas.isEmpty();
			case TypesPackage.INSTANCE_TYPE_REFERENCE__ANONYMOUS:
				return anonymous != ANONYMOUS_EDEFAULT;
			case TypesPackage.INSTANCE_TYPE_REFERENCE__INSTANCE:
				return instance != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Pragmatized.class) {
			switch (derivedFeatureID) {
				case TypesPackage.INSTANCE_TYPE_REFERENCE__PRAGMAS: return StructurePackage.PRAGMATIZED__PRAGMAS;
				default: return -1;
			}
		}
		if (baseClass == AbstractStatement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConstExpression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Pragmatized.class) {
			switch (baseFeatureID) {
				case StructurePackage.PRAGMATIZED__PRAGMAS: return TypesPackage.INSTANCE_TYPE_REFERENCE__PRAGMAS;
				default: return -1;
			}
		}
		if (baseClass == AbstractStatement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConstExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (anonymous: ");
		result.append(anonymous);
		result.append(')');
		return result.toString();
	}

} //InstanceTypeReferenceImpl
