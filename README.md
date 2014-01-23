expression-evaluator
===================
Expression evaluator will take a expression as input from command line. It will evaluate the expression and gives result.

##How to install

1.Extract zip folder.

2.Set Environment variable as EVALUATOR_HOME.

3.classpath contains path of bin folder.

4.run command sh evaluator.sh "expression".

5.ex sh evaluator.sh "1 + 2".

##Relaese 0.5

     * It supports decimal operations.

##Relaese 0.4

    * Nesting of brackets is allowed.
    * Brackets should be attached to number.

    Bugs:
        It not supports floating result.

##Relaese 0.3

    * Multiple brackets without nesting is allowed.
    * Brackets should be attached to number.

    Bugs:
        It not supports floating result.

##Relaese 0.2

    * Two or more operands and operators can be given.

    Bugs:
        It not supports floating result.

##Relaese 0.1

Input Specification:-

    * Only integer operands are possible.
    * Only two operands and one operator can be given.
    * Brackets not allowed.
    * There must be a space between each operand and operator.
    * Operators possible are :-
        +,-,*,/,^

