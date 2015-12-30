package com.artronics.gsdwn.senator.map;

import com.artronics.gsdwn.core.models.packet.SdwnPacket;

public interface MapUpdater
{
    void addPacket(SdwnPacket packet);
}
