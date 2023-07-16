package dev.conless.calc;

import dev.conless.calc.grammar.*;

import java.io.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Calculator {
  public static void main(String[] args) throws Exception {
    CharStream input = CharStreams.fromStream(System.in);
    CalcLexer lexer = new CalcLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    CalcParser parser = new CalcParser(tokens);
    ParseTree tree = parser.program();
    ArithVisitor visitor = new ArithVisitor();
    Integer result = visitor.visit(tree);
    System.out.println(result);
  }
}
