package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.RequirementsPrimary;
import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.primary.IRequirementsPrimaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsPrimaryService implements IRequirementsPrimaryService {
    @Autowired
    private IRequirementsPrimaryRepository repository;


    @Override
    public List<RequirementsPrimary> findAll() {
        return this.repository.findAll();
    }

    @Override
    public RequirementsPrimary findByName(String name) {
        Optional<RequirementsPrimary> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(RequirementsPrimary requirements) {
        this.repository.save(requirements);
    }

    @Override
    public void putAll(List<RequirementsPrimary> requirements) {
        requirements.forEach(this::put);
    }

    @Override
    public void delete(String name) {
        Optional<RequirementsPrimary> optional = this.repository.findByName(name);
        optional.ifPresent(primary -> this.repository.delete(primary));
    }
}
