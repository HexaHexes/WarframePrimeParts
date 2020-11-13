package org.bitwisemadness.warframeprimeparts.services.parts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee.PartsMelee;

import java.util.List;

public interface IPartsMeleeService {
    List<PartsMelee> findAll();

    List<PartsMelee> findByName(String name);

    PartsMelee findByNameByUser(String name, String appUser);

    void put (PartsMelee parts);

    void delete(String name, String appUser);
}
