
package org.protospec.net;

/**
 * A controller interface.
 */
public interface Controller
{
    Response processRequest( Request request );

    void addHandler( Request request, RequestHandler requestHandler );
}
