package com.company;


import NoteInterfaceModule.NoteInterface;

public class Client {
    public static void main(String[] args) {
        try {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
            org.omg.CORBA.Object distantNote = orb.string_to_object("IOR:000000000000002A49444C3A4E6F7465496E746572666163654D6F64756C652F4E6F7465496E746572666163653A312E30000000000000010000000000000058000102000000000D3139322E3136382E362E36320000C62900000014004F4F011F8FC0847D010000504F41FEB446281800000001000000010000001C00000000050100010000000100010020000101090000000100010100");
            NoteInterface note = NoteInterfaceModule.NoteInterfaceHelper.narrow(distantNote);
            System.out.println("Note = "+note.getNote((short) 999, "Base de données"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}