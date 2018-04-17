package demo.hoeflm.spring.autowireabstract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public abstract class Athlete implements Runnable{

	protected final String name;
	
	@Autowired protected Trainer trainer;
	
	
	public Athlete(String name)
	{
		this.name = name;
	}
	
	protected abstract void perform();
	
	@Override
	public void run() {
		perform();
	}
}
