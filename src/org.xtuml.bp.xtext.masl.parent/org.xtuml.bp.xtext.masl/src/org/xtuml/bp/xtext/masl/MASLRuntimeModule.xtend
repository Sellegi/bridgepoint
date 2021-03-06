/*
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl

import com.google.inject.Binder
import com.google.inject.name.Names
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy
import org.eclipse.xtext.resource.containers.IAllContainersState
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.xtuml.bp.xtext.masl.lib.MASLContainerManager
import org.xtuml.bp.xtext.masl.lib.MASLDelegatingAllContainerState
import org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage
import org.xtuml.bp.xtext.masl.masl.structure.StructurePackage
import org.xtuml.bp.xtext.masl.masl.types.TypesPackage
import org.xtuml.bp.xtext.masl.parser.MASLValueConverters
import org.xtuml.bp.xtext.masl.scoping.MASLImportScopeProvider
import org.xtuml.bp.xtext.masl.scoping.MASLQualifiedNameConverter
import org.xtuml.bp.xtext.masl.scoping.MASLQualifiedNameProvider
import org.xtuml.bp.xtext.masl.scoping.MASLResourceDescriptionStrategy
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.xtuml.bp.xtext.masl.doc.MaslEObjectDocumentationProvider
import org.eclipse.xtext.validation.ConfigurableIssueCodesProvider
import org.xtuml.bp.xtext.masl.validation.MaslIssueCodesProvider
import org.xtuml.bp.xtext.masl.linking.MaslLinkingService
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionManager
import org.xtuml.bp.xtext.masl.scoping.MaslResourceDescriptionManager

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class MASLRuntimeModule extends AbstractMASLRuntimeModule {
	
	override bindIQualifiedNameProvider() {
		MASLQualifiedNameProvider
	}
	
	def Class<? extends IQualifiedNameConverter> bindIQualifiedNameConverter() {
		MASLQualifiedNameConverter
	}
	
	override configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(MASLImportScopeProvider);
	}

	override bindILinkingService() {
		MaslLinkingService
	}

	def configureIAllContainersState$Provider(Binder binder) {
		binder.bind(IAllContainersState.Provider)
			.annotatedWith(Names.named(MASLDelegatingAllContainerState.DELEGATE_BINDING))
			.to(super.bindIAllContainersState$Provider)
	}

	override bindIAllContainersState$Provider() {
		MASLDelegatingAllContainerState.Provider
	}
	
	override bindIContainer$Manager() {
		MASLContainerManager
	}
	
	def configureStructurePackage(Binder binder) {
		binder.bind(StructurePackage).toInstance(StructurePackage.eINSTANCE)
	}
	
	def configureBehaviorPackage(Binder binder) {
		binder.bind(BehaviorPackage).toInstance(BehaviorPackage.eINSTANCE)
	}
	
	def configureTypesPackage(Binder binder) {
		binder.bind(TypesPackage).toInstance(TypesPackage.eINSTANCE)
	}
	
	def Class<? extends DefaultResourceDescriptionManager> bindDefaultResourceDescriptionManager() {
		MaslResourceDescriptionManager
	}
	
	def Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		MASLResourceDescriptionStrategy
	}
	
	override bindIValueConverterService() {
		MASLValueConverters
	}
	
	def Class<? extends IEObjectDocumentationProvider> bindIEObjectDocumentationProvider() {
		MaslEObjectDocumentationProvider
	}
	
	def Class<? extends ConfigurableIssueCodesProvider> bindConfigurableIssueCodesProvider() {
		MaslIssueCodesProvider
	}
}
