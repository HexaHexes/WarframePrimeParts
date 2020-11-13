package org.bitwisemadness.warframeprimeparts.services.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsSecondary;
import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.secondary.IRequirementsSecondaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsSecondaryService implements IRequirementsSecondaryService {
    @Autowired
    private IRequirementsSecondaryRepository repository;


    @Override
    public List<RequirementsSecondary> findAll() {
        return this.repository.findAll();
    }

    @Override
    public RequirementsSecondary findByName(String name) {
        Optional<RequirementsSecondary> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(RequirementsSecondary requirements) {
        this.repository.save(requirements);
    }

    @Override
    public void putAll(List<RequirementsSecondary> requirements) {
        requirements.forEach(this::put);
    }

    @Override
    public void delete(String name) {
        Optional<RequirementsSecondary> optional = this.repository.findByName(name);
        optional.ifPresent(secondary -> this.repository.delete(secondary));
    }
}
