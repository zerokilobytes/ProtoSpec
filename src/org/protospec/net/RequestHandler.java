package org.protospec.net;

/**
 * The request-handler interface.
 */
public interface RequestHandler
{
    Response process( Request request ) throws Exception;
}
