package org.durga.cmdpattern.service.impl;

import org.durga.cmdpattern.commands.Command;
import org.durga.cmdpattern.entity.CommandData;
import org.durga.cmdpattern.exception.CommandNotAvailableException;
import org.durga.cmdpattern.repository.CommandRepository;
import org.durga.cmdpattern.service.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @Author	    : Durga Prasad Narikalapa
 * @Created On  : 24-May-2017 11:33:58 AM
 * @Version	    : 1.0 
 * @Description : "CommandServiceImpl" is used for
 * 
 **/

@Service
public class CommandServiceImpl implements CommandService {

	@Autowired
	private CommandRepository commandRepository;

	@Override
	public String executeCommand(String commandId) throws CommandNotAvailableException {
		CommandData commandData = commandRepository.findByCommandId(commandId);

		if (null == commandData) {
			throw new CommandNotAvailableException("Command not available");
		} else {
			invokeCommand(commandData);
		}

		return "";
	}

	private void invokeCommand(CommandData commandData) {
		Class<?> className = null;
		try {
			className = Class.forName(commandData.getClassName());
			Command command = (Command) className.newInstance();
			command.execute();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
