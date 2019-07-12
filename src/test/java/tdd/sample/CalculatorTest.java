package tdd.sample;


// 1 + 2 = 3
// calculator
// - plus(x, y)
// => plus(1, 2) => 3
// - minus(x, y)
// - multiply(x, y)
// - divide(x, y)
// lhs(left hand side), rhs(right hand side)
// lhs operator rhs
// lhs = rhs


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void plus() {
        Calculator calculator = new Calculator();
        assertThat(calculator.plus(1, 2), is(3));
    }
}
