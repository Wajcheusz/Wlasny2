// Intro to ANTLR+LLVM
// sawickib, 2014-04-26

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static public class Program {
        public List<Statement> statements = new ArrayList<Statement>();
        public List<Function> functions = new ArrayList<Function>();
    }

    static public class Function {
        private final String m_name;
        private List<String> m_arguments = new ArrayList<String>();
        private Body m_body;

        public Function(String name) {
            m_name = name;
        }

        public void addArg(String name) {
            m_arguments.add(name);
        }

        public void setBody(Body b) {
            m_body = b;
        }
    }

    static public abstract class Statement {

    }

    static public class StatementExpression extends Statement {
        private final Expression m_expr;

        public StatementExpression(Expression expr) {
            m_expr = expr;
        }
    }

    static public class VariableDefinition extends Statement {
        private final String m_name;

        public VariableDefinition(String name) {
            m_name = name;
        }

        public String getName() {
            return m_name;
        }
    }

    static public abstract class Expression {}

    static public class IntExpression extends Expression {
        private final String m_data;

        public IntExpression(String data) {
            m_data = data;
        }

        public String getData() {
            return m_data;
        }
    }

    static public class Reference extends Expression {
        private final String m_name;

        public Reference(String to) {
            m_name = to;
        }

        public String getName() {
            return m_name;
        }
    }

    static public class ArExpression extends Expression {
        private List<Expression> exps = new ArrayList<Expression>();
        public ArExpression(Expression first) {
            add(first);
        }

        public void add(Expression e) {
            exps.add(e);
        }
    }

    static public class Assignment extends Expression {
        private final Expression m_what;
        private final String m_to;

        public Assignment(String to, Expression what) {
            m_to = to;
            m_what = what;
        }
    }

    static public class Invocation extends Expression {
        private final List<Expression> params = new ArrayList<Expression>();
        private final String m_what;
        public Invocation(String what) {
            m_what = what;
        }

        public void addParam(Expression expr) {
            params.add(expr);
        }
    }

    static public class Body {
        private List<Statement> statements = new ArrayList<Statement>();

        public Body() {

        }

        public void add(Statement stmt) {
            statements.add(stmt);
        }
    }

    public static void main(String[] args) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream(args[0]);

        MatLexer lexer = new MatLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MatParser parser = new MatParser(tokens);

        ParseTree tree = parser.prog();
//
//        //System.out.println(tree.toStringTree(parser));
//
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(new LLVMactions(), tree);

//        ParseTreeWalker walker = new ParseTreeWalker();
//        MatBaseListener listener = new MatBaseListener();
//        walker.walk(listener, tree);

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMactions(), tree);

    }
//public static void main (String args[]) {
//
//    ClassLoader cl = ClassLoader.getSystemClassLoader();
//
//    URL[] urls = ((URLClassLoader)cl).getURLs();
//
//    for(URL url: urls){
//        System.out.println(url.getFile());
//    }
//
//}
}
