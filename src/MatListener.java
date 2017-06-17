// Generated from C:\Users\E6420\Desktop\Wlasny2\src\Mat.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MatParser}.
 */
public interface MatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MatParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MatParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MatParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link MatParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWrite(MatParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link MatParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWrite(MatParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MatParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MatParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MatParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MatParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link MatParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(MatParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link MatParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(MatParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link MatParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(MatParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link MatParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(MatParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link MatParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(MatParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link MatParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(MatParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link MatParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(MatParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link MatParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(MatParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link MatParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMult(MatParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link MatParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMult(MatParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link MatParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterInt(MatParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MatParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitInt(MatParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link MatParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterReal(MatParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link MatParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitReal(MatParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toint}
	 * labeled alternative in {@link MatParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToint(MatParser.TointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link MatParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToint(MatParser.TointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link MatParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToreal(MatParser.TorealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link MatParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToreal(MatParser.TorealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link MatParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterPar(MatParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link MatParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitPar(MatParser.ParContext ctx);
}