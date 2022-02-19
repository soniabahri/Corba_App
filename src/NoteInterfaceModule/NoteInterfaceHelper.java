package NoteInterfaceModule;

/** 
 * Helper class for : NoteInterface
 *  
 * @author OpenORB Compiler
 */ 
public class NoteInterfaceHelper
{
    /**
     * Insert NoteInterface into an any
     * @param a an any
     * @param t NoteInterface value
     */
    public static void insert(org.omg.CORBA.Any a, NoteInterfaceModule.NoteInterface t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract NoteInterface from an any
     * @param a an any
     * @return the extracted NoteInterface value
     */
    public static NoteInterfaceModule.NoteInterface extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return NoteInterfaceModule.NoteInterfaceHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the NoteInterface TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"NoteInterface");
        }
        return _tc;
    }

    /**
     * Return the NoteInterface IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:NoteInterfaceModule/NoteInterface:1.0";

    /**
     * Read NoteInterface from a marshalled stream
     * @param istream the input stream
     * @return the readed NoteInterface value
     */
    public static NoteInterfaceModule.NoteInterface read(org.omg.CORBA.portable.InputStream istream)
    {
        return(NoteInterfaceModule.NoteInterface)istream.read_Object(NoteInterfaceModule._NoteInterfaceStub.class);
    }

    /**
     * Write NoteInterface into a marshalled stream
     * @param ostream the output stream
     * @param value NoteInterface value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, NoteInterfaceModule.NoteInterface value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to NoteInterface
     * @param obj the CORBA Object
     * @return NoteInterface Object
     */
    public static NoteInterface narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof NoteInterface)
            return (NoteInterface)obj;

        if (obj._is_a(id()))
        {
            _NoteInterfaceStub stub = new _NoteInterfaceStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to NoteInterface
     * @param obj the CORBA Object
     * @return NoteInterface Object
     */
    public static NoteInterface unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof NoteInterface)
            return (NoteInterface)obj;

        _NoteInterfaceStub stub = new _NoteInterfaceStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
