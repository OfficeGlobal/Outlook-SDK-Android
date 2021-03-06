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





/**
 * The type Conversation.
*/
public class Conversation extends Entity {

    public Conversation(){
        setODataType("#Microsoft.OutlookServices.Conversation");
    }
            
    private String Topic;
     
    /**
    * Gets the Topic.
    *
    * @return the String
    */
    public String getTopic() {
        return this.Topic; 
    }

    /**
    * Sets the Topic.
    *
    * @param value the String
    */
    public void setTopic(String value) { 
        this.Topic = value; 
        valueChanged("Topic", value);

    }
            
    private Boolean HasAttachments;
     
    /**
    * Gets the Has Attachments.
    *
    * @return the Boolean
    */
    public Boolean getHasAttachments() {
        return this.HasAttachments; 
    }

    /**
    * Sets the Has Attachments.
    *
    * @param value the Boolean
    */
    public void setHasAttachments(Boolean value) { 
        this.HasAttachments = value; 
        valueChanged("HasAttachments", value);

    }
            
    private java.util.Calendar LastDeliveredDateTime;
     
    /**
    * Gets the Last Delivered Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getLastDeliveredDateTime() {
        return this.LastDeliveredDateTime; 
    }

    /**
    * Sets the Last Delivered Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setLastDeliveredDateTime(java.util.Calendar value) { 
        this.LastDeliveredDateTime = value; 
        valueChanged("LastDeliveredDateTime", value);

    }
    
        
    private java.util.List<String> UniqueSenders = null;
    
    
     
    /**
    * Gets the Unique Senders.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getUniqueSenders() {
        return this.UniqueSenders; 
    }

    /**
    * Sets the Unique Senders.
    *
    * @param value the java.util.List<String>
    */
    public void setUniqueSenders(java.util.List<String> value) { 
        this.UniqueSenders = value; 
        valueChanged("UniqueSenders", value);

    }
            
    private String Preview;
     
    /**
    * Gets the Preview.
    *
    * @return the String
    */
    public String getPreview() {
        return this.Preview; 
    }

    /**
    * Sets the Preview.
    *
    * @param value the String
    */
    public void setPreview(String value) { 
        this.Preview = value; 
        valueChanged("Preview", value);

    }
    
        
    private java.util.List<ConversationThread> Threads = null;
    
    
     
    /**
    * Gets the Threads.
    *
    * @return the java.util.List<ConversationThread>
    */
    public java.util.List<ConversationThread> getThreads() {
        return this.Threads; 
    }

    /**
    * Sets the Threads.
    *
    * @param value the java.util.List<ConversationThread>
    */
    public void setThreads(java.util.List<ConversationThread> value) { 
        this.Threads = value; 
        valueChanged("Threads", value);

    }
}

