
package example;

import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * Test to show that auto-complete is limited to the scope of the module-info
 * E.g. try removing the imports of org.junit and you'll see that "Fix Imports" can't add them back
 */
public class FooTest {

  @Test
  public void testMarshalling() throws Exception {

    Foo instance = new Foo("hello JPMS");

    JAXBContext ctx = JAXBContext.newInstance(Foo.class);
    StringWriter writer = new StringWriter();
    Marshaller marshaller = ctx.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

    marshaller.marshal(instance, writer);
    
    // org.junit is not on auto-complete

    assertEquals("<foo>\n"
        + "    <bar>hello JPMS</bar>\n"
        + "</foo>", writer.toString());
  }

}
