package org.bitwisemadness.warframeprimeparts.services.parts.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary.PartsPrimary;

import java.util.List;

public interface IPartsPrimaryService {
    List<PartsPrimary> findAll();

    List<PartsPrimary> findByName(String name);

    PartsPrimary findByNameByUser(String name, String appUser);

    void put (PartsPrimary parts);

    void delete(String name, String appUser);
}
