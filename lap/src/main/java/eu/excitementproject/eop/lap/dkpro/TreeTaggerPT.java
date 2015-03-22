package eu.excitementproject.eop.lap.dkpro;
import eu.excitementproject.eop.lap.LAPAccess;
import eu.excitementproject.eop.lap.LAPException;
import eu.excitementproject.eop.lap.dkpro.TreeTaggerEN;

/**
 * This class supports LAPAccess interface, with Portuguese tokenization, lemmatization 
 * and POS tagging
 * 
 * Reuse EN code, but just set the langID as PT. The Default Lang ID is needed when 
 * LAPAccess is used to generate a new pair of TE pairs from string inputs. 
 * 
 * @author Erick Fonseca
 *
 */
public class TreeTaggerPT extends TreeTaggerEN implements LAPAccess {

    /**
     * The constructor sets the language flag.
     * 
     * @throws LAPException
     */
    public TreeTaggerPT() throws LAPException {
        super(); 
        languageIdentifier = "PT";
    }
}
