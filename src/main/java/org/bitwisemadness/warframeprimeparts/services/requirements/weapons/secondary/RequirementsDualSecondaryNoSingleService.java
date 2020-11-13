package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsDualSecondaryNoSingle;
import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.secondary.IRequirementsDualSecondaryNoSingleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsDualSecondaryNoSingleService implements IRequirementsDualSecondaryNoSingleService {
    @Autowired
    private IRequirementsDualSecondaryNoSingleRepository repository;


    @Override
    public List<RequirementsDualSecondaryNoSingle> findAll() {
        return this.repository.findAll();
    }

    @Override
    public RequirementsDualSecondaryNoSingle findByName(String name) {
        Optional<RequirementsDualSecondaryNoSingle> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(RequirementsDualSecondaryNoSingle requirements) {
        this.repository.save(requirements);
    }

    @Override
    public void putAll(List<RequirementsDualSecondaryNoSingle> requirements) {
        requirements.forEach(this::put);
    }

    @Override
    public void delete(String name) {
        Optional<RequirementsDualSecondaryNoSingle> optional = this.repository.findByName(name);
        optional.ifPresent(dualSecondaryNoSingle -> this.repository.delete(dualSecondaryNoSingle));
    }
}
