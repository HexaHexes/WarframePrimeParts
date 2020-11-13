package org.bitwisemadness.warframeprimeparts.services.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsDualSecondary;

import java.util.List;

public interface IPartsDualSecondaryService {
    List<PartsDualSecondary> findAll();

    List<PartsDualSecondary> findByName(String name);

    PartsDualSecondary findByNameByUser(String name, String appUser);

    void put (PartsDualSecondary parts);

    void delete(String name, String appUser);
}
