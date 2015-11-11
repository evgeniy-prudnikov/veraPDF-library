/**
 * 
 */
package org.verapdf.pdfa.validation;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Encapsulates the details of an error message, a String message and a
 * <code>List<String></code> of arguments to substitute into the error message
 * 
 * @author <a href="mailto:carl@openpreservation.org">Carl Wilson</a>
 *
 */
@XmlJavaTypeAdapter(ErrorDetailsImpl.Adapter.class)
public interface ErrorDetails {
    /**
     * @return the Error message as a String
     */
    public String getMessage();

    /**
     * @return a List of String arguments for the error, or an empty List if
     *         there are no args.
     */
    public List<String> getArguments();
}
