package dev.conless.calc;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.junit.Test;

import dev.conless.calc.grammar.*;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
  @Test
  public void BasicArithTest() throws Exception {
    String expr = "1+2*3+4*5+(6+7)*8";
    CharStream input = CharStreams.fromString(expr);
    CalcLexer lexer = new CalcLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    CalcParser parser = new CalcParser(tokens);
    ParseTree tree = parser.program();
    ArithVisitor visitor = new ArithVisitor();
    Integer result = visitor.visit(tree);
    System.out.printf("Calculate: %s=%d\n", expr, result);
    assert(result == 131);
  }
}
