package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsSecondary;

import java.util.List;

public interface IRequirementsSecondaryService {
    List<RequirementsSecondary> findAll();

    RequirementsSecondary findByName(String name);

    void put (RequirementsSecondary requirements);

    void delete(String name);
}
