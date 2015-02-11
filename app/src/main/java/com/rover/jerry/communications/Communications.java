package com.rover.jerry.communications;

/**
 * Created by freelance on 11/02/15.
 */
public interface Communications {

    /* Pass in all server and com details in constructor */

    public void send();

    public void registerReceiver(CommunicationsReceiver rx);

    public boolean connect();

    public void disconnect();


}
