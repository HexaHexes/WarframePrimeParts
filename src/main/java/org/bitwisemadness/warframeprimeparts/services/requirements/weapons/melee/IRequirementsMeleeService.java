package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee.RequirementsMelee;

import java.util.List;

public interface IRequirementsMeleeService {
    List<RequirementsMelee> findAll();

    RequirementsMelee findByName(String name);

    void put (RequirementsMelee requirements);

    void putAll (List<RequirementsMelee> requirements);

    void delete(String name);
}
