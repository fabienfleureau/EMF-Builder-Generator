package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.StateMachine</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class StateMachineBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.StateMachine> {
  // features and builders
  private org.eclipse.uml2.uml.Behavior m_classifierBehavior;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> m_featureClassifierBehaviorBuilder;
  private Boolean m_isAbstract;
  private Boolean m_isActive;
  private Boolean m_isLeaf;
  private Boolean m_isReentrant;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.TemplateSignature m_ownedTemplateSignature;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateSignature> m_featureOwnedTemplateSignatureBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_owningTemplateParameter;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> m_featureOwningTemplateParameterBuilder;
  private org.eclipse.uml2.uml.CollaborationUse m_representation;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.CollaborationUse> m_featureRepresentationBuilder;
  private org.eclipse.uml2.uml.BehavioralFeature m_specification;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.BehavioralFeature> m_featureSpecificationBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_templateParameter;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> m_featureTemplateParameterBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>>();
  private java.util.Collection<org.eclipse.uml2.uml.CollaborationUse> m_collaborationUse = new java.util.LinkedList<org.eclipse.uml2.uml.CollaborationUse>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.CollaborationUse>> m_featureCollaborationUseBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.CollaborationUse>>();
  private java.util.Collection<org.eclipse.uml2.uml.Pseudostate> m_connectionPoint = new java.util.LinkedList<org.eclipse.uml2.uml.Pseudostate>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate>> m_featureConnectionPointBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.ElementImport> m_elementImport = new java.util.LinkedList<org.eclipse.uml2.uml.ElementImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ElementImport>> m_featureElementImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ElementImport>>();
  private java.util.Collection<org.eclipse.uml2.uml.StateMachine> m_extendedStateMachine = new java.util.LinkedList<org.eclipse.uml2.uml.StateMachine>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StateMachine>> m_featureExtendedStateMachineBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StateMachine>>();
  private java.util.Collection<org.eclipse.uml2.uml.Generalization> m_generalization = new java.util.LinkedList<org.eclipse.uml2.uml.Generalization>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Generalization>> m_featureGeneralizationBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Generalization>>();
  private java.util.Collection<org.eclipse.uml2.uml.InterfaceRealization> m_interfaceRealization = new java.util.LinkedList<org.eclipse.uml2.uml.InterfaceRealization>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterfaceRealization>> m_featureInterfaceRealizationBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterfaceRealization>>();
  private java.util.Collection<org.eclipse.uml2.uml.Classifier> m_nestedClassifier = new java.util.LinkedList<org.eclipse.uml2.uml.Classifier>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier>> m_featureNestedClassifierBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier>>();
  private java.util.Collection<org.eclipse.uml2.uml.Property> m_ownedAttribute = new java.util.LinkedList<org.eclipse.uml2.uml.Property>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Property>> m_featureOwnedAttributeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Property>>();
  private java.util.Collection<org.eclipse.uml2.uml.Behavior> m_ownedBehavior = new java.util.LinkedList<org.eclipse.uml2.uml.Behavior>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior>> m_featureOwnedBehaviorBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  private java.util.Collection<org.eclipse.uml2.uml.Connector> m_ownedConnector = new java.util.LinkedList<org.eclipse.uml2.uml.Connector>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Connector>> m_featureOwnedConnectorBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Connector>>();
  private java.util.Collection<org.eclipse.uml2.uml.Operation> m_ownedOperation = new java.util.LinkedList<org.eclipse.uml2.uml.Operation>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Operation>> m_featureOwnedOperationBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Operation>>();
  private java.util.Collection<org.eclipse.uml2.uml.Parameter> m_ownedParameter = new java.util.LinkedList<org.eclipse.uml2.uml.Parameter>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Parameter>> m_featureOwnedParameterBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Parameter>>();
  private java.util.Collection<org.eclipse.uml2.uml.ParameterSet> m_ownedParameterSet = new java.util.LinkedList<org.eclipse.uml2.uml.ParameterSet>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterSet>> m_featureOwnedParameterSetBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterSet>>();
  private java.util.Collection<org.eclipse.uml2.uml.Reception> m_ownedReception = new java.util.LinkedList<org.eclipse.uml2.uml.Reception>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Reception>> m_featureOwnedReceptionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Reception>>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_ownedRule = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>> m_featureOwnedRuleBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>>();
  private java.util.Collection<org.eclipse.uml2.uml.Trigger> m_ownedTrigger = new java.util.LinkedList<org.eclipse.uml2.uml.Trigger>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger>> m_featureOwnedTriggerBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger>>();
  private java.util.Collection<org.eclipse.uml2.uml.UseCase> m_ownedUseCase = new java.util.LinkedList<org.eclipse.uml2.uml.UseCase>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase>> m_featureOwnedUseCaseBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase>>();
  private java.util.Collection<org.eclipse.uml2.uml.PackageImport> m_packageImport = new java.util.LinkedList<org.eclipse.uml2.uml.PackageImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageImport>> m_featurePackageImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageImport>>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_postcondition = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>> m_featurePostconditionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>>();
  private java.util.Collection<org.eclipse.uml2.uml.GeneralizationSet> m_powertypeExtent = new java.util.LinkedList<org.eclipse.uml2.uml.GeneralizationSet>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralizationSet>> m_featurePowertypeExtentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralizationSet>>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_precondition = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>> m_featurePreconditionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>>();
  private java.util.Collection<org.eclipse.uml2.uml.Behavior> m_redefinedBehavior = new java.util.LinkedList<org.eclipse.uml2.uml.Behavior>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior>> m_featureRedefinedBehaviorBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior>>();
  private java.util.Collection<org.eclipse.uml2.uml.Classifier> m_redefinedClassifier = new java.util.LinkedList<org.eclipse.uml2.uml.Classifier>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier>> m_featureRedefinedClassifierBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier>>();
  private java.util.Collection<org.eclipse.uml2.uml.Region> m_region = new java.util.LinkedList<org.eclipse.uml2.uml.Region>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Region>> m_featureRegionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Region>>();
  private java.util.Collection<org.eclipse.uml2.uml.State> m_submachineState = new java.util.LinkedList<org.eclipse.uml2.uml.State>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.State>> m_featureSubmachineStateBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.State>>();
  private java.util.Collection<org.eclipse.uml2.uml.Substitution> m_substitution = new java.util.LinkedList<org.eclipse.uml2.uml.Substitution>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Substitution>> m_featureSubstitutionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Substitution>>();
  private java.util.Collection<org.eclipse.uml2.uml.TemplateBinding> m_templateBinding = new java.util.LinkedList<org.eclipse.uml2.uml.TemplateBinding>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateBinding>> m_featureTemplateBindingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateBinding>>();
  private java.util.Collection<org.eclipse.uml2.uml.UseCase> m_useCase = new java.util.LinkedList<org.eclipse.uml2.uml.UseCase>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase>> m_featureUseCaseBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase>>();
  // helper attributes
  private boolean m_featureClassifierBehaviorSet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureCollaborationUseSet = false;
  private boolean m_featureConnectionPointSet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureElementImportSet = false;
  private boolean m_featureExtendedStateMachineSet = false;
  private boolean m_featureGeneralizationSet = false;
  private boolean m_featureInterfaceRealizationSet = false;
  private boolean m_featureIsAbstractSet = false;
  private boolean m_featureIsActiveSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureIsReentrantSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureNestedClassifierSet = false;
  private boolean m_featureOwnedAttributeSet = false;
  private boolean m_featureOwnedBehaviorSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwnedConnectorSet = false;
  private boolean m_featureOwnedOperationSet = false;
  private boolean m_featureOwnedParameterSet = false;
  private boolean m_featureOwnedParameterSetSet = false;
  private boolean m_featureOwnedReceptionSet = false;
  private boolean m_featureOwnedRuleSet = false;
  private boolean m_featureOwnedTemplateSignatureSet = false;
  private boolean m_featureOwnedTriggerSet = false;
  private boolean m_featureOwnedUseCaseSet = false;
  private boolean m_featureOwningTemplateParameterSet = false;
  private boolean m_featurePackageImportSet = false;
  private boolean m_featurePostconditionSet = false;
  private boolean m_featurePowertypeExtentSet = false;
  private boolean m_featurePreconditionSet = false;
  private boolean m_featureRedefinedBehaviorSet = false;
  private boolean m_featureRedefinedClassifierSet = false;
  private boolean m_featureRegionSet = false;
  private boolean m_featureRepresentationSet = false;
  private boolean m_featureSpecificationSet = false;
  private boolean m_featureSubmachineStateSet = false;
  private boolean m_featureSubstitutionSet = false;
  private boolean m_featureTemplateBindingSet = false;
  private boolean m_featureTemplateParameterSet = false;
  private boolean m_featureUseCaseSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newStateMachineBuilder()
   */
  private StateMachineBuilder() {
  }

  /**
   * This method creates a new instance of the StateMachineBuilder.
   * @return new instance of the StateMachineBuilder
   */
  public static StateMachineBuilder newStateMachineBuilder() {
    return new StateMachineBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public StateMachineBuilder but() {
    StateMachineBuilder _builder = newStateMachineBuilder();
    _builder.m_featureClassifierBehaviorSet = m_featureClassifierBehaviorSet;
    _builder.m_classifierBehavior = m_classifierBehavior;
    _builder.m_featureClassifierBehaviorBuilder = m_featureClassifierBehaviorBuilder;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureCollaborationUseSet = m_featureCollaborationUseSet;
    _builder.m_collaborationUse = m_collaborationUse;
    _builder.m_featureCollaborationUseBuilder = m_featureCollaborationUseBuilder;
    _builder.m_featureConnectionPointSet = m_featureConnectionPointSet;
    _builder.m_connectionPoint = m_connectionPoint;
    _builder.m_featureConnectionPointBuilder = m_featureConnectionPointBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureElementImportSet = m_featureElementImportSet;
    _builder.m_elementImport = m_elementImport;
    _builder.m_featureElementImportBuilder = m_featureElementImportBuilder;
    _builder.m_featureExtendedStateMachineSet = m_featureExtendedStateMachineSet;
    _builder.m_extendedStateMachine = m_extendedStateMachine;
    _builder.m_featureExtendedStateMachineBuilder = m_featureExtendedStateMachineBuilder;
    _builder.m_featureGeneralizationSet = m_featureGeneralizationSet;
    _builder.m_generalization = m_generalization;
    _builder.m_featureGeneralizationBuilder = m_featureGeneralizationBuilder;
    _builder.m_featureInterfaceRealizationSet = m_featureInterfaceRealizationSet;
    _builder.m_interfaceRealization = m_interfaceRealization;
    _builder.m_featureInterfaceRealizationBuilder = m_featureInterfaceRealizationBuilder;
    _builder.m_featureIsAbstractSet = m_featureIsAbstractSet;
    _builder.m_isAbstract = m_isAbstract;
    _builder.m_featureIsActiveSet = m_featureIsActiveSet;
    _builder.m_isActive = m_isActive;
    _builder.m_featureIsLeafSet = m_featureIsLeafSet;
    _builder.m_isLeaf = m_isLeaf;
    _builder.m_featureIsReentrantSet = m_featureIsReentrantSet;
    _builder.m_isReentrant = m_isReentrant;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureNestedClassifierSet = m_featureNestedClassifierSet;
    _builder.m_nestedClassifier = m_nestedClassifier;
    _builder.m_featureNestedClassifierBuilder = m_featureNestedClassifierBuilder;
    _builder.m_featureOwnedAttributeSet = m_featureOwnedAttributeSet;
    _builder.m_ownedAttribute = m_ownedAttribute;
    _builder.m_featureOwnedAttributeBuilder = m_featureOwnedAttributeBuilder;
    _builder.m_featureOwnedBehaviorSet = m_featureOwnedBehaviorSet;
    _builder.m_ownedBehavior = m_ownedBehavior;
    _builder.m_featureOwnedBehaviorBuilder = m_featureOwnedBehaviorBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwnedConnectorSet = m_featureOwnedConnectorSet;
    _builder.m_ownedConnector = m_ownedConnector;
    _builder.m_featureOwnedConnectorBuilder = m_featureOwnedConnectorBuilder;
    _builder.m_featureOwnedOperationSet = m_featureOwnedOperationSet;
    _builder.m_ownedOperation = m_ownedOperation;
    _builder.m_featureOwnedOperationBuilder = m_featureOwnedOperationBuilder;
    _builder.m_featureOwnedParameterSet = m_featureOwnedParameterSet;
    _builder.m_ownedParameter = m_ownedParameter;
    _builder.m_featureOwnedParameterBuilder = m_featureOwnedParameterBuilder;
    _builder.m_featureOwnedParameterSetSet = m_featureOwnedParameterSetSet;
    _builder.m_ownedParameterSet = m_ownedParameterSet;
    _builder.m_featureOwnedParameterSetBuilder = m_featureOwnedParameterSetBuilder;
    _builder.m_featureOwnedReceptionSet = m_featureOwnedReceptionSet;
    _builder.m_ownedReception = m_ownedReception;
    _builder.m_featureOwnedReceptionBuilder = m_featureOwnedReceptionBuilder;
    _builder.m_featureOwnedRuleSet = m_featureOwnedRuleSet;
    _builder.m_ownedRule = m_ownedRule;
    _builder.m_featureOwnedRuleBuilder = m_featureOwnedRuleBuilder;
    _builder.m_featureOwnedTemplateSignatureSet = m_featureOwnedTemplateSignatureSet;
    _builder.m_ownedTemplateSignature = m_ownedTemplateSignature;
    _builder.m_featureOwnedTemplateSignatureBuilder = m_featureOwnedTemplateSignatureBuilder;
    _builder.m_featureOwnedTriggerSet = m_featureOwnedTriggerSet;
    _builder.m_ownedTrigger = m_ownedTrigger;
    _builder.m_featureOwnedTriggerBuilder = m_featureOwnedTriggerBuilder;
    _builder.m_featureOwnedUseCaseSet = m_featureOwnedUseCaseSet;
    _builder.m_ownedUseCase = m_ownedUseCase;
    _builder.m_featureOwnedUseCaseBuilder = m_featureOwnedUseCaseBuilder;
    _builder.m_featureOwningTemplateParameterSet = m_featureOwningTemplateParameterSet;
    _builder.m_owningTemplateParameter = m_owningTemplateParameter;
    _builder.m_featureOwningTemplateParameterBuilder = m_featureOwningTemplateParameterBuilder;
    _builder.m_featurePackageImportSet = m_featurePackageImportSet;
    _builder.m_packageImport = m_packageImport;
    _builder.m_featurePackageImportBuilder = m_featurePackageImportBuilder;
    _builder.m_featurePostconditionSet = m_featurePostconditionSet;
    _builder.m_postcondition = m_postcondition;
    _builder.m_featurePostconditionBuilder = m_featurePostconditionBuilder;
    _builder.m_featurePowertypeExtentSet = m_featurePowertypeExtentSet;
    _builder.m_powertypeExtent = m_powertypeExtent;
    _builder.m_featurePowertypeExtentBuilder = m_featurePowertypeExtentBuilder;
    _builder.m_featurePreconditionSet = m_featurePreconditionSet;
    _builder.m_precondition = m_precondition;
    _builder.m_featurePreconditionBuilder = m_featurePreconditionBuilder;
    _builder.m_featureRedefinedBehaviorSet = m_featureRedefinedBehaviorSet;
    _builder.m_redefinedBehavior = m_redefinedBehavior;
    _builder.m_featureRedefinedBehaviorBuilder = m_featureRedefinedBehaviorBuilder;
    _builder.m_featureRedefinedClassifierSet = m_featureRedefinedClassifierSet;
    _builder.m_redefinedClassifier = m_redefinedClassifier;
    _builder.m_featureRedefinedClassifierBuilder = m_featureRedefinedClassifierBuilder;
    _builder.m_featureRegionSet = m_featureRegionSet;
    _builder.m_region = m_region;
    _builder.m_featureRegionBuilder = m_featureRegionBuilder;
    _builder.m_featureRepresentationSet = m_featureRepresentationSet;
    _builder.m_representation = m_representation;
    _builder.m_featureRepresentationBuilder = m_featureRepresentationBuilder;
    _builder.m_featureSpecificationSet = m_featureSpecificationSet;
    _builder.m_specification = m_specification;
    _builder.m_featureSpecificationBuilder = m_featureSpecificationBuilder;
    _builder.m_featureSubmachineStateSet = m_featureSubmachineStateSet;
    _builder.m_submachineState = m_submachineState;
    _builder.m_featureSubmachineStateBuilder = m_featureSubmachineStateBuilder;
    _builder.m_featureSubstitutionSet = m_featureSubstitutionSet;
    _builder.m_substitution = m_substitution;
    _builder.m_featureSubstitutionBuilder = m_featureSubstitutionBuilder;
    _builder.m_featureTemplateBindingSet = m_featureTemplateBindingSet;
    _builder.m_templateBinding = m_templateBinding;
    _builder.m_featureTemplateBindingBuilder = m_featureTemplateBindingBuilder;
    _builder.m_featureTemplateParameterSet = m_featureTemplateParameterSet;
    _builder.m_templateParameter = m_templateParameter;
    _builder.m_featureTemplateParameterBuilder = m_featureTemplateParameterBuilder;
    _builder.m_featureUseCaseSet = m_featureUseCaseSet;
    _builder.m_useCase = m_useCase;
    _builder.m_featureUseCaseBuilder = m_featureUseCaseBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.StateMachine type.
   * @return new instance of the org.eclipse.uml2.uml.StateMachine type
   */
  public org.eclipse.uml2.uml.StateMachine build() {
    final org.eclipse.uml2.uml.StateMachine _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createStateMachine();
    if (m_featureClassifierBehaviorSet) {
      _newInstance.setClassifierBehavior(m_classifierBehavior);
    } else {
      if (m_featureClassifierBehaviorBuilder != null) {
        _newInstance.setClassifierBehavior(m_featureClassifierBehaviorBuilder.build());
      }
    }
    if (m_featureIsAbstractSet) {
      _newInstance.setIsAbstract(m_isAbstract);
    }
    if (m_featureIsActiveSet) {
      _newInstance.setIsActive(m_isActive);
    }
    if (m_featureIsLeafSet) {
      _newInstance.setIsLeaf(m_isLeaf);
    }
    if (m_featureIsReentrantSet) {
      _newInstance.setIsReentrant(m_isReentrant);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureNameExpressionSet) {
      _newInstance.setNameExpression(m_nameExpression);
    } else {
      if (m_featureNameExpressionBuilder != null) {
        _newInstance.setNameExpression(m_featureNameExpressionBuilder.build());
      }
    }
    if (m_featureOwnedTemplateSignatureSet) {
      _newInstance.setOwnedTemplateSignature(m_ownedTemplateSignature);
    } else {
      if (m_featureOwnedTemplateSignatureBuilder != null) {
        _newInstance.setOwnedTemplateSignature(m_featureOwnedTemplateSignatureBuilder.build());
      }
    }
    if (m_featureOwningTemplateParameterSet) {
      _newInstance.setOwningTemplateParameter(m_owningTemplateParameter);
    } else {
      if (m_featureOwningTemplateParameterBuilder != null) {
        _newInstance.setOwningTemplateParameter(m_featureOwningTemplateParameterBuilder.build());
      }
    }
    if (m_featureRepresentationSet) {
      _newInstance.setRepresentation(m_representation);
    } else {
      if (m_featureRepresentationBuilder != null) {
        _newInstance.setRepresentation(m_featureRepresentationBuilder.build());
      }
    }
    if (m_featureSpecificationSet) {
      _newInstance.setSpecification(m_specification);
    } else {
      if (m_featureSpecificationBuilder != null) {
        _newInstance.setSpecification(m_featureSpecificationBuilder.build());
      }
    }
    if (m_featureTemplateParameterSet) {
      _newInstance.setTemplateParameter(m_templateParameter);
    } else {
      if (m_featureTemplateParameterBuilder != null) {
        _newInstance.setTemplateParameter(m_featureTemplateParameterBuilder.build());
      }
    }
    if (m_featureVisibilitySet) {
      _newInstance.setVisibility(m_visibility);
    }
    if (m_featureClientDependencySet) {
      _newInstance.getClientDependencies().addAll(m_clientDependency);
    } else {
      if (!m_featureClientDependencyBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> builder : m_featureClientDependencyBuilder) {
          _newInstance.getClientDependencies().add(builder.build());
        }
      }
    }
    if (m_featureCollaborationUseSet) {
      _newInstance.getCollaborationUses().addAll(m_collaborationUse);
    } else {
      if (!m_featureCollaborationUseBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.CollaborationUse> builder : m_featureCollaborationUseBuilder) {
          _newInstance.getCollaborationUses().add(builder.build());
        }
      }
    }
    if (m_featureConnectionPointSet) {
      _newInstance.getConnectionPoints().addAll(m_connectionPoint);
    } else {
      if (!m_featureConnectionPointBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate> builder : m_featureConnectionPointBuilder) {
          _newInstance.getConnectionPoints().add(builder.build());
        }
      }
    }
    if (m_featureEAnnotationsSet) {
      _newInstance.getEAnnotations().addAll(m_eAnnotations);
    } else {
      if (!m_featureEAnnotationsBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> builder : m_featureEAnnotationsBuilder) {
          _newInstance.getEAnnotations().add(builder.build());
        }
      }
    }
    if (m_featureElementImportSet) {
      _newInstance.getElementImports().addAll(m_elementImport);
    } else {
      if (!m_featureElementImportBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ElementImport> builder : m_featureElementImportBuilder) {
          _newInstance.getElementImports().add(builder.build());
        }
      }
    }
    if (m_featureExtendedStateMachineSet) {
      _newInstance.getExtendedStateMachines().addAll(m_extendedStateMachine);
    } else {
      if (!m_featureExtendedStateMachineBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StateMachine> builder : m_featureExtendedStateMachineBuilder) {
          _newInstance.getExtendedStateMachines().add(builder.build());
        }
      }
    }
    if (m_featureGeneralizationSet) {
      _newInstance.getGeneralizations().addAll(m_generalization);
    } else {
      if (!m_featureGeneralizationBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Generalization> builder : m_featureGeneralizationBuilder) {
          _newInstance.getGeneralizations().add(builder.build());
        }
      }
    }
    if (m_featureInterfaceRealizationSet) {
      _newInstance.getInterfaceRealizations().addAll(m_interfaceRealization);
    } else {
      if (!m_featureInterfaceRealizationBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterfaceRealization> builder : m_featureInterfaceRealizationBuilder) {
          _newInstance.getInterfaceRealizations().add(builder.build());
        }
      }
    }
    if (m_featureNestedClassifierSet) {
      _newInstance.getNestedClassifiers().addAll(m_nestedClassifier);
    } else {
      if (!m_featureNestedClassifierBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier> builder : m_featureNestedClassifierBuilder) {
          _newInstance.getNestedClassifiers().add(builder.build());
        }
      }
    }
    if (m_featureOwnedAttributeSet) {
      _newInstance.getOwnedAttributes().addAll(m_ownedAttribute);
    } else {
      if (!m_featureOwnedAttributeBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Property> builder : m_featureOwnedAttributeBuilder) {
          _newInstance.getOwnedAttributes().add(builder.build());
        }
      }
    }
    if (m_featureOwnedBehaviorSet) {
      _newInstance.getOwnedBehaviors().addAll(m_ownedBehavior);
    } else {
      if (!m_featureOwnedBehaviorBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> builder : m_featureOwnedBehaviorBuilder) {
          _newInstance.getOwnedBehaviors().add(builder.build());
        }
      }
    }
    if (m_featureOwnedCommentSet) {
      _newInstance.getOwnedComments().addAll(m_ownedComment);
    } else {
      if (!m_featureOwnedCommentBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> builder : m_featureOwnedCommentBuilder) {
          _newInstance.getOwnedComments().add(builder.build());
        }
      }
    }
    if (m_featureOwnedConnectorSet) {
      _newInstance.getOwnedConnectors().addAll(m_ownedConnector);
    } else {
      if (!m_featureOwnedConnectorBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Connector> builder : m_featureOwnedConnectorBuilder) {
          _newInstance.getOwnedConnectors().add(builder.build());
        }
      }
    }
    if (m_featureOwnedOperationSet) {
      _newInstance.getOwnedOperations().addAll(m_ownedOperation);
    } else {
      if (!m_featureOwnedOperationBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Operation> builder : m_featureOwnedOperationBuilder) {
          _newInstance.getOwnedOperations().add(builder.build());
        }
      }
    }
    if (m_featureOwnedParameterSet) {
      _newInstance.getOwnedParameters().addAll(m_ownedParameter);
    } else {
      if (!m_featureOwnedParameterBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Parameter> builder : m_featureOwnedParameterBuilder) {
          _newInstance.getOwnedParameters().add(builder.build());
        }
      }
    }
    if (m_featureOwnedParameterSetSet) {
      _newInstance.getOwnedParameterSets().addAll(m_ownedParameterSet);
    } else {
      if (!m_featureOwnedParameterSetBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterSet> builder : m_featureOwnedParameterSetBuilder) {
          _newInstance.getOwnedParameterSets().add(builder.build());
        }
      }
    }
    if (m_featureOwnedReceptionSet) {
      _newInstance.getOwnedReceptions().addAll(m_ownedReception);
    } else {
      if (!m_featureOwnedReceptionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Reception> builder : m_featureOwnedReceptionBuilder) {
          _newInstance.getOwnedReceptions().add(builder.build());
        }
      }
    }
    if (m_featureOwnedRuleSet) {
      _newInstance.getOwnedRules().addAll(m_ownedRule);
    } else {
      if (!m_featureOwnedRuleBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> builder : m_featureOwnedRuleBuilder) {
          _newInstance.getOwnedRules().add(builder.build());
        }
      }
    }
    if (m_featureOwnedTriggerSet) {
      _newInstance.getOwnedTriggers().addAll(m_ownedTrigger);
    } else {
      if (!m_featureOwnedTriggerBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger> builder : m_featureOwnedTriggerBuilder) {
          _newInstance.getOwnedTriggers().add(builder.build());
        }
      }
    }
    if (m_featureOwnedUseCaseSet) {
      _newInstance.getOwnedUseCases().addAll(m_ownedUseCase);
    } else {
      if (!m_featureOwnedUseCaseBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase> builder : m_featureOwnedUseCaseBuilder) {
          _newInstance.getOwnedUseCases().add(builder.build());
        }
      }
    }
    if (m_featurePackageImportSet) {
      _newInstance.getPackageImports().addAll(m_packageImport);
    } else {
      if (!m_featurePackageImportBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageImport> builder : m_featurePackageImportBuilder) {
          _newInstance.getPackageImports().add(builder.build());
        }
      }
    }
    if (m_featurePostconditionSet) {
      _newInstance.getPostconditions().addAll(m_postcondition);
    } else {
      if (!m_featurePostconditionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> builder : m_featurePostconditionBuilder) {
          _newInstance.getPostconditions().add(builder.build());
        }
      }
    }
    if (m_featurePowertypeExtentSet) {
      _newInstance.getPowertypeExtents().addAll(m_powertypeExtent);
    } else {
      if (!m_featurePowertypeExtentBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralizationSet> builder : m_featurePowertypeExtentBuilder) {
          _newInstance.getPowertypeExtents().add(builder.build());
        }
      }
    }
    if (m_featurePreconditionSet) {
      _newInstance.getPreconditions().addAll(m_precondition);
    } else {
      if (!m_featurePreconditionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> builder : m_featurePreconditionBuilder) {
          _newInstance.getPreconditions().add(builder.build());
        }
      }
    }
    if (m_featureRedefinedBehaviorSet) {
      _newInstance.getRedefinedBehaviors().addAll(m_redefinedBehavior);
    } else {
      if (!m_featureRedefinedBehaviorBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> builder : m_featureRedefinedBehaviorBuilder) {
          _newInstance.getRedefinedBehaviors().add(builder.build());
        }
      }
    }
    if (m_featureRedefinedClassifierSet) {
      _newInstance.getRedefinedClassifiers().addAll(m_redefinedClassifier);
    } else {
      if (!m_featureRedefinedClassifierBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier> builder : m_featureRedefinedClassifierBuilder) {
          _newInstance.getRedefinedClassifiers().add(builder.build());
        }
      }
    }
    if (m_featureRegionSet) {
      _newInstance.getRegions().addAll(m_region);
    } else {
      if (!m_featureRegionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Region> builder : m_featureRegionBuilder) {
          _newInstance.getRegions().add(builder.build());
        }
      }
    }
    if (m_featureSubmachineStateSet) {
      _newInstance.getSubmachineStates().addAll(m_submachineState);
    } else {
      if (!m_featureSubmachineStateBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.State> builder : m_featureSubmachineStateBuilder) {
          _newInstance.getSubmachineStates().add(builder.build());
        }
      }
    }
    if (m_featureSubstitutionSet) {
      _newInstance.getSubstitutions().addAll(m_substitution);
    } else {
      if (!m_featureSubstitutionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Substitution> builder : m_featureSubstitutionBuilder) {
          _newInstance.getSubstitutions().add(builder.build());
        }
      }
    }
    if (m_featureTemplateBindingSet) {
      _newInstance.getTemplateBindings().addAll(m_templateBinding);
    } else {
      if (!m_featureTemplateBindingBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateBinding> builder : m_featureTemplateBindingBuilder) {
          _newInstance.getTemplateBindings().add(builder.build());
        }
      }
    }
    if (m_featureUseCaseSet) {
      _newInstance.getUseCases().addAll(m_useCase);
    } else {
      if (!m_featureUseCaseBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase> builder : m_featureUseCaseBuilder) {
          _newInstance.getUseCases().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public StateMachineBuilder withClassifierBehavior(org.eclipse.uml2.uml.Behavior p_classifierBehavior) {
    m_classifierBehavior = p_classifierBehavior;
    m_featureClassifierBehaviorSet = true;
    return this;
  }

  public StateMachineBuilder withClassifierBehavior(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> p_behaviorBuilder) {
    m_featureClassifierBehaviorBuilder = p_behaviorBuilder;
    return this;
  }

  public StateMachineBuilder withIsAbstract(Boolean p_isAbstract) {
    m_isAbstract = p_isAbstract;
    m_featureIsAbstractSet = true;
    return this;
  }

  public StateMachineBuilder withIsActive(Boolean p_isActive) {
    m_isActive = p_isActive;
    m_featureIsActiveSet = true;
    return this;
  }

  public StateMachineBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public StateMachineBuilder withIsReentrant(Boolean p_isReentrant) {
    m_isReentrant = p_isReentrant;
    m_featureIsReentrantSet = true;
    return this;
  }

  public StateMachineBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public StateMachineBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public StateMachineBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public StateMachineBuilder withOwnedTemplateSignature(org.eclipse.uml2.uml.TemplateSignature p_ownedTemplateSignature) {
    m_ownedTemplateSignature = p_ownedTemplateSignature;
    m_featureOwnedTemplateSignatureSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedTemplateSignature(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateSignature> p_templateSignatureBuilder) {
    m_featureOwnedTemplateSignatureBuilder = p_templateSignatureBuilder;
    return this;
  }

  public StateMachineBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_owningTemplateParameter) {
    m_owningTemplateParameter = p_owningTemplateParameter;
    m_featureOwningTemplateParameterSet = true;
    return this;
  }

  public StateMachineBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> p_templateParameterBuilder) {
    m_featureOwningTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public StateMachineBuilder withRepresentation(org.eclipse.uml2.uml.CollaborationUse p_representation) {
    m_representation = p_representation;
    m_featureRepresentationSet = true;
    return this;
  }

  public StateMachineBuilder withRepresentation(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.CollaborationUse> p_collaborationUseBuilder) {
    m_featureRepresentationBuilder = p_collaborationUseBuilder;
    return this;
  }

  public StateMachineBuilder withSpecification(org.eclipse.uml2.uml.BehavioralFeature p_specification) {
    m_specification = p_specification;
    m_featureSpecificationSet = true;
    return this;
  }

  public StateMachineBuilder withSpecification(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.BehavioralFeature> p_behavioralFeatureBuilder) {
    m_featureSpecificationBuilder = p_behavioralFeatureBuilder;
    return this;
  }

  public StateMachineBuilder withTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_templateParameter) {
    m_templateParameter = p_templateParameter;
    m_featureTemplateParameterSet = true;
    return this;
  }

  public StateMachineBuilder withTemplateParameter(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> p_templateParameterBuilder) {
    m_featureTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public StateMachineBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public StateMachineBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public StateMachineBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public StateMachineBuilder withClientDependency(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public StateMachineBuilder withCollaborationUse(org.eclipse.uml2.uml.CollaborationUse p_collaborationUse) {
    m_collaborationUse.add(p_collaborationUse);
    m_featureCollaborationUseSet = true;
    return this;
  }

  public StateMachineBuilder withCollaborationUse(java.util.Collection<? extends org.eclipse.uml2.uml.CollaborationUse> p_collaborationUse) {
    m_collaborationUse.addAll(p_collaborationUse);
    m_featureCollaborationUseSet = true;
    return this;
  }

  public StateMachineBuilder withCollaborationUse(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.CollaborationUse> p_collaborationUseBuilder) {
    m_featureCollaborationUseBuilder.add(p_collaborationUseBuilder);
    return this;
  }

  public StateMachineBuilder withConnectionPoint(org.eclipse.uml2.uml.Pseudostate p_connectionPoint) {
    m_connectionPoint.add(p_connectionPoint);
    m_featureConnectionPointSet = true;
    return this;
  }

  public StateMachineBuilder withConnectionPoint(java.util.Collection<? extends org.eclipse.uml2.uml.Pseudostate> p_connectionPoint) {
    m_connectionPoint.addAll(p_connectionPoint);
    m_featureConnectionPointSet = true;
    return this;
  }

  public StateMachineBuilder withConnectionPoint(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate> p_pseudostateBuilder) {
    m_featureConnectionPointBuilder.add(p_pseudostateBuilder);
    return this;
  }

  public StateMachineBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public StateMachineBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public StateMachineBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public StateMachineBuilder withElementImport(org.eclipse.uml2.uml.ElementImport p_elementImport) {
    m_elementImport.add(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public StateMachineBuilder withElementImport(java.util.Collection<? extends org.eclipse.uml2.uml.ElementImport> p_elementImport) {
    m_elementImport.addAll(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public StateMachineBuilder withElementImport(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ElementImport> p_elementImportBuilder) {
    m_featureElementImportBuilder.add(p_elementImportBuilder);
    return this;
  }

  public StateMachineBuilder withExtendedStateMachine(org.eclipse.uml2.uml.StateMachine p_extendedStateMachine) {
    m_extendedStateMachine.add(p_extendedStateMachine);
    m_featureExtendedStateMachineSet = true;
    return this;
  }

  public StateMachineBuilder withExtendedStateMachine(java.util.Collection<? extends org.eclipse.uml2.uml.StateMachine> p_extendedStateMachine) {
    m_extendedStateMachine.addAll(p_extendedStateMachine);
    m_featureExtendedStateMachineSet = true;
    return this;
  }

  public StateMachineBuilder withExtendedStateMachine(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StateMachine> p_stateMachineBuilder) {
    m_featureExtendedStateMachineBuilder.add(p_stateMachineBuilder);
    return this;
  }

  public StateMachineBuilder withGeneralization(org.eclipse.uml2.uml.Generalization p_generalization) {
    m_generalization.add(p_generalization);
    m_featureGeneralizationSet = true;
    return this;
  }

  public StateMachineBuilder withGeneralization(java.util.Collection<? extends org.eclipse.uml2.uml.Generalization> p_generalization) {
    m_generalization.addAll(p_generalization);
    m_featureGeneralizationSet = true;
    return this;
  }

  public StateMachineBuilder withGeneralization(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Generalization> p_generalizationBuilder) {
    m_featureGeneralizationBuilder.add(p_generalizationBuilder);
    return this;
  }

  public StateMachineBuilder withInterfaceRealization(org.eclipse.uml2.uml.InterfaceRealization p_interfaceRealization) {
    m_interfaceRealization.add(p_interfaceRealization);
    m_featureInterfaceRealizationSet = true;
    return this;
  }

  public StateMachineBuilder withInterfaceRealization(java.util.Collection<? extends org.eclipse.uml2.uml.InterfaceRealization> p_interfaceRealization) {
    m_interfaceRealization.addAll(p_interfaceRealization);
    m_featureInterfaceRealizationSet = true;
    return this;
  }

  public StateMachineBuilder withInterfaceRealization(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterfaceRealization> p_interfaceRealizationBuilder) {
    m_featureInterfaceRealizationBuilder.add(p_interfaceRealizationBuilder);
    return this;
  }

  public StateMachineBuilder withNestedClassifier(org.eclipse.uml2.uml.Classifier p_nestedClassifier) {
    m_nestedClassifier.add(p_nestedClassifier);
    m_featureNestedClassifierSet = true;
    return this;
  }

  public StateMachineBuilder withNestedClassifier(java.util.Collection<? extends org.eclipse.uml2.uml.Classifier> p_nestedClassifier) {
    m_nestedClassifier.addAll(p_nestedClassifier);
    m_featureNestedClassifierSet = true;
    return this;
  }

  public StateMachineBuilder withNestedClassifier(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier> p_classifierBuilder) {
    m_featureNestedClassifierBuilder.add(p_classifierBuilder);
    return this;
  }

  public StateMachineBuilder withOwnedAttribute(org.eclipse.uml2.uml.Property p_ownedAttribute) {
    m_ownedAttribute.add(p_ownedAttribute);
    m_featureOwnedAttributeSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedAttribute(java.util.Collection<? extends org.eclipse.uml2.uml.Property> p_ownedAttribute) {
    m_ownedAttribute.addAll(p_ownedAttribute);
    m_featureOwnedAttributeSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedAttribute(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Property> p_propertyBuilder) {
    m_featureOwnedAttributeBuilder.add(p_propertyBuilder);
    return this;
  }

  public StateMachineBuilder withOwnedBehavior(org.eclipse.uml2.uml.Behavior p_ownedBehavior) {
    m_ownedBehavior.add(p_ownedBehavior);
    m_featureOwnedBehaviorSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedBehavior(java.util.Collection<? extends org.eclipse.uml2.uml.Behavior> p_ownedBehavior) {
    m_ownedBehavior.addAll(p_ownedBehavior);
    m_featureOwnedBehaviorSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedBehavior(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> p_behaviorBuilder) {
    m_featureOwnedBehaviorBuilder.add(p_behaviorBuilder);
    return this;
  }

  public StateMachineBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public StateMachineBuilder withOwnedConnector(org.eclipse.uml2.uml.Connector p_ownedConnector) {
    m_ownedConnector.add(p_ownedConnector);
    m_featureOwnedConnectorSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedConnector(java.util.Collection<? extends org.eclipse.uml2.uml.Connector> p_ownedConnector) {
    m_ownedConnector.addAll(p_ownedConnector);
    m_featureOwnedConnectorSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedConnector(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Connector> p_connectorBuilder) {
    m_featureOwnedConnectorBuilder.add(p_connectorBuilder);
    return this;
  }

  public StateMachineBuilder withOwnedOperation(org.eclipse.uml2.uml.Operation p_ownedOperation) {
    m_ownedOperation.add(p_ownedOperation);
    m_featureOwnedOperationSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedOperation(java.util.Collection<? extends org.eclipse.uml2.uml.Operation> p_ownedOperation) {
    m_ownedOperation.addAll(p_ownedOperation);
    m_featureOwnedOperationSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedOperation(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Operation> p_operationBuilder) {
    m_featureOwnedOperationBuilder.add(p_operationBuilder);
    return this;
  }

  public StateMachineBuilder withOwnedParameter(org.eclipse.uml2.uml.Parameter p_ownedParameter) {
    m_ownedParameter.add(p_ownedParameter);
    m_featureOwnedParameterSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedParameter(java.util.Collection<? extends org.eclipse.uml2.uml.Parameter> p_ownedParameter) {
    m_ownedParameter.addAll(p_ownedParameter);
    m_featureOwnedParameterSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedParameter(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Parameter> p_parameterBuilder) {
    m_featureOwnedParameterBuilder.add(p_parameterBuilder);
    return this;
  }

  public StateMachineBuilder withOwnedParameterSet(org.eclipse.uml2.uml.ParameterSet p_ownedParameterSet) {
    m_ownedParameterSet.add(p_ownedParameterSet);
    m_featureOwnedParameterSetSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedParameterSet(java.util.Collection<? extends org.eclipse.uml2.uml.ParameterSet> p_ownedParameterSet) {
    m_ownedParameterSet.addAll(p_ownedParameterSet);
    m_featureOwnedParameterSetSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedParameterSet(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterSet> p_parameterSetBuilder) {
    m_featureOwnedParameterSetBuilder.add(p_parameterSetBuilder);
    return this;
  }

  public StateMachineBuilder withOwnedReception(org.eclipse.uml2.uml.Reception p_ownedReception) {
    m_ownedReception.add(p_ownedReception);
    m_featureOwnedReceptionSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedReception(java.util.Collection<? extends org.eclipse.uml2.uml.Reception> p_ownedReception) {
    m_ownedReception.addAll(p_ownedReception);
    m_featureOwnedReceptionSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedReception(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Reception> p_receptionBuilder) {
    m_featureOwnedReceptionBuilder.add(p_receptionBuilder);
    return this;
  }

  public StateMachineBuilder withOwnedRule(org.eclipse.uml2.uml.Constraint p_ownedRule) {
    m_ownedRule.add(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedRule(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_ownedRule) {
    m_ownedRule.addAll(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedRule(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featureOwnedRuleBuilder.add(p_constraintBuilder);
    return this;
  }

  public StateMachineBuilder withOwnedTrigger(org.eclipse.uml2.uml.Trigger p_ownedTrigger) {
    m_ownedTrigger.add(p_ownedTrigger);
    m_featureOwnedTriggerSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedTrigger(java.util.Collection<? extends org.eclipse.uml2.uml.Trigger> p_ownedTrigger) {
    m_ownedTrigger.addAll(p_ownedTrigger);
    m_featureOwnedTriggerSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedTrigger(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger> p_triggerBuilder) {
    m_featureOwnedTriggerBuilder.add(p_triggerBuilder);
    return this;
  }

  public StateMachineBuilder withOwnedUseCase(org.eclipse.uml2.uml.UseCase p_ownedUseCase) {
    m_ownedUseCase.add(p_ownedUseCase);
    m_featureOwnedUseCaseSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedUseCase(java.util.Collection<? extends org.eclipse.uml2.uml.UseCase> p_ownedUseCase) {
    m_ownedUseCase.addAll(p_ownedUseCase);
    m_featureOwnedUseCaseSet = true;
    return this;
  }

  public StateMachineBuilder withOwnedUseCase(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase> p_useCaseBuilder) {
    m_featureOwnedUseCaseBuilder.add(p_useCaseBuilder);
    return this;
  }

  public StateMachineBuilder withPackageImport(org.eclipse.uml2.uml.PackageImport p_packageImport) {
    m_packageImport.add(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public StateMachineBuilder withPackageImport(java.util.Collection<? extends org.eclipse.uml2.uml.PackageImport> p_packageImport) {
    m_packageImport.addAll(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public StateMachineBuilder withPackageImport(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageImport> p_packageImportBuilder) {
    m_featurePackageImportBuilder.add(p_packageImportBuilder);
    return this;
  }

  public StateMachineBuilder withPostcondition(org.eclipse.uml2.uml.Constraint p_postcondition) {
    m_postcondition.add(p_postcondition);
    m_featurePostconditionSet = true;
    return this;
  }

  public StateMachineBuilder withPostcondition(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_postcondition) {
    m_postcondition.addAll(p_postcondition);
    m_featurePostconditionSet = true;
    return this;
  }

  public StateMachineBuilder withPostcondition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featurePostconditionBuilder.add(p_constraintBuilder);
    return this;
  }

  public StateMachineBuilder withPowertypeExtent(org.eclipse.uml2.uml.GeneralizationSet p_powertypeExtent) {
    m_powertypeExtent.add(p_powertypeExtent);
    m_featurePowertypeExtentSet = true;
    return this;
  }

  public StateMachineBuilder withPowertypeExtent(java.util.Collection<? extends org.eclipse.uml2.uml.GeneralizationSet> p_powertypeExtent) {
    m_powertypeExtent.addAll(p_powertypeExtent);
    m_featurePowertypeExtentSet = true;
    return this;
  }

  public StateMachineBuilder withPowertypeExtent(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralizationSet> p_generalizationSetBuilder) {
    m_featurePowertypeExtentBuilder.add(p_generalizationSetBuilder);
    return this;
  }

  public StateMachineBuilder withPrecondition(org.eclipse.uml2.uml.Constraint p_precondition) {
    m_precondition.add(p_precondition);
    m_featurePreconditionSet = true;
    return this;
  }

  public StateMachineBuilder withPrecondition(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_precondition) {
    m_precondition.addAll(p_precondition);
    m_featurePreconditionSet = true;
    return this;
  }

  public StateMachineBuilder withPrecondition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featurePreconditionBuilder.add(p_constraintBuilder);
    return this;
  }

  public StateMachineBuilder withRedefinedBehavior(org.eclipse.uml2.uml.Behavior p_redefinedBehavior) {
    m_redefinedBehavior.add(p_redefinedBehavior);
    m_featureRedefinedBehaviorSet = true;
    return this;
  }

  public StateMachineBuilder withRedefinedBehavior(java.util.Collection<? extends org.eclipse.uml2.uml.Behavior> p_redefinedBehavior) {
    m_redefinedBehavior.addAll(p_redefinedBehavior);
    m_featureRedefinedBehaviorSet = true;
    return this;
  }

  public StateMachineBuilder withRedefinedBehavior(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> p_behaviorBuilder) {
    m_featureRedefinedBehaviorBuilder.add(p_behaviorBuilder);
    return this;
  }

  public StateMachineBuilder withRedefinedClassifier(org.eclipse.uml2.uml.Classifier p_redefinedClassifier) {
    m_redefinedClassifier.add(p_redefinedClassifier);
    m_featureRedefinedClassifierSet = true;
    return this;
  }

  public StateMachineBuilder withRedefinedClassifier(java.util.Collection<? extends org.eclipse.uml2.uml.Classifier> p_redefinedClassifier) {
    m_redefinedClassifier.addAll(p_redefinedClassifier);
    m_featureRedefinedClassifierSet = true;
    return this;
  }

  public StateMachineBuilder withRedefinedClassifier(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier> p_classifierBuilder) {
    m_featureRedefinedClassifierBuilder.add(p_classifierBuilder);
    return this;
  }

  public StateMachineBuilder withRegion(org.eclipse.uml2.uml.Region p_region) {
    m_region.add(p_region);
    m_featureRegionSet = true;
    return this;
  }

  public StateMachineBuilder withRegion(java.util.Collection<? extends org.eclipse.uml2.uml.Region> p_region) {
    m_region.addAll(p_region);
    m_featureRegionSet = true;
    return this;
  }

  public StateMachineBuilder withRegion(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Region> p_regionBuilder) {
    m_featureRegionBuilder.add(p_regionBuilder);
    return this;
  }

  public StateMachineBuilder withSubmachineState(org.eclipse.uml2.uml.State p_submachineState) {
    m_submachineState.add(p_submachineState);
    m_featureSubmachineStateSet = true;
    return this;
  }

  public StateMachineBuilder withSubmachineState(java.util.Collection<? extends org.eclipse.uml2.uml.State> p_submachineState) {
    m_submachineState.addAll(p_submachineState);
    m_featureSubmachineStateSet = true;
    return this;
  }

  public StateMachineBuilder withSubmachineState(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.State> p_stateBuilder) {
    m_featureSubmachineStateBuilder.add(p_stateBuilder);
    return this;
  }

  public StateMachineBuilder withSubstitution(org.eclipse.uml2.uml.Substitution p_substitution) {
    m_substitution.add(p_substitution);
    m_featureSubstitutionSet = true;
    return this;
  }

  public StateMachineBuilder withSubstitution(java.util.Collection<? extends org.eclipse.uml2.uml.Substitution> p_substitution) {
    m_substitution.addAll(p_substitution);
    m_featureSubstitutionSet = true;
    return this;
  }

  public StateMachineBuilder withSubstitution(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Substitution> p_substitutionBuilder) {
    m_featureSubstitutionBuilder.add(p_substitutionBuilder);
    return this;
  }

  public StateMachineBuilder withTemplateBinding(org.eclipse.uml2.uml.TemplateBinding p_templateBinding) {
    m_templateBinding.add(p_templateBinding);
    m_featureTemplateBindingSet = true;
    return this;
  }

  public StateMachineBuilder withTemplateBinding(java.util.Collection<? extends org.eclipse.uml2.uml.TemplateBinding> p_templateBinding) {
    m_templateBinding.addAll(p_templateBinding);
    m_featureTemplateBindingSet = true;
    return this;
  }

  public StateMachineBuilder withTemplateBinding(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateBinding> p_templateBindingBuilder) {
    m_featureTemplateBindingBuilder.add(p_templateBindingBuilder);
    return this;
  }

  public StateMachineBuilder withUseCase(org.eclipse.uml2.uml.UseCase p_useCase) {
    m_useCase.add(p_useCase);
    m_featureUseCaseSet = true;
    return this;
  }

  public StateMachineBuilder withUseCase(java.util.Collection<? extends org.eclipse.uml2.uml.UseCase> p_useCase) {
    m_useCase.addAll(p_useCase);
    m_featureUseCaseSet = true;
    return this;
  }

  public StateMachineBuilder withUseCase(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase> p_useCaseBuilder) {
    m_featureUseCaseBuilder.add(p_useCaseBuilder);
    return this;
  }
}
