package org.durga.cmdpattern.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @Author	    : Durga Prasad Narikalapa
 * @Created On  : 24-May-2017 12:30:29 AM
 * @Version	    : 1.0 
 * @Description : "CommandData" is used for
 * 
 **/

@Entity
@Table(name = "COMMANDS")
public class CommandData {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String commandId;
	private String className;
	private String data;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCommandId() {
		return commandId;
	}

	public void setCommandId(String commandId) {
		this.commandId = commandId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
