package com.example.design_pattern.section_11_proxy_pattern.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
