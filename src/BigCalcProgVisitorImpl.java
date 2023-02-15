import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class BigCalcProgVisitorImpl extends BigCalcProgBaseVisitor<BigDecimal> {

	Map<String, BigDecimal> memory = new HashMap<String, BigDecimal>();

	@Override
	public BigDecimal visitTxtfile(BigCalcProgParser.TxtfileContext ctx) {
		return visit(ctx.program());
	}

	@Override
	public BigDecimal visitAssignmentStatement(BigCalcProgParser.AssignmentStatementContext ctx) {
		String var = ctx.Variable().getText();
		BigDecimal value = visit(ctx.expression());
		memory.put(var, value);
		return value;
	}

	@Override
	public BigDecimal visitExpressionStatement(BigCalcProgParser.ExpressionStatementContext ctx) {
		return visit(ctx.expression());
	}

	@Override
	public BigDecimal visitMulDiv(BigCalcProgParser.MulDivContext ctx) {
		final BigDecimal left = visit(ctx.expression(0));
		final BigDecimal right = visit(ctx.expression(1));
		if (ctx.op.getText().equals("*")) {
			return left.multiply(right);
		} else {
			return left.divide(right, 10, RoundingMode.HALF_UP);
		}
	}

	@Override
	public BigDecimal visitAddSub(BigCalcProgParser.AddSubContext ctx) {
		final BigDecimal left = visit(ctx.expression(0));
		final BigDecimal right = visit(ctx.expression(1));
		if (ctx.op.getText().equals("+")) {
			return left.add(right);
		} else {
			return left.subtract(right);
		}
	}

	@Override
	public BigDecimal visitNum(BigCalcProgParser.NumContext ctx) {
		return new BigDecimal(ctx.Number().getText());
	}

	@Override
	public BigDecimal visitVar(BigCalcProgParser.VarContext ctx) {
		return memory.getOrDefault(ctx.Variable().getText(), BigDecimal.ZERO);
	}

	@Override
	public BigDecimal visitParens(BigCalcProgParser.ParensContext ctx) {
		return visit(ctx.expression());
	}
}