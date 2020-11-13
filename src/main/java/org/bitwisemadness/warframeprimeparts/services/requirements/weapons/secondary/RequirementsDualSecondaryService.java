package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsDualSecondary;
import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.secondary.IRequirementsDualSecondaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsDualSecondaryService implements IRequirementsDualSecondaryService {
    @Autowired
    private IRequirementsDualSecondaryRepository repository;

    @Override
    public List<RequirementsDualSecondary> findAll() {
        return this.repository.findAll();
    }

    @Override
    public RequirementsDualSecondary findByName(String name) {
        Optional<RequirementsDualSecondary> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(RequirementsDualSecondary requirements) {
        this.repository.save(requirements);
    }

    @Override
    public void putAll(List<RequirementsDualSecondary> requirements) {
        requirements.forEach(this::put);
    }

    @Override
    public void delete(String name) {
        Optional<RequirementsDualSecondary> optional = this.repository.findByName(name);
        optional.ifPresent(dualSecondary -> this.repository.delete(dualSecondary));
    }
}
