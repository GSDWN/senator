package com.artronics.gsdwn.senator.map;

import com.artronics.gsdwn.senator.config.SenatorBeanConfigTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SenatorBeanConfigTest.class)
public class SdwnMapUpdaterTest
{
    @Autowired
    MapUpdater mapUpdater;

    @Test
    public void it(){

    }
}