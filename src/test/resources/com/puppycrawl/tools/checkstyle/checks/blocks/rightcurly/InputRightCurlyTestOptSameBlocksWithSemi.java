/*
RightCurly
option = (default)SAME
tokens = CLASS_DEF, METHOD_DEF, CTOR_DEF, ANNOTATION_DEF, ENUM_DEF, INTERFACE_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.blocks.rightcurly;

public class InputRightCurlyTestOptSameBlocksWithSemi {

    public void testMethod() {};

    public void testMethod1() {
    }; // violation ''}' at column 5 should be alone on a line'

    public class TestClass {};

    public class TestClass1 {
    }; // violation ''}' at column 5 should be alone on a line'

    public class TestClass2 {
        public TestClass2() {};

        public TestClass2(String someValue) {
        }; // violation ''}' at column 9 should be alone on a line'
    }

    public void testMethod11() {
    }
    ;

    public @interface TestAnnnotation5 {
        String someValue(); }; // violation ''}' at column 29 should have line break before'

    public @interface TestAnnotation6 {};

    public @interface TestAnnotation7 {
        String someValue();
    }; // violation ''}' at column 5 should be alone on a line'

    public @interface TestAnnotation8 { String someValue();
    }; // violation ''}' at column 5 should be alone on a line'

    public @interface TestAnnotation9 { String someValue(); };

    enum TestEnum{};

    enum TestEnum1{
        SOME_VALUE;}; // violation ''}' at column 20 should have line break before'

    enum TestEnum2 { SOME_VALUE; };

    enum TestEnum3{
        SOME_VALUE;
    }; // violation ''}' at column 5 should be alone on a line'

    enum TestEnum4{ SOME_VALUE;
    }; // violation ''}' at column 5 should be alone on a line'

    interface Interface1
    {
        int i = 1;
        public void meth1(); }; // violation ''}' at column 30 should have line break before'

    interface Interface2
    { int i = 1; public void meth1(); };

    interface Interface3 {
        void display();
        interface Interface4 {
            void myMethod();
        };}; // 2 violations

    interface InterfaceEndingWithSemiColon2 {
        public void fooEmpty();
    }; // violation ''}' at column 5 should be alone on a line'
}
