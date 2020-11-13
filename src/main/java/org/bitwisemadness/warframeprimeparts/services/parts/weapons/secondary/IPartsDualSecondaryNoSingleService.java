package org.bitwisemadness.warframeprimeparts.services.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsDualSecondaryNoSingle;

import java.util.List;

public interface IPartsDualSecondaryNoSingleService {
    List<PartsDualSecondaryNoSingle> findAll();

    List<PartsDualSecondaryNoSingle> findByName(String name);

    PartsDualSecondaryNoSingle findByNameByUser(String name, String appUser);

    void put (PartsDualSecondaryNoSingle parts);

    void delete(String name, String appUser);
}
