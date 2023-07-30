package com.example.design_pattern.section_11_proxy_pattern.applyremote;

import com.example.design_pattern.section_10_status_pattern.gumballstate.State;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    State state;
    int count = 0;
    String location;

    protected GumballMachine(String location, int count) throws RemoteException {
        this.location = location;
        this.count = count;
    }

    @Override
    public int getCount() throws RemoteException {
        return count;
    }

    @Override
    public String getLocation() throws RemoteException {
        return location;
    }

    @Override
    public State getState() throws RemoteException {
        return state;
    }
}
