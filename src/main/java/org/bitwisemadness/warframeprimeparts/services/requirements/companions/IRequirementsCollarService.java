package org.bitwisemadness.warframeprimeparts.services.requirements.companions;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsCollar;

import java.util.List;

public interface IRequirementsCollarService {
    List<RequirementsCollar> findAll();

    RequirementsCollar findByName(String name);

    void put (RequirementsCollar requirements);

    void delete(String name);
}
