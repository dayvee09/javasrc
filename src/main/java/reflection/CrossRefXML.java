import java.io.*;
import java.lang.reflect.*;

/** This class subclasss CrossRef to output the information in XML.
 * @version $Id$
 */
public class CrossRefXML extends CrossRef {

	public static void main(String[] argv) {
		CrossRef xref = new CrossRefXML();
		xref.doArgs(argv);
	}

	/** Print the start of a class.
	 */
	protected void startClass(Class c) {
		println("<class><classname>" + c.getName() + "</classname>");
	}

	protected void putField(Field fld, Class c) {
		println("<field>" + fld + "</field>");
	}

	/** put a Method's information to the standard output.
	 * Marked protected so you can override it (hint, hint).
	 */
	protected void putMethod(Method method, Class c) {
		println("<method>" + method + "</method>");
	}

	/** Print the end of a class. 
	 */
	protected void endClass() {
		println("</class>");
	}
}
