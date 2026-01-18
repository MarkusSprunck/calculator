## Task

Write a simple calculator with a Test Driven Development approach. Available time is 60 minutes.

#### 1) Create Class Calculator 

```java
public class Calculator {

    public static final String INVALID_INPUT = "INVALID_INPUT";

    public static String run(String calculation) {
        //TODO: place implementation here
        return INVALID_INPUT;
    }
}    
```

#### 2) Use TDD (test first approach)

#### 3) Requirements

    a. Always three parameter (e.g. "2 + 5", "4 * 6" )

    b. Valid operators => {‘+’, ’-‘, ‘*’, ‘/’}

    c. All operators are separated by a single whitespace ’ ‘

    d. Input is always integer

    e. Output is Integer or Float (with 3 digits after the decimal point) as String

    f. If the input is not valid the return value is “INVALID INPUT”

    g. If the calculation fails the return value is “ERROR”

#### 4) Examples:

    a. Input: 1 + 3

       Output: 4

    b. Input: 1 - 3

       Output: -2

    c. Input: 1 + a

       Output: INVALID INPUT

    d. Input: 1 / 0

       Output: ERROR


### Build and Test

```shell
mvn clean verify
```

Expected result:
```shell
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------< org.example:Calculator >-----------------------
[INFO] Building Calculator 2.0
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ Calculator ---
[INFO] Deleting /Users/markus/Projects/github/calculator/target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ Calculator ---
[INFO] skip non existing resourceDirectory /Users/markus/Projects/github/calculator/src/main/resources
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ Calculator ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 3 source files with javac [debug release 21] to target/classes
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ Calculator ---
[INFO] skip non existing resourceDirectory /Users/markus/Projects/github/calculator/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ Calculator ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 1 source file with javac [debug release 21] to target/test-classes
[INFO] 
[INFO] --- surefire:3.5.4:test (default-test) @ Calculator ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running calculator.CalculatorTest
[INFO] Tests run: 22, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.123 s -- in calculator.CalculatorTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 22, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- jar:3.4.1:jar (default-jar) @ Calculator ---
[INFO] Building jar: /Users/markus/Projects/github/calculator/target/Calculator-2.0.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.565 s
[INFO] Finished at: 2026-01-18T10:57:09+01:00
[INFO] ------------------------------------------------------------------------
```
