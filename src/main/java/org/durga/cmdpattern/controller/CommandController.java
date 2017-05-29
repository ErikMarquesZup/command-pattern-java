package org.durga.cmdpattern.controller;

import org.durga.cmdpattern.exception.CommandNotAvailableException;
import org.durga.cmdpattern.service.CommandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @Author	    : Durga Prasad Narikalapa
 * @Created On  : 24-May-2017 10:29:37 AM
 * @Version	    : 1.0 
 * @Description : "CommandController" is used for
 * 
 **/

@RestController
@EnableAutoConfiguration
public class CommandController {
	
	private static final Logger log = LoggerFactory.getLogger(CommandController.class);
	
	@Autowired
	private CommandService commandSerivce;
	
	@GetMapping("/execute/{id}")
	public ResponseEntity<Void> runCommand(@PathVariable("id") String commandId) {
		if (log.isDebugEnabled()) {
            log.debug("execute command of commandId @" + commandId);
        }
		try {
			commandSerivce.executeCommand(commandId);
		} catch (CommandNotAvailableException e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
