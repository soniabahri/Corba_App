package com.company;

public class NoteImpl extends NoteInterfaceModule.NoteInterfacePOA{

    @Override
    public double getNote(short cin, String codeMatiere) {
        return Math.random()*10+10;
    }

    @Override
    public void shutdown() {

    }
}
