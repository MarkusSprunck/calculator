## Task

Write a simple calculator with a TDD approach. Available time is 60 minutes.

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
[INFO] Building Calculator 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ Calculator ---
[INFO] Deleting /Users/markus/IdeaProjects/private/calculator/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Calculator ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/markus/IdeaProjects/private/calculator/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Calculator ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to /Users/markus/IdeaProjects/private/calculator/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Calculator ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/markus/IdeaProjects/private/calculator/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Calculator ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/markus/IdeaProjects/private/calculator/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Calculator ---
[INFO] Surefire report directory: /Users/markus/IdeaProjects/private/calculator/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running calculator.CalculatorTest
Tests run: 22, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.087 sec

Results :

Tests run: 22, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ Calculator ---
[INFO] Building jar: /Users/markus/IdeaProjects/private/calculator/target/Calculator-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.178 s
[INFO] Finished at: 2023-02-07T08:35:53+01:00
[INFO] ------------------------------------------------------------------------
```