package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee.RequirementsTipedo;

import java.util.List;

public interface IRequirementsTipedoService {
    List<RequirementsTipedo> findAll();

    RequirementsTipedo findByName(String name);

    void put (RequirementsTipedo requirements);

    void putAll (List<RequirementsTipedo> requirements);

    void delete(String name);
}
