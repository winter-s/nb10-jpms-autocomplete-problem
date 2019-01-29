
package example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "foo", namespace = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class Foo {

  @XmlElement(name = "bar")
  private String bar;

  Foo() {
  }

  public Foo(String bar) {
    this.bar = bar;
  }

  public String getBar() {
    return bar;
  }

}
