package org.bitwisemadness.warframeprimeparts.services.requirements.frames;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.RequirementsWarframe;

import java.util.List;

public interface IRequirementsWarframeService {
    List<RequirementsWarframe> findAll();

    RequirementsWarframe findByName(String name);

    void put (RequirementsWarframe requirements);

    void delete(String name);
}
