package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.RequirementsPrimary;

import java.util.List;

public interface IRequirementsPrimaryService {
    List<RequirementsPrimary> findAll();

    RequirementsPrimary findByName(String name);

    void put (RequirementsPrimary requirements);

    void delete(String name);
}
