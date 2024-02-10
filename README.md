# BigCalcProg Interpreter

BigCalcProg is an extended interpreter for processing programs with enhanced functionality. It is built using ANTLR for Programming Languages and Concepts (PLC) at University of Vienna.

## Features

- A program consists of one or more statements, each terminated with a semicolon (`;`).
- A statement can be an assignment statement (e.g., `t = 7;`) or an expression statement (e.g., `1 + 2 * s / u;`).
- Expressions can contain variables and parentheses, e.g., `(1+x)*3`.
- Variables are comprised of one letter and zero or more digits.
- Undefined variables have the value 0.
- The result of the last statement in a program is printed on the console.
