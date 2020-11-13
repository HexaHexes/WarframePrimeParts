package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.RequirementsBow;
import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.primary.IRequirementsBowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsBowService implements IRequirementsBowService {
    @Autowired
    private IRequirementsBowRepository repository;


    @Override
    public List<RequirementsBow> findAll() {
        return this.repository.findAll();
    }

    @Override
    public RequirementsBow findByName(String name) {
        Optional<RequirementsBow> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(RequirementsBow requirements) {
        this.repository.save(requirements);
    }

    @Override
    public void putAll(List<RequirementsBow> requirements) {
        requirements.forEach(this::put);
    }

    @Override
    public void delete(String name) {
        Optional<RequirementsBow> optional = this.repository.findByName(name);
        optional.ifPresent(bow -> this.repository.delete(bow));
    }
}
