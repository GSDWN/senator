package com.artronics.gsdwn.senator.config;

import com.artronics.gsdwn.suren.config.SurenBeanConfigTest;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.artronics.gsdwn.senator")
@Import(SurenBeanConfigTest.class)
public class SenatorBeanConfigTest
{
    private final static Logger log = Logger.getLogger(SenatorBeanConfigTest.class);
}
