package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsDualSecondaryNoSingle;

import java.util.List;

public interface IRequirementsDualSecondaryNoSingleService {
    List<RequirementsDualSecondaryNoSingle> findAll();

    RequirementsDualSecondaryNoSingle findByName(String name);

    void put (RequirementsDualSecondaryNoSingle requirements);

    void putAll (List<RequirementsDualSecondaryNoSingle> requirements);

    void delete(String name);
}
