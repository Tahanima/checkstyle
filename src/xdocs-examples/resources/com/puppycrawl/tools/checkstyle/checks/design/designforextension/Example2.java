/*xml
<module name="Checker">
  <module name="TreeWalker">
    <module name="DesignForExtension">
      <property name="ignoredAnnotations" value="Override"/>
    </module>
  </module>
</module>
*/
package com.puppycrawl.tools.checkstyle.checks.design.designforextension;

// xdoc section -- start
public abstract class Example2 {
  private int bar;

  public int m1() {return 2;}  // violation

  public int m2() {return 8;}  // violation

  private void m3() {m4();}  // OK. Private method.

  protected void m4() { }  // OK. No implementation.

  public abstract void m5();  // OK. Abstract method.

  /**
   * This implementation ...
   @return some int value.
   */
  public int m6() {return 1;}  // OK. Have javadoc on overridable method.

  /**
   * Some comments ...
   */
  public int m7() {return 1;}  // OK. Have javadoc on overridable method.

  /**
   * This
   * implementation ...
   */
  public int m8() {return 2;}  // OK. Have javadoc on overridable method.

  @Override
  public String toString() {
    return "";
  }
}
// xdoc section -- end
