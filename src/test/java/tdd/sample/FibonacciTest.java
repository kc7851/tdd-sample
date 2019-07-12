package tdd.sample;

import org.junit.Test;

import static org.junit.Assert.*;
import static sun.jvm.hotspot.HelloWorld.fib;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FibonacciTest {

    @Test
    public void fibonacciTest(){

        Fibonacci fibonacci = new Fibonacci();
        assertThat(fibonacci.fib(1), is(1));
        assertThat(fibonacci.fib(2), is(1));
        assertThat(fibonacci.fib(3), is(2));
        assertThat(fibonacci.fib(4), is(3));
        assertThat(fibonacci.fib(5), is(5));
        assertThat(fibonacci.fib(6), is(8));
        assertThat(fibonacci.fib(7), is(13));
        assertThat(fibonacci.fib(8), is(21));
        assertThat(fibonacci.fib(9), is(34));
        assertThat(fibonacci.fib(10), is(55));
    }


    @Test
    public void fibonacciArrayTest(){
        Fibonacci fibonacci = new Fibonacci();
        assertThat(fibonacci.fibonacciArray(1), is(1));
        assertThat(fibonacci.fibonacciArray(2), is(1));
        assertThat(fibonacci.fibonacciArray(3), is(2));
        assertThat(fibonacci.fibonacciArray(4), is(3));
        assertThat(fibonacci.fibonacciArray(5), is(5));
        assertThat(fibonacci.fibonacciArray(6), is(8));
        assertThat(fibonacci.fibonacciArray(7), is(13));
        assertThat(fibonacci.fibonacciArray(8), is(21));
        assertThat(fibonacci.fibonacciArray(9), is(34));
        assertThat(fibonacci.fibonacciArray(10), is(55));
    }

}