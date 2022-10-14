package polymorphismDemo;

public class main {

	public static void main(String[] args) {
//		BaseLogger[] loggers = new BaseLogger[]{ new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//		
//		for(BaseLogger logger:loggers) {
//			logger.Log("log mesaji");
//		}
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
