package NoteInterfaceModule;

/**
 * Interface definition : NoteInterface
 * 
 * @author OpenORB Compiler
 */
public class _NoteInterfaceStub extends org.omg.CORBA.portable.ObjectImpl
        implements NoteInterface
{
    static final String[] _ids_list =
    {
        "IDL:NoteInterfaceModule/NoteInterface:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = NoteInterfaceModule.NoteInterfaceOperations.class;

    /**
     * Operation getNote
     */
    public double getNote(short cin, String codeMatiere)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("getNote",true);
                    _output.write_short(cin);
                    _output.write_string(codeMatiere);
                    _input = this._invoke(_output);
                    double _arg_ret = _input.read_double();
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("getNote",_opsClass);
                if (_so == null)
                   continue;
                NoteInterfaceModule.NoteInterfaceOperations _self = (NoteInterfaceModule.NoteInterfaceOperations) _so.servant;
                try
                {
                    return _self.getNote( cin,  codeMatiere);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation shutdown
     */
    public void shutdown()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("shutdown",false);
                    _input = this._invoke(_output);
                    return;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("shutdown",_opsClass);
                if (_so == null)
                   continue;
                NoteInterfaceModule.NoteInterfaceOperations _self = (NoteInterfaceModule.NoteInterfaceOperations) _so.servant;
                try
                {
                    _self.shutdown();
                    return;
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
