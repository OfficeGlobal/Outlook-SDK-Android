/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Corporation. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.outlook.fetchers;

import com.microsoft.services.outlook.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.Readable;

/**
 * The type  Notification
 */
public class NotificationFetcher extends OrcEntityFetcher<Notification,NotificationOperations> 
                                     implements Readable<Notification> {

     /**
     * Instantiates a new NotificationFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public NotificationFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, Notification.class, NotificationOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public NotificationFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }
	
	/**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public NotificationFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
         /**
     * Gets resourcedata.
     *
     * @return the resource data
     */
    public EntityFetcher getResourceDatum() {
        return new EntityFetcher("ResourceData", this);
    }

}
