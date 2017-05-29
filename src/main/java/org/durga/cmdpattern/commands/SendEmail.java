package org.durga.cmdpattern.commands;

/**
 * 
 * @Author	    : Durga Prasad Narikalapa
 * @Created On  : 24-May-2017 12:18:10 PM
 * @Version	    : 1.0 
 * @Description : "SendEmail" is used for
 * 
 **/

public class SendEmail implements Command {

	@Override
	public void execute() {
		System.out.println("Sending an email");
	}

}
