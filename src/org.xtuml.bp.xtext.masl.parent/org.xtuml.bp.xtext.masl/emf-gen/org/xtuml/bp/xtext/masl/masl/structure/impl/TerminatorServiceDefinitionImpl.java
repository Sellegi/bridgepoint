/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.structure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtuml.bp.xtext.masl.masl.structure.AbstractService;
import org.xtuml.bp.xtext.masl.masl.structure.StructurePackage;
import org.xtuml.bp.xtext.masl.masl.structure.TerminatorDefinition;
import org.xtuml.bp.xtext.masl.masl.structure.TerminatorServiceDefinition;

import org.xtuml.bp.xtext.masl.masl.types.AbstractTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminator Service Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.TerminatorServiceDefinitionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.impl.TerminatorServiceDefinitionImpl#getTerminator <em>Terminator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminatorServiceDefinitionImpl extends AbstractActionDefinitionImpl implements TerminatorServiceDefinition {
	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected AbstractTypeReference returnType;

	/**
	 * The cached value of the '{@link #getTerminator() <em>Terminator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminator()
	 * @generated
	 * @ordered
	 */
	protected TerminatorDefinition terminator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminatorServiceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.TERMINATOR_SERVICE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeReference getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(AbstractTypeReference newReturnType, NotificationChain msgs) {
		AbstractTypeReference oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.TERMINATOR_SERVICE_DEFINITION__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(AbstractTypeReference newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.TERMINATOR_SERVICE_DEFINITION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.TERMINATOR_SERVICE_DEFINITION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.TERMINATOR_SERVICE_DEFINITION__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminatorDefinition getTerminator() {
		if (terminator != null && terminator.eIsProxy()) {
			InternalEObject oldTerminator = (InternalEObject)terminator;
			terminator = (TerminatorDefinition)eResolveProxy(oldTerminator);
			if (terminator != oldTerminator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.TERMINATOR_SERVICE_DEFINITION__TERMINATOR, oldTerminator, terminator));
			}
		}
		return terminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminatorDefinition basicGetTerminator() {
		return terminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminator(TerminatorDefinition newTerminator) {
		TerminatorDefinition oldTerminator = terminator;
		terminator = newTerminator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.TERMINATOR_SERVICE_DEFINITION__TERMINATOR, oldTerminator, terminator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.TERMINATOR_SERVICE_DEFINITION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
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
			case StructurePackage.TERMINATOR_SERVICE_DEFINITION__RETURN_TYPE:
				return getReturnType();
			case StructurePackage.TERMINATOR_SERVICE_DEFINITION__TERMINATOR:
				if (resolve) return getTerminator();
				return basicGetTerminator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructurePackage.TERMINATOR_SERVICE_DEFINITION__RETURN_TYPE:
				setReturnType((AbstractTypeReference)newValue);
				return;
			case StructurePackage.TERMINATOR_SERVICE_DEFINITION__TERMINATOR:
				setTerminator((TerminatorDefinition)newValue);
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
			case StructurePackage.TERMINATOR_SERVICE_DEFINITION__RETURN_TYPE:
				setReturnType((AbstractTypeReference)null);
				return;
			case StructurePackage.TERMINATOR_SERVICE_DEFINITION__TERMINATOR:
				setTerminator((TerminatorDefinition)null);
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
			case StructurePackage.TERMINATOR_SERVICE_DEFINITION__RETURN_TYPE:
				return returnType != null;
			case StructurePackage.TERMINATOR_SERVICE_DEFINITION__TERMINATOR:
				return terminator != null;
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
		if (baseClass == AbstractService.class) {
			switch (derivedFeatureID) {
				case StructurePackage.TERMINATOR_SERVICE_DEFINITION__RETURN_TYPE: return StructurePackage.ABSTRACT_SERVICE__RETURN_TYPE;
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
		if (baseClass == AbstractService.class) {
			switch (baseFeatureID) {
				case StructurePackage.ABSTRACT_SERVICE__RETURN_TYPE: return StructurePackage.TERMINATOR_SERVICE_DEFINITION__RETURN_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TerminatorServiceDefinitionImpl
