package org.bitwisemadness.warframeprimeparts.services.requirements.frames;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.frames.RequirementsArchwing;
import org.bitwisemadness.warframeprimeparts.database.repositories.requirements.frames.IRequirementsArchwingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsArchwingService implements IRequirementsArchwingService {
    @Autowired
    private IRequirementsArchwingRepository repository;


    @Override
    public List<RequirementsArchwing> findAll() {
        return this.repository.findAll();
    }

    @Override
    public RequirementsArchwing findByName(String name) {
        Optional<RequirementsArchwing> optional = this.repository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public void put(RequirementsArchwing requirements) {
        this.repository.save(requirements);
    }

    @Override
    public void putAll(List<RequirementsArchwing> requirements) {
        requirements.forEach(this::put);
    }

    @Override
    public void delete(String name) {
        Optional<RequirementsArchwing> optional = this.repository.findByName(name);
        optional.ifPresent(archwing -> this.repository.delete(archwing));
    }
}
