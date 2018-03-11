package com.company;

import org.apache.log4j.Logger;

public class Main {

    final static Logger logger=Logger.getLogger(Main.class);

    public static void main(String[] args) {
	  logger.trace("This is Trace");
	  logger.debug("This is Debug");
	  logger.info("This is Info");
	  logger.warn("This is Warning");
	  logger.error("This is Error");
	  logger.fatal("This is Fatal");

    }
}
