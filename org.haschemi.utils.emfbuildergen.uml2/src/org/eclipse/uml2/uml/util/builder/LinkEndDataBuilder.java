package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.LinkEndData</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class LinkEndDataBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.LinkEndData> {
  // features and builders
  private org.eclipse.uml2.uml.Property m_end;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Property> m_featureEndBuilder;
  private org.eclipse.uml2.uml.InputPin m_value;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InputPin> m_featureValueBuilder;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  private java.util.Collection<org.eclipse.uml2.uml.QualifierValue> m_qualifier = new java.util.LinkedList<org.eclipse.uml2.uml.QualifierValue>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.QualifierValue>> m_featureQualifierBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.QualifierValue>>();
  // helper attributes
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEndSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureQualifierSet = false;
  private boolean m_featureValueSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newLinkEndDataBuilder()
   */
  private LinkEndDataBuilder() {
  }

  /**
   * This method creates a new instance of the LinkEndDataBuilder.
   * @return new instance of the LinkEndDataBuilder
   */
  public static LinkEndDataBuilder newLinkEndDataBuilder() {
    return new LinkEndDataBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public LinkEndDataBuilder but() {
    LinkEndDataBuilder _builder = newLinkEndDataBuilder();
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureEndSet = m_featureEndSet;
    _builder.m_end = m_end;
    _builder.m_featureEndBuilder = m_featureEndBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureQualifierSet = m_featureQualifierSet;
    _builder.m_qualifier = m_qualifier;
    _builder.m_featureQualifierBuilder = m_featureQualifierBuilder;
    _builder.m_featureValueSet = m_featureValueSet;
    _builder.m_value = m_value;
    _builder.m_featureValueBuilder = m_featureValueBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.LinkEndData type.
   * @return new instance of the org.eclipse.uml2.uml.LinkEndData type
   */
  public org.eclipse.uml2.uml.LinkEndData build() {
    final org.eclipse.uml2.uml.LinkEndData _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createLinkEndData();
    if (m_featureEndSet) {
      _newInstance.setEnd(m_end);
    } else {
      if (m_featureEndBuilder != null) {
        _newInstance.setEnd(m_featureEndBuilder.build());
      }
    }
    if (m_featureValueSet) {
      _newInstance.setValue(m_value);
    } else {
      if (m_featureValueBuilder != null) {
        _newInstance.setValue(m_featureValueBuilder.build());
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
    if (m_featureOwnedCommentSet) {
      _newInstance.getOwnedComments().addAll(m_ownedComment);
    } else {
      if (!m_featureOwnedCommentBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> builder : m_featureOwnedCommentBuilder) {
          _newInstance.getOwnedComments().add(builder.build());
        }
      }
    }
    if (m_featureQualifierSet) {
      _newInstance.getQualifiers().addAll(m_qualifier);
    } else {
      if (!m_featureQualifierBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.QualifierValue> builder : m_featureQualifierBuilder) {
          _newInstance.getQualifiers().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public LinkEndDataBuilder withEnd(org.eclipse.uml2.uml.Property p_end) {
    m_end = p_end;
    m_featureEndSet = true;
    return this;
  }

  public LinkEndDataBuilder withEnd(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Property> p_propertyBuilder) {
    m_featureEndBuilder = p_propertyBuilder;
    return this;
  }

  public LinkEndDataBuilder withValue(org.eclipse.uml2.uml.InputPin p_value) {
    m_value = p_value;
    m_featureValueSet = true;
    return this;
  }

  public LinkEndDataBuilder withValue(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InputPin> p_inputPinBuilder) {
    m_featureValueBuilder = p_inputPinBuilder;
    return this;
  }

  public LinkEndDataBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public LinkEndDataBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public LinkEndDataBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public LinkEndDataBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public LinkEndDataBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public LinkEndDataBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public LinkEndDataBuilder withQualifier(org.eclipse.uml2.uml.QualifierValue p_qualifier) {
    m_qualifier.add(p_qualifier);
    m_featureQualifierSet = true;
    return this;
  }

  public LinkEndDataBuilder withQualifier(java.util.Collection<? extends org.eclipse.uml2.uml.QualifierValue> p_qualifier) {
    m_qualifier.addAll(p_qualifier);
    m_featureQualifierSet = true;
    return this;
  }

  public LinkEndDataBuilder withQualifier(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.QualifierValue> p_qualifierValueBuilder) {
    m_featureQualifierBuilder.add(p_qualifierValueBuilder);
    return this;
  }
}
