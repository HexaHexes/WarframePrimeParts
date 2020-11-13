package org.bitwisemadness.warframeprimeparts.services.parts.companions;

import org.bitwisemadness.warframeprimeparts.database.model.parts.companions.PartsSentinel;

import java.util.List;

public interface IPartsSentinelService {
    List<PartsSentinel> findAll();

    List<PartsSentinel> findByName(String name);

    PartsSentinel findByNameByUser(String name, String appUser);

    void put (PartsSentinel parts);

    void delete(String name, String appUser);
}
