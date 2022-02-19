package NoteInterfaceModule;

/**
 * Interface definition : NoteInterface
 * 
 * @author OpenORB Compiler
 */
public abstract class NoteInterfacePOA extends org.omg.PortableServer.Servant
        implements NoteInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{
    public NoteInterface _this()
    {
        return NoteInterfaceHelper.narrow(_this_object());
    }

    public NoteInterface _this(org.omg.CORBA.ORB orb)
    {
        return NoteInterfaceHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:NoteInterfaceModule/NoteInterface:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("getNote")) {
                return _invoke_getNote(_is, handler);
        } else if (opName.equals("shutdown")) {
                return _invoke_shutdown(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_getNote(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        short arg0_in = _is.read_short();
        String arg1_in = _is.read_string();

        double _arg_result = getNote(arg0_in, arg1_in);

        _output = handler.createReply();
        _output.write_double(_arg_result);

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_shutdown(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;

        shutdown();

        _output = handler.createReply();

        return _output;
    }

}
