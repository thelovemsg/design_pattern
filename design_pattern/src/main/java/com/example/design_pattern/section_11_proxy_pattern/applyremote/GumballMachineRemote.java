package com.example.design_pattern.section_11_proxy_pattern.applyremote;

import com.example.design_pattern.section_10_status_pattern.gumballstate.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;
}
