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
 * The type Mail Folder.
*/
public class MailFolder extends Entity {

    public MailFolder(){
        setODataType("#Microsoft.OutlookServices.MailFolder");
    }
            
    private String DisplayName;
     
    /**
    * Gets the Display Name.
    *
    * @return the String
    */
    public String getDisplayName() {
        return this.DisplayName; 
    }

    /**
    * Sets the Display Name.
    *
    * @param value the String
    */
    public void setDisplayName(String value) { 
        this.DisplayName = value; 
        valueChanged("DisplayName", value);

    }
            
    private String ParentFolderId;
     
    /**
    * Gets the Parent Folder Id.
    *
    * @return the String
    */
    public String getParentFolderId() {
        return this.ParentFolderId; 
    }

    /**
    * Sets the Parent Folder Id.
    *
    * @param value the String
    */
    public void setParentFolderId(String value) { 
        this.ParentFolderId = value; 
        valueChanged("ParentFolderId", value);

    }
            
    private Integer ChildFolderCount;
     
    /**
    * Gets the Child Folder Count.
    *
    * @return the Integer
    */
    public Integer getChildFolderCount() {
        return this.ChildFolderCount; 
    }

    /**
    * Sets the Child Folder Count.
    *
    * @param value the Integer
    */
    public void setChildFolderCount(Integer value) { 
        this.ChildFolderCount = value; 
        valueChanged("ChildFolderCount", value);

    }
            
    private Integer UnreadItemCount;
     
    /**
    * Gets the Unread Item Count.
    *
    * @return the Integer
    */
    public Integer getUnreadItemCount() {
        return this.UnreadItemCount; 
    }

    /**
    * Sets the Unread Item Count.
    *
    * @param value the Integer
    */
    public void setUnreadItemCount(Integer value) { 
        this.UnreadItemCount = value; 
        valueChanged("UnreadItemCount", value);

    }
            
    private Integer TotalItemCount;
     
    /**
    * Gets the Total Item Count.
    *
    * @return the Integer
    */
    public Integer getTotalItemCount() {
        return this.TotalItemCount; 
    }

    /**
    * Sets the Total Item Count.
    *
    * @param value the Integer
    */
    public void setTotalItemCount(Integer value) { 
        this.TotalItemCount = value; 
        valueChanged("TotalItemCount", value);

    }
    
        
    private java.util.List<Message> Messages = null;
    
    
     
    /**
    * Gets the Messages.
    *
    * @return the java.util.List<Message>
    */
    public java.util.List<Message> getMessages() {
        return this.Messages; 
    }

    /**
    * Sets the Messages.
    *
    * @param value the java.util.List<Message>
    */
    public void setMessages(java.util.List<Message> value) { 
        this.Messages = value; 
        valueChanged("Messages", value);

    }
    
        
    private java.util.List<MailFolder> ChildFolders = null;
    
    
     
    /**
    * Gets the Child Folders.
    *
    * @return the java.util.List<MailFolder>
    */
    public java.util.List<MailFolder> getChildFolders() {
        return this.ChildFolders; 
    }

    /**
    * Sets the Child Folders.
    *
    * @param value the java.util.List<MailFolder>
    */
    public void setChildFolders(java.util.List<MailFolder> value) { 
        this.ChildFolders = value; 
        valueChanged("ChildFolders", value);

    }
}

