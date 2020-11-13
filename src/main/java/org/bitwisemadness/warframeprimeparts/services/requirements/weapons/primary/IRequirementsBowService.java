package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.RequirementsBow;

import java.util.List;

public interface IRequirementsBowService {
    List<RequirementsBow> findAll();

    RequirementsBow findByName(String name);

    void put (RequirementsBow requirements);

    void putAll (List<RequirementsBow> requirements);

    void delete(String name);
}
