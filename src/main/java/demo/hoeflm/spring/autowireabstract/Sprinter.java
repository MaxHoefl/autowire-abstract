package demo.hoeflm.spring.autowireabstract;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Sprinter extends Athlete {

	public Sprinter(String name) {
		super(name);
	}

	@Override
	protected void perform() 
	{
		System.out.println("Trainer is null?" + trainer == null);
		this.trainer.giveAdviceTo(name);
		for(int i=0;i<3;i++)
		{
			System.out.println("Sprinting...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
