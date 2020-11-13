package org.bitwisemadness.warframeprimeparts.services.requirements.frames;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.RequirementsArchwing;

import java.util.List;

public interface IRequirementsArchwingService {
    List<RequirementsArchwing> findAll();

    RequirementsArchwing findByName(String name);

    void put (RequirementsArchwing requirements);

    void delete(String name);
}
