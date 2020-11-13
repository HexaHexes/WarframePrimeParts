package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.RequirementsCrossbow;
import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.primary.IRequirementsCrossbowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsCrossbowService implements IRequirementsCrossbowService {
    @Autowired
    private IRequirementsCrossbowRepository repository;


    @Override
    public List<RequirementsCrossbow> findAll() {
        return this.repository.findAll();
    }

    @Override
    public RequirementsCrossbow findByName(String name) {
        Optional<RequirementsCrossbow> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(RequirementsCrossbow requirements) {
        this.repository.save(requirements);
    }

    @Override
    public void putAll(List<RequirementsCrossbow> requirements) {
        requirements.forEach(this::put);
    }

    @Override
    public void delete(String name) {
        Optional<RequirementsCrossbow> optional = this.repository.findByName(name);
        optional.ifPresent(crossbow -> this.repository.delete(crossbow));
    }
}
