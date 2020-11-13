package org.bitwisemadness.warframeprimeparts.services.parts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee.PartsTipedo;

import java.util.List;

public interface IPartsTipedoService {
    List<PartsTipedo> findAll();

    List<PartsTipedo> findByName(String name);

    PartsTipedo findByNameByUser(String name, String appUser);

    void put (PartsTipedo parts);

    void delete(String name, String appUser);
}
