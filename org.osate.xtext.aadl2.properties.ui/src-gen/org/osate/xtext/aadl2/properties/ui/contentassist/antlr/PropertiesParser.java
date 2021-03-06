/*
* generated by Xtext
*/
package org.osate.xtext.aadl2.properties.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.osate.xtext.aadl2.properties.services.PropertiesGrammarAccess;

public class PropertiesParser extends AbstractContentAssistParser {
	
	@Inject
	private PropertiesGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.osate.xtext.aadl2.properties.ui.contentassist.antlr.internal.InternalPropertiesParser createParser() {
		org.osate.xtext.aadl2.properties.ui.contentassist.antlr.internal.InternalPropertiesParser result = new org.osate.xtext.aadl2.properties.ui.contentassist.antlr.internal.InternalPropertiesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPModelAccess().getAlternatives(), "rule__PModel__Alternatives");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAlternatives_1(), "rule__ContainedPropertyAssociation__Alternatives_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAlternatives_3(), "rule__ContainedPropertyAssociation__Alternatives_3");
					put(grammarAccess.getPropertyAssociationAccess().getAlternatives_1(), "rule__PropertyAssociation__Alternatives_1");
					put(grammarAccess.getPropertyAssociationAccess().getAlternatives_3(), "rule__PropertyAssociation__Alternatives_3");
					put(grammarAccess.getPropertyExpressionAccess().getAlternatives(), "rule__PropertyExpression__Alternatives");
					put(grammarAccess.getActualBooleanTermAccess().getAlternatives(), "rule__ActualBooleanTerm__Alternatives");
					put(grammarAccess.getBooleanAtomAccess().getAlternatives(), "rule__BooleanAtom__Alternatives");
					put(grammarAccess.getBooleanLiteralAccess().getAlternatives_1(), "rule__BooleanLiteral__Alternatives_1");
					put(grammarAccess.getContainmentPathElementAccess().getAlternatives(), "rule__ContainmentPathElement__Alternatives");
					put(grammarAccess.getPlusMinusAccess().getAlternatives(), "rule__PlusMinus__Alternatives");
					put(grammarAccess.getSignedIntAccess().getAlternatives_0(), "rule__SignedInt__Alternatives_0");
					put(grammarAccess.getSignedRealAccess().getAlternatives_0(), "rule__SignedReal__Alternatives_0");
					put(grammarAccess.getNumAltAccess().getAlternatives(), "rule__NumAlt__Alternatives");
					put(grammarAccess.getOperationKindAccess().getAlternatives(), "rule__OperationKind__Alternatives");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup(), "rule__ContainedPropertyAssociation__Group__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3_0(), "rule__ContainedPropertyAssociation__Group_3_0__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3_0_2(), "rule__ContainedPropertyAssociation__Group_3_0_2__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3_0_3(), "rule__ContainedPropertyAssociation__Group_3_0_3__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4(), "rule__ContainedPropertyAssociation__Group_4__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4_3(), "rule__ContainedPropertyAssociation__Group_4_3__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup(), "rule__PropertyAssociation__Group__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup_3_0(), "rule__PropertyAssociation__Group_3_0__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup_3_0_2(), "rule__PropertyAssociation__Group_3_0_2__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup_3_0_3(), "rule__PropertyAssociation__Group_3_0_3__0");
					put(grammarAccess.getBasicPropertyAssociationAccess().getGroup(), "rule__BasicPropertyAssociation__Group__0");
					put(grammarAccess.getContainmentPathAccess().getGroup(), "rule__ContainmentPath__Group__0");
					put(grammarAccess.getContainmentPathAccess().getGroup_2(), "rule__ContainmentPath__Group_2__0");
					put(grammarAccess.getModalPropertyValueAccess().getGroup(), "rule__ModalPropertyValue__Group__0");
					put(grammarAccess.getModalPropertyValueAccess().getGroup_5(), "rule__ModalPropertyValue__Group_5__0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup(), "rule__OptionalModalPropertyValue__Group__0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1(), "rule__OptionalModalPropertyValue__Group_1__0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1_4(), "rule__OptionalModalPropertyValue__Group_1_4__0");
					put(grammarAccess.getActualOrTermAccess().getGroup(), "rule__ActualOrTerm__Group__0");
					put(grammarAccess.getActualOrTermAccess().getGroup_3(), "rule__ActualOrTerm__Group_3__0");
					put(grammarAccess.getActualAndTermAccess().getGroup(), "rule__ActualAndTerm__Group__0");
					put(grammarAccess.getActualAndTermAccess().getGroup_3(), "rule__ActualAndTerm__Group_3__0");
					put(grammarAccess.getOrTermAccess().getGroup(), "rule__OrTerm__Group__0");
					put(grammarAccess.getOrTermAccess().getGroup_1(), "rule__OrTerm__Group_1__0");
					put(grammarAccess.getAndTermAccess().getGroup(), "rule__AndTerm__Group__0");
					put(grammarAccess.getAndTermAccess().getGroup_1(), "rule__AndTerm__Group_1__0");
					put(grammarAccess.getNotTermAccess().getGroup(), "rule__NotTerm__Group__0");
					put(grammarAccess.getBooleanAtomAccess().getGroup_3(), "rule__BooleanAtom__Group_3__0");
					put(grammarAccess.getBooleanLiteralAccess().getGroup(), "rule__BooleanLiteral__Group__0");
					put(grammarAccess.getReferenceTermAccess().getGroup(), "rule__ReferenceTerm__Group__0");
					put(grammarAccess.getReferenceTermAccess().getGroup_3(), "rule__ReferenceTerm__Group_3__0");
					put(grammarAccess.getRecordTermAccess().getGroup(), "rule__RecordTerm__Group__0");
					put(grammarAccess.getComputedTermAccess().getGroup(), "rule__ComputedTerm__Group__0");
					put(grammarAccess.getComponentClassifierTermAccess().getGroup(), "rule__ComponentClassifierTerm__Group__0");
					put(grammarAccess.getListTermAccess().getGroup(), "rule__ListTerm__Group__0");
					put(grammarAccess.getListTermAccess().getGroup_2(), "rule__ListTerm__Group_2__0");
					put(grammarAccess.getFieldPropertyAssociationAccess().getGroup(), "rule__FieldPropertyAssociation__Group__0");
					put(grammarAccess.getContainmentPathElementAccess().getGroup_0(), "rule__ContainmentPathElement__Group_0__0");
					put(grammarAccess.getContainmentPathElementAccess().getGroup_1(), "rule__ContainmentPathElement__Group_1__0");
					put(grammarAccess.getANNEXREFAccess().getGroup(), "rule__ANNEXREF__Group__0");
					put(grammarAccess.getArrayRangeAccess().getGroup(), "rule__ArrayRange__Group__0");
					put(grammarAccess.getArrayRangeAccess().getGroup_3(), "rule__ArrayRange__Group_3__0");
					put(grammarAccess.getSignedConstantAccess().getGroup(), "rule__SignedConstant__Group__0");
					put(grammarAccess.getIntegerTermAccess().getGroup(), "rule__IntegerTerm__Group__0");
					put(grammarAccess.getSignedIntAccess().getGroup(), "rule__SignedInt__Group__0");
					put(grammarAccess.getRealTermAccess().getGroup(), "rule__RealTerm__Group__0");
					put(grammarAccess.getSignedRealAccess().getGroup(), "rule__SignedReal__Group__0");
					put(grammarAccess.getNumericRangeTermAccess().getGroup(), "rule__NumericRangeTerm__Group__0");
					put(grammarAccess.getNumericRangeTermAccess().getGroup_3(), "rule__NumericRangeTerm__Group_3__0");
					put(grammarAccess.getQPREFAccess().getGroup(), "rule__QPREF__Group__0");
					put(grammarAccess.getQPREFAccess().getGroup_1(), "rule__QPREF__Group_1__0");
					put(grammarAccess.getQCREFAccess().getGroup(), "rule__QCREF__Group__0");
					put(grammarAccess.getQCREFAccess().getGroup_0(), "rule__QCREF__Group_0__0");
					put(grammarAccess.getQCREFAccess().getGroup_2(), "rule__QCREF__Group_2__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getPropertyAssignment_0(), "rule__ContainedPropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAppendAssignment_1_1(), "rule__ContainedPropertyAssociation__AppendAssignment_1_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getConstantAssignment_2(), "rule__ContainedPropertyAssociation__ConstantAssignment_2");
					put(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_0_1(), "rule__ContainedPropertyAssociation__OwnedValueAssignment_3_0_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_0_2_1(), "rule__ContainedPropertyAssociation__OwnedValueAssignment_3_0_2_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_0_3_1(), "rule__ContainedPropertyAssociation__OwnedValueAssignment_3_0_3_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_1(), "rule__ContainedPropertyAssociation__OwnedValueAssignment_3_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_2(), "rule__ContainedPropertyAssociation__AppliesToAssignment_4_2");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_3_1(), "rule__ContainedPropertyAssociation__AppliesToAssignment_4_3_1");
					put(grammarAccess.getPropertyAssociationAccess().getPropertyAssignment_0(), "rule__PropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getPropertyAssociationAccess().getAppendAssignment_1_1(), "rule__PropertyAssociation__AppendAssignment_1_1");
					put(grammarAccess.getPropertyAssociationAccess().getConstantAssignment_2(), "rule__PropertyAssociation__ConstantAssignment_2");
					put(grammarAccess.getPropertyAssociationAccess().getOwnedValueAssignment_3_0_1(), "rule__PropertyAssociation__OwnedValueAssignment_3_0_1");
					put(grammarAccess.getPropertyAssociationAccess().getOwnedValueAssignment_3_0_2_1(), "rule__PropertyAssociation__OwnedValueAssignment_3_0_2_1");
					put(grammarAccess.getPropertyAssociationAccess().getOwnedValueAssignment_3_0_3_1(), "rule__PropertyAssociation__OwnedValueAssignment_3_0_3_1");
					put(grammarAccess.getPropertyAssociationAccess().getOwnedValueAssignment_3_1(), "rule__PropertyAssociation__OwnedValueAssignment_3_1");
					put(grammarAccess.getBasicPropertyAssociationAccess().getPropertyAssignment_0(), "rule__BasicPropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getBasicPropertyAssociationAccess().getOwnedValueAssignment_2(), "rule__BasicPropertyAssociation__OwnedValueAssignment_2");
					put(grammarAccess.getContainmentPathAccess().getContainmentPathElementAssignment_1(), "rule__ContainmentPath__ContainmentPathElementAssignment_1");
					put(grammarAccess.getContainmentPathAccess().getContainmentPathElementAssignment_2_1(), "rule__ContainmentPath__ContainmentPathElementAssignment_2_1");
					put(grammarAccess.getModalPropertyValueAccess().getOwnedValueAssignment_0(), "rule__ModalPropertyValue__OwnedValueAssignment_0");
					put(grammarAccess.getModalPropertyValueAccess().getInModeAssignment_4(), "rule__ModalPropertyValue__InModeAssignment_4");
					put(grammarAccess.getModalPropertyValueAccess().getInModeAssignment_5_1(), "rule__ModalPropertyValue__InModeAssignment_5_1");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValueAssignment_0(), "rule__OptionalModalPropertyValue__OwnedValueAssignment_0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_3(), "rule__OptionalModalPropertyValue__InModeAssignment_1_3");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_4_1(), "rule__OptionalModalPropertyValue__InModeAssignment_1_4_1");
					put(grammarAccess.getPropertyValueAccess().getOwnedValueAssignment(), "rule__PropertyValue__OwnedValueAssignment");
					put(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAssignment(), "rule__LiteralorReferenceTerm__NamedValueAssignment");
					put(grammarAccess.getActualOrTermAccess().getOwnedPropertyExpressionAssignment_0(), "rule__ActualOrTerm__OwnedPropertyExpressionAssignment_0");
					put(grammarAccess.getActualOrTermAccess().getOpAssignment_1(), "rule__ActualOrTerm__OpAssignment_1");
					put(grammarAccess.getActualOrTermAccess().getOwnedPropertyExpressionAssignment_2(), "rule__ActualOrTerm__OwnedPropertyExpressionAssignment_2");
					put(grammarAccess.getActualOrTermAccess().getOpAssignment_3_0(), "rule__ActualOrTerm__OpAssignment_3_0");
					put(grammarAccess.getActualOrTermAccess().getOwnedPropertyExpressionAssignment_3_1(), "rule__ActualOrTerm__OwnedPropertyExpressionAssignment_3_1");
					put(grammarAccess.getActualAndTermAccess().getOwnedPropertyExpressionAssignment_0(), "rule__ActualAndTerm__OwnedPropertyExpressionAssignment_0");
					put(grammarAccess.getActualAndTermAccess().getOpAssignment_1(), "rule__ActualAndTerm__OpAssignment_1");
					put(grammarAccess.getActualAndTermAccess().getOwnedPropertyExpressionAssignment_2(), "rule__ActualAndTerm__OwnedPropertyExpressionAssignment_2");
					put(grammarAccess.getActualAndTermAccess().getOpAssignment_3_0(), "rule__ActualAndTerm__OpAssignment_3_0");
					put(grammarAccess.getActualAndTermAccess().getOwnedPropertyExpressionAssignment_3_1(), "rule__ActualAndTerm__OwnedPropertyExpressionAssignment_3_1");
					put(grammarAccess.getOrTermAccess().getOpAssignment_1_1(), "rule__OrTerm__OpAssignment_1_1");
					put(grammarAccess.getOrTermAccess().getOwnedPropertyExpressionAssignment_1_2(), "rule__OrTerm__OwnedPropertyExpressionAssignment_1_2");
					put(grammarAccess.getAndTermAccess().getOpAssignment_1_1(), "rule__AndTerm__OpAssignment_1_1");
					put(grammarAccess.getAndTermAccess().getOwnedPropertyExpressionAssignment_1_2(), "rule__AndTerm__OwnedPropertyExpressionAssignment_1_2");
					put(grammarAccess.getNotTermAccess().getOpAssignment_0(), "rule__NotTerm__OpAssignment_0");
					put(grammarAccess.getNotTermAccess().getOwnedPropertyExpressionAssignment_1(), "rule__NotTerm__OwnedPropertyExpressionAssignment_1");
					put(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1_0(), "rule__BooleanLiteral__ValueAssignment_1_0");
					put(grammarAccess.getConstantValueAccess().getNamedValueAssignment(), "rule__ConstantValue__NamedValueAssignment");
					put(grammarAccess.getReferenceTermAccess().getContainmentPathElementAssignment_2(), "rule__ReferenceTerm__ContainmentPathElementAssignment_2");
					put(grammarAccess.getReferenceTermAccess().getContainmentPathElementAssignment_3_1(), "rule__ReferenceTerm__ContainmentPathElementAssignment_3_1");
					put(grammarAccess.getRecordTermAccess().getOwnedFieldValueAssignment_1(), "rule__RecordTerm__OwnedFieldValueAssignment_1");
					put(grammarAccess.getComputedTermAccess().getFunctionAssignment_2(), "rule__ComputedTerm__FunctionAssignment_2");
					put(grammarAccess.getComponentClassifierTermAccess().getClassifierAssignment_2(), "rule__ComponentClassifierTerm__ClassifierAssignment_2");
					put(grammarAccess.getListTermAccess().getOwnedListElementAssignment_1(), "rule__ListTerm__OwnedListElementAssignment_1");
					put(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_1(), "rule__ListTerm__OwnedListElementAssignment_2_1");
					put(grammarAccess.getFieldPropertyAssociationAccess().getPropertyAssignment_0(), "rule__FieldPropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValueAssignment_2(), "rule__FieldPropertyAssociation__OwnedValueAssignment_2");
					put(grammarAccess.getContainmentPathElementAccess().getNamedElementAssignment_0_0(), "rule__ContainmentPathElement__NamedElementAssignment_0_0");
					put(grammarAccess.getContainmentPathElementAccess().getArrayRangeAssignment_0_1(), "rule__ContainmentPathElement__ArrayRangeAssignment_0_1");
					put(grammarAccess.getContainmentPathElementAccess().getNamedElementAssignment_1_1(), "rule__ContainmentPathElement__NamedElementAssignment_1_1");
					put(grammarAccess.getStringTermAccess().getValueAssignment(), "rule__StringTerm__ValueAssignment");
					put(grammarAccess.getArrayRangeAccess().getLowerBoundAssignment_2(), "rule__ArrayRange__LowerBoundAssignment_2");
					put(grammarAccess.getArrayRangeAccess().getUpperBoundAssignment_3_1(), "rule__ArrayRange__UpperBoundAssignment_3_1");
					put(grammarAccess.getSignedConstantAccess().getOpAssignment_0(), "rule__SignedConstant__OpAssignment_0");
					put(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionAssignment_1(), "rule__SignedConstant__OwnedPropertyExpressionAssignment_1");
					put(grammarAccess.getIntegerTermAccess().getValueAssignment_0(), "rule__IntegerTerm__ValueAssignment_0");
					put(grammarAccess.getIntegerTermAccess().getUnitAssignment_1(), "rule__IntegerTerm__UnitAssignment_1");
					put(grammarAccess.getRealTermAccess().getValueAssignment_0(), "rule__RealTerm__ValueAssignment_0");
					put(grammarAccess.getRealTermAccess().getUnitAssignment_1(), "rule__RealTerm__UnitAssignment_1");
					put(grammarAccess.getNumericRangeTermAccess().getMinimumAssignment_0(), "rule__NumericRangeTerm__MinimumAssignment_0");
					put(grammarAccess.getNumericRangeTermAccess().getMaximumAssignment_2(), "rule__NumericRangeTerm__MaximumAssignment_2");
					put(grammarAccess.getNumericRangeTermAccess().getDeltaAssignment_3_1(), "rule__NumericRangeTerm__DeltaAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.osate.xtext.aadl2.properties.ui.contentassist.antlr.internal.InternalPropertiesParser typedParser = (org.osate.xtext.aadl2.properties.ui.contentassist.antlr.internal.InternalPropertiesParser) parser;
			typedParser.entryRulePModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}
	
	public PropertiesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PropertiesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
