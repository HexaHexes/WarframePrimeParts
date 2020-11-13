package org.bitwisemadness.warframeprimeparts.services.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsSecondary;

import java.util.List;

public interface IPartsSecondaryService {
    List<PartsSecondary> findAll();

    List<PartsSecondary> findByName(String name);

    PartsSecondary findByNameByUser(String name, String appUser);

    void put (PartsSecondary parts);

    void delete(String name, String appUser);
}
