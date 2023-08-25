// Generated from TermAndType.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TermAndTypeParser}.
 */
public interface TermAndTypeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TermAndTypeParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(TermAndTypeParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TermAndTypeParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(TermAndTypeParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterValueTerm(TermAndTypeParser.ValueTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitValueTerm(TermAndTypeParser.ValueTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iteTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterIteTerm(TermAndTypeParser.IteTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iteTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitIteTerm(TermAndTypeParser.IteTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOprTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOprTerm(TermAndTypeParser.BinaryOprTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOprTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOprTerm(TermAndTypeParser.BinaryOprTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterElementTerm(TermAndTypeParser.ElementTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitElementTerm(TermAndTypeParser.ElementTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBracketTerm(TermAndTypeParser.BracketTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBracketTerm(TermAndTypeParser.BracketTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterStructTerm(TermAndTypeParser.StructTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitStructTerm(TermAndTypeParser.StructTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTupleTerm(TermAndTypeParser.TupleTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTupleTerm(TermAndTypeParser.TupleTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleOprTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterSingleOprTerm(TermAndTypeParser.SingleOprTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleOprTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitSingleOprTerm(TermAndTypeParser.SingleOprTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterListTerm(TermAndTypeParser.ListTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitListTerm(TermAndTypeParser.ListTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterCallTerm(TermAndTypeParser.CallTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitCallTerm(TermAndTypeParser.CallTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFieldTerm(TermAndTypeParser.FieldTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldTerm}
	 * labeled alternative in {@link TermAndTypeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFieldTerm(TermAndTypeParser.FieldTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intValue}
	 * labeled alternative in {@link TermAndTypeParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(TermAndTypeParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intValue}
	 * labeled alternative in {@link TermAndTypeParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(TermAndTypeParser.IntValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleValue}
	 * labeled alternative in {@link TermAndTypeParser#value}.
	 * @param ctx the parse tree
	 */
	void enterDoubleValue(TermAndTypeParser.DoubleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleValue}
	 * labeled alternative in {@link TermAndTypeParser#value}.
	 * @param ctx the parse tree
	 */
	void exitDoubleValue(TermAndTypeParser.DoubleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strValue}
	 * labeled alternative in {@link TermAndTypeParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStrValue(TermAndTypeParser.StrValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strValue}
	 * labeled alternative in {@link TermAndTypeParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStrValue(TermAndTypeParser.StrValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolValue}
	 * labeled alternative in {@link TermAndTypeParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(TermAndTypeParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolValue}
	 * labeled alternative in {@link TermAndTypeParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(TermAndTypeParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code portVarValue}
	 * labeled alternative in {@link TermAndTypeParser#value}.
	 * @param ctx the parse tree
	 */
	void enterPortVarValue(TermAndTypeParser.PortVarValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code portVarValue}
	 * labeled alternative in {@link TermAndTypeParser#value}.
	 * @param ctx the parse tree
	 */
	void exitPortVarValue(TermAndTypeParser.PortVarValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link TermAndTypeParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIdValue(TermAndTypeParser.IdValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link TermAndTypeParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIdValue(TermAndTypeParser.IdValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullValue}
	 * labeled alternative in {@link TermAndTypeParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNullValue(TermAndTypeParser.NullValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullValue}
	 * labeled alternative in {@link TermAndTypeParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNullValue(TermAndTypeParser.NullValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBracketType(TermAndTypeParser.BracketTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBracketType(TermAndTypeParser.BracketTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterCharType(TermAndTypeParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitCharType(TermAndTypeParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(TermAndTypeParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(TermAndTypeParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code templateType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTemplateType(TermAndTypeParser.TemplateTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTemplateType(TermAndTypeParser.TemplateTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIdType(TermAndTypeParser.IdTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIdType(TermAndTypeParser.IdTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abstractType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterAbstractType(TermAndTypeParser.AbstractTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abstractType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitAbstractType(TermAndTypeParser.AbstractTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(TermAndTypeParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(TermAndTypeParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(TermAndTypeParser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(TermAndTypeParser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(TermAndTypeParser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(TermAndTypeParser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterInitType(TermAndTypeParser.InitTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitInitType(TermAndTypeParser.InitTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterListType(TermAndTypeParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitListType(TermAndTypeParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(TermAndTypeParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(TermAndTypeParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boundedIntType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoundedIntType(TermAndTypeParser.BoundedIntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boundedIntType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoundedIntType(TermAndTypeParser.BoundedIntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStructType(TermAndTypeParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStructType(TermAndTypeParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterNullType(TermAndTypeParser.NullTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitNullType(TermAndTypeParser.NullTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterUnionType(TermAndTypeParser.UnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionType}
	 * labeled alternative in {@link TermAndTypeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitUnionType(TermAndTypeParser.UnionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TermAndTypeParser#typeorvalue}.
	 * @param ctx the parse tree
	 */
	void enterTypeorvalue(TermAndTypeParser.TypeorvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TermAndTypeParser#typeorvalue}.
	 * @param ctx the parse tree
	 */
	void exitTypeorvalue(TermAndTypeParser.TypeorvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TermAndTypeParser#scopedID}.
	 * @param ctx the parse tree
	 */
	void enterScopedID(TermAndTypeParser.ScopedIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TermAndTypeParser#scopedID}.
	 * @param ctx the parse tree
	 */
	void exitScopedID(TermAndTypeParser.ScopedIDContext ctx);
}