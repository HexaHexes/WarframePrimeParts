package org.bitwisemadness.warframeprimeparts.services.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsThrowing;

import java.util.List;

public interface IPartsThrowingService {
    List<PartsThrowing> findAll();

    List<PartsThrowing> findByName(String name);

    PartsThrowing findByNameByUser(String name, String appUser);

    void put (PartsThrowing parts);

    void delete(String name, String appUser);
}
