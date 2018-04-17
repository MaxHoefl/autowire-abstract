package demo.hoeflm.spring.autowireabstract;

import org.springframework.stereotype.Component;

@Component
public class TrainerImpl implements Trainer{

	@Override
	public void	giveAdviceTo(String name)
	{
		System.out.println("Go " + name + "!!");
	}

}
