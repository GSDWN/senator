package com.artronics.gsdwn.senator.config;

import com.artronics.gsdwn.suren.config.SurenBeanConfig;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.artronics.gsdwn.senator"})
@Import({SurenBeanConfig.class})
public class SenatorBeanConfig
{
    private final static Logger log = Logger.getLogger(SenatorBeanConfig.class);
}
