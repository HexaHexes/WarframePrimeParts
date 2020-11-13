package org.bitwisemadness.warframeprimeparts.services.parts.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary.PartsCrossbow;

import java.util.List;

public interface IPartsCrossbowService {
    List<PartsCrossbow> findAll();

    List<PartsCrossbow> findByName(String name);

    PartsCrossbow findByNameByUser(String name, String appUser);

    void put (PartsCrossbow parts);

    void delete(String name, String appUser);
}
