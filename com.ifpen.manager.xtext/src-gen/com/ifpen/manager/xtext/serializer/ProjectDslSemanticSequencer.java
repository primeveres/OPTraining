/*
 * generated by Xtext 2.9.2
 */
package com.ifpen.manager.xtext.serializer;

import com.google.inject.Inject;
import com.ifpen.manager.xtext.projectDsl.Company;
import com.ifpen.manager.xtext.projectDsl.Employee;
import com.ifpen.manager.xtext.projectDsl.Employees;
import com.ifpen.manager.xtext.projectDsl.Project;
import com.ifpen.manager.xtext.projectDsl.ProjectDslPackage;
import com.ifpen.manager.xtext.projectDsl.Task;
import com.ifpen.manager.xtext.services.ProjectDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ProjectDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ProjectDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ProjectDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ProjectDslPackage.COMPANY:
				sequence_Company(context, (Company) semanticObject); 
				return; 
			case ProjectDslPackage.EMPLOYEE:
				sequence_Employee(context, (Employee) semanticObject); 
				return; 
			case ProjectDslPackage.EMPLOYEES:
				sequence_Employees(context, (Employees) semanticObject); 
				return; 
			case ProjectDslPackage.PROJECT:
				sequence_Project(context, (Project) semanticObject); 
				return; 
			case ProjectDslPackage.TASK:
				sequence_Task(context, (Task) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Company returns Company
	 *
	 * Constraint:
	 *     (name=ID employees=Employees project=Project)
	 */
	protected void sequence_Company(ISerializationContext context, Company semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectDslPackage.Literals.COMPANY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDslPackage.Literals.COMPANY__NAME));
			if (transientValues.isValueTransient(semanticObject, ProjectDslPackage.Literals.COMPANY__EMPLOYEES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDslPackage.Literals.COMPANY__EMPLOYEES));
			if (transientValues.isValueTransient(semanticObject, ProjectDslPackage.Literals.COMPANY__PROJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDslPackage.Literals.COMPANY__PROJECT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCompanyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCompanyAccess().getEmployeesEmployeesParserRuleCall_2_0(), semanticObject.getEmployees());
		feeder.accept(grammarAccess.getCompanyAccess().getProjectProjectParserRuleCall_3_0(), semanticObject.getProject());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Employee returns Employee
	 *
	 * Constraint:
	 *     (name=ID weight=INT? height=INT?)
	 */
	protected void sequence_Employee(ISerializationContext context, Employee semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Employees returns Employees
	 *
	 * Constraint:
	 *     employees+=Employee+
	 */
	protected void sequence_Employees(ISerializationContext context, Employees semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Project returns Project
	 *
	 * Constraint:
	 *     (name=ID type=taskType tasks+=Task+)
	 */
	protected void sequence_Project(ISerializationContext context, Project semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Task returns Task
	 *
	 * Constraint:
	 *     (name=ID type=taskType)
	 */
	protected void sequence_Task(ISerializationContext context, Task semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectDslPackage.Literals.TASK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDslPackage.Literals.TASK__NAME));
			if (transientValues.isValueTransient(semanticObject, ProjectDslPackage.Literals.TASK__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDslPackage.Literals.TASK__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTaskAccess().getTypeTaskTypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
}
