package org.durga.cmdpattern.commands;

/**
 * 
 * @Author	    : Durga Prasad Narikalapa
 * @Created On  : 24-May-2017 12:16:41 PM
 * @Version	    : 1.0 
 * @Description : "SenMessage" is used for
 * 
 **/

public class SendMessage implements Command {

	@Override
	public void execute() {
		System.out.println("Sending a message");
	}

}
