package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.RequirementsCrossbow;

import java.util.List;

public interface IRequirementsCrossbowService {
    List<RequirementsCrossbow> findAll();

    RequirementsCrossbow findByName(String name);

    void put (RequirementsCrossbow requirements);

    void delete(String name);
}
