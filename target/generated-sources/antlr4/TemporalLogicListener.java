// Generated from TemporalLogic.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TemporalLogicParser}.
 */
public interface TemporalLogicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code notPathFormulae}
	 * labeled alternative in {@link TemporalLogicParser#pathFormulae}.
	 * @param ctx the parse tree
	 */
	void enterNotPathFormulae(TemporalLogicParser.NotPathFormulaeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notPathFormulae}
	 * labeled alternative in {@link TemporalLogicParser#pathFormulae}.
	 * @param ctx the parse tree
	 */
	void exitNotPathFormulae(TemporalLogicParser.NotPathFormulaeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existsPathFormulae}
	 * labeled alternative in {@link TemporalLogicParser#pathFormulae}.
	 * @param ctx the parse tree
	 */
	void enterExistsPathFormulae(TemporalLogicParser.ExistsPathFormulaeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existsPathFormulae}
	 * labeled alternative in {@link TemporalLogicParser#pathFormulae}.
	 * @param ctx the parse tree
	 */
	void exitExistsPathFormulae(TemporalLogicParser.ExistsPathFormulaeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketPathFormulae}
	 * labeled alternative in {@link TemporalLogicParser#pathFormulae}.
	 * @param ctx the parse tree
	 */
	void enterBracketPathFormulae(TemporalLogicParser.BracketPathFormulaeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketPathFormulae}
	 * labeled alternative in {@link TemporalLogicParser#pathFormulae}.
	 * @param ctx the parse tree
	 */
	void exitBracketPathFormulae(TemporalLogicParser.BracketPathFormulaeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allPathFormulae}
	 * labeled alternative in {@link TemporalLogicParser#pathFormulae}.
	 * @param ctx the parse tree
	 */
	void enterAllPathFormulae(TemporalLogicParser.AllPathFormulaeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allPathFormulae}
	 * labeled alternative in {@link TemporalLogicParser#pathFormulae}.
	 * @param ctx the parse tree
	 */
	void exitAllPathFormulae(TemporalLogicParser.AllPathFormulaeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryPathFormulae}
	 * labeled alternative in {@link TemporalLogicParser#pathFormulae}.
	 * @param ctx the parse tree
	 */
	void enterBinaryPathFormulae(TemporalLogicParser.BinaryPathFormulaeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryPathFormulae}
	 * labeled alternative in {@link TemporalLogicParser#pathFormulae}.
	 * @param ctx the parse tree
	 */
	void exitBinaryPathFormulae(TemporalLogicParser.BinaryPathFormulaeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomicPathFormulae}
	 * labeled alternative in {@link TemporalLogicParser#pathFormulae}.
	 * @param ctx the parse tree
	 */
	void enterAtomicPathFormulae(TemporalLogicParser.AtomicPathFormulaeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomicPathFormulae}
	 * labeled alternative in {@link TemporalLogicParser#pathFormulae}.
	 * @param ctx the parse tree
	 */
	void exitAtomicPathFormulae(TemporalLogicParser.AtomicPathFormulaeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void enterNotStateFormulae(TemporalLogicParser.NotStateFormulaeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void exitNotStateFormulae(TemporalLogicParser.NotStateFormulaeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pathStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void enterPathStateFormulae(TemporalLogicParser.PathStateFormulaeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pathStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void exitPathStateFormulae(TemporalLogicParser.PathStateFormulaeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globallyStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void enterGloballyStateFormulae(TemporalLogicParser.GloballyStateFormulaeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globallyStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void exitGloballyStateFormulae(TemporalLogicParser.GloballyStateFormulaeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void enterBinaryStateFormulae(TemporalLogicParser.BinaryStateFormulaeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void exitBinaryStateFormulae(TemporalLogicParser.BinaryStateFormulaeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void enterBracketStateFormulae(TemporalLogicParser.BracketStateFormulaeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void exitBracketStateFormulae(TemporalLogicParser.BracketStateFormulaeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code finallyStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void enterFinallyStateFormulae(TemporalLogicParser.FinallyStateFormulaeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code finallyStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void exitFinallyStateFormulae(TemporalLogicParser.FinallyStateFormulaeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void enterNextStateFormulae(TemporalLogicParser.NextStateFormulaeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void exitNextStateFormulae(TemporalLogicParser.NextStateFormulaeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code untilStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void enterUntilStateFormulae(TemporalLogicParser.UntilStateFormulaeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code untilStateFormulae}
	 * labeled alternative in {@link TemporalLogicParser#stateFormulae}.
	 * @param ctx the parse tree
	 */
	void exitUntilStateFormulae(TemporalLogicParser.UntilStateFormulaeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemporalLogicParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(TemporalLogicParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemporalLogicParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(TemporalLogicParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void enterValueTerm(TemporalLogicParser.ValueTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void exitValueTerm(TemporalLogicParser.ValueTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iteTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void enterIteTerm(TemporalLogicParser.IteTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iteTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void exitIteTerm(TemporalLogicParser.IteTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOprTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOprTerm(TemporalLogicParser.BinaryOprTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOprTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOprTerm(TemporalLogicParser.BinaryOprTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void enterElementTerm(TemporalLogicParser.ElementTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void exitElementTerm(TemporalLogicParser.ElementTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBracketTerm(TemporalLogicParser.BracketTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBracketTerm(TemporalLogicParser.BracketTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void enterStructTerm(TemporalLogicParser.StructTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void exitStructTerm(TemporalLogicParser.StructTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTupleTerm(TemporalLogicParser.TupleTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTupleTerm(TemporalLogicParser.TupleTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleOprTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void enterSingleOprTerm(TemporalLogicParser.SingleOprTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleOprTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void exitSingleOprTerm(TemporalLogicParser.SingleOprTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void enterListTerm(TemporalLogicParser.ListTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void exitListTerm(TemporalLogicParser.ListTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void enterCallTerm(TemporalLogicParser.CallTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void exitCallTerm(TemporalLogicParser.CallTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFieldTerm(TemporalLogicParser.FieldTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldTerm}
	 * labeled alternative in {@link TemporalLogicParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFieldTerm(TemporalLogicParser.FieldTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intValue}
	 * labeled alternative in {@link TemporalLogicParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(TemporalLogicParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intValue}
	 * labeled alternative in {@link TemporalLogicParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(TemporalLogicParser.IntValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleValue}
	 * labeled alternative in {@link TemporalLogicParser#value}.
	 * @param ctx the parse tree
	 */
	void enterDoubleValue(TemporalLogicParser.DoubleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleValue}
	 * labeled alternative in {@link TemporalLogicParser#value}.
	 * @param ctx the parse tree
	 */
	void exitDoubleValue(TemporalLogicParser.DoubleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strValue}
	 * labeled alternative in {@link TemporalLogicParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStrValue(TemporalLogicParser.StrValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strValue}
	 * labeled alternative in {@link TemporalLogicParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStrValue(TemporalLogicParser.StrValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolValue}
	 * labeled alternative in {@link TemporalLogicParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(TemporalLogicParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolValue}
	 * labeled alternative in {@link TemporalLogicParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(TemporalLogicParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code portVarValue}
	 * labeled alternative in {@link TemporalLogicParser#value}.
	 * @param ctx the parse tree
	 */
	void enterPortVarValue(TemporalLogicParser.PortVarValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code portVarValue}
	 * labeled alternative in {@link TemporalLogicParser#value}.
	 * @param ctx the parse tree
	 */
	void exitPortVarValue(TemporalLogicParser.PortVarValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link TemporalLogicParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIdValue(TemporalLogicParser.IdValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link TemporalLogicParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIdValue(TemporalLogicParser.IdValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullValue}
	 * labeled alternative in {@link TemporalLogicParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNullValue(TemporalLogicParser.NullValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullValue}
	 * labeled alternative in {@link TemporalLogicParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNullValue(TemporalLogicParser.NullValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBracketType(TemporalLogicParser.BracketTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBracketType(TemporalLogicParser.BracketTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterCharType(TemporalLogicParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitCharType(TemporalLogicParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(TemporalLogicParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(TemporalLogicParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code templateType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTemplateType(TemporalLogicParser.TemplateTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTemplateType(TemporalLogicParser.TemplateTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIdType(TemporalLogicParser.IdTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIdType(TemporalLogicParser.IdTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abstractType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterAbstractType(TemporalLogicParser.AbstractTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abstractType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitAbstractType(TemporalLogicParser.AbstractTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(TemporalLogicParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(TemporalLogicParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(TemporalLogicParser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(TemporalLogicParser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(TemporalLogicParser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(TemporalLogicParser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterInitType(TemporalLogicParser.InitTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitInitType(TemporalLogicParser.InitTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterListType(TemporalLogicParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitListType(TemporalLogicParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(TemporalLogicParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(TemporalLogicParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boundedIntType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoundedIntType(TemporalLogicParser.BoundedIntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boundedIntType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoundedIntType(TemporalLogicParser.BoundedIntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStructType(TemporalLogicParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStructType(TemporalLogicParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterNullType(TemporalLogicParser.NullTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitNullType(TemporalLogicParser.NullTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterUnionType(TemporalLogicParser.UnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionType}
	 * labeled alternative in {@link TemporalLogicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitUnionType(TemporalLogicParser.UnionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemporalLogicParser#typeorvalue}.
	 * @param ctx the parse tree
	 */
	void enterTypeorvalue(TemporalLogicParser.TypeorvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemporalLogicParser#typeorvalue}.
	 * @param ctx the parse tree
	 */
	void exitTypeorvalue(TemporalLogicParser.TypeorvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemporalLogicParser#scopedID}.
	 * @param ctx the parse tree
	 */
	void enterScopedID(TemporalLogicParser.ScopedIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemporalLogicParser#scopedID}.
	 * @param ctx the parse tree
	 */
	void exitScopedID(TemporalLogicParser.ScopedIDContext ctx);
}