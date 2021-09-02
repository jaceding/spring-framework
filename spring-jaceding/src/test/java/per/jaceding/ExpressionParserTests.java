package per.jaceding;

import org.junit.jupiter.api.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * ExpressionParser 测试
 *
 * @author jaceding
 * @date 2021/9/2
 */
public class ExpressionParserTests {

	@Test
	public void test1() {
		String expStr = "100 * 2 + 10 * 3 - 66";
		ExpressionParser expressionParser = new SpelExpressionParser();
		Expression expression = expressionParser.parseExpression(expStr);
		Integer result = (Integer) expression.getValue();
		System.out.println(expStr + " = " + result);
	}
}
