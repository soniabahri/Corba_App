package NoteInterfaceModule;

/**
 * Interface definition : NoteInterface
 * 
 * @author OpenORB Compiler
 */
public class NoteInterfacePOATie extends NoteInterfacePOA
{

    //
    // Private reference to implementation object
    //
    private NoteInterfaceOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public NoteInterfacePOATie(NoteInterfaceOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public NoteInterfacePOATie(NoteInterfaceOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public NoteInterfaceOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(NoteInterfaceOperations delegate_)
    {
        _tie = delegate_;
    }

    /**
     * _default_POA method
     */
    public org.omg.PortableServer.POA _default_POA()
    {
        if (_poa != null)
            return _poa;
        else
            return super._default_POA();
    }

    /**
     * Operation getNote
     */
    public double getNote(short cin, String codeMatiere)
    {
        return _tie.getNote( cin,  codeMatiere);
    }

    /**
     * Operation shutdown
     */
    public void shutdown()
    {
        _tie.shutdown();
    }

}
