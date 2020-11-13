package org.bitwisemadness.warframeprimeparts.services.parts;

import org.bitwisemadness.warframeprimeparts.database.model.parts.companions.PartsCollar;
import org.bitwisemadness.warframeprimeparts.services.IAppUserService;
import org.bitwisemadness.warframeprimeparts.services.parts.companions.IPartsCollarService;
import org.bitwisemadness.warframeprimeparts.services.requirements.companions.IRequirementsCollarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class PartsService implements IPartsService {
    @Autowired
    private IAppUserService appUserService;

    @Autowired
    private IPartsCollarService partsCollarService;
    @Autowired
    private IRequirementsCollarService requirementsCollarService;

    @Override
    @PostConstruct
    public void initParts() {
        this.appUserService.findAll().forEach(appUser -> {
            this.requirementsCollarService.findAll().forEach(requirementsCollar -> {
                PartsCollar parts = this.partsCollarService.findByNameByUser(requirementsCollar.getName(), appUser.getName());
                if (parts == null) {
                    PartsCollar newParts = new PartsCollar(requirementsCollar, appUser);
                    newParts.setBaseRequirement(requirementsCollar);
                    this.partsCollarService.put(newParts);
                }
                //TODO Do this for each Parts service
            });
        });
    }
}
