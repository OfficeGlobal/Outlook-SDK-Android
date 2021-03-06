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
package com.microsoft.services.outlook;

import com.microsoft.services.orc.core.ODataBaseEntity;




/**
 * The type Date Time Time Zone.
*/
public class DateTimeTimeZone extends ODataBaseEntity {

    public DateTimeTimeZone(){
        setODataType("#Microsoft.OutlookServices.DateTimeTimeZone");
    }

    private String DateTime;

    /**
    * Gets the Date Time.
    *
    * @return the String
    */
    public String getDateTime() {
        return this.DateTime; 
    }

    /**
    * Sets the Date Time.
    *
    * @param value the String
    */
    public void setDateTime(String value) { 
        this.DateTime = value;
        valueChanged("DateTime", value);

    }

    private String TimeZone;

    /**
    * Gets the Time Zone.
    *
    * @return the String
    */
    public String getTimeZone() {
        return this.TimeZone; 
    }

    /**
    * Sets the Time Zone.
    *
    * @param value the String
    */
    public void setTimeZone(String value) { 
        this.TimeZone = value;
        valueChanged("TimeZone", value);

    }
}
