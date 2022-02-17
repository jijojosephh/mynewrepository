import org.apache.log4j.Logger;

public class Test {
	
	final static Logger logger = Logger.getLogger(Test.class);

	public static void main(String[] args) {
		
		String parameter = "test";
		// TODO Auto-generated method stub
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}
		
		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
		
		try {
			int i = 10;
			int c =0;
			int k = i/c;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Exception occured" + e.getMessage());
		}

	}

}
