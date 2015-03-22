package eu.excitementproject.eop.lap.dkpro;
import eu.excitementproject.eop.lap.LAPAccess;
import eu.excitementproject.eop.lap.LAPException;
import eu.excitementproject.eop.lap.dkpro.OpenNLPTaggerEN;

/**
 * This class supports LAPAccess interface, with Portuguese tokenization and tagging
 *  
 * Reuse EN code, but just set the langID as PT. 
 * 
 * @author Gil
 *
 */
public class OpenNLPTaggerPT extends OpenNLPTaggerEN implements LAPAccess {

    /**
     * The constructor sets the language flag.
     * 
     * @throws LAPException
     */
    public OpenNLPTaggerPT() throws LAPException {
        super(); 
        languageIdentifier = "PT"; 
    }

}
