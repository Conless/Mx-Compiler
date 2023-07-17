package dev.conless.calc;

import dev.conless.calc.grammar.*;

public class ArithVisitor extends CalcBaseVisitor<Integer> {
  @Override
  public Integer visitProgram(CalcParser.ProgramContext ctx) {
    return visit(ctx.expression());
  }
  @Override
  public Integer visitSubExpr(CalcParser.SubExprContext ctx) {
    return visit(ctx.expression());
  }
  @Override
  public Integer visitBinaryExpr(CalcParser.BinaryExprContext ctx) {
    int left = visit(ctx.expression(0));
    int right = visit(ctx.expression(1));
    int result = 0;
    switch (ctx.op.getType()) {
      case CalcParser.Mul:
        result = left * right;
        break;
      case CalcParser.Div:
        result = left / right;
        break;
      case CalcParser.Mod:
        result = left % right;
        break;
      case CalcParser.Add:
        result = left + right;
        break;
      case CalcParser.Sub:
        result = left - right;
        break;
      default:
        assert (false);
        break;
    }
    return result;
  }

  @Override
  public Integer visitAtomExpr(CalcParser.AtomExprContext ctx) {
    return Integer.valueOf(ctx.constant().getText());
  }
}
