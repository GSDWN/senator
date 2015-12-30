package com.artronics.gsdwn.senator.map;

import com.artronics.gsdwn.core.models.packet.SdwnPacket;
import com.artronics.gsdwn.suren.services.SdwnNodeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SdwnMapUpdater implements MapUpdater
{
    private final static Logger log = Logger.getLogger(SdwnMapUpdater.class);

    @Autowired
    SdwnNodeService nodeService;

    @Override
    public void addPacket(SdwnPacket packet)
    {

    }
}
