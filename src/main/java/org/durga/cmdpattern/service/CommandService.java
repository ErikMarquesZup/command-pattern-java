package org.durga.cmdpattern.service;

import org.durga.cmdpattern.exception.CommandNotAvailableException;

/**
 * 
 * @Author	    : Durga Prasad Narikalapa
 * @Created On  : 24-May-2017 11:30:45 AM
 * @Version	    : 1.0 
 * @Description : "CommandService" is used for
 * 
 **/

public interface CommandService {
	
	String executeCommand(String commandId) throws CommandNotAvailableException;
	
}
