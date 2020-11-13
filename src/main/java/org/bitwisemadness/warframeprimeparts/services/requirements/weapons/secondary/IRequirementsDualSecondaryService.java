package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsDualSecondary;

import java.util.List;

public interface IRequirementsDualSecondaryService {
    List<RequirementsDualSecondary> findAll();

    RequirementsDualSecondary findByName(String name);

    void put (RequirementsDualSecondary requirements);

    void delete(String name);
}
