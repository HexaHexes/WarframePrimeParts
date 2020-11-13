package org.bitwisemadness.warframeprimeparts.services.parts.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary.PartsBow;

import java.util.List;

public interface IPartsBowService {
    List<PartsBow> findAll();

    List<PartsBow> findByName(String name);

    PartsBow findByNameByUser(String name, String appUser);

    void put (PartsBow parts);

    void delete(String name, String appUser);
}
