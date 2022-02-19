package NoteInterfaceModule;

/**
 * Holder class for : NoteInterface
 * 
 * @author OpenORB Compiler
 */
final public class NoteInterfaceHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal NoteInterface value
     */
    public NoteInterfaceModule.NoteInterface value;

    /**
     * Default constructor
     */
    public NoteInterfaceHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public NoteInterfaceHolder(NoteInterfaceModule.NoteInterface initial)
    {
        value = initial;
    }

    /**
     * Read NoteInterface from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = NoteInterfaceHelper.read(istream);
    }

    /**
     * Write NoteInterface into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        NoteInterfaceHelper.write(ostream,value);
    }

    /**
     * Return the NoteInterface TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return NoteInterfaceHelper.type();
    }

}
