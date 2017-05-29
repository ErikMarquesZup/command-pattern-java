package org.durga.cmdpattern.repository;

import org.durga.cmdpattern.entity.CommandData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 
 * @Author	    : Durga Prasad Narikalapa
 * @Created On  : 24-May-2017 12:29:21 AM
 * @Version	    : 1.0 
 * @Description : "CommandDao" is used for
 * 
 **/

public interface CommandRepository extends JpaRepository<CommandData, Long>, JpaSpecificationExecutor<CommandData>{

	public CommandData findByCommandId(String commandId);

}
